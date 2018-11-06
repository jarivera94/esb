package com.koghi.nodo.cant.util.srvIntCertificadoCatastralCANT;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import com.onesystem.edatel.catastro.sp.nodotierras.NodoTierrasWS;
import com.onesystem.edatel.catastro.sp.nodotierras.NodoTierrasWS_Service;

public class ClienteWsdlCa {
	
	private static ClienteWsdlCa instancia;
	private NodoTierrasWS cliente;
	
	private ClienteWsdlCa() {
		this.cliente = new NodoTierrasWS_Service().getNodoTierrasWSPort();
	}
	
	public static ClienteWsdlCa getInstancia() {
		if (instancia == null) {
			instancia = new ClienteWsdlCa();
		}
		return instancia;
	}
	
	public String genCertPlanoCatastralNodoTierras(String fichaPredial, String matriculaCompleta, String numeroPredialNacional, int identificadorEntidad) {
		return cliente.genCertPlanoCatastralNodoTierras(fichaPredial, matriculaCompleta, numeroPredialNacional, identificadorEntidad);
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
				
		this.cliente = new NodoTierrasWS_Service(newEndpoint).getNodoTierrasWSPort();
	}
}
