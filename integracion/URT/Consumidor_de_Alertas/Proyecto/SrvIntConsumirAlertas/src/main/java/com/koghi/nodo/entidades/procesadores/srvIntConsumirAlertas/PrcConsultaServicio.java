package com.koghi.nodo.entidades.procesadores.srvIntConsumirAlertas;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.koghi.nodo.entidades.modelo.srvIntConsumirAlertas.LectorArchivoPropiedades;

public class PrcConsultaServicio implements Processor {
	
	public void process (Exchange ex) throws Exception {
		LectorArchivoPropiedades.setValProperty();
		String body = LectorArchivoPropiedades.getProperty("ID_SERVICIO");
		ex.getIn().setBody(body);
		ex.setOut(ex.getIn());
		
		System.out.println("Body a la salida de ConsultaServicio: " + ex.getOut().getBody().toString());
	}

}

