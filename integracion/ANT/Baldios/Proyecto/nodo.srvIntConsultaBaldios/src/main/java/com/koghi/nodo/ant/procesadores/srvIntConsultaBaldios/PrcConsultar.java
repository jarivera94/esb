package com.koghi.nodo.ant.procesadores.srvIntConsultaBaldios;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcConsultar implements Processor {
	
	public void process(Exchange exchange) throws Exception {
		
		exchange.setOut(exchange.getIn());
		String header1 = exchange.getIn().getHeader("Content-Type") != null ? exchange.getIn().getHeader("Content-Type").toString() : "application/json";
		String header2 = exchange.getIn().getHeader("Cache-Control") != null ? exchange.getIn().getHeader("Cache-Control").toString() : "no-cache";
		String bodyMsg = exchange.getIn().getBody().toString();
		
//		System.out.println(exchange.getIn().getHeaders());
		
//		System.out.println(header1);
//		System.out.println(header2);
//		System.out.println(bodyMsg);

		exchange.getOut().getHeaders().put("Content-Type", header1);
		exchange.getOut().getHeaders().put("Cache-Control", header2);
		exchange.getOut().getHeaders().put("CamelHttpMethod", "POST");
		exchange.getOut().setBody(bodyMsg);
		
	}
	
}