package com.koghi.urt.servicios.igac.informacionCatastral.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcesorError implements Processor{

	@Override
	public void process(Exchange ex) throws Exception {
		ex.setOut(ex.getIn());
		Exception e = ex.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
		if(e.getMessage().contains("404")){
			ex.getOut().setHeader("Valcodigo", "404");
			ex.getOut().setHeader("IdError", "ERR-002");
		}else if(e.getMessage().contains("/transversales/transaccion")){
			ex.getOut().setHeader("Valcodigo", "500");
			ex.getOut().setHeader("IdError", "ERR-001");
		}else{
			ex.getOut().setHeader("ValCodigo", "500");
			ex.getOut().setHeader("IdError", "ERR-01");
		}
	}

}
