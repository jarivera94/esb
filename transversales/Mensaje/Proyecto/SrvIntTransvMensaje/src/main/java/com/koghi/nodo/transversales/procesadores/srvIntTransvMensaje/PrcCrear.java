package com.koghi.nodo.transversales.procesadores.srvIntTransvMensaje;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;
import com.koghi.nodo.transversales.tos.srvIntTransvMensaje.*;

public class PrcCrear implements Processor{
	@Override
	public void process(Exchange ex) throws Exception {
		String body = ex.getIn().getBody(String.class);
		TOMensaje Data = new Gson().fromJson(body, TOMensaje.class);
		
		if (Data.getIdTransaccion()!=null && !Data.getIdTransaccion().replace(" ","").isEmpty() &&
				Data.getValMensaje()!=null && !Data.getValMensaje().replace(" ","").isEmpty() && 
				Data.getIdEntidadEmisora()!=null && !Data.getIdEntidadEmisora().replace(" ","").isEmpty() &&
				Data.getIdEntidadReceptora()!=null && !Data.getIdEntidadReceptora().replace(" ","").isEmpty() &&
				Data.getIdUsuario()!=null && !Data.getIdUsuario().replace(" ","").isEmpty()){
		
			Date date = new Date();
			DateFormat hourdateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			Data.setId(UUID.randomUUID().toString());
			Data.setFecCreacion(hourdateFormat.format(date));
			
			String TX_Query = "sqlComponent:INSERT INTO ESB_MENSAJE " + 
			"(ID,ID_TRANSACCION,ID_ENTIDAD_EMISORA,ID_ENTIDAD_RECEPTORA," + 
			"VAL_MENSAJE,FEC_CREACION,ID_USUARIO_CREACION) " + 
			"VALUES ('" + Data.getId() + "','" + Data.getIdTransaccion() + "','" + 
			Data.getIdEntidadEmisora() + "','" + Data.getIdEntidadReceptora() + "','" + 
			Data.getValMensaje() + "','" + Data.getFecCreacion() + "','" + Data.getIdUsuario() + "')";
			
			TOEvento DataEVT = new TOEvento ();
			DataEVT.setValDescripcion("La entidad emisora: " + Data.getIdEntidadEmisora() + ", envía mensaje a la entidad receptora: " + Data.getIdEntidadReceptora() + ".");
			DataEVT.setValSeveridad("INFO");
			DataEVT.setIdTransaccion(Data.getIdTransaccion());
			DataEVT.setIdUsuario(Data.getIdUsuario());
			String EVT_Query = new Gson().toJson(DataEVT);
			
			ex.getContext().createProducerTemplate().send(TX_Query,ex);
			ex.getOut().setHeader("MSJ_IdTransaccion", Data.getIdTransaccion());
			ex.getOut().setHeader("EVT_Query", EVT_Query);
			body = "true";
			
		} else {
			body = "[0] : Fallo por datos insuficientes . . .";
		}
		
		ex.getOut().setBody(body);
	}
}
