package com.koghi.urt.nodo.SrvIntWcfDAICMAOperaciones.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;

import org.datacontract.schemas._2004._07.wcf_daicma_operaciones.ArrayOfClsOperaciones;
import org.datacontract.schemas._2004._07.wcf_daicma_operaciones.ClsOperaciones;
import org.tempuri.operaciones.FntDAICMAConsultarOperacionesResponse;
import org.tempuri.operaciones.IwcfDAICMAOperaciones;
import org.tempuri.operaciones.ObjectFactory;
import org.tempuri.operaciones.WcfDAICMAOperaciones;

import com.google.gson.Gson;
import com.koghi.urt.nodo.SrvIntWcfDAICMAOperaciones.objects.OperacionObject;
import com.koghi.urt.nodo.SrvIntWcfDAICMAOperaciones.objects.OperacionesRequest;

public class ClientOperaciones {

	private WcfDAICMAOperaciones service;
	private ObjectFactory objectFactory;
	private FntDAICMAConsultarOperacionesResponse consultarOperacionesResponse;
	private IwcfDAICMAOperaciones operacionesPort;
	private ArrayOfClsOperaciones arrayClsOperaciones;
	private JAXBElement<ArrayOfClsOperaciones> elementArrayClsOperaciones;
	private List<ClsOperaciones> listClsOperaciones;
	private ArrayList<OperacionObject> arrayRespuesta;
	private OperacionObject operacionesObject;
	private ClsOperaciones clsOperaciones;
	private String respuesta;

	private static ClientOperaciones instance = null;

	public static ClientOperaciones getInstance() {
		if (instance == null) {
			instance = new ClientOperaciones();
		}
		return instance;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected ClientOperaciones() {
		this.objectFactory = new ObjectFactory();
		this.consultarOperacionesResponse = objectFactory.createFntDAICMAConsultarOperacionesResponse();
		this.service = new WcfDAICMAOperaciones();

		
		this.operacionesPort = service.getBasicHttpBindingIwcfDAICMAOperaciones();
		this.arrayClsOperaciones = null;

		this.elementArrayClsOperaciones = new JAXBElement(service.getServiceName(), service.getClass(), service);
		this.listClsOperaciones = null;
		this.arrayRespuesta = null;
		this.operacionesObject = null;
		this.clsOperaciones = null;
		this.respuesta = "";
	}

	public String consultarOperaciones(OperacionesRequest request) {
		try {
			arrayRespuesta = new ArrayList<OperacionObject>();
			arrayClsOperaciones = operacionesPort.fntDAICMAConsultarOperaciones(request.getIntCodDaneDepto(),
					request.getIntCodDaneMunicipio(), request.getIntAaaaFechaOperacion(), request.getIntMmFechaOperacion());
			elementArrayClsOperaciones.setValue(arrayClsOperaciones);
			consultarOperacionesResponse.setFntDAICMAConsultarOperacionesResult(elementArrayClsOperaciones);
			listClsOperaciones = consultarOperacionesResponse.getFntDAICMAConsultarOperacionesResult().getValue()
					.getClsOperaciones();
			if (listClsOperaciones.size() > 0) {
				for (int i = 0; i < listClsOperaciones.size(); i++) {
					clsOperaciones = (ClsOperaciones) listClsOperaciones.get(i);
					operacionesObject = new OperacionObject(clsOperaciones);
					arrayRespuesta.add(operacionesObject);
				}
				respuesta = new Gson().toJson(arrayRespuesta);
			} else {
				respuesta = "N/A";
			}
		} catch (Exception e) {
			System.out.println("ENTRA A LA EXCPECIONNNNNNNNNNNNNNNN");
			respuesta = "{\n\t\"Estado\": \"Error\", \n\t\"Mensaje\" : \"" + e.getMessage() + "\" \n}";
			System.out.println("RESPUESTA:");
			System.out.println(respuesta);
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
				
		this.operacionesPort = new WcfDAICMAOperaciones(newEndpoint).getBasicHttpBindingIwcfDAICMAOperaciones();
	}

}
