package com.koghi.nodo.madr.cliente.srvIntConsultaSIPOV;

import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.soap.SOAPFaultException;

import org.tempuri.srvIntConsultaSIPOV.AuthHeader;
import org.tempuri.srvIntConsultaSIPOV.ConsultarOrdenesSIPOV;
import org.tempuri.srvIntConsultaSIPOV.ConsultarOrdenesSIPOVWsServiceSOAP;
import org.tempuri.srvIntConsultaSIPOV.ObjectFactory;

import com.google.gson.Gson;
import com.koghi.nodo.madr.tos.srvIntConsultaSIPOV.TOConsulta;
import com.koghi.nodo.madr.tos.srvIntConsultaSIPOV.TORequest;

import co.gov.gobiernoenlinea.gel_xml._1_0.schemas.proyectos.minagricultura.sipov.ArrayOfTipoOrden;
import co.gov.gobiernoenlinea.gel_xml._1_0.schemas.proyectos.minagricultura.sipov.TipoOrden;
import co.gov.gobiernoenlinea.gel_xml._1_0.schemas.proyectos.minagricultura.sipov.TipoOrdenesEnt;

public class ClienteSIPOV {
	private ConsultarOrdenesSIPOV service;
	private ObjectFactory objectFactory;
	private co.gov.gobiernoenlinea.gel_xml._1_0.schemas.proyectos.minagricultura.sipov.ObjectFactory objectF;
	private AuthHeader authenticationHeader;
	private ConsultarOrdenesSIPOVWsServiceSOAP consultaPort;
	private ArrayOfTipoOrden arrayTipoOrden;
	private TipoOrden tipoOrden;
	private List<TipoOrden> listTipoOrden;
	private TipoOrdenesEnt tipoOrdenesEnt;
	private TOConsulta consultaObject;
	private ArrayList<TOConsulta> arrayRespuesta;
	private String respuesta;
	
	private static ClienteSIPOV instance = null;
	
	public static ClienteSIPOV getInstance() {
		if (instance == null) {
			instance = new ClienteSIPOV();
		}
		return instance;
	}

	protected ClienteSIPOV () {
		this.service = new ConsultarOrdenesSIPOV();
		this.objectFactory = new ObjectFactory();
		this.authenticationHeader = objectFactory.createAuthHeader();
		this.consultaPort = service.getConsultarOrdenesSIPOVWsServiceSOAP();
		this.objectF = new co.gov.gobiernoenlinea.gel_xml._1_0.schemas.proyectos.minagricultura.sipov.ObjectFactory();
				
		this.arrayTipoOrden = objectF.createArrayOfTipoOrden();
		this.tipoOrden = objectF.createTipoOrden();
		this.tipoOrdenesEnt = objectF.createTipoOrdenesEnt();
		this.listTipoOrden = new ArrayList<TipoOrden>();
		this.consultaObject = new TOConsulta();
		this.arrayRespuesta = new ArrayList<TOConsulta>();
		
		this.respuesta = "";
	}
	
	public String consultarSIPOV (TORequest request) throws ParseException, DatatypeConfigurationException {
		arrayRespuesta = new ArrayList<TOConsulta>();
				
		tipoOrdenesEnt.setFechaInicio(getXMLGregorianCalendar(request.getFechaInicio()));
		tipoOrdenesEnt.setFechaFin(getXMLGregorianCalendar(request.getFechaFin()));
		
		authenticationHeader.setUsername(request.getUser());
		authenticationHeader.setPassword(request.getPass());
		
		try {		
			arrayTipoOrden = consultaPort.consultarOrdenesSIPOV(tipoOrdenesEnt,authenticationHeader);
			listTipoOrden = arrayTipoOrden.getListaOrdenesSal();
			
			if(listTipoOrden.size() > 0) {
				for(int i = 0;i < listTipoOrden.size();i++) {
					tipoOrden = (TipoOrden) listTipoOrden.get(i);
					consultaObject = new TOConsulta(tipoOrden);
					arrayRespuesta.add(consultaObject);
				}
				respuesta = new Gson().toJson(arrayRespuesta);
			}
			else
				
				respuesta = "{\"estado\": \"error\", \n\"mensaje\": \"Error en el formato de datos de entrada.\"}";

		} catch (SOAPFaultException e) {

			respuesta = "{\"estado\": \"error\", ";
			respuesta += "\"mensaje\": \"" + e.getMessage() + "\"}";
			e.printStackTrace();
		}
		return respuesta;
	}
	
	public static XMLGregorianCalendar getXMLGregorianCalendar(String date) {
		XMLGregorianCalendar xmlCalender = null;
		GregorianCalendar calender = new GregorianCalendar();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date2 = null;
		try {
			date2 = formatter.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		calender.setTime(date2);
		try {
			xmlCalender = DatatypeFactory.newInstance().newXMLGregorianCalendar(calender);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return xmlCalender;
	}
	
	public void setNewEndpointWSDL(String newURL) {
		URL newEndpoint = null;
		
		try {
			newEndpoint = new URL(newURL);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		this.consultaPort = new ConsultarOrdenesSIPOV(newEndpoint).getConsultarOrdenesSIPOVWsServiceSOAP();
	}
}