package com.koghi.nodo.uariv.procesadores.srvIntAnexo11;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcVerificarCambioAuthorization implements Processor {
	
	public void process (Exchange ex) throws Exception {
		String operacion = ex.getIn().getHeader("operationName") != null ? ex.getIn().getHeader("operationName").toString() : "";
		String authorizationAuxiliar = "";
		
		switch (operacion) {
		default :
			ex.getIn().setHeader("Authorization", "");
	}
		
		ex.getIn().setHeader("Authorization", authorizationAuxiliar);
		ex.setOut(ex.getIn());
	}

}
