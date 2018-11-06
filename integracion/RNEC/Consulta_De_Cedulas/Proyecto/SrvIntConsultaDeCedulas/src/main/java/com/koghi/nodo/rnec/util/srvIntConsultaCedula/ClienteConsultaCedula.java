package com.koghi.nodo.rnec.util.srvIntConsultaCedula;


import java.net.URL;

import co.gov.rnec.ani.ws.WSConsultas;
import co.gov.rnec.ani.ws.WSConsultas_Service;

public class ClienteConsultaCedula {
	
	private static ClienteConsultaCedula instancia;
	
	private WSConsultas_Service service;
	private WSConsultas consultasPort;
	
	public static ClienteConsultaCedula getInstancia() throws Exception {
		instancia = new ClienteConsultaCedula();
		return instancia;
	}
	
	private ClienteConsultaCedula() throws Exception {
		LectorArchivoPropiedades.setValProperty();
		String hostURI = LectorArchivoPropiedades.getProperty("HOST_SOAP_CONSULTA_CEDULA");
		if (!hostURI.isEmpty()) {
			URL newEndpoint = null;
			newEndpoint = new URL(hostURI);
			service = new WSConsultas_Service(newEndpoint);
		}else {
			service = new WSConsultas_Service();
		}
		consultasPort = service.getWSConsultasPort();
	}
	
	public String consultarCedulas(String usuario, String contrasena, String entidad, String cedulas){
		String respuesta = consultasPort.consultarCedulas(cedulas, contrasena, entidad, usuario);
		return respuesta;
	}
	
}