package com.koghi.urt.servicios.urt.prediosInscritos.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcessorPrediosJSON implements Processor{

	@Override
	public void process(Exchange ex) throws Exception {
		ex.setOut(ex.getIn());
		ex.getOut().setHeader("CamelHttpPath", "");
		ex.getOut().setBody(ex.getIn().getBody(String.class));
		
	}

}
