package com.koghi.urt.nodo.srvIntWcfDAICMAEventos.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;
import com.koghi.nodo.urt.modelo.srvIntConsultaEventos.LectorArchivoPropiedades;
import com.koghi.urt.nodo.srvIntWcfDAICMAEventos.client.ClientEventos;
import com.koghi.urt.nodo.srvIntWcfDAICMAEventos.objects.EventosRequest;

public class ProcessorClient implements Processor{

	@Override
	public void process(Exchange ex) throws Exception {
		System.out.println("Entró al process");
		ClientEventos clientEventos = ClientEventos.getInstance();
		System.out.println("process 1");
		EventosRequest eventosRequest = new Gson().fromJson(ex.getIn().getBody(String.class), EventosRequest.class);

		LectorArchivoPropiedades.setValProperty();
		String hostURI = LectorArchivoPropiedades.getProperty("HOST_SOAP_EVENTOS");
		if (!hostURI.isEmpty()) {
			clientEventos.setNewEndpointWSDL(hostURI);
		}
		
		ex.getOut().setBody(clientEventos.consultarEventos(eventosRequest));
		
	}

}
