package com.koghi.nodo.uariv.procesadores.srvIntAnexo11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONArray;

import com.koghi.nodo.uariv.util.srvIntAnexo11.XMLParserDOMUtil;

public class PrcRespuestaServicioUariv implements Processor {
	
	public void process(Exchange ex) throws Exception {
		System.out.println("PROCESAR RESPUESTA ANEXOS 11");
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

		JSONArray respuesta = new JSONArray();
		String filePath = ex.getIn().getHeader("rutaArchivoRespuesta").toString() + "/respuestaAnexos11.xml";
		System.out.println("------------------ Antes del parser XML ------------------");
		System.out.println("------------------ Ruta al archivo: " + filePath + " ------------------");
		respuesta = XMLParserDOMUtil.parseXML(filePath);
		ex.getIn().setBody(respuesta.toString());
		
		System.out.println("JSON GENERADO A PARTIR DE CONSULTA ANEXOS 11: ");
		System.out.println(respuesta.get(0).toString());
	}

}
