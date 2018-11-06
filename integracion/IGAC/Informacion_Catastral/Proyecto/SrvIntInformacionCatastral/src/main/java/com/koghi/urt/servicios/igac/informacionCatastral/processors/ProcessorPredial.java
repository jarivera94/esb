package com.koghi.urt.servicios.igac.informacionCatastral.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcessorPredial implements Processor{

	
//	<setHeader headerName="origen">
//	<simple>${body[0]}</simple>
//</setHeader>
//<setHeader headerName="idRequerimiento">
//	<simple>${body[1]}</simple>
//</setHeader>
//<setHeader headerName="numPredial">
//	<simple>${body[2]}</simple>
//</setHeader>
//<setHeader headerName="usuario">
//	<simple>${body[3]}</simple>
//</setHeader>
	@Override
	public void process(Exchange ex) throws Exception {
		
		String origen = (ex.getIn().getHeader("origen") != null) ? ex.getIn().getHeader("origen").toString() : "";
		String usuario = (ex.getIn().getHeader("usuario") != null) ? ex.getIn().getHeader("usuario").toString() : "";
		String idRequerimiento = (ex.getIn().getHeader("idRequerimiento") != null) ? ex.getIn().getHeader("idRequerimiento").toString() : "";
		String numPredial = (ex.getIn().getHeader("numPredial") != null) ? ex.getIn().getHeader("numPredial").toString() : "";
		String mensaje = "";
		
		//Se crea el query que se le va a enviar al servicio de información
		if(!origen.equals("")){
			mensaje = "origen=" + origen;
			mensaje += ((usuario != "") ? ("&usuario="+usuario) : "") + 
						((idRequerimiento != "") ? ("&idRequerimiento="+idRequerimiento) : "") +
						((numPredial != "") ? ("&numPredial="+numPredial) : "");
		}else{
			throw new Exception("Datos incorrectos");
		}
		ex.setOut(ex.getIn());
		ex.getOut().setHeader("CamelHttpPath", "");
		ex.getOut().setHeader("CamelHttpQuery", mensaje);
	}

}
