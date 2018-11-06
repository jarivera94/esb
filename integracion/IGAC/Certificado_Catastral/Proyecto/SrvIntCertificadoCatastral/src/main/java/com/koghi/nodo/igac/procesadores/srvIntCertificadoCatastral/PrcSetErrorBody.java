package com.koghi.nodo.igac.procesadores.srvIntCertificadoCatastral;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcSetErrorBody implements Processor {

	@Override
	public void process(Exchange exchange) {
		
		String headerNumCertEmpty = "";
		
		if(exchange.getIn().getHeader("NumCertificadoVacio") != null)
			headerNumCertEmpty = exchange.getIn().getHeader("NumCertificadoVacio", String.class);
		
		if (headerNumCertEmpty.equals("true")) {
			exchange.getOut().setBody("{\n" + 
					"    \"error\": true,\n" + 
					"    \"codigo\": 400,\n" + 
					"    \"mensaje\": \"No se indicó número de certificado.\"\n}");
//			System.out.println("\n\n\nMensaje de error final:\n\n" + exchange.getOut().getBody(String.class));
		}
		
	}
}
