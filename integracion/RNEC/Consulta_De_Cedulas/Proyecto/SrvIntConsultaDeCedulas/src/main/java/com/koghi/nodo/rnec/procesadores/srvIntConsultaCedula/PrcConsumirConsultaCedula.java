package com.koghi.nodo.rnec.procesadores.srvIntConsultaCedula;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;
import org.json.XML;

import com.koghi.nodo.rnec.util.srvIntConsultaCedula.ClienteConsultaCedula;

public class PrcConsumirConsultaCedula implements Processor {
	
	public void process (Exchange ex) throws Exception {
		System.out.println("*************Entra a PrcConsumirConsultaCedula");
		
		ClienteConsultaCedula cliente = ClienteConsultaCedula.getInstancia();
		
		System.out.println("**************Después de instanciar el cliente del web service");
		
		String usuario = ex.getProperty("usuario").toString();
		String password = ex.getProperty("password").toString();
		String entidad = ex.getProperty("entidad").toString();
		String cedulas = ex.getProperty("cedulas").toString();
		
		System.out.println("***************ANTES DE CONSUMIR CONSULTA CEDULA");
		
		String respuesta = cliente.consultarCedulas(usuario, password, entidad, cedulas);
		
		System.out.println("***************DESPUES DE CONSUMIR CONSULTA CEDULA");
		
//		System.out.println("Respuesta XML en consulta cédulas: " + respuesta);
		JSONObject jsonRespuesta = XML.toJSONObject(respuesta);
		System.out.println("Respuesta JSON en consulta cédulas: " + jsonRespuesta.toString());
		
		ex.getIn().setBody(jsonRespuesta.getJSONObject("respuesta").toString());

		ex.setOut(ex.getIn());
	}

}
