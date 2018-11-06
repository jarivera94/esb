package com.koghi.nodo.uariv.procesadores.srvIntAnexo11;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;


public class PrcConsumirServicioUariv implements Processor {
	
	public void process(Exchange ex) throws Exception {
		String cuerpo;
		String regex = "\\d*";
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

		String periodo = json.has("periodo") ? json.getString("periodo") : "-1";
		String mes = json.has("mes") ? json.getString("mes") : "-1";
		String vigencia = json.has("vigencia") ? json.getString("vigencia") : "-1";
		
		periodo = periodo.matches(regex) ? periodo : "-1";
		mes = mes.matches(regex) ? mes : "-1";
		vigencia = vigencia.matches(regex) ? vigencia : "-1";
		
		String idUsuario = ex.getIn().getHeader("idUsuarioUariv").toString();
		String token = ex.getIn().getHeader("tokenUariv").toString();
		String parametros = idUsuario + "/" + token + "/" + codap + "/" + periodo + "," + mes + "," + vigencia;
		
		ex.getIn().setHeader("CamelHttpPath",parametros);
		ex.getIn().setHeader("CamelHttpMethod", "GET");
		ex.getIn().setHeader("Content-Type", "text");
		
		ex.getIn().setBody(parametros);
		
	}
	

}
