package com.koghi.nodo.uariv.procesadores.srvIntAnexo11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

import com.koghi.nodo.uariv.util.srvIntAnexo11.CacheLoginUariv;

public class PrcRespuestaLogin implements Processor {
	
	public void process(Exchange ex) throws Exception {
		String body = ex.getIn().getBody().toString();
		System.out.println("Body obtenido como respuesta del login: ");
		System.out.println(body);
		
		Pattern pattern = Pattern.compile("<IdUsuario>.*</IdUsuario>");
		Matcher matcher = pattern.matcher(body);
		
		String idUsuario;
		
		if (matcher.find()){
			System.out.println("MATCH");
			idUsuario = matcher.group();
			idUsuario = idUsuario.substring(11, idUsuario.length()-12);
			if (idUsuario.contains("INCORRECTO") || idUsuario.toUpperCase().replaceAll(" ", "").contains("YASEENCUENTRALOGUEADO")){
				idUsuario = "INCORRECTO";
			}
		}else{
			idUsuario = "INCORRECTO";
			System.out.println("NO MATCH");
		}
		
		pattern = Pattern.compile("<Token>.*</Token>");
		matcher = pattern.matcher(body);
		
		String token;
		
		if (matcher.find()){
			System.out.println("MATCH");
			token = matcher.group();
			token = token.substring(7,token.length()-8);
			if (token.contains("INCORRECTO") || token.toUpperCase().replaceAll(" ", "").contains("YASEENCUENTRALOGUEADO")){
				token = "INCORRECTO";
			}
		}else{
			token = "INCORRECTO";
			System.out.println("NO MATCH");
		}
		
		boolean loginExitoso;
		
		if (!idUsuario.equals("INCORRECTO") && !token.equals("INCORRECTO")) {
			loginExitoso = true;
			ex.getIn().setHeader("tokenUariv", token);
			ex.getIn().setHeader("idUsuarioUariv", idUsuario);
			String credenciales = ex.getIn().getHeader("credencialesLoginUariv").toString();
			String datosAutorizacion = idUsuario + ":" + token;
			JSONObject json = new JSONObject();
			json.put(credenciales , datosAutorizacion);
			String ruta = ex.getIn().getHeader("rutaCacheLogin").toString();
			CacheLoginUariv.getInstance(ruta).setCache(json, ruta);
		}else {
			loginExitoso = false;
			//SETEAR EN EL BODY EL ERROR.
			JSONObject error = new JSONObject();
			error.put("codError", "ERR_CONSULTA_RUV_001");
			error.put("valDescripcion", "La autenticación interna de la entidad no fue exitosa.");
			error.put("respuestaServicio", body);
			ex.getIn().setBody(error.toString());
		}
		ex.getIn().setHeader("loginExitoso", loginExitoso);
		ex.setOut(ex.getIn());	
	}
}