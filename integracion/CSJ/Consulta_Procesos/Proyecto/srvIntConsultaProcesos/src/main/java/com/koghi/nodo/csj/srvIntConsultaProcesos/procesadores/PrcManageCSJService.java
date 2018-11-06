package com.koghi.nodo.csj.srvIntConsultaProcesos.procesadores;

import java.util.Set;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.koghi.nodo.csj.srvIntConsultaProcesos.tos.TOAuthorizationToken;
import com.koghi.nodo.csj.srvIntConsultaProcesos.tos.TOIncomingData;	

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
				
				exchange.getOut().getHeaders().put(Exchange.HTTP_METHOD, "GET");
				
				JSONObject cuerpo = new JSONObject(exchange.getProperty("demandData").toString());
				
				String operacion = exchange.getIn().getHeader("operationName").toString();
				String codigoProceso = "";
				String numeroIdentificacion = "";
				String tarjetaProfesional = "";
				String nombreDocumento = "";
				String codigoHash = "";
				String peticion = "";
				String codigoDespacho = "";
				String codigoJuez = "";
				String fechaInicial = "";
				String fechaFinal = "";

				
				switch(operacion)
				{
				case "consultaProcesos":
					 codigoProceso = (cuerpo.has("codigoProceso"))?cuerpo.getString("codigoProceso"):"-1";
					 codigoProceso = (codigoProceso.isEmpty())?"-1":codigoProceso;
					 
					 numeroIdentificacion =cuerpo.has("numeroIdentificacion")?cuerpo.getString("numeroIdentificacion"):"-1";
					 numeroIdentificacion = (numeroIdentificacion.isEmpty())?"-1":numeroIdentificacion;

					 tarjetaProfesional = cuerpo.has("tarjetaProfesional")?cuerpo.getString("tarjetaProfesional"):"-1";
					 tarjetaProfesional = (tarjetaProfesional.isEmpty())?"-1":tarjetaProfesional;

					 peticion = "codigoProceso=" + codigoProceso + "&numeroIdentificacion=" + numeroIdentificacion
							 + "&tarjetaProfesional=" + tarjetaProfesional;
					 break; 
					
				case "consulta":
					 codigoProceso = cuerpo.has("CodigoProceso")?cuerpo.getString("CodigoProceso"):"-1";
					 codigoProceso = (codigoProceso.isEmpty())?"-1":codigoProceso;

					 numeroIdentificacion =cuerpo.has("numeroIdentificacion")?cuerpo.getString("numeroIdentificacion"):"-1";
					 numeroIdentificacion = (numeroIdentificacion.isEmpty())?"-1":numeroIdentificacion;

					 tarjetaProfesional = cuerpo.has("tarjetaProfesional")?cuerpo.getString("tarjetaProfesional"):"-1";
					 tarjetaProfesional = (tarjetaProfesional.isEmpty())?"-1":tarjetaProfesional;

					 nombreDocumento = cuerpo.has("nombreDocumento")?cuerpo.getString("nombreDocumento"):"-1";
					 nombreDocumento = (nombreDocumento.isEmpty())?"-1":nombreDocumento;

					 codigoHash = cuerpo.has("codigoHash")?cuerpo.getString("codigoHash"):"-1";
					 codigoHash = (codigoHash.isEmpty())?"-1":codigoHash;

	
					 peticion = "CodigoProceso=" + codigoProceso + "&numeroIdentificacion=" + numeroIdentificacion
							 + "&tarjetaProfesional=" + tarjetaProfesional + "&nombreDocumento=" + nombreDocumento
							 + "&codigoHash=" + codigoHash;

					 break;
				
				case "sentenciasPorRadicacion":
					codigoProceso = cuerpo.has("codigoProceso")?cuerpo.getString("codigoProceso"):"-1";
					codigoProceso = (codigoProceso.isEmpty())?"-1":codigoProceso;

					peticion = "codigoProceso=" + codigoProceso;
					break;
					
				case "sentenciasDespacho":
					codigoDespacho = cuerpo.has("codigoDespacho")?cuerpo.getString("codigoDespacho"):"-1";
					codigoDespacho = (codigoDespacho.isEmpty())?"-1":codigoDespacho;

					codigoJuez = cuerpo.has("codigoJuez")?cuerpo.getString("codigoJuez"):"-1";
					codigoJuez = (codigoJuez.isEmpty())?"-1":codigoJuez;

					
					fechaInicial = cuerpo.has("fechaInicial")?cuerpo.getString("fechaInicial"):"-1";
					fechaInicial = (fechaInicial.isEmpty())?"-1":fechaInicial;

					
					fechaFinal = cuerpo.has("fechaFinal")?cuerpo.getString("fechaFinal"):"-1";
					fechaFinal = (fechaFinal.isEmpty())?"-1":fechaFinal;

					peticion = "codigoDespacho=" + codigoDespacho + "&codigoJuez=" + codigoJuez
							+ "&fechaInicial=" + fechaInicial + "&fechaFinal=" + fechaFinal;
					break;
					
				case "sentenciasPDF":
					codigoProceso = cuerpo.has("codigoProceso")?cuerpo.getString("codigoProceso"):"-1";
					codigoProceso = (codigoProceso.isEmpty())?"-1":codigoProceso;

					nombreDocumento = cuerpo.has("nombreDocumento")?cuerpo.getString("nombreDocumento"):"-1";
					nombreDocumento = (nombreDocumento.isEmpty())?"-1":nombreDocumento;

					codigoHash = cuerpo.has("codigoHash")?cuerpo.getString("codigoHash"):"-1";
					codigoHash = (codigoHash.isEmpty())?"-1":codigoHash;

					
					peticion = "codigoProceso=" + codigoProceso + "&nombreDocumento=" + nombreDocumento
							+ "&codigoHash=" + codigoHash;
					
					break;
									
				}
				

				exchange.getOut().getHeaders().put(Exchange.HTTP_QUERY, peticion);
//				exchange.getOut().getHeaders().put(Exchange.HTTP_PATH, peticion);
				System.out.println("--------------------------------------------------------\n\n");
				System.out.println("QUERY*********************" + exchange.getOut().getHeader(Exchange.HTTP_QUERY));
				System.out.println("URI*********************" + exchange.getOut().getHeader(Exchange.HTTP_URI));
				System.out.println("BASE_URI*********************" + exchange.getOut().getHeader(Exchange.HTTP_BASE_URI));


//				System.out.println((Exchange.HTTP_QUERY));
				System.out.println(exchange.getOut().getHeader(Exchange.HTTP_METHOD));
				System.out.println("\n\n--------------------------------------------------------");
				
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
