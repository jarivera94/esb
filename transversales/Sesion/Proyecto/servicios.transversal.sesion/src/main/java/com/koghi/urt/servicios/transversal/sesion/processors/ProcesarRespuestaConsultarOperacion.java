package com.koghi.urt.servicios.transversal.sesion.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.koghi.urt.servicios.transversal.sesion.modelo.ParserStringToArray;

public class ProcesarRespuestaConsultarOperacion implements Processor {
	
	public void process(Exchange ex) throws Exception {
		System.out.println("ENTRA AL PROCESSOR ProcesarRespuestaConsultarOperacion");
		String body;
		if (ex.getIn().getHeader("cuerpoLeido") == null) {
			body = "";
		}else {
			body = ex.getIn().getHeader("cuerpoLeido").toString();
		}
		System.out.println("BODY: " + body);
		if (body.trim().isEmpty()) {
			JSONObject jsonRespuesta = new JSONObject();
			//ERROR, NO AUTORIZADO. 005
			jsonRespuesta.put("codError", "ERR_SESION_AUTORIZAR_005");
			jsonRespuesta.put("valDescripcion", "La operación suministrada no fue encontrada.");
			jsonRespuesta.put("valExcepcion", "");
			jsonRespuesta.put("indAutorizacionExitosa", false);
			ex.getIn().setBody(jsonRespuesta.toString());
			ex.setOut(ex.getIn());
		}else {
			JSONObject json = new JSONObject(body);
			boolean rolValido, servicioValido;
			JSONObject jsonRespuesta = new JSONObject();
			try{
				JSONArray roles = json.getJSONArray("roles");
				String servicio = json.getString("idServicio");
				rolValido = validarRoles(ex.getIn().getHeader("lista").toString(),roles);
				servicioValido = servicio.trim().equals(ex.getIn().getHeader("idServicio").toString().trim());
				if (servicioValido) {
					jsonRespuesta.put("indAutorizacionExitosa", rolValido);
					if (!rolValido){
						//ERROR, NO AUTORIZADO. 001
						jsonRespuesta.put("codError", "ERR_SESION_AUTORIZAR_001");
						jsonRespuesta.put("valDescripcion", "El usuario no tiene un rol válido para ejecutar la operación.");
						jsonRespuesta.put("valExcepcion", "");
						jsonRespuesta.put("indAutorizacionExitosa", false);
					}
				}else {
					//ERROR, NO AUTORIZADO. 005
					jsonRespuesta.put("codError", "ERR_SESION_AUTORIZAR_005");
					jsonRespuesta.put("valDescripcion", "El id de servicio suministrado no corresponde al id de servicio de la operación consultada.");
					jsonRespuesta.put("valExcepcion", "");
					jsonRespuesta.put("indAutorizacionExitosa", false);
				}
				
				
			}catch (JSONException e){
				rolValido = false;
				//ERROR NO HAY ROLES 002
				jsonRespuesta.put("codError", "ERR_SESION_AUTORIZAR_002");
				jsonRespuesta.put("valDescripcion", "La operación consultada no tiene roles asociados.");
				jsonRespuesta.put("valExcepcion", "");
				jsonRespuesta.put("indAutorizacionExitosa", false);
			}catch (Exception e){
				rolValido = false;
				//Error Excepcion 006
				jsonRespuesta.put("codError", "ERR_SESION_AUTORIZAR_006");
				jsonRespuesta.put("valDescripcion", "Excepción generada.");
				jsonRespuesta.put("valExcepcion", e.getMessage());
				jsonRespuesta.put("indAutorizacionExitosa", false);
			}
			ex.getIn().setHeader("rolValido",rolValido);
			ex.getIn().setBody(jsonRespuesta.toString());
			ex.setOut(ex.getIn());
		}
		
	}
	
	private static boolean validarRoles(String roles, JSONArray rolesOperacion){
		System.out.println("ROLES DE LA PERSONA: " + roles);
		System.out.println("ROLES OPERACION: " + rolesOperacion.toString());
		boolean respuesta = false;
		if (roles != null){
			if (!roles.isEmpty()){
				String[] rolesPersona = ParserStringToArray.castearRoles(roles);
				int n = rolesOperacion.length();
				JSONObject aux;
				for (String rol: rolesPersona){
					System.out.println("ROL BUSCADO: " + rol);
					for (int i=0; i<n; i++){
						aux = rolesOperacion.getJSONObject(i);
						System.out.println(aux);
						System.out.println(aux.getString("idRol"));
						if (rol.equals(aux.getString("idRol"))){
							respuesta = true;
							i = n;
						}
					}
					if (respuesta){
						break;
					}
				}
			}
		}
		return respuesta;
	}

}
