package com.koghi.nodo.snr.util.srvIntConsultaCopiaSimplePDF;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import co.com.ubi.servgenpdfconsultaj.EntradaServGenPDFConsultaJuridica;
import co.com.ubi.servgenpdfconsultaj.SalidaServGenPDFConsultaJuridica;
import co.com.ubi.servgenpdfconsultaj.ServicioGeneraPDFConsultaJuridica;
import co.com.ubi.servgenpdfconsultaj.ServicioGeneraPDFConsultaJuridica_Service;

public class ClienteWsdlSNR {
	
	private static ClienteWsdlSNR instancia;
	private ServicioGeneraPDFConsultaJuridica cliente;
	
	private ClienteWsdlSNR() {
		this.cliente = new ServicioGeneraPDFConsultaJuridica_Service().getServicioGeneraPDFConsultaJuridicaPort();
	}
	
	public static ClienteWsdlSNR getInstancia() {
		if (instancia == null) {
			instancia = new ClienteWsdlSNR();
		}
		return instancia;
	}
	
	public SalidaServGenPDFConsultaJuridica obtenerConsultaJuridica(EntradaServGenPDFConsultaJuridica entrada) {
		return cliente.obtenerConsultaJuridica(entrada);
	}
	
	public String getServiceEndpoint() {
		return ((BindingProvider) cliente).getRequestContext().get(BindingProvider.ENDPOINT_ADDRESS_PROPERTY).toString();
	}
	
	public void setNewEndpointWSDL(String newURL) {
		URL newEndpoint = null;
		
		try {
			newEndpoint = new URL(newURL);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		this.cliente = new ServicioGeneraPDFConsultaJuridica_Service(newEndpoint).getServicioGeneraPDFConsultaJuridicaPort();
	}
}
