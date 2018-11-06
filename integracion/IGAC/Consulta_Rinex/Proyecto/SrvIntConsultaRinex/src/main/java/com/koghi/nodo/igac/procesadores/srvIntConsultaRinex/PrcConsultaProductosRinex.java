package com.koghi.nodo.igac.procesadores.srvIntConsultaRinex;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.core.task.AsyncListenableTaskExecutor;

import com.google.gson.Gson;
import com.koghi.nodo.igac.tos.srvIntConsultaRinex.TOArchivo;
import com.koghi.nodo.igac.tos.srvIntConsultaRinex.TOEstaciones;
import com.koghi.nodo.igac.tos.srvIntConsultaRinex.TOProductos;
import com.koghi.nodo.igac.tos.srvIntConsultaRinex.TOSalidaServicio;

public class PrcConsultaProductosRinex implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		String bodyMsg = exchange.getIn().getBody().toString();
		
		TOEstaciones estacionRinex = new Gson().fromJson(exchange.getProperty("estacionBuscada").toString(),
				TOEstaciones.class);
		TOProductos productosRinex = new Gson().fromJson(bodyMsg, TOProductos.class);
		
		TOSalidaServicio salidaServicio = new TOSalidaServicio();
		
		salidaServicio.setIdEstacion(estacionRinex.getIdEstacion());
		salidaServicio.setNombreEstacion(estacionRinex.getNombreEstacion());
		salidaServicio.setEstadoEstacion(estacionRinex.getEstadoEstacion());
		salidaServicio.setCiudadEstacion(estacionRinex.getCiudadEstacion());
		salidaServicio.setLongitudUbicacionEstacion(estacionRinex.getLongitudUbicacionEstacion());
		salidaServicio.setLatitudUbicacionEstacion(estacionRinex.getLatitudUbicacionEstacion());
		salidaServicio.setAccionEstadoEstacion(estacionRinex.getAccionEstadoEstacion());
		if (productosRinex.getArchivo() == null) {
			TOArchivo tmpArchivo = new TOArchivo();
			
			tmpArchivo.setNombreArchivoRinex("null");
			tmpArchivo.setExtensionArchivoRinex("null");
			tmpArchivo.setNombreTipoArchivo("null");
			tmpArchivo.setTamano("null");
			tmpArchivo.setArchivo("null");
			
			salidaServicio.setArchivo(tmpArchivo);
			
		} else {
			salidaServicio.setArchivo(productosRinex.getArchivo());
			salidaServicio.getArchivo().setArchivo(productosRinex.getArchivo().getArchivo().toString());
		}
		salidaServicio.setError(productosRinex.getError());
		if (productosRinex.getCodigo() == null) {
			salidaServicio.setCodigo("null");
		} else {
			salidaServicio.setCodigo(productosRinex.getCodigo());
		}
		if (productosRinex.getMensaje() == null) {
			salidaServicio.setMensaje("null");
		} else {
			salidaServicio.setMensaje(productosRinex.getMensaje());
		}
		
		exchange.getOut().setBody(salidaServicio.toString());
		
	}
	
}
