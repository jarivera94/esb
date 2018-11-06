package com.koghi.nodo.urt.procesadores.srvIntConsultaZonasMicrofocalizadas;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcZonasMicrofocalizadas implements Processor{

	@Override
	public void process(Exchange ex) throws Exception {
		String operacion = ex.getIn().getHeader("operationName").toString();
		String body = ex.getIn().getBody() != null ? ex.getIn().getBody().toString() : "";
		if (body.charAt(0) == '[') {
			body = body.substring(1, body.length() - 1);
		}
	}

}
