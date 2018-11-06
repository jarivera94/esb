package com.koghi.nodo.rnec.procesadores.srvIntConsultaCedula;

import java.util.ArrayList;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONArray;
import org.json.JSONObject;

import com.koghi.nodo.rnec.util.srvIntConsultaCedula.CedulasXmlParser;
import com.koghi.nodo.rnec.util.srvIntConsultaCedula.DecodificadorBase64;
import com.koghi.nodo.rnec.util.srvIntConsultaCedula.LectorArchivoPropiedades;

public class PrcConsultaCedula implements Processor {
	
	public void process (Exchange ex) throws Exception {
		System.out.println("************************Entra a PrcConsultaCedula");
		String body = ex.getIn().getBody() != null ? ex.getIn().getBody().toString() : "";
		System.out.println("BODY:\n" + body);
		JSONArray inJsonArr = new JSONArray(body);
		JSONObject inJsonO = inJsonArr != null ? inJsonArr.getJSONObject(0) : new JSONObject(body);
//		if (!body.equals("")) {
//			if (body.charAt(0) == '[') {
//				body = body.substring(1, body.length() - 1);
//			}
//			json = new JSONObject(body);
//		}else {
//			json = new JSONObject();
//		}
		String usuario, password, entidad, listaCedulas;
		LectorArchivoPropiedades.setValProperty();
		String authorization = LectorArchivoPropiedades.getProperty("AUTHORIZATION_OPERACION_CONSULTAR");
		String[] credenciales = DecodificadorBase64.decodificar(authorization).split(":");
		usuario = credenciales[0];
		password = credenciales[1];
		entidad = inJsonO.has("entidad") ? inJsonO.getString("entidad")  : "";
		listaCedulas = inJsonO.has("cedulas") ? inJsonO.getString("cedulas") : "";
		String xmlCedulas = "";
		if (!listaCedulas.equals("")) {
			String[] cedulas = listaCedulas.split(",");
			ArrayList<Long> listadoCedulas = new ArrayList<Long>();
			int n = cedulas.length;
			for (int i=0; i<n; i++) {
				listadoCedulas.add(Long.parseLong(cedulas[i]));
			}
			xmlCedulas = CedulasXmlParser.getCedulasXml(listadoCedulas);
		}
		
		System.out.println("****************************************ENTRADAS PARA EL WEBSERVICE*****************************************************************");
		System.out.println("Usuario: " + usuario);
		System.out.println("Password: " + password);
		System.out.println("Entidad: " + entidad);
		System.out.println("Cedulas:\n" + xmlCedulas);
		System.out.println("****************************************ENTRADAS PARA EL WEBSERVICE*****************************************************************");
		
		ex.setProperty("usuario", usuario);
		ex.setProperty("password", password);
		ex.setProperty("entidad", entidad);
		ex.setProperty("cedulas", xmlCedulas);
			
		ex.setOut(ex.getIn());
	}

}
