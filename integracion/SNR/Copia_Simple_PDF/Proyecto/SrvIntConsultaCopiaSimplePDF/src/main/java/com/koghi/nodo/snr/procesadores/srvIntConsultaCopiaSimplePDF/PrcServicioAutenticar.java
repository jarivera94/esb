package com.koghi.nodo.snr.procesadores.srvIntConsultaCopiaSimplePDF;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcServicioAutenticar implements Processor {
	
	public void process (Exchange ex) throws Exception {
		//El body se deja en blanco, porque el servicio de autenticar no lo utiliza. Hay un backup del body en la property "bodyBackup"
		ex.getIn().setBody("");	
		ex.setOut(ex.getIn());
	}

}
