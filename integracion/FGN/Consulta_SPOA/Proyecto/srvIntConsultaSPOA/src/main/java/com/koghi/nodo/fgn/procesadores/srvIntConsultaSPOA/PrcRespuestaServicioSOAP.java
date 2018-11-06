package com.koghi.nodo.fgn.procesadores.srvIntConsultaSPOA;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

public class PrcRespuestaServicioSOAP implements Processor {
	
	public void process (Exchange ex) throws Exception {
		
		String inBody = ex.getIn().getBody() != null ? ex.getIn().getBody(String.class) : "";
		String operacionCANT = ex.getIn().getHeader("operationName", String.class);
		String respuestaServicio = "";
		
		JSONObject jsonRespuesta = XML.toJSONObject(inBody);
		jsonRespuesta = jsonRespuesta.getJSONObject("S:Envelope");
		jsonRespuesta = jsonRespuesta.getJSONObject("S:Body");
		jsonRespuesta = jsonRespuesta.has("ns0:ejecutarBusquedaResponse") ? jsonRespuesta.getJSONObject("ns0:ejecutarBusquedaResponse") : 
						jsonRespuesta.getJSONObject("ns2:ejecutarBusquedaResponse");

		respuestaServicio = jsonRespuesta.getJSONObject("return").toString(); 
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("-------------------- Body de respuesta --------------------");
		System.out.println(inBody);
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("JSON Respuesta:\n" + respuestaServicio);
		
		ex.getOut().setBody(respuestaServicio);
	}

}
