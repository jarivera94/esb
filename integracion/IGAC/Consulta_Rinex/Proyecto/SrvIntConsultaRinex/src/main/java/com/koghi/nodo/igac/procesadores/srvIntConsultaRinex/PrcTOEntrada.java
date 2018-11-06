package com.koghi.nodo.igac.procesadores.srvIntConsultaRinex;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcTOEntrada implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		String inBody = exchange.getIn().getBody().toString();
		inBody = inBody.substring(1, inBody.length()-1);
		
		exchange.setProperty("entradaRinex", inBody);
	}

}
