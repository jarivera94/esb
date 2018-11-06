package com.koghi.nodo.urt.procesadores.srvIntCopiaFormularioSolicitud;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcSolicitud implements Processor{
	@Override
	public void process(Exchange ex) throws Exception {
//		TOSolicitud json = new Gson().fromJson(ex.getIn().getBody(String.class), TOSolicitud.class);
//		
//		Date date = new Date();
//		DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy");
//
//		json.setFechaDocumento(hourdateFormat.format(date));
//		
//		ex.getOut().setHeader("NumeroDocumento", json.getNumeroDocumento());
//		ex.getOut().setHeader("FechaDocumento", json.getFechaDocumento());
				
		ex.getOut().setBody(ex.getIn().getBody(String.class));
		ex.setOut(ex.getIn());
	}
}
