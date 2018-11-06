package com.koghi.nodo.transversales.procesadores.srvIntTransvTransaccion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;
import com.koghi.nodo.transversales.tos.srvIntTransvTransaccion.*;

public class PrcCrear implements Processor{
	@Override
	public void process(Exchange ex){
		String body = ex.getIn().getBody(String.class);
		TOTransaccion Data = new Gson().fromJson(body, TOTransaccion.class);
		
		if (Data.getId()!=null && !Data.getId().replace(" ","").isEmpty() && 
			Data.getIdServicio()!=null && !Data.getIdServicio().replace(" ","").isEmpty() &&
			Data.getIdOperacion()!=null && !Data.getIdOperacion().replace(" ","").isEmpty() &&
			Data.getIdEntidadEmisora()!=null && !Data.getIdEntidadEmisora().replace(" ","").isEmpty() && 
			Data.getValIpOrigen()!=null && !Data.getValIpOrigen().replace(" ","").isEmpty() && 
			Data.getIdUsuario()!=null && !Data.getIdUsuario().replace(" ","").isEmpty()){
		
			Date date = new Date();
			DateFormat hourdateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
			Data.setCodEstado(0);
			Data.setValReintentos(0);
			Data.setFecInicio(hourdateFormat.format(date));
			Data.setFecCreacion(hourdateFormat.format(date));
						
			String TX_Query = "sqlComponent:INSERT INTO ESB_TRANSACCION " + 
			"(ID,ID_SERVICIO,ID_OPERACION,ID_TX_PREVIA,ID_ENTIDAD_EMISORA,ID_ENTIDAD_RECEPTORA," + 
			"VAL_IP_ORIGEN,ID_USUARIO_CREACION,COD_ESTADO,VAL_REINTENTOS,FEC_INICIO,FEC_CREACION) " +  
			"VALUES ('" + Data.getId() + "','" + Data.getIdServicio() + "','" + Data.getIdOperacion() + "','" + 
			Data.getIdTxPrevia() + "','" + Data.getIdEntidadEmisora() + "','" + 
			Data.getIdEntidadReceptora() + "','" + Data.getValIpOrigen() + "','" + Data.getIdUsuario() + "','" + 
			Data.getCodEstado() + "','" + Data.getValReintentos() + "','" + Data.getFecInicio() + "','" + 
			Data.getFecCreacion() + "')";
			
			TOEvento DataEVT = new TOEvento ();
			DataEVT.setValDescripcion("Creación de transacción: " + Data.getId() + ", con fecha: " + Data.getFecCreacion() + ".");
			DataEVT.setValSeveridad("INFO");
			DataEVT.setIdTransaccion(Data.getId());
			DataEVT.setIdUsuario(Data.getIdUsuario());
			String EVT_Query = new Gson().toJson(DataEVT);
					
			ex.getContext().createProducerTemplate().send(TX_Query,ex);			
			ex.getOut().setHeader("TX_Id", Data.getId());
			ex.getOut().setHeader("EVT_Query", EVT_Query);
			body = "true";
						
		} else {
			body = "[0] : Datos insuficientes para crear la transacción . .	.";
		}
		
		ex.getOut().setBody(body);
	}
}
