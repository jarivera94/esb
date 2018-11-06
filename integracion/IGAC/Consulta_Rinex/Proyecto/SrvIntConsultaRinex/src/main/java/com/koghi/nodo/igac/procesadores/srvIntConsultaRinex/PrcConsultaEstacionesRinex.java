package com.koghi.nodo.igac.procesadores.srvIntConsultaRinex;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.koghi.nodo.igac.tos.srvIntConsultaRinex.TOEntradaRinex;
import com.koghi.nodo.igac.tos.srvIntConsultaRinex.TOEstaciones;

public class PrcConsultaEstacionesRinex implements Processor {
	
	@Override
	public void process(Exchange exchange) throws Exception {

		int iterator = 0;
		boolean flgOverflow = false;
		String bodyMsg = exchange.getIn().getBody().toString();
		String parametrosConsultaProductos = "";
		TOEstaciones[] arregloEstaciones = new Gson().fromJson(bodyMsg, TOEstaciones[].class);
		JSONObject entradaRinex = new JSONObject(exchange.getProperty("entradaRinex").toString());

		System.out.println("Entrada Rinex:\n" + entradaRinex.toString());
		
		if( entradaRinex.has("idEstacion") ) {
			while(!arregloEstaciones[iterator].getIdEstacion().equals(entradaRinex.getString("idEstacion"))) {
				iterator++;
				if(iterator >= arregloEstaciones.length) {
					flgOverflow = true;
					break;
				}
			}
		} else {
			flgOverflow = true;
		}
		
		if (flgOverflow) {
			
			TOEstaciones tmpEstacion = new TOEstaciones();
			tmpEstacion.setIdEstacion(entradaRinex.has("idEstacion") ? entradaRinex.getString("idEstacion") : "");
			tmpEstacion.setNombreEstacion("null");
			tmpEstacion.setEstadoEstacion("null");
			tmpEstacion.setCiudadEstacion("null");
			tmpEstacion.setLongitudUbicacionEstacion(0.0);
			tmpEstacion.setLatitudUbicacionEstacion(0.0);
			tmpEstacion.setAccionEstadoEstacion("null");
			
			exchange.setProperty("estacionBuscada", tmpEstacion);
			
		} else {
			exchange.setProperty("estacionBuscada", arregloEstaciones[iterator]);
		}
		
		parametrosConsultaProductos += entradaRinex.has("idEstacion") ? "idEstacion=" + entradaRinex.getString("idEstacion") + "&" : "idEstacion=&";
		parametrosConsultaProductos += entradaRinex.has("fechaCalendario") ? "fechaCalendario=" + entradaRinex.getString("fechaCalendario") + "&" : "fechaCalendario=&";
		parametrosConsultaProductos += entradaRinex.has("tipoArchivo") ? "tipoArchivo=" + entradaRinex.getString("tipoArchivo") + "&" : "tipoArchivo=&";
		
		System.out.println("Parámetros Consultar Productos:\n" + parametrosConsultaProductos);
		
		exchange.getOut().setHeader("CamelHttpMethod", "GET");
		exchange.getOut().setHeader(Exchange.HTTP_QUERY, parametrosConsultaProductos);
		
//		exchange.getOut().setHeader(Exchange.HTTP_QUERY, "idEstacion=" + entradaRinex.getIdEstacion() + 
//									"&fechaCalendario=" + entradaRinex.getFechaCalendario() + 
//									"&tipoArchivo=" + entradaRinex.getTipoArchivo());
	}

}
