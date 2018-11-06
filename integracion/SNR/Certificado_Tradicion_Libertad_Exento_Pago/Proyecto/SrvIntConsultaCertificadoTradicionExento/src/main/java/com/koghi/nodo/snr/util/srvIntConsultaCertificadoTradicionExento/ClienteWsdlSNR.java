package com.koghi.nodo.snr.util.srvIntConsultaCertificadoTradicionExento;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import co.com.ubi.enviarpdfcertificadolibertad.CertificadoLibertadPDFEnt;
import co.com.ubi.enviarpdfcertificadolibertad.CertificadoLibertadPDFSal;
import co.com.ubi.enviarpdfcertificadolibertad.EnviarPDFCertificadoLibertad;
import co.com.ubi.enviarpdfcertificadolibertad.EnviarPDFCertificadoLibertad_Service;

public class ClienteWsdlSNR {
	
	private static ClienteWsdlSNR instancia;
	private EnviarPDFCertificadoLibertad cliente;
	
	private ClienteWsdlSNR() {
		this.cliente = new EnviarPDFCertificadoLibertad_Service().getEnviarPDFCertificadoLibertadPort();
	}
	
	public static ClienteWsdlSNR getInstancia() {
		if (instancia == null) {
			instancia = new ClienteWsdlSNR();
		}
		return instancia;
	}
	
	public CertificadoLibertadPDFSal obtenerConsultaJuridica(CertificadoLibertadPDFEnt entrada) {
		return cliente.obtenerPDF(entrada);
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
				
		this.cliente = new EnviarPDFCertificadoLibertad_Service(newEndpoint).getEnviarPDFCertificadoLibertadPort();
	}
}
