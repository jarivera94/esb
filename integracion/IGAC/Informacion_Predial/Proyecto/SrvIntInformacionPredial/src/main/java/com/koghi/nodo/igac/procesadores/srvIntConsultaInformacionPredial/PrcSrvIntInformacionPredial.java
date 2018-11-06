package com.koghi.nodo.igac.procesadores.srvIntConsultaInformacionPredial;

import java.util.Map;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcSrvIntInformacionPredial implements Processor {
	
	public void process(Exchange exchange) throws Exception {
		
		Map headers = exchange.getIn().getHeaders();
		String bodyMsg = exchange.getIn().getBody().toString();
		
		if (bodyMsg.indexOf("[") >= 0) {
			bodyMsg = bodyMsg.substring(1, bodyMsg.length() - 1);
		}
		
		System.out.println("Headers Informacion Predial:\n" + headers);
		System.out.println("Body Informacion Predial:\n" + bodyMsg);

		exchange.getOut().setHeaders(headers);
		exchange.getOut().setHeader("CamelHttpMethod", "POST");
		exchange.getOut().setBody(bodyMsg);
	}

}
