package com.koghi.nodo.cant.srvIntConsultaGeograficoPredial.procesadores;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcSeteoIdExchange implements Processor {
	
	public void process (Exchange ex) throws Exception {
		String id = ex.getExchangeId();
		ex.setProperty("idExchange", id);
		ex.setOut(ex.getIn());
	}

}
