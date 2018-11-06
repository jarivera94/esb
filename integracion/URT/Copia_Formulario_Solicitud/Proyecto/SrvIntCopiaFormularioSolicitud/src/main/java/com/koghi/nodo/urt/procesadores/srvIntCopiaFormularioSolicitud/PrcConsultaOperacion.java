package com.koghi.nodo.urt.procesadores.srvIntCopiaFormularioSolicitud;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcConsultaOperacion implements Processor {
	
	public void process (Exchange ex) throws Exception {
		Object body = ex.getIn().getBody();
		ex.setProperty("bodyBackup", body);
		
		//String operacion = WSPropiedadesSrvIntConsultaPersonasInscritas.OPERACION_CONSULTAR;
		String operacion = ex.getIn().getHeader("IdOperacion")!=null ? ex.getIn().getHeader("IdOperacion").toString() : "";
		ex.getIn().setBody(operacion);
		ex.setOut(ex.getIn());
		
		System.out.println("HEADERS EN PROCESSOR PrcConsultaOperacion");
		for (String llave: ex.getIn().getHeaders().keySet()) {
			System.out.println(llave + "   -------->   " + ex.getIn().getHeaders().get(llave).toString());
		}
	}

}
