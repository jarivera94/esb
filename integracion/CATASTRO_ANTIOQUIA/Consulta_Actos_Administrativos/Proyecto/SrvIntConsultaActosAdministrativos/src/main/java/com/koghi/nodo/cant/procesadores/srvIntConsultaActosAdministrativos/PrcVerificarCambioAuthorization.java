package com.koghi.nodo.cant.procesadores.srvIntConsultaActosAdministrativos;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcVerificarCambioAuthorization implements Processor {
	
	public void process (Exchange ex) throws Exception {
		String operacion = ex.getIn().getHeader("operationName") != null ? ex.getIn().getHeader("operationName").toString() : "";
		String authorizationAuxiliar = "";
		
		System.out.println("ENTRA A PROCESOR PrcVerificarCambioAuthorization");
		System.out.println("Valor del string operacion (operationName): " + operacion);
		
		switch (operacion) {
		case "consultarActosPorAnoYMunicipio" :
			authorizationAuxiliar = ex.getIn().getHeader("authorizationOperacionConsultarPorAnoYMunicipio") != null ? ex.getIn().getHeader("authorizationOperacionConsultarPorAnoYMunicipio").toString() : "";
			break;
		case "consultarActosPorNumeroResolucion" :
			authorizationAuxiliar = ex.getIn().getHeader("authorizationOperacionConsultarPorNumeroResolucion") != null ? ex.getIn().getHeader("authorizationOperacionConsultarPorNumeroResolucion").toString() : "";
			break;
		case "op3" :
			authorizationAuxiliar = ex.getIn().getHeader("authorizationOperacionMiOperacion") != null ? ex.getIn().getHeader("authorizationOperacionMiOperacion").toString() : "";
			break;
		default :
			ex.getIn().setHeader("Authorization", "");
	}
		
		ex.getIn().setHeader("Authorization", authorizationAuxiliar);
		ex.setOut(ex.getIn());
	}

}
