package com.koghi.nodo.urt.procesadores.srvIntConsultaCumplimientoOrdenes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

public class PrcProcesarRespuestaOperacion implements Processor {
	
	public void process (Exchange ex) throws Exception {
		System.out.println("Entra a Processor PrcProcesarRespuestaOperacion");
		String body = ex.getIn().getBody().toString();
		if (body.charAt(0) == '[') {
			body = body.substring(1, body.length() - 1);
		}
		System.out.println("BODY RECIBIDO DE CONSULTAR OPERACION:\n" + body);
		JSONObject json = new JSONObject(body);
		int existeAutenticacion = json.getInt("indExisteAutenticacion");
		int existeAutorizacion = json.getInt("indExisteAutorizacion");
		ex.getIn().setHeader("existeAutenticacion", existeAutenticacion);
		ex.getIn().setHeader("existeAutorizacion", existeAutorizacion);
		//ex.getIn().setBody(ex.getIn().getHeader("bodyBackup"));
		ex.getIn().setBody(ex.getProperty("bodyBackup"));
		ex.setOut(ex.getIn());
	}

}
