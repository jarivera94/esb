package com.koghi.nodo.snr.util.srvIntConsultaDatosBasicos;

import java.net.MalformedURLException;
import java.net.URL;

import com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos.ServicioConsultaCertificadoTradicion;
import com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos.ServicioConsultaCertificadoTradicion_Service;
import com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos.TipoCertificadoTradiciLibertSal;
import com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos.TipoLstCertificadoTradiciLibertEnt;

public class ClienteWsdlSNR {
	
	private static ClienteWsdlSNR instancia;
	private ServicioConsultaCertificadoTradicion_Service service;
	private ServicioConsultaCertificadoTradicion server;
	
	private ClienteWsdlSNR() {
//		System.out.println("------------------------------------------------------------------------------");
//		System.out.println("--------------------- ENTRÓ AL CONSTRUCTOR PRIVATE ---------------------------");
		service = new ServicioConsultaCertificadoTradicion_Service();
		server = service.getServicioConsultaCertificadoTradicionPort();
//		System.out.println("------------------------------------------------------------------------------");
//		System.out.println("-------------------- DESPUÉS DEL CONSTRUCTOR PRIVATE -------------------------");
	}
	
	public static ClienteWsdlSNR getInstancia() {
//		System.out.println("------------------------------------------------------------------------------");
//		System.out.println("-------------------------- ENTRÓ AL CONSTRUCTOR ------------------------------");
		if (instancia == null) {
//			System.out.println("------------------------------------------------------------------------------");
//			System.out.println("--------------------- ENTRÓ AL IF EN EL CONSTRUCTOR --------------------------");
			instancia = new ClienteWsdlSNR();
		}
//		System.out.println("------------------------------------------------------------------------------");
//		System.out.println("-------------------------- INSTANCIA: " + instancia + "----------------------------------------");
		return instancia;
	}
	
	public TipoCertificadoTradiciLibertSal ejecutar(TipoLstCertificadoTradiciLibertEnt entrada, String sistemaUsuario, String clave) {
		return server.ejecutar(entrada, sistemaUsuario, clave);
	}
	
//	public String getServiceEndpoint() {
//		return ((BindingProvider) server).getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY).toString();
//	}
	
	public void setNewEndpointWSDL(String newURL) {
		URL newEndpoint = null;
		
		try {
			newEndpoint = new URL(newURL);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		service = new ServicioConsultaCertificadoTradicion_Service(newEndpoint);
		server = service.getServicioConsultaCertificadoTradicionPort();
	}
}
