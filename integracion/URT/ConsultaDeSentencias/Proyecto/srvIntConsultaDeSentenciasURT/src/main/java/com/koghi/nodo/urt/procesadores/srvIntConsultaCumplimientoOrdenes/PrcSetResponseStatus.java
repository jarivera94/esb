package com.koghi.nodo.urt.procesadores.srvIntConsultaCumplimientoOrdenes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcSetResponseStatus implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		Exception exception = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
		int httpCode = exchange.getProperty(Exchange.HTTP_RESPONSE_CODE, Integer.class);
		System.out.println("Status code: " + httpCode);
		
	}

}
