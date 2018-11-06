package com.koghi.nodo.urt.procesadores.srvIntConsultaITPITG;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcConsultar implements Processor{

	@Override
	public void process(Exchange ex) throws Exception {
		ex.getOut().setBody(ex.getIn().getBody(String.class));
		ex.setOut(ex.getIn());		
	}
}
