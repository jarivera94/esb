package com.koghi.nodo.cant.util.srvIntCertificadoPoseerNoPoseer;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.ws.BindingProvider;

import com.onesystem.edatel.catastro.sp.nodotierras.InfoPredio;
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
	
	public String genCertPoseerNoPoseerNodoTierras(String tipoDocumento, String numeroDocumento, String nombrePropietario, int identificadorEntidad) {
		return cliente.genCertPoseerNoPoseerNodoTierras(tipoDocumento, numeroDocumento, nombrePropietario, identificadorEntidad);
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
