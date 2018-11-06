package com.koghi.nodo.urt.procesadores.srvIntConsultaITPITG;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcSetCodEstado implements Processor {

	public void process(Exchange ex) {
		
		int statusCode = (ex.getIn().getHeader(Exchange.HTTP_RESPONSE_CODE, Integer.class));
		
		System.out.println("RESPONSE CODE!!!: ************************** \n" + 
				//ex.getIn().getHeader(Exchange.HTTP_RESPONSE_CODE) +
				ex.getIn().getHeader(Exchange.HTTP_RESPONSE_CODE, Integer.class) +
							"\n***********************************");
		
		
		if((statusCode >= 500) || (statusCode >= 200 && statusCode < 300) )
		{
			ex.getIn().getHeaders().put("CodEstado", 1);
		}
		else 
		{
			ex.getIn().getHeaders().put("CodEstado", -1);		
		}
		System.out.println("Valor CodEstado: " + ex.getIn().getHeader("CodEstado"));
		
		System.out.println("Body en PrcSetCodEstado: \n" + ex.getIn().toString());
		
//		Exception e = ex.getProperty(Exchange.EXCEPTION_CAUGHT) != null ? ex.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class) : null;
//
//		if ( e != null ) {
//			System.out.println("Valor Excepción: \n" + e.getMessage());
//			ex.getIn().setBody("{\n\t\"Message\": \"" + e.getMessage() + "\"\n}");
//		}
		
		System.out.println("Valor HTTP Status: " + ex.getIn().getHeader(Exchange.HTTP_RESPONSE_CODE, Integer.class));
		
		ex.setOut(ex.getIn());
	}
	
}
