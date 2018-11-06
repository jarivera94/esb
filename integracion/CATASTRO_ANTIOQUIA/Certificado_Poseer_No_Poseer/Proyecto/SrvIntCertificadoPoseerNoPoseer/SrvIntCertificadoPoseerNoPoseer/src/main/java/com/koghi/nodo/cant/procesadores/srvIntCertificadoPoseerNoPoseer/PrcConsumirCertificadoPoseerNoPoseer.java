package com.koghi.nodo.cant.procesadores.srvIntCertificadoPoseerNoPoseer;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONException;
import org.json.JSONObject;

import com.koghi.nodo.cant.util.srvIntCertificadoPoseerNoPoseer.ClienteWsdlCa;
import com.koghi.nodo.cant.util.srvIntCertificadoPoseerNoPoseer.LectorArchivoPropiedades;

public class PrcConsumirCertificadoPoseerNoPoseer implements Processor{

	@Override
	public void process(Exchange ex) throws Exception {
		System.out.println("**********************************ENTRA A PrcConsumirCertificadoPoseerNoPoseer");
		String operacion = ex.getIn().getHeader("operationName").toString();
		String body = ex.getIn().getBody() != null ? ex.getIn().getBody().toString() : "";
		boolean b = false;
		if (body.charAt(0) == '[') {
			body = body.substring(1, body.length() - 1);
		}
		JSONObject json = !body.equals("") ? new JSONObject(body) : new JSONObject();

		System.out.println("******ANTES DE EL TRY***********");
		try 
		{
			String tipoDocumento = "";
			String numeroDocumento = "";
			String nombrePropietario = "";
			int identificadorEntidad = -1;
			
			switch (operacion) {
			case "consultarCertificado" :
				tipoDocumento = (json.has("tipoDocumento"))?json.getString("tipoDocumento"):"";
				numeroDocumento = (json.has("numeroDocumento"))?json.getString("numeroDocumento"):"";
				nombrePropietario = (json.has("nombrePropietario"))?json.getString("nombrePropietario"):"";
				identificadorEntidad = (json.has("identificadorEntidad"))?json.getInt("identificadorEntidad"):-1;
				break;
				

			}
			ClienteWsdlCa cliente = ClienteWsdlCa.getInstancia();
			System.out.println("***************************A PUNTO DE CONSUMIR EL WEB SERVICE");
			
			LectorArchivoPropiedades.setValProperty();
			String hostURI = LectorArchivoPropiedades.getProperty("HOST_SOAP_CANT");
			if (!hostURI.isEmpty()) {
				cliente.setNewEndpointWSDL(hostURI);
			}
			System.out.println("********ANTES DE ASIGNACION ********************");
			String cadena = cliente.genCertPoseerNoPoseerNodoTierras(tipoDocumento, numeroDocumento, nombrePropietario, identificadorEntidad);
			System.out.println("***************************RESPUESTA DEL WEB SERVICE");
			System.out.println(cadena);
			if(cadena == null)
			{
				cadena = "";
			}
			JSONObject jsonRespuesta = new JSONObject();
				jsonRespuesta.put("return", cadena);
//			String jsonRespuesta = new Gson().toJson(cadena);
//			ex.getOut().setBody(jsonRespuesta);
			ex.getOut().setBody(jsonRespuesta.toString());


//			System.out.println("RESPUESTA SETEADA EN EL BODY:\n" + jsonRespuesta);
		}catch(JSONException e) 
		{
			System.out.println("***********DENTRO DE CATCH******************");
			JSONObject jsonRespuesta = new JSONObject();
			ex.getOut().setBody(jsonRespuesta.toString());
			//e.printStackTrace();
		}
	}

}
