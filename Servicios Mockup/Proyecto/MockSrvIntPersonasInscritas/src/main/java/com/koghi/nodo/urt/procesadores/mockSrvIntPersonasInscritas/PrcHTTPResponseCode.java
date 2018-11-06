package com.koghi.nodo.urt.procesadores.mockSrvIntPersonasInscritas;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.http.HttpOperationFailedException;

public class PrcHTTPResponseCode implements Processor {

	public void process(Exchange exchange) {
		
		HttpOperationFailedException exception = exchange.getException(HttpOperationFailedException.class);
		String resBody = exception.getResponseBody();
		int httpCode = exception.getStatusCode();
		
		System.out.println("Código HTTP de la respuesta: " + httpCode + ". Cuerpo HTTP de la respuesta: " + resBody);
	}
}
