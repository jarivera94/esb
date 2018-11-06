package com.koghi.nodo.cant.srvIntConsultaHistoricaCatastral.procesadores;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcImprimirBody implements Processor {

	@Override
	public void process(Exchange exchange) {
		
		String inBody = exchange.getIn().getBody(String.class);
//		String inBody2 = exchange.getIn().getBody().toString();
		
		System.out.println("\n\n\nBody antes de enviar a la cola de correo:\n\n" + inBody);
//		System.out.println("Body2 en respuesta a la consulta de servicio:\n" + inBody2);
	}
}
