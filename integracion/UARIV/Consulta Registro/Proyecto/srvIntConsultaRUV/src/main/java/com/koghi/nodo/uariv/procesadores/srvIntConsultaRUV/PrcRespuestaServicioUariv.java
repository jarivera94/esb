package com.koghi.nodo.uariv.procesadores.srvIntConsultaRUV;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

public class PrcRespuestaServicioUariv implements Processor {
	
	public void process(Exchange ex) throws Exception {
		System.out.println("PROCESAR RESPUESTA RUV");
		String cuerpo = ex.getIn().getBody().toString();
		
		Pattern pattern = Pattern.compile("<estadoTransaccion>Este usuario NO se encuentra AUTENTICADO...</estadoTransaccion>");
		Matcher matcher = pattern.matcher(cuerpo);
		pattern = Pattern.compile("<descripcion>EL TOKEN ENVIADO NO ES VALIDO PARA  ACCEDER AL WEB SERVICES</descripcion>");
		Matcher matcher2 = pattern.matcher(cuerpo);
		
		if (matcher.find() || matcher2.find()) {
			//TOKEN EXPIRADO
			ex.getIn().setHeader("actualizarCache", true);
		}else {
			respuestaTokenValido(ex);
		}
		ex.setOut(ex.getIn());
	}
	
	private void respuestaTokenValido(Exchange ex) throws Exception {
		String cuerpo = ex.getIn().getBody().toString();
		
		System.out.println("CUERPO OBTENIDO COMO RESPUESTA CON UN TOKEN VALIDO: ");
		System.out.println(cuerpo);
		
		JSONObject respuesta = new JSONObject();
		JSONArray respuestaArr = new JSONArray();
//		String subTabla = cuerpo.substring(cuerpo.indexOf("<ArrayOfDatosBasicos") , cuerpo.indexOf("</ArrayOfDatosBasicos") + 15);
//		String subTabla = cuerpo.substring(cuerpo.indexOf("<ArrayOfDatosBasicos") , cuerpo.indexOf("</ArrayOfDatosBasicos") + 22);
//		System.out.println("Array of Datos Básicos: " + subTabla);
		System.out.println("Array of Datos Básicos: " + cuerpo);
//		respuesta = XML.toJSONObject(subTabla).getJSONObject("ArrayOfDatosBasicos");
		respuesta = XML.toJSONObject(cuerpo).getJSONObject("root").getJSONObject("ArrayOfDatosBasicos");
		if (respuesta.has("DatosBasicos")) {			
			respuesta.remove("xmlns");
			respuesta.remove("xmlns:i");
//			respuesta = XML.toJSONObject(subTabla).getJSONObject("DatosBasicos");
			try {
				respuestaArr = respuesta.getJSONArray("DatosBasicos");
				ex.getIn().setBody(respuestaArr.toString());
			} catch (Exception e) {
				respuesta = respuesta.getJSONObject("DatosBasicos");
				ex.getIn().setBody(respuesta.toString());
			}
		} else {
			respuesta = new JSONObject("{}");
			ex.getIn().setBody(respuesta.toString());
		}
		
		System.out.println("JSON GENERADO A PARTIR DE RUV: ");
		System.out.println(respuesta.toString());
	}
}
