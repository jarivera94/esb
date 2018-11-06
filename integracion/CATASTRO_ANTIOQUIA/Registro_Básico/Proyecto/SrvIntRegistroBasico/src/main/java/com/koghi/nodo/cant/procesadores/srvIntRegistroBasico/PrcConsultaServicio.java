package com.koghi.nodo.cant.procesadores.srvIntRegistroBasico;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.koghi.nodo.cant.util.srvIntRegistroBasico.LectorArchivoPropiedades;

public class PrcConsultaServicio implements Processor {
	
	public void process (Exchange ex) throws Exception {
		LectorArchivoPropiedades.setValProperty();
		String body = LectorArchivoPropiedades.getProperty("ID_SERVICIO");
		ex.getIn().setBody(body);
		ex.setOut(ex.getIn());
		
		System.out.println("Body a la salida de ConsultaServicio: " + ex.getOut().getBody().toString());
	}

}

