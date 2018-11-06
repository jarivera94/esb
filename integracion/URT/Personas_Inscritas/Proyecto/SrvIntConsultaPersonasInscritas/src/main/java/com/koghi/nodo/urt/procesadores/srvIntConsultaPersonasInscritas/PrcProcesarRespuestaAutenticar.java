package com.koghi.nodo.urt.procesadores.srvIntConsultaPersonasInscritas;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

import com.koghi.nodo.urt.modelo.srvIntConsultaPersonasInscritas.DecodificadorBase64;

public class PrcProcesarRespuestaAutenticar implements Processor {
	
	public void process (Exchange ex) throws Exception {
		System.out.println("ENTRA A PrcProcesarRespuestaAutenticar");
		System.out.println("*************BODY QUE LLEGA EN PrcProcesarRespuestaAutenticar");
		System.out.println(ex.getIn().getBody());
		System.out.println("BODY QUE LLEGA, TOSTRINIADO");
		System.out.println(ex.getIn().getBody().toString());
		String body = ex.getIn().getBody().toString();
		if (body.charAt(0) == '[') {
			System.out.println("SE SUBSTRINIARA EL BODY");
			body = body.substring(1, body.length() - 1);
		}
		JSONObject json = new JSONObject(body);
		String listaRoles = "";
		boolean estaAutenticado = json.getBoolean("idAutenticacionExitosa");
		String user = "";
		if (estaAutenticado) {
			String authorization = ex.getIn().getHeader("Authorization").toString();
			String decodificado = DecodificadorBase64.decodificar(authorization.substring(6,authorization.length()));
			user = decodificado.split(":")[0];
			listaRoles = json.getString("Lista");
			
			String entidad = ex.getIn().getHeader("EntidadEmisora")!=null?ex.getIn().getHeader("EntidadEmisora").toString():"";
			
			JSONObject jsonAutorizar = new JSONObject();
			jsonAutorizar.put("idUsuario", user);
			jsonAutorizar.put("idTx", "");
			jsonAutorizar.put("idServicio", ex.getIn().getHeader("IdServicio")!=null?ex.getIn().getHeader("IdServicio").toString():"");
			jsonAutorizar.put("idOperacion", ex.getIn().getHeader("IdOperacion")!=null?ex.getIn().getHeader("IdOperacion").toString():"");
			jsonAutorizar.put("Lista", listaRoles);
			jsonAutorizar.put("idEntidadEmisora", entidad);
			jsonAutorizar.put("valIP", ex.getIn().getHeader("IpOrigen")!=null?ex.getIn().getHeader("IpOrigen").toString():"");
			
			body = jsonAutorizar.toString();
			ex.getIn().setBody(body);
		}else {
			Response respuesta = Response.status(Status.FORBIDDEN).entity(body.toString()).type(MediaType.APPLICATION_JSON).build();
			ex.getIn().setBody(respuesta);
		}
		
		ex.getIn().setHeader("estaAutenticado", estaAutenticado);
		ex.setOut(ex.getIn());
	}

}
