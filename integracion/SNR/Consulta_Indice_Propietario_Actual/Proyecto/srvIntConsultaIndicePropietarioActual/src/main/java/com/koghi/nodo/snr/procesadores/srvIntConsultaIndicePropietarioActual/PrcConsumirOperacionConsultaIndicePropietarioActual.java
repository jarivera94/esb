package com.koghi.nodo.snr.procesadores.srvIntConsultaIndicePropietarioActual;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;
import com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.TipoListResultadoCompleto;
import com.koghi.nodo.snr.tos.srvIntConsultaIndicePropietarioActual.TOEntradaConsultaIndicePropietarioActual;
import com.koghi.nodo.snr.util.srvIntConsultaIndicePropietarioActual.ClienteWsdlSNR;
import com.koghi.nodo.snr.util.srvIntConsultaIndicePropietarioActual.LectorArchivoPropiedades;

public class PrcConsumirOperacionConsultaIndicePropietarioActual implements Processor {
	
	@Override
	public void process (Exchange exchange) throws Exception {
		ClienteWsdlSNR cliente = ClienteWsdlSNR.getInstancia();
		String body = exchange.getIn().getBody() != null ? exchange.getIn().getBody().toString() : "";
		System.out.println("Body desde Postman: \n" + body);
		if (body.indexOf("[") >= 0) {
			body = body.substring(1, body.length() - 1);
		}
		System.out.println("Body después de quitar los brackets: \n" + body);
		TOEntradaConsultaIndicePropietarioActual entradaServicio = new Gson().fromJson(body, TOEntradaConsultaIndicePropietarioActual.class);
		entradaServicio = entradaServicio != null ? entradaServicio : new TOEntradaConsultaIndicePropietarioActual();

		entradaServicio.setSistemaUsuario(exchange.getIn().getHeader("SistemaUsuario") != null ? exchange.getIn().getHeader("SistemaUsuario").toString() : "");
		entradaServicio.setClave(exchange.getIn().getHeader("ClaveUsuario") != null ? exchange.getIn().getHeader("ClaveUsuario").toString() : "");
		TipoListResultadoCompleto salidaServicio = new TipoListResultadoCompleto();
		
		LectorArchivoPropiedades.setValProperty();
		String hostURI = LectorArchivoPropiedades.getProperty("HOST_SOAP_SNR");
		if (!hostURI.isEmpty()) {
			cliente.setNewEndpointWSDL(hostURI);
		}
		
		salidaServicio = cliente.ejecutarBusqueda(entradaServicio.getEntrada(), entradaServicio.getSistemaUsuario(), entradaServicio.getClave());
		
		String jsonRespuesta = new Gson().toJson(salidaServicio, TipoListResultadoCompleto.class);
		
		System.out.println("JSON Respuesta: " + jsonRespuesta);
		exchange.getIn().setBody(jsonRespuesta);
		exchange.setOut(exchange.getIn());
	}

}
