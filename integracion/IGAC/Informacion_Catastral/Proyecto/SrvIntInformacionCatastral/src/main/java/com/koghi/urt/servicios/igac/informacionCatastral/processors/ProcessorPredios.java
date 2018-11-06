package com.koghi.urt.servicios.igac.informacionCatastral.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcessorPredios implements Processor{
	

	@Override
	public void process(Exchange ex) throws Exception {
		String origen = (ex.getIn().getHeader("origen") != null) ? ex.getIn().getHeader("origen").toString() : "";
		String usuario = (ex.getIn().getHeader("usuario") != null) ? ex.getIn().getHeader("usuario").toString() : "";
		String idRequerimiento = (ex.getIn().getHeader("idRequerimiento") != null) ? ex.getIn().getHeader("idRequerimiento").toString() : "";
		String nombre = (ex.getIn().getHeader("nombre") != null) ? ex.getIn().getHeader("nombre").toString() : "";
		String numDoc = (ex.getIn().getHeader("numDoc") != null) ? ex.getIn().getHeader("numDoc").toString() : "";
		String tipoDoc = (ex.getIn().getHeader("tipoDoc") != null) ? ex.getIn().getHeader("tipoDoc").toString() : "";
		String pagina = (ex.getIn().getHeader("pagina") != null) ? ex.getIn().getHeader("pagina").toString() : "";
		String mensaje = "";
		
		if(!origen.equals("")){
			mensaje = "origen=" + origen;
			mensaje += ((usuario != "") ? ("&usuario="+usuario) : "") + 
						((idRequerimiento != "") ? ("&idRequerimiento="+idRequerimiento) : "") +
						((nombre != "") ? ("&nombre="+nombre) : "") +
						((numDoc != "") ? ("&numDoc="+numDoc) : "") +
						((tipoDoc != "") ? ("&tipoDoc="+tipoDoc) : "") +
						((pagina != "") ? ("&pagina="+pagina) : "");
		}else{
			throw new Exception("Datos incorrectos");
		}
		ex.setOut(ex.getIn());
		ex.getOut().setHeader("CamelHttpPath", "");
		ex.getOut().setHeader("CamelHttpQuery", mensaje);
	}

}
