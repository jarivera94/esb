package com.koghi.nodo.snr.procesadores.srvIntConsultaDatosJuridicos;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.step.aac.glass.TipoEstadoJuridicoInmuebleSal;
import org.step.aac.glass.TipoLstEstadoJuridicoInmuebleEnt;

import com.google.gson.Gson;
import com.koghi.nodo.snr.tos.srvIntConsultaDatosJuridicos.TOEntradaConsultaDatosJuridicos;
import com.koghi.nodo.snr.util.srvIntConsultaDatosJuridicos.ClienteWsdlSNR;
import com.koghi.nodo.snr.util.srvIntConsultaDatosJuridicos.LectorArchivoPropiedades;

public class PrcConsumirOperacionConsultaDatosJuridicos implements Processor {
	
	@Override
	public void process (Exchange exchange) throws Exception {
		
		ClienteWsdlSNR cliente = ClienteWsdlSNR.getInstancia();
		
		String body = exchange.getIn().getBody() != null ? exchange.getIn().getBody().toString() : "";
		System.out.println("Body desde Postman: \n" + body);
		if (body.indexOf("[") >= 0) {
			body = body.substring(1, body.length() - 1);
		}
		System.out.println("Body después de quitar los brackets: \n" + body);
		TOEntradaConsultaDatosJuridicos entradaServicio = new Gson().fromJson(body, TOEntradaConsultaDatosJuridicos.class);
		entradaServicio = entradaServicio == null ? new TOEntradaConsultaDatosJuridicos() : entradaServicio;

		entradaServicio.setSistemaUsuario(exchange.getIn().getHeader("SistemaUsuario") != null ? exchange.getIn().getHeader("SistemaUsuario").toString() : "");
		entradaServicio.setClave(exchange.getIn().getHeader("ClaveUsuario") != null ? exchange.getIn().getHeader("ClaveUsuario").toString() : "");
		TipoEstadoJuridicoInmuebleSal salidaServicio = new TipoEstadoJuridicoInmuebleSal();
		
		LectorArchivoPropiedades.setValProperty();
		String hostURI = LectorArchivoPropiedades.getProperty("HOST_SOAP_SNR");
		if (!hostURI.isEmpty()) {
			cliente.setNewEndpointWSDL(hostURI);
		}
		
		salidaServicio = cliente.consultaEstadoJuridico(entradaServicio.getObjEntrada(), entradaServicio.getSistemaUsuario(), entradaServicio.getClave());
		
		String jsonRespuesta = new Gson().toJson(salidaServicio, TipoEstadoJuridicoInmuebleSal.class);
		
		System.out.println("JSON Respuesta: " + jsonRespuesta);
		exchange.getIn().setBody(jsonRespuesta);
		exchange.setOut(exchange.getIn());
	}

}
