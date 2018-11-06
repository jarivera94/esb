package com.koghi.nodo.snr.util.srvIntConsultaDatosJuridicos;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.ws.BindingProvider;

import org.step.aac.glass.ServicioConsultaEstadoJuridico;
import org.step.aac.glass.ServicioConsultaEstadoJuridico_Service;
import org.step.aac.glass.TipoEstadoJuridicoInmuebleSal;
import org.step.aac.glass.TipoLstEstadoJuridicoInmuebleEnt;

public class ClienteWsdlSNR {
	
	private static ClienteWsdlSNR instancia;
	private ServicioConsultaEstadoJuridico cliente;
	
	private ClienteWsdlSNR() {
		this.cliente = new ServicioConsultaEstadoJuridico_Service().getServicioConsultaEstadoJuridicoPort();
	}
	
	public static ClienteWsdlSNR getInstancia() {
		if (instancia == null) {
			instancia = new ClienteWsdlSNR();
		}
		return instancia;
	}
	
	public TipoEstadoJuridicoInmuebleSal consultaEstadoJuridico(TipoLstEstadoJuridicoInmuebleEnt objEntrada, String sistemaUsuario, String clave) {
		return cliente.consultaEstadoJuridico(objEntrada, sistemaUsuario, clave);
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
				
		this.cliente = new ServicioConsultaEstadoJuridico_Service(newEndpoint).getServicioConsultaEstadoJuridicoPort();
	}
}
