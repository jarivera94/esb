package com.koghi.nodo.urt.procesadores.mockSrvIntPersonasInscritas;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcHttpStatus implements Processor {
	
	public void process(Exchange exchange) {
		
		exchange.setOut(exchange.getIn());
		
		int statusCode = Integer.parseInt(exchange.getIn().getHeader("PropCodStatusHTTP", String.class));
		System.out.println("Response code: " + statusCode);
		Response respuesta = Response.status(statusCode).entity(exchange.getIn().getBody().toString()).type(MediaType.APPLICATION_JSON).build();
		
		exchange.getOut().setBody(respuesta);		
	}
	
}
