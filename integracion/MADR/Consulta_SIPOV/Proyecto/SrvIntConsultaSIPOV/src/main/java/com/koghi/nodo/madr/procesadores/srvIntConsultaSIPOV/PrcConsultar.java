package com.koghi.nodo.madr.procesadores.srvIntConsultaSIPOV;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;
import com.koghi.nodo.madr.cliente.srvIntConsultaSIPOV.ClienteSIPOV;
import com.koghi.nodo.madr.cliente.srvIntConsultaSIPOV.LectorArchivoPropiedades;
import com.koghi.nodo.madr.tos.srvIntConsultaSIPOV.TORequest;

public class PrcConsultar implements Processor{

	@Override
	public void process(Exchange ex) throws Exception {
		ex.setOut(ex.getIn());
		System.out.println("*************************\n\nAntes de crear el cliente\n\n*************************");
		ClienteSIPOV clienteSIPOV = ClienteSIPOV.getInstance();
		System.out.println("*************************\n\nDespués de crear el cliente, antes de crear la consulta\n\n*************************");
		TORequest consultaRequest = new Gson().fromJson(ex.getIn().getBody(String.class), TORequest.class);
		System.out.println("*************************\n\nDespués de crear la consulta, antes de hacer las validaciones\n\n*************************");
		
		if ( consultaRequest.getFechaInicio() == null ) {
			consultaRequest.setFechaInicio("1000-01-01");
		}
		System.out.println("*************************\n\nDespués verificar la fecha de inicio\n\n*************************");
		if ( consultaRequest.getFechaFin() == null ) {
			consultaRequest.setFechaFin("1000-01-01");
		}
		System.out.println("*************************\n\nDespués verificar la fecha de Fin\n\n*************************");
		if ( ex.getIn().getHeader("Username") == null || ex.getIn().getHeader("Password") == null ) {
			consultaRequest.setUser("no-username");
			consultaRequest.setPass("no-password");
		} else {
			consultaRequest.setUser(ex.getIn().getHeader("Username").toString());
			consultaRequest.setPass(ex.getIn().getHeader("Password").toString());
		}
		System.out.println("*************************\n\nDespués verificar headers de usuario y contraseña\n\n*************************");
		LectorArchivoPropiedades.setValPropiedad();
		String hostURI = LectorArchivoPropiedades.getProperty("HOST_SOAP_SIPOV");
		if (!hostURI.isEmpty()) {
			clienteSIPOV.setNewEndpointWSDL(hostURI);
		}
		System.out.println("*************************\n\nA punto de consumir el servicio\n\n*************************");
		ex.getOut().setBody(clienteSIPOV.consultarSIPOV(consultaRequest));
	}
	
}