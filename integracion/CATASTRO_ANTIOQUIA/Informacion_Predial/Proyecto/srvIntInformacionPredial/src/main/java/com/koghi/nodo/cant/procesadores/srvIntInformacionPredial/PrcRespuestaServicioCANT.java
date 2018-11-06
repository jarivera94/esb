package com.koghi.nodo.cant.procesadores.srvIntInformacionPredial;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

public class PrcRespuestaServicioCANT implements Processor {
	
	public void process (Exchange ex) throws Exception {
		
		String inBody = ex.getIn().getBody() != null ? ex.getIn().getBody(String.class) : "";
		String operacionCANT = ex.getIn().getHeader("operationName", String.class);
		String respuestaServicio = "";
		
		JSONObject jsonRespuesta = XML.toJSONObject(inBody);
		jsonRespuesta = jsonRespuesta.getJSONObject("S:Envelope");
		jsonRespuesta = jsonRespuesta.getJSONObject("S:Body");
		jsonRespuesta = jsonRespuesta.getJSONObject("ns2:obtenerInformacionPredialNodoTierrasResponse");
		
		if (jsonRespuesta.has("return")) {			
			switch (operacionCANT) {
				case "consultarPorDocumento":
				case "consultarPorRazonSocial":
				case "consultarPorNombrePropietario":
					respuestaServicio = jsonRespuesta.getJSONArray("return").toString(); 
					break;
				default:
					respuestaServicio = jsonRespuesta.getJSONObject("return").toString(); 
					break;
			}
		} else {
			respuestaServicio = "{}";
		}
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("-------------------- Body de respuesta --------------------");
		System.out.println(inBody);
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("JSON Respuesta:\n" + respuestaServicio);
		
		ex.getOut().setBody(respuestaServicio);
	}

}
