package com.koghi.nodo.transversales.procesadores.srvIntTransvEvento;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;
import com.koghi.nodo.transversales.tos.srvIntTransvEvento.*;

public class PrcCrear implements Processor{
	@Override
	public void process(Exchange ex) throws Exception {
		String body = ex.getIn().getBody(String.class);
		TOEvento Data = new Gson().fromJson(body, TOEvento.class);
		
		if (Data.getIdTransaccion()!=null && !Data.getIdTransaccion().replace(" ","").isEmpty() &&
				Data.getValDescripcion()!=null && !Data.getValDescripcion().replace(" ","").isEmpty() && 
				Data.getValSeveridad()!=null && !Data.getValSeveridad().replace(" ","").isEmpty() && 
				Data.getIdUsuario()!=null && !Data.getIdUsuario().replace(" ","").isEmpty()){
		
			Date date = new Date();
			DateFormat hourdateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			Data.setId(UUID.randomUUID().toString());
			Data.setFecCreacion(hourdateFormat.format(date));
			
			String TX_Query = "sqlComponent:INSERT INTO ESB_EVENTO " + 
			"(ID,ID_TRANSACCION,VAL_DESCRIPCION," + 
			"VAL_SEVERIDAD,FEC_CREACION,ID_USUARIO_CREACION) " + 
			"VALUES ('" + Data.getId() + "','" + Data.getIdTransaccion() + "','" + 
			Data.getValDescripcion() + "','" + Data.getValSeveridad() + "','" + 
			Data.getFecCreacion() + "','" + Data.getIdUsuario() + "')";
			
			ex.getContext().createProducerTemplate().send(TX_Query,ex);
			ex.getOut().setHeader("EVT_IdTransaccion", Data.getIdTransaccion());			
			body = "true";
			
		} else {
			body = "[0] : Fallo por datos insuficientes . . .";
		}
		
		ex.getOut().setBody(body);
	}
}
