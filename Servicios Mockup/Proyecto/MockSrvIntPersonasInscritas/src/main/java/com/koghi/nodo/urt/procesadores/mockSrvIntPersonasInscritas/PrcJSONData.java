package com.koghi.nodo.urt.procesadores.mockSrvIntPersonasInscritas;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcJSONData implements Processor {

	public void process(Exchange exchange) throws Exception {
		
		String header1 = exchange.getIn().getHeaders().toString();
		String bodyMsg = exchange.getIn().getBody().toString();
		
		System.out.println(header1);
		System.out.println("Body: " + bodyMsg);
		
		// Set output
		exchange.getOut().setBody(bodyMsg);
	}

}