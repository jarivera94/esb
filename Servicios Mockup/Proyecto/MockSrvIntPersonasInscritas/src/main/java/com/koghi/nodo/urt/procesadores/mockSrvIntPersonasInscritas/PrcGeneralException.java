package com.koghi.nodo.urt.procesadores.mockSrvIntPersonasInscritas;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcGeneralException implements Processor {

//	private static final Logger log = LogManager.getLogger(PrcGeneralException.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
		
		int noEx = exchange.getIn().getHeader("NO_EXISTE_EL_HEADER", Integer.class);
		
//		System.out.println("********************************************************");
//		System.out.println("****** Esto sucede dentro de PrcGeneralException *******");
//		System.out.println("********************************************************");
//		
//		Exception e = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
//		
//		String excClass = e.getClass().getName();
//		String excMess = e.getMessage();
//		
//		System.out.println("Se ha lanzado una excepción y no es un error de conexión.");
//		System.out.println("Excepción lanzada: " + excClass);
//		System.out.println("Mensaje de la excepción: " + excMess);
//		
//		e.printStackTrace();
//
//		exchange.getContext().getShutdownStrategy().setLogInflightExchangesOnTimeout(false);
//	    exchange.getContext().getShutdownStrategy().setTimeout(exchange.getIn().getHeader("routeEndTimeout", Integer.class));
//	    exchange.getContext().stop();
		
	}

}
