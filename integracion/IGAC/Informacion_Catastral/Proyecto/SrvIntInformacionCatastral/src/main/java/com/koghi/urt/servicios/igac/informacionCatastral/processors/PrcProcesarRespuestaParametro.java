package com.koghi.urt.servicios.igac.informacionCatastral.processors;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

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
		datosCorreo.put("idUsuario", "idUsuarioPrueba");
		datosCorreo.put("idTx", "idTxPrueba");
		datosCorreo.put("asunto", "Incidencia en el servicio " + "Información Catastral" 
				+ ", versión " + "1.0" 
				+ ", operación: " + (ex.getIn().getHeader("operationName")!=null?ex.getIn().getHeader("operationName").toString():" "));
		datosCorreo.put("cuerpoMensaje", "Nombre de Contacto: " + "Reinaldo Gámez"
				+ ", teléfono: " + "911"
				+ ", transacción: " + ""
				+ ", Fecha y Hora: " + new java.util.Date().toString()
				+ ", código: " + ""
				+ ", descripción: " + "Ocurrió una excepción al ejecutar la operación"
				+ ", excepción: " + e.getMessage());
		datosCorreo.put("valDestinatario", valDestinatario);
		
		ex.setProperty("objCorreoMesaAyuda", datosCorreo);
		
//		ex.getIn().setBody(datosCorreo.toString());
		System.out.println("Datos correo:\n" + datosCorreo.toString());
		ex.setOut(ex.getIn());
	}

}
