package com.koghi.nodo.cant.srvIntConsultaGeograficoPredial.procesadores;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONArray;
import org.json.JSONObject;

public class PrcConsultaParametro implements Processor {
	
	public void process(Exchange ex) throws Exception {
		JSONArray body;
		JSONObject body0 = new JSONObject();
		body0.put("codigo", "VAL_CODIGO");
		body0.put("valor", "MAIL-002");
		JSONObject body1 = new JSONObject();
		body1.put("codigo", "FEC_VIGENCIA");
		body1.put("valor", "");
		JSONObject[] parametros = new JSONObject[2];
		parametros[0] = body0;
		parametros[1] = body1;
		body = new JSONArray(parametros);
		ex.getIn().setBody(body.toString());
		ex.setOut(ex.getIn());
	}

}
