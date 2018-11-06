package com.koghi.urt.servicios.igac.informacionCatastral.processors;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcRedeliveryCounter implements Processor {
	
	@Override
	public void process(Exchange ex) throws Exception {
		
		CamelContext context = ex.getContext();
		int rCounter = 0;
		
		if (ex.getProperty("contador_redelivery") == null) {
			rCounter = 1;
			ex.setProperty("contador_redelivery", rCounter);
		} else {
			rCounter = Integer.parseInt(ex.getProperty("contador_redelivery").toString());
			rCounter++;
			ex.setProperty("contador_redelivery", rCounter);
		}
		context.createProducerTemplate().send("direct:endPointException", ex);

		System.out.println("Contador errores: " + rCounter);

	}
	
}
