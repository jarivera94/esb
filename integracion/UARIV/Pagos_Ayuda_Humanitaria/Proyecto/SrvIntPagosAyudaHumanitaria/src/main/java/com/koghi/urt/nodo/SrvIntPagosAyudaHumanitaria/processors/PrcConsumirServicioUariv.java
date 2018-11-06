package com.koghi.urt.nodo.SrvIntPagosAyudaHumanitaria.processors;


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
		String documento = json.has("documento")? json.getString("documento") : "-1";
		if (documento.length() <= 1) {
			documento = "-1";
		}
		String opcion = json.has("opcion")? json.getString("opcion") : "-1";
		if (opcion.length() <= 0) {
			opcion = "-1";
		}
		String idUsuario = ex.getIn().getHeader("idUsuarioUariv").toString();
		String token = ex.getIn().getHeader("tokenUariv").toString();
		String parametros = idUsuario + "/" + token + "/" + codap + "/" + documento + "," + opcion;
		
		ex.getIn().setHeader("CamelHttpPath",parametros);
		ex.getIn().setHeader("CamelHttpMethod", "GET");
		ex.getIn().setHeader("Content-Type", "text");
		
		ex.getIn().setBody(parametros);
		
		
		
		
	}
	

}
