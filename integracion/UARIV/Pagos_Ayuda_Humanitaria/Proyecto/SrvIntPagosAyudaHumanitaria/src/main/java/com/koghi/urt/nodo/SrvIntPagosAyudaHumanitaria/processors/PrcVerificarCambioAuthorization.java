package com.koghi.urt.nodo.SrvIntPagosAyudaHumanitaria.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcVerificarCambioAuthorization implements Processor {
	
	public void process (Exchange ex) throws Exception {
		String operacion = ex.getIn().getHeader("operationName") != null ? ex.getIn().getHeader("operationName").toString() : "";
		String authorizationAuxiliar = "";
		
		System.out.println("ENTRA A PROCESOR PrcVerificarCambioAuthorization");
		System.out.println("Valor del string operacion (operationName): " + operacion);
		
		switch (operacion) {
		case "getJsonPersonQueryData" :
			authorizationAuxiliar = ex.getIn().getHeader("authorizationOperacionConsultar") != null ? ex.getIn().getHeader("authorizationOperacionConsultar").toString() : "";
			break;
		case "op1" :
			authorizationAuxiliar = ex.getIn().getHeader("authorizationOperacionOp1") != null ? ex.getIn().getHeader("authorizationOperacionOp1").toString() : "";
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
