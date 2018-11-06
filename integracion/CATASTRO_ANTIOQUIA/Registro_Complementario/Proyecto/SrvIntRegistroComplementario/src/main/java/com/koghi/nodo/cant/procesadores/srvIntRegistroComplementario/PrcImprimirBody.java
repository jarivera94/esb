package com.koghi.nodo.cant.procesadores.srvIntRegistroComplementario;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcImprimirBody implements Processor {

	@Override
	public void process(Exchange exchange) {
		
//		String inBody = exchange.getIn().getBody(String.class);
//		String inBody2 = exchange.getIn().getBody().toString();
		Map<String, Object> headers = exchange.getIn().getHeaders();
		
		for (Map.Entry<String, Object> header : headers.entrySet()) {
			System.out.println("____________________________________________________________________________________________________________");
			System.out.println(header.getKey() + "\t==========>\t" + header.getValue());
			System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
		}
		
		System.out.println("HTTP Response code: " + exchange.getIn().getHeader(Exchange.HTTP_RESPONSE_CODE));
//		System.out.println("\n\n\nBody antes de enviar a la cola de correo:\n\n" + inBody);
//		System.out.println("Body2 en respuesta a la consulta de servicio:\n" + inBody2);
	}
}
