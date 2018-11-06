package com.koghi.urt.servicios.igac.informacionCatastral.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

public class PrcSetErrorInfoUsuario implements Processor {
	
	public void process(Exchange ex) throws Exception {
		Exception e = ex.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);		
		JSONObject json = new JSONObject();
		json.put("Error", "true");
		json.put("Código", "-1");
		json.put("Descripción", "Error Técnico");
		json.put("Mensaje", e.getMessage());
		ex.getIn().setBody(json.toString());
		ex.setOut(ex.getIn());
	}

}
