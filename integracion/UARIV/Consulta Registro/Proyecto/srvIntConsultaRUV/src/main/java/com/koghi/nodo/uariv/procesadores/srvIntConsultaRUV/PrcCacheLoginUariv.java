package com.koghi.nodo.uariv.procesadores.srvIntConsultaRUV;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

import com.koghi.nodo.uariv.util.srvIntConsultaRUV.CacheLoginUariv;
import com.koghi.nodo.uariv.util.srvIntConsultaRUV.DecodificadorBase64;

public class PrcCacheLoginUariv implements Processor {
	
	public void process (Exchange ex) throws Exception {
		System.out.println("Entra al processor de CacheLoginUariv");
		boolean actualizarCache = Boolean.parseBoolean(ex.getIn().getHeader("actualizarCache").toString());
		System.out.println("Actualizar Cache: " + actualizarCache);
		String ruta = ex.getIn().getHeader("rutaCacheLogin").toString();
		System.out.println("Ruta Cache: "  + ruta);
		CacheLoginUariv cacheUariv = CacheLoginUariv.getInstance(ruta);
		String credenciales = ex.getIn().getHeader("credencialesLoginUariv").toString();
		System.out.println("Credenciales Uariv: " + credenciales);
		if (!actualizarCache) {
			System.out.println("Entra al if porque actualizarCache es false");
			JSONObject json = cacheUariv.getCache();
			System.out.println("Cache leido: " + json.toString());
			String autorizacionesUariv = json.getString(credenciales);
			System.out.println("Autorizaciones leidas del json: " + autorizacionesUariv);
			String[] autorizacionesUarivArr = autorizacionesUariv.split(":");
			ex.getIn().setHeader("idUsuarioUariv", autorizacionesUarivArr[0]);
			ex.getIn().setHeader("tokenUariv", autorizacionesUarivArr[1]);
		}else {
			System.out.println("Entro al else porque actualizarCache es true");
			String credencialesDecodificadas = DecodificadorBase64.decodificar(credenciales);
			System.out.println("Credenciales Uariv Decodificadas: " + credencialesDecodificadas);
			String[] credencialesArr = credencialesDecodificadas.split(":");
			String user = credencialesArr[0];
			String pass = credencialesArr[1];
			String codap = ex.getIn().getHeader("CODAP_LOGIN").toString();
			String parametros = codap + "," + user + "," + pass;
			System.out.println("Parametros que se setearan en el body: " + parametros);
			
			ex.getIn().setHeader("CamelHttpMethod", "GET");
			ex.getIn().setHeader("CamelHttpPath",java.net.URLDecoder.decode(parametros,"UTF-8"));
			ex.getIn().setHeader("Content-Type", "text");
//			ex.getIn().setHeader("payload", parametros);
			ex.getIn().setBody(parametros);
			

//			ex.getIn().setHeader("documento", documento);
//			ex.getIn().setHeader("user", user);
//			ex.getIn().setHeader("pass", pass);
//			ex.getIn().setHeader("parametros", parametros);
//			ex.getIn().setHeader("CamelHttpPath",java.net.URLDecoder.decode(parametros,"UTF-8"));
//			ex.getIn().setHeader("CamelHttpMethod", "GET");
//			ex.getIn().setHeader("CamelHttpUri", "/LoginRest/Autentica.svc/Login/");
//			ex.getIn().setHeader("Content-Type", "text");
//			ex.getIn().setHeader("payload", parametros);
//			ex.getIn().setHeader("cuerpoLeido", null);
//			ex.getIn().setBody(parametros);
		}
		ex.setOut(ex.getIn());
		System.out.println("Fin del processor PrcCacheLoginUariv");
	}

}
