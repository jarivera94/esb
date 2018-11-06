package com.koghi.nodo.csj.procesadores.srvIntRadicarDemanda;

import java.util.Set;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;
import com.koghi.nodo.csj.tos.srvIntRadicarDemanda.TOAuthorizationToken;
import com.koghi.nodo.csj.tos.srvIntRadicarDemanda.TOIncomingData;

public class PrcManageCSJService implements Processor {

    public void process (Exchange exchange) throws Exception {
		
    	String firstBody = exchange.getIn().getBody() != null ? exchange.getIn().getBody().toString() : "";
    	String operationName = exchange.getProperty("propOperationName") != null ? exchange.getProperty("propOperationName").toString() : "";
		String headerOperacion = exchange.getIn().getHeader("Operacion", String.class) != null ? exchange.getIn().getHeader("Operacion").toString() : "";
		String bodyMsg = (exchange.getIn().getBody() != null) ? exchange.getIn().getBody().toString() : "";
		
		exchange.setOut(exchange.getIn());
		
		switch (headerOperacion) {
		
			case "Guardar-Body":
				exchange.setProperty("demandData", firstBody);
				exchange.setProperty("propOperationName", exchange.getIn().getHeader("operationName"));
//				exchange.setProperty("propContentType", exchange.getIn().getHeader("Content-Type"));
//				exchange.getOut().setHeader("Content-Type", "");

				break;
			case "Obtener-Token":
				exchange.getOut().getHeaders().put("operationName", operationName);
//				exchange.getIn().setHeader("oeprationName", operationName);
//				firstBody = exchange.getProperty("demandData").toString();
//				TOIncomingData incomingData = new Gson().fromJson(firstBody, TOIncomingData.class);
				exchange.getOut().getHeaders().put("Content-Type", "application/x-www-form-urlencoded");
				String requestBody = "";
//				if (incomingData != null) {
//					requestBody = "grant_type=" + incomingData.getGrant_type() +
//							 	  "&username=" + incomingData.getUsername() +
//							 	  "&password=" + incomingData.getPassword();
//					exchange.setProperty("demandData", incomingData.getDemandJSONData());
//				}
				requestBody = "grant_type=" + exchange.getIn().getHeader("grantType") +
					 	  	  "&username=" + exchange.getIn().getHeader("usuarioToken") +
					 	  	  "&password=" + exchange.getIn().getHeader("passwordToken");
//			exchange.setProperty("demandData", incomingData.getDemandJSONData());
				exchange.getOut().setBody(requestBody);
				break;
				
			case "Almacenar-Token":
				exchange.getOut().setHeader("operationName", operationName);
				TOAuthorizationToken authToken = new Gson().fromJson(bodyMsg, TOAuthorizationToken.class);
				if (authToken != null) {
					exchange.setProperty("accessToken", authToken.getAccess_token());
				}
				break;
				
			case "Consumir-Servicio":
//				System.out.println("\n\n\nBody de entrada en Consumir-Servicio: " + bodyMsg);
//				exchange.getOut().removeHeaders("");
				exchange.getOut().getHeaders().put("operationName", operationName);
				exchange.getOut().getHeaders().put("Content-Type", exchange.getProperty("propContentType"));
				exchange.getOut().getHeaders().put("Authorization", "Bearer " + exchange.getProperty("accessToken"));
				requestBody = exchange.getProperty("demandData").toString();
				System.out.println("\n\n\nHeaders: " + exchange.getOut().getHeaders().toString());
//				System.out.println("\n\nBody de salida en Consumir-Servicio: " + requestBody);
				exchange.getOut().setBody(requestBody);
				break;
			default:
				exchange.setProperty("demandData", firstBody);
				exchange.setProperty("propOperationName", exchange.getIn().getHeader("operationName"));
				exchange.setProperty("propContentType", exchange.getIn().getHeader("Content-Type"));
				exchange.getIn().getHeaders().put("Content-Type", "");
				System.out.println("Content-Type para el servicio del CSJ: " + exchange.getProperty("propContentType"));
				exchange.getIn().getHeaders().put("Content-Type", "application/json");
//				exchange.getOut().setHeader("Content-Type", "application/json");
//				throw new IllegalArgumentException("Ocurrió un problema con el consumo del servicio.");
		}		
	}
}
