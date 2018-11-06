package com.koghi.nodo.cant.procesadores.srvIntConsultaActosAdministrativos;


import javax.servlet.ServletRequest;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.Message;

import com.koghi.nodo.cant.util.srvIntConsultaActosAdministrativos.DecodificadorBase64;


public class PrcConfigurarHeadersTx implements Processor {

	@Override
	public void process(Exchange ex) {
		String hdrEntidadEmisora = ex.getIn().getHeader("IdEntidadConsumidora") != null ? ex.getIn().getHeader("IdEntidadConsumidora").toString() : "" ;
		String hdrIdUsuario = ex.getIn().getHeader("Authorization") != null ? ex.getIn().getHeader("Authorization").toString() : "";
		Message cxfMessage = ex.getIn().getHeader(CxfConstants.CAMEL_CXF_MESSAGE, Message.class);
		ServletRequest request = (ServletRequest) cxfMessage.get("HTTP.REQUEST");
		String strIpOrigen = request.getRemoteAddr();
		
		ex.getIn().getHeaders().put("IpOrigen", ex.getIn().getHeader("valIpOrigen") != null ? ex.getIn().getHeader("valIpOrigen", String.class) : strIpOrigen);
		
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
