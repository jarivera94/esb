package com.koghi.nodo.rnec.procesadores.srvIntConsultaCedula;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcVerificarCambioAuthorization implements Processor {
	
	public void process (Exchange ex) throws Exception {
		String operacion = ex.getIn().getHeader("operationName") != null ? ex.getIn().getHeader("operationName").toString() : "";
		String authorizationAuxiliar = "";
		
		System.out.println("ENTRA A PROCESOR PrcVerificarCambioAuthorization");
		System.out.println("Valor del string operacion (operationName): " + operacion);
		
		switch (operacion) {
		default :
			ex.getIn().setHeader("Authorization", "");
	}
		
		ex.getIn().setHeader("Authorization", authorizationAuxiliar);
		ex.setOut(ex.getIn());
	}

}
