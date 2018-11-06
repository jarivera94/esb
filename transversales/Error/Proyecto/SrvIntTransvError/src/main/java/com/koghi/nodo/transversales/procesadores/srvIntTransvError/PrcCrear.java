package com.koghi.nodo.transversales.procesadores.srvIntTransvError;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;
import com.koghi.nodo.transversales.tos.srvIntTransvError.*;

public class PrcCrear implements Processor{
	@Override
	public void process(Exchange ex) throws Exception {
		String body = ex.getIn().getBody(String.class);
		System.out.println("---------------------------------------------------------");
		System.out.println("Body en Crear Error:\n" + body);
		System.out.println("---------------------------------------------------------");
		TOTransaccionError Data = new Gson().fromJson(body, TOTransaccionError.class);
		
		ArrayList<TOError> errsDB = Data.getErrores();
		int validacion = 1;
		for(TOError errDB : errsDB) {
			if (errDB.getIdError()!=null && !errDB.getIdError().replace(" ","").isEmpty() &&
				errDB.getValCodigo()!=null && !errDB.getValCodigo().replace(" ","").isEmpty() &&
				errDB.getValDescripcion()!=null && !errDB.getValDescripcion().replace(" ","").isEmpty() &&
				errDB.getValExcepcion()!=null && !errDB.getValExcepcion().replace(" ","").isEmpty())
				validacion = validacion * 1;
			else
				validacion = validacion * 0;
		}
		System.out.println("Valor validación: " + validacion);
		
		if (Data.getIdUsuario()!=null && !Data.getIdUsuario().replace(" ","").isEmpty() &&
			Data.getIdTransaccion()!=null && !Data.getIdTransaccion().replace(" ","").isEmpty() &&
			validacion == 1) {
		
			String TX_Query;
			Date date = new Date();
			DateFormat hourdateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			Data.setFecCreacion(hourdateFormat.format(date));
			
			errsDB = Data.getErrores();
			for(TOError errDB : errsDB) {
				errDB.setId(UUID.randomUUID().toString());
				TX_Query = "sqlComponent:INSERT INTO ESB_TRANSACCION_ERROR " + 
				"(ID,ID_TRANSACCION,ID_ERROR,VAL_CODIGO,VAL_DESCRIPCION," + 
				"VAL_EXCEPCION,FEC_CREACION,ID_USUARIO_CREACION) " + 
				"VALUES ('" + errDB.getId() + "','" + Data.getIdTransaccion() + 
				"','" + errDB.getIdError() + "','" + errDB.getValCodigo() + 
				"','" + errDB.getValDescripcion() + "','" + errDB.getValExcepcion() + 
				"','" + Data.getFecCreacion() + "','" + Data.getIdUsuario() + "')";
				
				ex.getContext().createProducerTemplate().send(TX_Query,ex);
			}
			
			ex.getOut().setHeader("EVT_IdTransaccion", Data.getIdTransaccion());			
			body = "true";
			
		} else {
			body = "[0] : Fallo por datos insuficientes . . .";
		}
		ex.getOut().setBody(body);
	}
}
