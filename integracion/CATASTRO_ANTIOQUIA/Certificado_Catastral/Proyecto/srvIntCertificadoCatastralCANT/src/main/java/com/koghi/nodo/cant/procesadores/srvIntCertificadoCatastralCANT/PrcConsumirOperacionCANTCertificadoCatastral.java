package com.koghi.nodo.cant.procesadores.srvIntCertificadoCatastralCANT;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

import com.koghi.nodo.cant.util.srvIntCertificadoCatastralCANT.ClienteWsdlCa;
import com.koghi.nodo.cant.util.srvIntCertificadoCatastralCANT.LectorArchivoPropiedades;

public class PrcConsumirOperacionCANTCertificadoCatastral implements Processor {
	
	@Override
	public void process (Exchange ex) throws Exception {
		ClienteWsdlCa cliente = ClienteWsdlCa.getInstancia();
		
		String operacion = ex.getIn().getHeader("operationName").toString();
		
		String body = ex.getIn().getBody() != null ? ex.getIn().getBody().toString() : "";
		System.out.println("Body desde Postman: \n" + body);
		if (body.indexOf("[") >= 0) {
			body = body.substring(1, body.length() - 1);
		}
		System.out.println("Body después de quitar los brackets: \n" + body);
		JSONObject json = !body.equals("") ? new JSONObject(body) : new JSONObject();
		
		String respuesta = "";
		
		String fichaPredial = json.has("fichaPredial") ? json.get("fichaPredial").toString() : "";
		String matriculaCompleta = json.has("matriculaCompleta") ? json.get("matriculaCompleta").toString() : "";
		String numeroPredialNacional = json.has("numeroPredialNacional") ? json.get("numeroPredialNacional").toString() : "";
		int identificadorEntidad = json.has("identificadorEntidad") ? Integer.parseInt(json.get("identificadorEntidad").toString()) : -1;
		
		LectorArchivoPropiedades.setValProperty();
		String hostURI = LectorArchivoPropiedades.getProperty("HOST_SOAP_CANT");
		if (!hostURI.isEmpty()) {
			cliente.setNewEndpointWSDL(hostURI);
		}
		
		switch (operacion) {
			case "consultarPorFichaPredial" :
				respuesta = cliente.genCertPlanoCatastralNodoTierras(fichaPredial, "", "", identificadorEntidad);
				break;
			case "consultarPorFolioDeMatricula" :
				respuesta = cliente.genCertPlanoCatastralNodoTierras("", matriculaCompleta, "", identificadorEntidad);
				break;
			case "consultarPorCedulaCatastral" :
				respuesta = cliente.genCertPlanoCatastralNodoTierras("", "", numeroPredialNacional, identificadorEntidad);
				break;
		}
		
//		System.out.println("Respuesta: " + respuesta);
		JSONObject jsonRespuesta = new JSONObject();
		jsonRespuesta.put("archivo", respuesta);
		System.out.println("JSON Respuesta: " + jsonRespuesta.toString());
		ex.getIn().setBody(jsonRespuesta.toString());
		ex.setOut(ex.getIn());
	}

}
