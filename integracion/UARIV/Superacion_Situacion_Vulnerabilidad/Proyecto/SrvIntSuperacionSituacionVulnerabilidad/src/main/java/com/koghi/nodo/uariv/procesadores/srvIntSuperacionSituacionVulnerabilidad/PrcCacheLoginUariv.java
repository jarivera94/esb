package com.koghi.nodo.uariv.procesadores.srvIntSuperacionSituacionVulnerabilidad;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

import com.koghi.nodo.uariv.util.SuperacionSituacionVulnerabilidad.CacheLoginUariv;
import com.koghi.nodo.uariv.util.SuperacionSituacionVulnerabilidad.DecodificadorBase64;

public class PrcCacheLoginUariv implements Processor {
	
	public void process (Exchange ex) throws Exception {
		boolean actualizarCache = Boolean.parseBoolean(ex.getIn().getHeader("actualizarCache").toString());
		String ruta = ex.getIn().getHeader("rutaCacheLogin").toString();
		CacheLoginUariv cacheUariv = CacheLoginUariv.getInstance(ruta);
		String credenciales = ex.getIn().getHeader("credencialesLoginUariv").toString();
		if (!actualizarCache) {
			JSONObject json = cacheUariv.getCache();
			String autorizacionesUariv = json.getString(credenciales);
			String[] autorizacionesUarivArr = autorizacionesUariv.split(":");
			ex.getIn().setHeader("idUsuarioUariv", autorizacionesUarivArr[0]);
			ex.getIn().setHeader("tokenUariv", autorizacionesUarivArr[1]);
		}else {
			String credencialesDecodificadas = DecodificadorBase64.decodificar(credenciales);
			String[] credencialesArr = credencialesDecodificadas.split(":");
			String user = credencialesArr[0];
			String pass = credencialesArr[1];
			String codap = ex.getIn().getHeader("CODAP_LOGIN").toString();
			String parametros = codap + "," + user + "," + pass;
			
			ex.getIn().setHeader("CamelHttpMethod", "GET");
			ex.getIn().setHeader("CamelHttpPath",java.net.URLDecoder.decode(parametros,"UTF-8"));
			ex.getIn().setHeader("Content-Type", "text");
			ex.getIn().setBody(parametros);
		
		}
		ex.setOut(ex.getIn());
	}

}
