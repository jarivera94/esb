package com.koghi.nodo.cant.procesadores.srvIntCertificadoCatastralCANT;


import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONArray;
import org.json.JSONObject;

import com.koghi.urt.nodo.libTransaccion.objects.ServicioTransaccion;

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
		datosCorreo.put("idUsuario", (ex.getIn().getHeader("IdUsuario") != null ? ex.getIn().getHeader("IdUsuario").toString() : " "));
		datosCorreo.put("idTx", ServicioTransaccion.getId(ex.getProperty("idExchange").toString()));
		datosCorreo.put("asunto", "Incidencia en el servicio " + (ex.getIn().getHeader("IdServicio") != null ? ex.getIn().getHeader("IdServicio").toString() : " ") 
				+ ", versión " + (ex.getIn().getHeader("VersionServicio") != null ? ex.getIn().getHeader("VersionServicio").toString() : " ") 
				+ ", operación: " + (ex.getIn().getHeader("operationName")!=null?ex.getIn().getHeader("operationName").toString():" "));
		datosCorreo.put("cuerpoMensaje", "Transacción: " + ServicioTransaccion.getId(ex.getProperty("idExchange").toString())
				+ ", Fecha y Hora: " + new java.util.Date().toString()
				+ ", Código: " + (ex.getIn().getHeader("CodEstado") != null ? ex.getIn().getHeader("CodEstado").toString() : "-1")
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
