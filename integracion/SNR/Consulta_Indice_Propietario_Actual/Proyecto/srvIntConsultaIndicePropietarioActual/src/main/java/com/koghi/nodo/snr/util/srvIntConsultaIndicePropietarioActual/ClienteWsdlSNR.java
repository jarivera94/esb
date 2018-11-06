package com.koghi.nodo.snr.util.srvIntConsultaIndicePropietarioActual;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.ServicioConsultaBusquedaParametros;
import com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.ServicioConsultaBusquedaParametros_Service;
import com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.TipoListResultadoCompleto;
import com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.TipoParametrosBusqueda;

public class ClienteWsdlSNR {
	
	private static ClienteWsdlSNR instancia;
	private ServicioConsultaBusquedaParametros cliente;
	
	private ClienteWsdlSNR() {
		this.cliente = new ServicioConsultaBusquedaParametros_Service().getServicioConsultaBusquedaParametrosPort();
	}
	
	public static ClienteWsdlSNR getInstancia() {
		if (instancia == null) {
			instancia = new ClienteWsdlSNR();
		}
		return instancia;
	}
	
	public TipoListResultadoCompleto ejecutarBusqueda(TipoParametrosBusqueda entrada, String sistemaUsuario, String clave) {
		return cliente.ejecutarBusqueda(entrada, sistemaUsuario, clave);
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
				
		this.cliente = new ServicioConsultaBusquedaParametros_Service(newEndpoint).getServicioConsultaBusquedaParametrosPort();
	}
}
