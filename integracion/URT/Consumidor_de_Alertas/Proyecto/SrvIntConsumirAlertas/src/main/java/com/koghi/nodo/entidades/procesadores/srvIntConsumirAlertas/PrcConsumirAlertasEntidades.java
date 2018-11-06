package com.koghi.nodo.entidades.procesadores.srvIntConsumirAlertas;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcConsumirAlertasEntidades implements Processor {

	public void process (Exchange exchange) {
		String headers = exchange.getIn().getHeaders().toString();
		String header2 = (exchange.getIn().getHeader("authorizationOperacionConsumir") != null) ? exchange.getIn().getHeader("authorizationOperacionConsumir").toString(): "";
		String headerOperacion = exchange.getIn().getHeader("Operacion") != null ? exchange.getIn().getHeader("Operacion").toString() : "";
		String bodyMsg = exchange.getIn().getBody() != null ? exchange.getIn().getBody(String.class) : "";
		
		if(bodyMsg.charAt(0) == '[') {
			bodyMsg = bodyMsg.substring(1, bodyMsg.length() - 1);			
		}
		
		System.out.println("***********************************************");
		System.out.println("Body entrada:\n" + bodyMsg);
		System.out.println("***********************************************\n");
		
		if (headerOperacion == "consumir-servicio") {
			exchange.getIn().getHeaders().put("Content-Type", exchange.getProperty("propContentType").toString());
			exchange.getIn().getHeaders().put("Authorization", header2);
			System.out.println("Authorization: " + exchange.getIn().getHeader("Authorization"));
		} else {
			exchange.setProperty("propContentType", exchange.getIn().getHeader("Content-Type"));
			exchange.getIn().getHeaders().put("Operacion", "consumir-servicio");
//			System.out.println("Body durante la configuración previa de las propiedades del servicio:\n" + bodyMsg);
		}

		System.out.println("Content-Type: " + exchange.getIn().getHeader("Content-Type"));
		exchange.getIn().setBody(bodyMsg);
		exchange.setOut(exchange.getIn());
		
	}
	
}
