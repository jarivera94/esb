package com.koghi.nodo.uariv.procesadores.srvIntConsultaRUV;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcRespuestaLogout implements Processor {
	
	public void process(Exchange ex) throws Exception {
		System.out.println("RESPUESTA LOGOUT: " + ex.getIn().getBody().toString());
		ex.getIn().setBody(ex.getIn().getHeader("json").toString());
		ex.setOut(ex.getIn());
	}
}
