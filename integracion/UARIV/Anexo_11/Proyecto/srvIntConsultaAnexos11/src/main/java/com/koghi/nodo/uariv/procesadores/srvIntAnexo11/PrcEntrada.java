package com.koghi.nodo.uariv.procesadores.srvIntAnexo11;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;
import com.koghi.nodo.uariv.tos.srvIntAnexo11.TOEntrada;
import com.koghi.nodo.uariv.util.srvIntAnexo11.DecodificadorBase64;

public class PrcEntrada implements Processor{

	@Override
	public void process(Exchange ex) throws Exception {
		System.out.println("Entró al processor");
	
		String credencialesCod = ex.getIn().getHeader("credencialesLoginUariv").toString();
		String credencialesDecod = DecodificadorBase64.decodificar(credencialesCod);
		String[] credenciales = credencialesDecod.split(":");
		String user = credenciales[0];
		String password = credenciales[1];
		String codap = ex.getIn().getHeader("codap").toString();
		
		//Se guarda el json de entrada
		String body = ex.getIn().getBody(String.class);
//		String loginURL = "http://213.136.81.75:8080/pruebas/seguridad/LoginRest/Autentica.svc/Login/";
//		String loginURL = ex.getProperty("loginURL", String.class);
		System.out.println("Entrada: \n" + body);
		//Se crea el objeto que contendrá los valores de entrada
		TOEntrada objetoEntrada = new TOEntrada();
//		
		objetoEntrada.setUsuario(user);
		objetoEntrada.setNumero(codap);
		objetoEntrada.setPassword(password);
		
//		//Se convierte el body en el objeto de entrada
		objetoEntrada = new Gson().fromJson(body, TOEntrada.class);
//		
//		//Se guardan los valores en headers
		ex.getOut().setHeader("numeroEntrada", objetoEntrada.getNumero());
		ex.getOut().setHeader("usuarioEntrada", objetoEntrada.getUsuario());
		ex.getOut().setHeader("passwordEntrada", objetoEntrada.getPassword());
		ex.getOut().setHeader("numero2Entrada", objetoEntrada.getNumero2());
		ex.getOut().setHeader("periodoEntrada", objetoEntrada.getPeriodo());
		ex.getOut().setHeader("mesEntrada", objetoEntrada.getMes());
		ex.getOut().setHeader("vigenciaEntrada", objetoEntrada.getVigencia());
//		ex.getOut().setBody(body);
		System.out.println("\n\n\nEntrada:\n" + objetoEntrada.toString());
		
//		loginURL += objetoEntrada.getNumero() + "/" +
//					objetoEntrada.getUsuario() + "/" +
//					objetoEntrada.getPassword();
//		System.out.println("\n\n\nURL:\n" + loginURL);
//		ex.setProperty("loginURL", loginURL);
//		System.out.println("\n\n\nURL:\n" + ex.getProperty("loginURL"));
//		ex.setProperty( "jsonAnexo11", "\"numero2\":\"" + 
//						objetoEntrada.getNumero2() + "\"," +
//						"\"periodo\":\"" + objetoEntrada.getPeriodo() + "\"," +
//						"\"mes\":\"" + objetoEntrada.getMes() + "\"," +
//						"\"vigencia\":\"" + objetoEntrada.getVigencia() + "\"");
//		System.out.println("JSONAnexo11: " + ex.getProperty("jsonAnexo11"));
		
//		String xmlAnswer = "<ArrayOfAutorizado xmlns=\"http://schemas.datacontract.org/2004/07/RestServiceAutentica\" xmlns:i=\"http://www.w3.org/2001/XMLSchema-instance\">\n" + 
//				"    <Autorizado>\n" + 
//				"        <IdUsuario>62825</IdUsuario>\n" + 
//				"        <Token>DAD87BD63F5E4605B4846441027E67C9</Token>\n" + 
//				"    </Autorizado>\n" + 
//				"</ArrayOfAutorizado>";
//		ex.getOut().setBody(xmlAnswer);
		
		//ex.getOut().setBody(body);
	}

}
