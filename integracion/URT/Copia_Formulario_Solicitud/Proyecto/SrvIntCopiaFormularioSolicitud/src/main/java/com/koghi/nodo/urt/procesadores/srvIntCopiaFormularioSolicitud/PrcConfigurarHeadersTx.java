package com.koghi.nodo.urt.procesadores.srvIntCopiaFormularioSolicitud;


import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.koghi.nodo.urt.modelo.srvIntCopiaFormularioSolicitud.DecodificadorBase64;


public class PrcConfigurarHeadersTx implements Processor {

	@Override
	public void process(Exchange ex) {
		String hdrEntidadEmisora = ex.getIn().getHeader("IdEntidadConsumidora") != null ? ex.getIn().getHeader("IdEntidadConsumidora").toString() : "" ;
		String hdrIdUsuario = ex.getIn().getHeader("Authorization") != null ? ex.getIn().getHeader("Authorization").toString() : "";

		if (!hdrIdUsuario.isEmpty()) {
			hdrIdUsuario = hdrIdUsuario.substring(6);
			hdrIdUsuario = DecodificadorBase64.decodificar(hdrIdUsuario);
			hdrIdUsuario = hdrIdUsuario.substring(0, hdrIdUsuario.indexOf(":"));
			ex.getIn().getHeaders().put("IdUsuario", hdrIdUsuario);
		}
		
		ex.setOut(ex.getIn());
		ex.getOut().getHeaders().put("EntidadEmisora", hdrEntidadEmisora);
	}
	
}
