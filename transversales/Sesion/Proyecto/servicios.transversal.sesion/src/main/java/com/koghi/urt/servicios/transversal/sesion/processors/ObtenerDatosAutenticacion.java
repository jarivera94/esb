package com.koghi.urt.servicios.transversal.sesion.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

import com.koghi.urt.servicios.transversal.sesion.modelo.CodificarBase64;

public class ObtenerDatosAutenticacion implements Processor{
	
	public void process(Exchange ex) throws Exception {
		String authorization = ex.getIn().getHeader("Authorization")!=null?ex.getIn().getHeader("Authorization").toString().trim():"";
		if (!authorization.equals("")) {
			if (authorization.length() >= 7) {
				String basic = authorization.substring(0,6);
				if (basic.equals("Basic ")) {
					String credencialesCodificadas = authorization.substring(6,authorization.length());
					String decoded = CodificarBase64.decodificar(credencialesCodificadas);
					String[] credenciales = decoded.split(":");
					if (credenciales.length == 2) {
						ex.getIn().setHeader("AuthorizationExists", true);
						String user = credenciales[0];
						String password = credenciales[1];
						String entidad = ex.getIn().getHeader("EntidadEmisora")!=null?ex.getIn().getHeader("EntidadEmisora").toString().trim():"";
						if (!entidad.equals("")) {
							String passwordEncriptado = CodificarBase64.encriptar(password, CodificarBase64.MD5);
							ex.getIn().setHeader("EntidadExists", true);
							ex.getIn().setHeader("user", user);
							ex.setProperty("usuarioAutenticado", user);
							ex.getIn().setHeader("password", password);
							ex.getIn().setHeader("entidad", entidad);
							ex.getIn().setHeader("passwordEncriptado", passwordEncriptado);
							ex.setOut(ex.getIn());
						}else {
							ex.getIn().setHeader("EntidadExists", false);
							JSONObject json = new JSONObject();
							json.put("idAutenticacionExitosa", false);
							JSONObject error = new JSONObject();
							error.put("codError", "ERR_SESION_AUTENTICAR_007"); //ERROR 7, HEADER MAL FORMADO
							error.put("valDescripcion", "Hay algun header inexistente o mal formado");
							error.put("valExcepcion", "El Header IdEntidadConsumidora no fue encontrado, o no está apropiadamente diligenciado");
							json.put("Errores", error);
							ex.getIn().setBody(json.toString());
							ex.setOut(ex.getIn());
						}
					}else {
						ex.getIn().setHeader("AuthorizationExists", false);
						ex.getIn().setHeader("EntidadExists", false);
						JSONObject json = new JSONObject();
						json.put("idAutenticacionExitosa", false);
						JSONObject error = new JSONObject();
						error.put("codError", "ERR_SESION_AUTENTICAR_007"); //ERROR 7, HEADER MAL FORMADO
						error.put("valDescripcion", "Hay algun header inexistente o mal formado");
						error.put("valExcepcion", "El Header Authorization no está apropiadamente formado");
						json.put("Errores", error);
						ex.getIn().setBody(json.toString());
						ex.setOut(ex.getIn());
					}
				}else {
					ex.getIn().setHeader("AuthorizationExists", false);
					ex.getIn().setHeader("EntidadExists", false);
					JSONObject json = new JSONObject();
					json.put("idAutenticacionExitosa", false);
					JSONObject error = new JSONObject();
					error.put("codError", "ERR_SESION_AUTENTICAR_007"); //ERROR 7, HEADER MAL FORMADO
					error.put("valDescripcion", "Hay algun header inexistente o mal formado");
					error.put("valExcepcion", "El Header Authorization no fue encontrado, o no está apropiadamente diligenciado");
					json.put("Errores", error);
					ex.getIn().setBody(json.toString());
					ex.setOut(ex.getIn());
				}
			}else {
				ex.getIn().setHeader("AuthorizationExists", false);
				ex.getIn().setHeader("EntidadExists", false);
				JSONObject json = new JSONObject();
				json.put("idAutenticacionExitosa", false);
				JSONObject error = new JSONObject();
				error.put("codError", "ERR_SESION_AUTENTICAR_007"); //ERROR 7, HEADER MAL FORMADO
				error.put("valDescripcion", "Hay algun header inexistente o mal formado");
				error.put("valExcepcion", "El Header Authorization no fue encontrado, o no está apropiadamente diligenciado");
				json.put("Errores", error);
				ex.getIn().setBody(json.toString());
				ex.setOut(ex.getIn());
			}
			
		}else {
			ex.getIn().setHeader("AuthorizationExists", false);
			ex.getIn().setHeader("EntidadExists", false);
			JSONObject json = new JSONObject();
			json.put("idAutenticacionExitosa", false);
			JSONObject error = new JSONObject();
			error.put("codError", "ERR_SESION_AUTENTICAR_007"); //ERROR 7, HEADER MAL FORMADO
			error.put("valDescripcion", "Hay algun header inexistente o mal formado");
			error.put("valExcepcion", "El Header Authorization no fue encontrado, o no está apropiadamente diligenciado");
			json.put("Errores", error);
			
			ex.getIn().setBody(json.toString());
			ex.setOut(ex.getIn());
		}
	}
}
