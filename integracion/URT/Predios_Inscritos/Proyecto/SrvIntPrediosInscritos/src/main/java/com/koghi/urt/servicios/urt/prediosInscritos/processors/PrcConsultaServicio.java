package com.koghi.urt.servicios.urt.prediosInscritos.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcConsultaServicio implements Processor {
	
	public void process (Exchange ex) throws Exception {
		String body = "SrvIntConsultaPersonasInscritasV1";
		ex.getIn().setBody(body);
		ex.setOut(ex.getIn());
		
		System.out.println("Body a la salida de ConsultaServicio: " + ex.getOut().getBody().toString());
	}

}

