package com.koghi.nodo.uariv.procesadores.srvIntSuperacionSituacionVulnerabilidad;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;


public class PrcConsumirServicioUariv implements Processor {
	
	public void process(Exchange ex) throws Exception {
		String cuerpo;
		if (ex.getProperties().containsKey("bodyBackup")) {
			cuerpo = ex.getProperty("bodyBackup").toString();
		}else {
			cuerpo = ex.getIn().getBody().toString();
			ex.setProperty("bodyBackup", cuerpo);
		}
		if (cuerpo.charAt(0) == '[') {
			cuerpo = cuerpo.substring(1 , cuerpo.length() - 1);
		}
		String codap = ex.getIn().getHeader("CODAP").toString();
		JSONObject json = new JSONObject(cuerpo);
		String documento = json.has("documento") ? json.getString("documento") : "-1";
		if (documento.length() <= 1) {
			documento = "-1";
		}
		String tipoOperacion = json.has("tipo_operacion") ? json.getString("tipo_operacion") : "-1";
		if (tipoOperacion.length() <= 0) {
			tipoOperacion = "-1";
		}
		String idUsuario = ex.getIn().getHeader("idUsuarioUariv").toString();
		String token = ex.getIn().getHeader("tokenUariv").toString();
		String parametros = idUsuario + "/" + token + "/" + codap + "/" + tipoOperacion + "," + documento;
		
		ex.getIn().setHeader("CamelHttpPath",parametros);
		ex.getIn().setHeader("CamelHttpMethod", "GET");
		ex.getIn().setHeader("Content-Type", "text");
		
		ex.getIn().setBody(parametros);
		
		
		
		
	}
	

}
