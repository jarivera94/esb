package com.koghi.nodo.rnec.procesadores.srvIntConsultaCedula;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcSeteoIdExchange implements Processor {
	
	public void process (Exchange ex) throws Exception {
		String id = ex.getExchangeId();
		ex.setProperty("idExchange", id);
		ex.setOut(ex.getIn());
	}

}
