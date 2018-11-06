package com.koghi.nodo.uariv.procesadores.srvIntAnexo11;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.file.FileComponent;

public class PrcSetFileName implements Processor{

	@Override
	public void process(Exchange ex) throws Exception {
		
//		ex.setOut(ex.getIn());
//		ex.getOut().getHeaders().put(FileComponent.HEADER_FILE_NAME, "report.txt");
//		FileComponent.HEADER_FILE_NAME = "";
	}

}
