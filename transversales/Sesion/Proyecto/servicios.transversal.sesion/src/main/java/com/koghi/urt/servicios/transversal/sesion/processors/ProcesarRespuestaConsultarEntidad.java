package com.koghi.urt.servicios.transversal.sesion.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ProcesarRespuestaConsultarEntidad implements Processor {
	
	@SuppressWarnings("unused")
	public void process(Exchange ex) throws Exception {
		String body = ex.getIn().getHeader("cuerpoLeido")!=null?ex.getIn().getHeader("cuerpoLeido").toString():"";
		@SuppressWarnings("unused")
		JSONObject json = body.isEmpty() ? new JSONObject() : new JSONObject(body);
		boolean ipValida = true;
		if (body.isEmpty()) {
			// ERROR ENTIDAD NO ENCONTRADA EN BD. 008
			ipValida = false;
			JSONObject error = new JSONObject();
			error.put("codError", "ERR_SESION_AUTORIZAR_008");
			error.put("valDescripcion", "No se encontró la entidad suministrada en la base de datos.");
			error.put("indAutorizacionExitosa", false);
			ex.getIn().setBody(error.toString());
		}
		try{
			//JSONArray ips = json.getJSONArray("ips");			SI SE REQUIERE VALIDAR IPS, SE DEBEN DESCOMENTAR ESTAS TRES LINEAS
			//System.out.println("IPS: " + ips);
			//ipValida = validarIp(ex.getIn().getHeader("valIP").toString(),ips);
			if (!ipValida && false){	//SI SE QUIERE VALIDAR IPS, SE TIENE QUE QUITAR EL && false
				//ERROR NO HAY IP. 004
				JSONObject error = new JSONObject();
				error.put("codError", "ERR_SESION_AUTORIZAR_004");
				error.put("valDescripcion", "La ip suministrada no está autorizada.");
				error.put("valExcepcion", "");
				error.put("indAutorizacionExitosa", false);
				ex.getIn().setBody(error.toString());
			}
		}catch(JSONException e){
			ipValida = false;
			JSONObject error = new JSONObject();
			//ERROR NO HAY IP. 003
			error.put("codError", "ERR_SESION_AUTORIZAR_003");
			error.put("valDescripcion", "La entidad consultada no tiene ips permitidas, o es una operación inexistente.");
			error.put("indAutorizacionExitosa", false);
			error.put("valExcepcion", "");
			ex.getIn().setBody(error.toString());
		}catch(Exception e){
			ipValida = false;
			//Error Excepcion 005
			JSONObject error = new JSONObject();
			error.put("codError", "ERR_SESION_AUTORIZAR_005");
			error.put("valDescripcion", "Excepción generada.");
			error.put("valExcepcion", e.getMessage());
			error.put("indAutorizacionExitosa", false);
			ex.getIn().setBody(error.toString());			
		}
		ex.getIn().setHeader("ipValida", ipValida);
		ex.getIn().setHeader("CamelHttpPath", "");
		ex.setOut(ex.getIn());
	}
	
	@SuppressWarnings("unused")
	private static boolean validarIp(String ip, JSONArray ips){
		boolean respuesta = false;
		int n = ips.length();
		JSONObject aux;
		for (int i=0; i<n; i++){
			aux = ips.getJSONObject(i);
			System.out.println("Aux: " + aux);
			if (ip.equals(aux.getString("valIpPermitido"))) {
				respuesta = true;
			}
		}
		return respuesta;
	}

}
