package com.koghi.nodo.csj.procesadores.srvIntConsultaSentencias;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.koghi.nodo.csj.tos.srvIntConsultaSentencias.TOConsultaSentencias;

public class PrcConsultar implements Processor{
	@Override
	public void process(Exchange ex) throws Exception {
		ex.setOut(ex.getIn());
		
		String body = ex.getIn().getBody(String.class);
		TOConsultaSentencias Data = new Gson().fromJson(body, TOConsultaSentencias.class);
		
		Data.setError(true);
		
//		if (Data.getUsername()!=null && !Data.getUsername().replace(" ","").isEmpty() &&
//			Data.getPassword()!=null && !Data.getPassword().replace(" ","").isEmpty() &&
//			Data.getGrantType()!=null && !Data.getGrantType().replace(" ","").isEmpty() ){
		
		if (ex.getIn().getHeader("username", String.class) != null &&
			ex.getIn().getHeader("password", String.class) != null &&
			ex.getIn().getHeader("grantType", String.class) != null){

			System.out.println("Se validaron los headers que si existen");
			Data.setError(false);
		}
				
//		ex.getOut().setHeader("username", Data.getUsername());
//		ex.getOut().setHeader("password", Data.getPassword());
//		ex.getOut().setHeader("grantType", Data.getGrantType());
		
		ex.getOut().setHeader("errorToken", Data.isError());
		
//		Data.setError(true);
		
		if (Data.getCodigoCiudad()!=null && !Data.getCodigoCiudad().replace(" ","").isEmpty() &&
			Data.getFechaInicial()!=null && !Data.getFechaInicial().replace(" ","").isEmpty() &&
			Data.getFechaFinal()!=null && !Data.getFechaFinal().replace(" ","").isEmpty() ){
			
			ex.getOut().setHeader("codigoCiudad", Data.getCodigoCiudad());
			ex.getOut().setHeader("fechaInicial", Data.getFechaInicial());
			ex.getOut().setHeader("fechaFinal", Data.getFechaFinal());
			
			Data.setError(false);
		} else {
			ex.getOut().setHeader("codigoCiudad", "" );
			ex.getOut().setHeader("fechaInicial", "" );
			ex.getOut().setHeader("fechaFinal", "" );
		}
		
		ex.getOut().setHeader("errorConsulta", Data.isError());
		
//		ex.getOut().setBody(ex.getIn().getBody(String.class));				
	}
}