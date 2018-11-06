package com.koghi.nodo.cant.srvIntConsultaGeograficoPredial.procesadores;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcConsumirOperacion implements Processor {
	
	@Override
	public void process (Exchange ex) throws Exception {
		
		String body = ex.getIn().getBody() != null ? ex.getIn().getBody().toString() : "";
		System.out.println("Body desde Postman: \n" + body);
		if (body.indexOf("[") >= 0) {
			body = body.substring(1, body.length() - 1);
		}
		
		ex.getIn().setBody(body);
		ex.setOut(ex.getIn());
	}

}
