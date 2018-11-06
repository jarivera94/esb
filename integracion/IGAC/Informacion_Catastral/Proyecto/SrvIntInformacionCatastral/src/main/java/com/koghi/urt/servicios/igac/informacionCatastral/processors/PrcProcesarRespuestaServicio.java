package com.koghi.urt.servicios.igac.informacionCatastral.processors;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONArray;
import org.json.JSONObject;

public class PrcProcesarRespuestaServicio implements Processor {
	
	public void process(Exchange ex) throws Exception {
		
		List<JSONObject> listaMensajesCorreo = new ArrayList<JSONObject>();		
		JSONObject infoCorreo = (JSONObject) ex.getProperty("objCorreoMesaAyuda");
		listaMensajesCorreo.add(infoCorreo);
		
		Exception e = ex.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
		
		String body;
		if (ex.getIn().getBody() != null) {
			body = ex.getIn().getBody(String.class);
		} else {
			body = "{\"valValor\" : \"dagudelo@koghi.com\"}";
		}
		
		System.out.println("\nBody en PrcRespuestaServicio:\n" + body);
		JSONObject respuestaServicio = new JSONObject(body);
		String valDestinatario = respuestaServicio.getString("valEmailNotificacion");
		
		JSONObject datosCorreo = new JSONObject();
		datosCorreo.put("idUsuario", "idUsuarioPrueba");
		datosCorreo.put("idTx", "idTxPrueba");
		datosCorreo.put("asunto", "Incidencia en el servicio " + "Personas Inscritas" 
				+ ", versión " + "1.0" 
				+ ", operación: " + "Consultar");
		datosCorreo.put("cuerpoMensaje", "Transacción: " + "Tx001"
				+ ", Fecha y Hora: " + new java.util.Date().toString()
				+ ", Código: " + "-1"
				+ ", Descripción: " + "error responsable servicio"
				+ ", Excepción: " + e.getMessage());
		datosCorreo.put("valDestinatario", valDestinatario);
				
//		ex.getIn().setBody(datosCorreo.toString());
		listaMensajesCorreo.add(datosCorreo);
		JSONArray arreglo = new JSONArray(listaMensajesCorreo);
		ex.getIn().setBody(arreglo.toString());
		System.out.println("Datos correo:\n" + datosCorreo.toString());
		ex.setOut(ex.getIn());
	}
	
}
