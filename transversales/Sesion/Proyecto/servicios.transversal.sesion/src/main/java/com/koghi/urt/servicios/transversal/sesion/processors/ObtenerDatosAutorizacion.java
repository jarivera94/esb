package com.koghi.urt.servicios.transversal.sesion.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import org.json.JSONObject;

public class ObtenerDatosAutorizacion implements Processor {
	
	public void process(Exchange ex) throws Exception {
		String cuerpo = ex.getIn().getHeader("cuerpoLeido").toString();
		JSONObject json = new JSONObject(cuerpo);
		String idUsuario = json.getString("idUsuario");
		String idTx = json.getString("idTx");
		String idServicio = json.getString("idServicio");
		String idOperacion = json.getString("idOperacion");
		String lista = json.getString("Lista");
		String idEntidadEmisora = json.getString("idEntidadEmisora");
		//String valIP = json.getString("valIP");
		
		ex.getIn().setHeader("idUsuario", idUsuario);
		ex.getIn().setHeader("idTx", idTx);
		ex.getIn().setHeader("idServicio", idServicio);
		ex.getIn().setHeader("idOperacion", idOperacion);
		ex.getIn().setHeader("lista", lista);
		ex.getIn().setHeader("idEntidadEmisora", idEntidadEmisora);
		//ex.getIn().setHeader("valIP", valIP);
		ex.getIn().setHeader("CamelHttpPath", "");
		ex.setOut(ex.getIn());
	}
}
