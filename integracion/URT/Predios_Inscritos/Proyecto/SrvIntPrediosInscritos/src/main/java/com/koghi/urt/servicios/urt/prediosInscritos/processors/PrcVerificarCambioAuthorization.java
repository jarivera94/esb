package com.koghi.urt.servicios.urt.prediosInscritos.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcVerificarCambioAuthorization implements Processor {
	
	public void process (Exchange ex) throws Exception {
		String operacion = ex.getIn().getHeader("operationName") != null ? ex.getIn().getHeader("operationName").toString() : "";
		String authorizationAuxiliar = "";
		
		switch (operacion) {
		case "getPrediosInscritos" :
			authorizationAuxiliar = ex.getIn().getHeader("authorizationOperacionSolicitar") != null ? ex.getIn().getHeader("authorizationOperacionSolicitar").toString() : "";
			break;
		default :
			ex.getIn().setHeader("Authorization", "");
	}
		
		ex.getIn().setHeader("Authorization", authorizationAuxiliar);
		ex.setOut(ex.getIn());
	}

}
