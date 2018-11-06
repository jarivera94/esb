package com.koghi.nodo.cant.procesadores.srvIntConsultaActosAdministrativos;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

public class PrcSetErrorInfoUsuario implements Processor {
	
	public void process(Exchange ex) throws Exception {
		int status = ex.getProperty("statusCodeAnswer", Integer.class);
		Exception e = ex.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);		
		JSONObject json = new JSONObject();
		json.put("Error", "true");
		json.put("Código", ex.getProperty("propCodEstado", Integer.class));
		json.put("Descripción", "Error Técnico");
		json.put("Mensaje", e.getMessage());
		Response respuesta = Response.status(status).entity(json.toString()).type(MediaType.APPLICATION_JSON).build();
		ex.getIn().setBody(respuesta);
//		ex.getIn().setBody(json.toString());
		ex.setOut(ex.getIn());
	}

}
