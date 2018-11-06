package com.koghi.nodo.entidades.procesadores.srvIntConsumirAlertas;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcVerificarCambioAuthorization implements Processor {
	
	public void process (Exchange ex) throws Exception {
		String operacion = ex.getIn().getHeader("operationName") != null ? ex.getIn().getHeader("operationName").toString() : "";
		String authorizationAuxiliar = "";
		
		switch (operacion) {
		case "getJsonPersonQueryData" :
			authorizationAuxiliar = ex.getIn().getHeader("authorizationOperacionConsumir") != null ? ex.getIn().getHeader("authorizationOperacionConsumir").toString() : "";
			break;
		default :
			ex.getIn().setHeader("Authorization", "");
	}
		
		ex.getIn().setHeader("Authorization", authorizationAuxiliar);
		ex.setOut(ex.getIn());
	}

}
