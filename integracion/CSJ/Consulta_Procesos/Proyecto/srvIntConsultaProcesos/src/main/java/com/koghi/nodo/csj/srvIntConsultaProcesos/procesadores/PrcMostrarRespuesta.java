package com.koghi.nodo.csj.srvIntConsultaProcesos.procesadores;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

public class PrcMostrarRespuesta implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		String body = exchange.getIn().getBody().toString();
		JSONObject rta = new JSONObject();
		rta.put("return", body);
//		rta.put("Mensaje", "Dentro del process de JSON");
		exchange.getIn().setBody(rta.toString());
		exchange.setOut(exchange.getIn());
		
	}

}
