package com.koghi.urt.servicios.igac.informacionCatastral.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.koghi.urt.nodo.interfaces.libTransaccion.InterfaceIdsServicios;

public class PrcConsultaServicio implements Processor {
	
	public void process (Exchange ex) throws Exception {
		String body = InterfaceIdsServicios.ID_SERVICIO_INFORMACION_CATASTRAL;
		ex.getIn().setBody(body);
		ex.setOut(ex.getIn());
		
		System.out.println("Body a la salida de ConsultaServicio: " + ex.getOut().getBody().toString());
	}

}

