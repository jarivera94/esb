package com.koghi.urt.servicios.igac.informacionCatastral.processors;

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
		}
		ex.setOut(ex.getIn());
	}

}
