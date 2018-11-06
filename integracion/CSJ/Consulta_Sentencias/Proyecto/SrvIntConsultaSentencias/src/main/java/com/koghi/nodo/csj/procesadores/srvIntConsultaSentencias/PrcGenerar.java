package com.koghi.nodo.csj.procesadores.srvIntConsultaSentencias;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;
import com.koghi.nodo.csj.tos.srvIntConsultaSentencias.TOToken;

public class PrcGenerar implements Processor{
	@Override
	public void process(Exchange ex) throws Exception {
		ex.setOut(ex.getIn());
		
		String body = ex.getIn().getBody(String.class);
		TOToken Data = new Gson().fromJson(body, TOToken.class);
		
		if (Data.getError()==null || Data.getError().replace(" ","").isEmpty()){
			ex.getOut().setHeader("accessToken", Data.getAccess_token());
			ex.getOut().setHeader("tokenType", Data.getToken_type());
			ex.getOut().setHeader("expiresIn", Data.getExpires_in());
		}
	}
}
