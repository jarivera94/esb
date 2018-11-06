package com.koghi.urt.nodo.srvIntWcfDAICMAEventos.processors;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

import com.koghi.urt.nodo.libTransaccion.objects.ServicioTransaccion;

public class PrcProcesarRespuestaParametro implements Processor {
	
	public void process(Exchange ex) throws Exception {
		
		Exception e = ex.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);

		String body;
		if (ex.getIn().getBody() != null) {
			body = ex.getIn().getBody(String.class);
			System.out.println("Body SIN substriniar:\n" + body);
			body = body.substring(1, body.length() - 1);
		} else {
			body = "{\"valValor\" : \"dagudelo@koghi.com\"}";
		}
		
		System.out.println("\nBody en PrcRespuestaParámetro:\n" + body);
		JSONObject respuestaServicio = new JSONObject(body);
		String valDestinatario = respuestaServicio.getString("valValor");
		
		JSONObject datosCorreo = new JSONObject();
		datosCorreo.put("idUsuario", (ex.getIn().getHeader("IdUsuario") != null ? ex.getIn().getHeader("IdUsuario").toString() : " "));
		datosCorreo.put("idTx", ServicioTransaccion.getId(ex.getProperty("idExchange").toString()));
		datosCorreo.put("asunto", "Incidencia en el servicio " + (ex.getIn().getHeader("IdServicio") != null ? ex.getIn().getHeader("IdServicio").toString() : " ") 
				+ ", versión " + (ex.getIn().getHeader("VersionServicio") != null ? ex.getIn().getHeader("VersionServicio").toString() : " ")
				+ ", operación: " + (ex.getIn().getHeader("operationName")!=null?ex.getIn().getHeader("operationName").toString():" "));
		datosCorreo.put("cuerpoMensaje", "Nombre de Contacto: " + (ex.getIn().getHeader("NombreContactoMesaDeAyuda") != null ? ex.getIn().getHeader("NombreContactoMesaDeAyuda").toString() : " ")
				+ ", teléfono: " + (ex.getIn().getHeader("TelefonoMesaDeAyuda") != null ? ex.getIn().getHeader("TelefonoMesaDeAyuda").toString() : " ")
				+ ", transacción: " + ServicioTransaccion.getId(ex.getProperty("idExchange").toString())
				+ ", Fecha y Hora: " + new java.util.Date().toString()
				+ ", código: " + (ex.getIn().getHeader("CodEstado") != null ? ex.getIn().getHeader("CodEstado").toString() : "-1")
				+ ", descripción: " + "Ocurrió una excepción al ejecutar la operación"
				+ ", excepción: " + e.getMessage());
		datosCorreo.put("valDestinatario", valDestinatario);
		
		ex.setProperty("objCorreoMesaAyuda", datosCorreo);
		
//		ex.getIn().setBody(datosCorreo.toString());
		System.out.println("Datos correo:\n" + datosCorreo.toString());
		ex.setOut(ex.getIn());
	}

}
