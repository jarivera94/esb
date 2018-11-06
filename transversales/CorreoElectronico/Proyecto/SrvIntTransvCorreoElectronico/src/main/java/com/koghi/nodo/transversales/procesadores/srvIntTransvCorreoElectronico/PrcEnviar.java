package com.koghi.nodo.transversales.procesadores.srvIntTransvCorreoElectronico;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;

import com.google.gson.Gson;
import com.koghi.nodo.transversales.tos.srvIntTransvCorreoElectronico.TOCorreoElectronico;
import com.koghi.nodo.transversales.tos.srvIntTransvCorreoElectronico.TOParametro;
import com.koghi.nodo.transversales.tos.srvIntTransvCorreoElectronico.TOEvento;

public class PrcEnviar implements Processor {
	@Override
	public void process(Exchange ex) throws Exception {
		String body = ex.getIn().getHeader("infoJSON").toString();
		
		String bodyRespuesta = "";
		String host = ex.getIn().getHeader("infoHOST").toString();
		String from = ex.getIn().getHeader("infoMAIL").toString();
		String pass = ex.getIn().getHeader("infoPASS").toString();
		System.out.println("\n-----------------------------------------------------------");
		System.out.println("Body para correo: " + body);
		System.out.println("\n-----------------------------------------------------------");
		TOCorreoElectronico[] DataAux = new Gson().fromJson(body, TOCorreoElectronico[].class);
		
		TOParametro[] HostData = new Gson().fromJson(host, TOParametro[].class);
		host = HostData[0].getValValor();
		
		TOParametro[] MailData = new Gson().fromJson(from, TOParametro[].class);
		from = MailData[0].getValValor();

		TOParametro[] PassData = new Gson().fromJson(pass, TOParametro[].class);
		pass = PassData[0].getValValor();
		
		
		int n = DataAux.length;
		for (int i=0; i<n; i++) {
			TOCorreoElectronico Data = DataAux[i];
			if (Data.getIdUsuario() != null && !Data.getIdUsuario().replace(" ", "").isEmpty() && Data.getIdTx() != null
					&& !Data.getIdTx().replace(" ", "").isEmpty() && Data.getAsunto() != null
					&& !Data.getAsunto().replace(" ", "").isEmpty() && Data.getCuerpoMensaje() != null
					&& !Data.getCuerpoMensaje().replace(" ", "").isEmpty() && Data.getValDestinatario() != null
					&& !Data.getValDestinatario().replace(" ", "").isEmpty()) {
				
				
				
				Map<String, Object> map = new HashMap<String, Object>();
				map.put("To", Data.getValDestinatario());
				map.put("From", from);
				map.put("Subject", Data.getAsunto());

				body = Data.getCuerpoMensaje();
				ProducerTemplate template = ex.getContext().createProducerTemplate();
				try {
					template.sendBodyAndHeaders(host + "?username=" + from + "&password=" + pass, body, map);
				}catch (Exception e){
					bodyRespuesta += "Ocurrió una excepción al intentar enviar el correo " + (i+1);
					System.out.println(e.getMessage() + e.getCause());
					continue;
				}
				
					
				Date date = new Date();
				DateFormat hourdateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				
				TOEvento DataEVT = new TOEvento ();
				DataEVT.setValDescripcion("Envio de correo a: " + Data.getValDestinatario() + ", con asunto: " + Data.getAsunto() + ", con fecha: " + hourdateFormat.format(date) + ".");
				DataEVT.setValSeveridad("INFO");
				DataEVT.setIdTransaccion(Data.getIdTx());
				DataEVT.setIdUsuario(Data.getIdUsuario());
				String EVT_Query = new Gson().toJson(DataEVT);
				ex.getOut().setHeader("EVT_Query", EVT_Query);
				System.out.println("\n\n\nEVT Query en EnviarCorreo:\n\n" + EVT_Query);
				bodyRespuesta += "Estado del correo " + (i+1) + ": [1] : Correo electrónico enviado correctamente . . .\n";
			} else {
				bodyRespuesta = "Estado del correo " + (i+1) + ": [0] : Fallo por datos insuficientes . . .\n";
			}		
			ex.getOut().setBody(bodyRespuesta);
			
		}

	}
}
