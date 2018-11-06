package com.koghi.nodo.urt.procesadores.srvIntConsultaCumplimientoOrdenes;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcVerificarCambioAuthorization implements Processor {
	
	public void process (Exchange ex) throws Exception {
		String operacion = ex.getIn().getHeader("operationName") != null ? ex.getIn().getHeader("operationName").toString() : "";
		String authorizationAuxiliar = "";
		
		System.out.println("ENTRA A PROCESOR PrcVerificarCambioAuthorization");
		System.out.println("Valor del string operacion (operationName): " + operacion);
		
		switch (operacion) {
		case "consultarPorSentencia" :
			authorizationAuxiliar = ex.getIn().getHeader("authorizationOperacionConsultarPorSentencia") != null ? ex.getIn().getHeader("authorizationOperacionConsultarPorSentencia").toString() : "";
			break;
		case "consultarPorRadicado" :
			authorizationAuxiliar = ex.getIn().getHeader("authorizationOperacionConsultarPorRadicado") != null ? ex.getIn().getHeader("authorizationOperacionConsultarPorRadicado").toString() : "";
			break;
		case "consultarPorFecha" :
			authorizationAuxiliar = ex.getIn().getHeader("authorizationOperacionConsultarPorFecha") != null ? ex.getIn().getHeader("authorizationOperacionConsultarPorFecha").toString() : "";
			break;
		case "consultarPredioPorSentencia" :
			authorizationAuxiliar = ex.getIn().getHeader("authorizationOperacionConsultarPredioPorSentencia") != null ? ex.getIn().getHeader("authorizationOperacionConsultarPredioPorSentencia").toString() : "";
			break;
		case "consultarPredioPorCedulaCatastral" :
			authorizationAuxiliar = ex.getIn().getHeader("authorizationOperacionConsultarPredioPorCedulaCatastral") != null ? ex.getIn().getHeader("authorizationOperacionConsultarPredioPorCedulaCatastral").toString() : "";
			break;
		case "consultarPersonaPorDocumento" :
			authorizationAuxiliar = ex.getIn().getHeader("authorizationOperacionConsultarPersonaPorDocumento") != null ? ex.getIn().getHeader("authorizationOperacionConsultarPersonaPorDocumento").toString() : "";
			break;
		case "consultarOrdenesSentenciaPorIdSentencia" :
			authorizationAuxiliar = ex.getIn().getHeader("authorizationOperacionConsultarOrdenesSentenciaPorIdSentencia") != null ? ex.getIn().getHeader("authorizationOperacionConsultarOrdenesSentenciaPorIdSentencia").toString() : "";
			break;
		case "consultarOrdenesSentenciaPorIdOrden" :
			authorizationAuxiliar = ex.getIn().getHeader("authorizationOperacionConsultarOrdenesSentenciaPorIdOrden") != null ? ex.getIn().getHeader("authorizationOperacionConsultarOrdenesSentenciaPorIdOrden").toString() : "";
			break;
		default :
			ex.getIn().setHeader("Authorization", "");
	}
		
		ex.getIn().setHeader("Authorization", authorizationAuxiliar);
		ex.setOut(ex.getIn());
	}

}
