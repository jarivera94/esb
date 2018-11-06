package com.koghi.nodo.cant.srvIntConsultaHistoricaCatastral.procesadores;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;

import com.koghi.nodo.cant.srvIntConsultaHistoricaCatastral.util.LectorArchivoPropiedades;

public class PrcManipularEntrada implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		String opxPrcManipular = exchange.getIn().getHeader("opxPrcManipular") != null ? exchange.getIn().getHeader("opxPrcManipular").toString() : null;
		
		switch (opxPrcManipular) {
		case "consumirServicio":
			exchange.getIn().setBody(exchange.getProperty("bodyEntrada").toString());
			System.out.println("---------------------------------------------------------------");
			System.out.println("-------------------- Envelope para consumo --------------------");
			System.out.println(exchange.getIn().getBody().toString());
			System.out.println("---------------------------------------------------------------");
			LectorArchivoPropiedades.setValProperty();
			String soapAction = LectorArchivoPropiedades.getProperty("SOAP_ACTION");
			System.out.println("SOAP_ACTION: " + soapAction);
			soapAction = soapAction.equals("none") ? "" : soapAction;
			System.out.println("SOAP_ACTION: " + soapAction);
			exchange.getIn().getHeaders().put("SOAPAction", soapAction);
			exchange.getIn().getHeaders().put("CamelHttpMethod", "POST");
			exchange.getIn().getHeaders().put("Content-Type", "text/xml;charset=UTF-8");
			break;

		default:
			String inBody = exchange.getIn().getBody() != null ? exchange.getIn().getBody().toString() : "";
			
			System.out.println("---------------------------------------------------------");
			System.out.println("-------------------- Body de entrada --------------------");
			System.out.println(inBody);
			System.out.println("---------------------------------------------------------");
			
			JSONArray jaBody = new JSONArray(inBody.toString());
			
			System.out.println("JSON Array: " + jaBody.length() + " elements");
			JSONObject jsonEntrada = jaBody == null ? new JSONObject(inBody) : jaBody.getJSONObject(0);
			jsonEntrada.put("nombreUsuario", exchange.getIn().getHeader("NombreUsuario", String.class));
			jsonEntrada.put("clave", exchange.getIn().getHeader("ClaveUsuario", String.class));
			System.out.println("JSON Entrada: " + jsonEntrada.length() + " elements");
			String xmlQuery = XML.toString(jsonEntrada);
			
			System.out.println("-----------------------------------------------------------------");
			System.out.println("-------------------- Body antes de cambiarlo --------------------");
			System.out.println(jsonEntrada.toString());
			System.out.println("-----------------------------------------------------------------");
			
			LectorArchivoPropiedades.setValProperty();
			String soapHeader = LectorArchivoPropiedades.getProperty("soapEnvHeader");
			LectorArchivoPropiedades.setValProperty();
			String soapBodyPrefix = LectorArchivoPropiedades.getProperty("soapEnvBodyPrefix");
			LectorArchivoPropiedades.setValProperty();
			String soapFooter = LectorArchivoPropiedades.getProperty("soapEnvFooter");
			LectorArchivoPropiedades.setValProperty();
			soapHeader = soapHeader.replaceAll("xmlns", " xmlns");
			
			System.out.println("--------------------------------------------------------------------");
			System.out.println("-------------------- Body desupués de cambiarlo --------------------");
			System.out.println(xmlQuery);
			System.out.println("--------------------------------------------------------------------");
			
			xmlQuery = soapHeader + soapBodyPrefix + xmlQuery + soapFooter;
			
			System.out.println("--------------------------------------------------------------------");
			System.out.println("-------------------- Body final para el consumo --------------------");
			System.out.println(xmlQuery);
			System.out.println("--------------------------------------------------------------------");
			
			exchange.setProperty("bodyEntrada", xmlQuery);
			break;
		}
		
		exchange.setOut(exchange.getIn());
	}	
	
}
