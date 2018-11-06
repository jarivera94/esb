package com.koghi.nodo.cant.procesadores.srvIntInformacionPredial;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcSetValReintentos implements Processor {

	@Override
	public void process(Exchange exchange) {
		int valReintentos = Integer.parseInt(exchange.getProperty("contador_redelivery").toString());
		String codEstado = exchange.getProperty("CodEstado") != null ? exchange.getProperty("CodEstado").toString() : "";
		
		System.out.println("ValReintentos: " + valReintentos);
		System.out.println("CodEstado: " + codEstado);
		
		exchange.getOut().setHeader("CodEstado", codEstado);
		exchange.getOut().setHeader("ValReintentos", valReintentos);
		exchange.getOut().setHeader("operacionTransversal", "actualizarTransaccion");
	}
	
}
