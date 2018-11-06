package com.koghi.nodo.urt.procesadores.srvIntConsultaZonasMicrofocalizadas;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

public class PrcProcesarRespuestaAutorizar implements Processor {
	
	public void process (Exchange ex) throws Exception {
		String body = ex.getIn().getBody().toString();
		if (body.charAt(0) == '[') {
			body = body.substring(1, body.length() - 1);
		}
		JSONObject json = new JSONObject(body);
		boolean estaAutorizado = json.getBoolean("indAutorizacionExitosa");
		ex.getIn().setHeader("estaAutorizado", estaAutorizado);
		if (estaAutorizado)  {
			ex.getIn().setBody(ex.getProperty("bodyBackup"));
		}else {
			Response respuesta = Response.status(Status.UNAUTHORIZED).entity(body.toString()).type(MediaType.APPLICATION_JSON).build();
			ex.getIn().setBody(respuesta);
		}
		ex.setOut(ex.getIn());
	}

}
