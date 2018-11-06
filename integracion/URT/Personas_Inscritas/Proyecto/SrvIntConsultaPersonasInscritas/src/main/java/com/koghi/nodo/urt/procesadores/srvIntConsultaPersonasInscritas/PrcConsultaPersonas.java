package com.koghi.nodo.urt.procesadores.srvIntConsultaPersonasInscritas;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcConsultaPersonas implements Processor {
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void process(Exchange exchange) throws Exception {
		
		Map headers = exchange.getIn().getHeaders();
		String bodyMsg = exchange.getIn().getBody().toString();
		
		System.out.println("Headers Personas Inscritas:\n" + headers);
		System.out.println("Body Personas Inscritas:\n" + bodyMsg);

		exchange.getOut().setHeaders(headers);
		exchange.getOut().setHeader("CamelHttpMethod", "POST");
		exchange.getOut().setBody(bodyMsg);
	}
	
}