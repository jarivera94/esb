package com.koghi.nodo.cant.procesadores.srvIntRegistroComplementario;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcVerificarCambioAuthorization implements Processor {
	
	public void process (Exchange ex) throws Exception {
		String operacion = ex.getIn().getHeader("operationName") != null ? ex.getIn().getHeader("operationName").toString() : "";
		String authorizationAuxiliar = "";
		
		System.out.println("ENTRA A PROCESOR PrcVerificarCambioAuthorization");
		System.out.println("Valor del string operacion (operationName): " + operacion);
		
		switch (operacion) {
		case "consultarPorNPN" :
			authorizationAuxiliar = ex.getIn().getHeader("authorizationOperacionPorNPN") != null ? ex.getIn().getHeader("authorizationOperacionPorNPN").toString() : "";
			break;
		case "consultarPorFMI" :
			authorizationAuxiliar = ex.getIn().getHeader("authorizationOperacionPorFMI") != null ? ex.getIn().getHeader("authorizationOperacionPorFMI").toString() : "";
			break;
		default :
			ex.getIn().setHeader("Authorization", "");
	}
		
		ex.getIn().setHeader("Authorization", authorizationAuxiliar);
		ex.setOut(ex.getIn());
	}

}
