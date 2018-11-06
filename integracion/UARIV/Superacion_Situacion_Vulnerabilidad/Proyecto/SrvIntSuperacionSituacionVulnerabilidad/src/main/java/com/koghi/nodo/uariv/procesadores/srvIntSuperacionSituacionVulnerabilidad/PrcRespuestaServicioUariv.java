package com.koghi.nodo.uariv.procesadores.srvIntSuperacionSituacionVulnerabilidad;

import java.util.ArrayList;
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
		
		ArrayList<JSONObject> coleccion = new ArrayList<JSONObject>();
		
		int i=0;
		
		Pattern pattern = Pattern.compile("<Table diffgr:id=\"Table" + (i+1) + "\".*rowOrder=\"" + i + "\">.*</Table>");
		Matcher matcher = pattern.matcher(cuerpo);

		while (matcher.find()) {
			String tabla = matcher.group();
			String subTabla = tabla.substring(tabla.indexOf("<Table") , tabla.indexOf("</Table") + 8);
			JSONObject elemento = XML.toJSONObject(subTabla).getJSONObject("Table");
			coleccion.add(elemento);
			i++;
			matcher = matcher.reset();
			pattern = Pattern.compile("<Table diffgr:id=\"Table" + (i+1) + "\".*rowOrder=\"" + i + "\">.*</Table>");
			matcher = pattern.matcher(cuerpo);
		}
		JSONArray respuesta = new JSONArray(coleccion);
		
		ex.getIn().setBody(respuesta.toString());
		
		System.out.println("JSON GENERADO A PARTIR DE PAGOS AYUDA HUMANITARIA: ");
		System.out.println(respuesta.toString());
	}
}
