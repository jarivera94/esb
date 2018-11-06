package com.koghi.nodo.urt.procesadores.mockSrvIntPersonasInscritas;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcImprimir implements Processor {
	
	public void process(Exchange exchange) throws Exception {
		
		Map<String, Object> headers = exchange.getIn().getHeaders();
		
		for (Map.Entry<String, Object> header : headers.entrySet()) {
			System.out.println("____________________________________________________________________________________________________________");
			System.out.println(header.getKey() + "\t==========>\t" + header.getValue());
			System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
		}
		
//		int statusCode = Integer.parseInt(exchange.getIn().getHeader("CamelHttpResponseCode", String.class));
//		String statusText = exchange.getProperty(Exchange.HTTP_RESPONSE_TEXT, String.class);

//		System.out.println("____________________________________________________________________________________________________________");
//		System.out.println("Status Code:\t==========>\t" + statusCode);
//		System.out.println("Status Code:\t==========>\t" + exchange.getIn().getHeader("CamelHttpResponseCode"));
//		System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");

//		System.out.println("____________________________________________________________________________________________________________");
//		System.out.println("Status Text:\t==========>\t" + statusText);
//		System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
		
//		if (statusCode < 200 && statusCode > 300) {
//			exchange.getIn().setBody("{\n\t\"Message:\"" + exchange.getIn().getBody() + "\n}");
//		}
//		System.out.println("HTTP Status: " + exchange.getProperty("CamelHttpResponseCode"));
		exchange.setOut(exchange.getIn());
	}
	
}