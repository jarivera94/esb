package com.koghi.urt.nodo.srvIntWcfDAICMAEventos.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.datacontract.schemas._2004._07.wcf_daicma_eventos.ArrayOfClsEventos;
import org.datacontract.schemas._2004._07.wcf_daicma_eventos.ClsEventos;
import org.tempuri.srvIntConsultaEventos.FntDAICMAConsultarEventosResponse;
import org.tempuri.srvIntConsultaEventos.IwcfDAICMAEventos;
import org.tempuri.srvIntConsultaEventos.ObjectFactory;
import org.tempuri.srvIntConsultaEventos.WcfDAICMAEventos;

import com.google.gson.Gson;
import com.koghi.urt.nodo.srvIntWcfDAICMAEventos.objects.EventosObject;
import com.koghi.urt.nodo.srvIntWcfDAICMAEventos.objects.EventosRequest;

public class ClientEventos {
	
	private WcfDAICMAEventos service;
	private ObjectFactory objectFactory;
	private FntDAICMAConsultarEventosResponse consultarEventosResponse;
	private IwcfDAICMAEventos eventosPort;
	private ArrayOfClsEventos arrayClsEventos;
	private JAXBElement<ArrayOfClsEventos> elementArrayClsEventos;
	private List<ClsEventos> listClsEventos;
	private ArrayList<EventosObject> arrayRespuesta;
	private EventosObject eventosObject;
	private ClsEventos clsEventos; 
	private String respuesta;
	
	private static ClientEventos instance = null;
	
	public static ClientEventos getInstance() {
		if (instance == null) {
			instance = new ClientEventos();
		}
		return instance;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected ClientEventos(){
		this.service = new WcfDAICMAEventos();
		System.out.println("Crea service");
		this.objectFactory = new ObjectFactory();
		System.out.println("Object factory");
		this.consultarEventosResponse = objectFactory.createFntDAICMAConsultarEventosResponse();
		System.out.println("consultar eventos response");
		this.eventosPort = service.getBasicHttpBindingIwcfDAICMAEventos();
		System.out.println("Eventos Port");
		this.arrayClsEventos = null;
		System.out.println("arrayclsEventos");
		this.elementArrayClsEventos = new JAXBElement(service.getServiceName(),service.getClass(),service);
		System.out.println("elementArrayEventos");
		this.listClsEventos = null;
		System.out.println("listclsEventos");
		this.arrayRespuesta = null;
		System.out.println("Aray Respuesta");
		this.eventosObject = null;
		System.out.println("eventosObject");
		this.clsEventos = null;
		System.out.println("Cls Eventos");
		this.respuesta = "";
		System.out.println("Respuesta");
	}
	
	
	public String consultarEventos(EventosRequest request){
		
		arrayRespuesta = new ArrayList<EventosObject>();
		arrayClsEventos = eventosPort.fntDAICMAConsultarEventos(request.getIntCodDaneDepto(), request.getIntCodDaneMunicipio(), request.getIntAaaaFechaEvento(), request.getIntMmFechaEvento());
		elementArrayClsEventos.setValue(arrayClsEventos);
		consultarEventosResponse.setFntDAICMAConsultarEventosResult(elementArrayClsEventos);		
		listClsEventos = consultarEventosResponse.getFntDAICMAConsultarEventosResult().getValue().getClsEventos();
		if(listClsEventos.size()> 0){
			for (int i = 0; i < listClsEventos.size(); i++) {
				clsEventos = (ClsEventos) listClsEventos.get(i);
				eventosObject = new EventosObject(clsEventos);
				arrayRespuesta.add(eventosObject);
			}
			respuesta = new Gson().toJson(arrayRespuesta);
		}else{
			respuesta = "N/A";
		}

		return respuesta;
	}

	public void setNewEndpointWSDL(String newURL) {
		URL newEndpoint = null;
		
		try {
			newEndpoint = new URL(newURL);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		this.eventosPort = new WcfDAICMAEventos(newEndpoint).getBasicHttpBindingIwcfDAICMAEventos();
	}

}
