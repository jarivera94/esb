package com.koghi.urt.servicios.igac.procesadres.rinex;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcessorCleanRinex implements Processor{

	@Override
	public void process(Exchange ex) throws Exception {

		String fechaCalendario = ex.getIn().getHeader("fechaCalendario").toString();
		String idEstacion = ex.getIn().getHeader("idEstacion").toString();
		String tipoArchivo = ex.getIn().getHeader("tipoArchivo").toString();
		
		ex.setOut(ex.getIn());
		String año = "";
		String mes = "";
		String dia = "";
		if (fechaCalendario != null && !fechaCalendario.equals("")) {
			String[] fecha = fechaCalendario.toString().split("/");
			año = fecha[0];
			mes = fecha[1];
			dia = fecha[2];
		}
		String mensaje = "idEstacion=" + idEstacion + "&fechaCalendario=" + dia + "/" + mes
				+ "/" + año + "&tipoArchivo=" + tipoArchivo;
		ex.getOut().setBody(null);
		ex.getOut().setHeader(Exchange.HTTP_QUERY, mensaje);
		ex.getOut().setHeader("idEstacion", idEstacion);
	}

	
}
