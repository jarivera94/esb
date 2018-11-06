package com.koghi.urt.servicios.igac.informacionCatastral.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcessorPrediosParams implements Processor{

	@Override
	public void process(Exchange ex) throws Exception {
		
		//Obteniendo los valores de los headers
		String origen = (ex.getIn().getHeader("origen") != null) ? ex.getIn().getHeader("origen").toString() : "";
		String usuario = (ex.getIn().getHeader("usuario") != null) ? ex.getIn().getHeader("usuario").toString() : "";
		String idRequerimiento = (ex.getIn().getHeader("idRequerimiento") != null) ? ex.getIn().getHeader("idRequerimiento").toString() : "";
		String primerNombre = (ex.getIn().getHeader("primerNombre") != null) ? ex.getIn().getHeader("primerNombre").toString() : "";
		String segundoNombre = (ex.getIn().getHeader("segundoNombre") != null) ? ex.getIn().getHeader("segundoNombre").toString() : "";
		String primerApellido = (ex.getIn().getHeader("primerApellido") != null) ? ex.getIn().getHeader("primerApellido").toString() : "";
		String segundoApellido = (ex.getIn().getHeader("segundoApellido") != null) ? ex.getIn().getHeader("segundoApellido").toString() : "";
		String numDoc = (ex.getIn().getHeader("numDoc") != null) ? ex.getIn().getHeader("numDoc").toString() : "";
		String tipoDoc = (ex.getIn().getHeader("tipoDoc") != null) ? ex.getIn().getHeader("tipoDoc").toString() : "";
		String razonSocial = (ex.getIn().getHeader("razonSocial") != null) ? ex.getIn().getHeader("razonSocial").toString() : "";
		String direccion = (ex.getIn().getHeader("direccion") != null) ? ex.getIn().getHeader("direccion").toString() : "";
		String matricula = (ex.getIn().getHeader("matricula") != null) ? ex.getIn().getHeader("matricula").toString() : "";
		String nroPredial = (ex.getIn().getHeader("nroPredial") != null) ? ex.getIn().getHeader("nroPredial").toString() : "";
		String pagina = (ex.getIn().getHeader("pagina") != null) ? ex.getIn().getHeader("pagina").toString() : "";
		String mensaje = "";
		
		//Se crea el query que se le va a enviar al servicio de información
		if(!origen.equals("")){
			mensaje = "origen=" + origen;
			mensaje += ((usuario != "") ? ("&usuario="+usuario) : "") + 
						((idRequerimiento != "") ? ("&idRequerimiento="+idRequerimiento) : "") +
						((primerNombre != "") ? ("&primerNombre="+primerNombre) : "") +
						((segundoNombre != "") ? ("&segundoNombre="+segundoNombre) : "") +
						((primerApellido != "") ? ("&primerApellido="+primerApellido) : "") +
						((segundoApellido != "") ? ("&segundoApellido="+segundoApellido) : "") +
						((numDoc != "") ? ("&numDoc="+numDoc) : "") +
						((tipoDoc != "") ? ("&tipoDoc="+tipoDoc) : "") +
						((razonSocial != "") ? ("&razonSocial="+razonSocial) : "") +
						((direccion != "") ? ("&direccion="+direccion) : "") +
						((matricula != "") ? ("&matricula="+matricula) : "") +
						((nroPredial != "") ? ("&nroPredial="+nroPredial) : "") +
						((pagina != "") ? ("&pagina="+pagina) : "");
		}else{
			throw new Exception("Datos incorrectos");
		}
		ex.setOut(ex.getIn());
		ex.getOut().setHeader("CamelHttpPath", "");
		ex.getOut().setHeader("CamelHttpQuery", mensaje);
		
	}

}
