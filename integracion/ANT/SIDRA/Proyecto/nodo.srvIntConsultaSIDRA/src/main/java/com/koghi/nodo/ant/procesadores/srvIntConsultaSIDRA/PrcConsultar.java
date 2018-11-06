package com.koghi.nodo.ant.procesadores.srvIntConsultaSIDRA;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcConsultar implements Processor {

	public void process(Exchange exchange) {
		String bodyMsg = exchange.getIn().getBody().toString();
		
		System.out.println(bodyMsg);
				
		exchange.getOut().getHeaders().put("EntidadEmisora", exchange.getIn().getHeader("EntidadEmisora"));
		exchange.getOut().getHeaders().put("EntidadReceptora", exchange.getIn().getHeader("EntidadReceptora"));
		exchange.getOut().getHeaders().put("Host", exchange.getIn().getHeader("Host"));
		exchange.getOut().getHeaders().put("IdEntidadConsumidora", exchange.getIn().getHeader("IdEntidadConsumidora"));
		exchange.getOut().getHeaders().put("IdOperacion", exchange.getIn().getHeader("IdOperacion"));
		exchange.getOut().getHeaders().put("IdServicio", exchange.getIn().getHeader("IdServicio"));
		exchange.getOut().getHeaders().put("IdUsuario", exchange.getIn().getHeader("IdUsuario"));
		exchange.getOut().getHeaders().put("NombreContactoMesaDeAyuda", exchange.getIn().getHeader("NombreContactoMesaDeAyuda"));
		exchange.getOut().getHeaders().put("TelefonoMesaDeAyuda", exchange.getIn().getHeader("TelefonoMesaDeAyuda"));
		exchange.getOut().getHeaders().put("ValIPOrigen", exchange.getIn().getHeader("ValIPOrigen"));
		exchange.getOut().getHeaders().put("ValReintentos", exchange.getIn().getHeader("ValReintentos"));
		exchange.getOut().getHeaders().put("VersionServicio", exchange.getIn().getHeader("VersionServicio"));
		exchange.getOut().getHeaders().put("Content-Type", "application/json");
		exchange.getOut().getHeaders().put("Cache-Control", "no-cache");
		exchange.getOut().getHeaders().put("CamelHttpMethod", "POST");
		exchange.getOut().setBody(bodyMsg);
		
		System.out.println("\n\n\n***********************************************************\n\n");
		System.out.println("Headers en PrcConsultar después de cambiarlos");
		System.out.println("\n\n***********************************************************\n");
		Map<String, Object> headers = exchange.getOut().getHeaders();
		for (Map.Entry<String, Object> header : headers.entrySet()) {
			System.out.println(header.getKey() + " = " + header.getValue());
		}
		System.out.println("\n***********************************************************\n\n\n");
	}
}
