package com.koghi.urt.nodo.SrvIntWcfDAICMAOperaciones.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;
import com.koghi.nodo.urt.modelo.srvIntConsultaOperaciones.LectorArchivoPropiedades;
import com.koghi.urt.nodo.SrvIntWcfDAICMAOperaciones.client.ClientOperaciones;
import com.koghi.urt.nodo.SrvIntWcfDAICMAOperaciones.objects.OperacionesRequest;

public class ProcessorClient implements Processor{

	@Override
	public void process(Exchange ex) throws Exception {
		System.out.println("Entró al process");
		ClientOperaciones clientOperaciones = ClientOperaciones.getInstance();
		System.out.println("process 1");
		OperacionesRequest operacionesRequest = new Gson().fromJson(ex.getIn().getBody(String.class), OperacionesRequest.class);
		
		LectorArchivoPropiedades.setValProperty();
		String hostURI = LectorArchivoPropiedades.getProperty("HOST_SOAP_OPERACIONES");
		if (!hostURI.isEmpty()) {
			clientOperaciones.setNewEndpointWSDL(hostURI);
		}
		
		ex.getOut().setBody(clientOperaciones.consultarOperaciones(operacionesRequest));
		
	}

}
