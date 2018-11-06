package com.koghi.nodo.snr.procesadores.srvIntConsultaCopiaSimplePDF;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

import com.koghi.nodo.snr.util.srvIntConsultaCopiaSimplePDF.ClienteWsdlSNR;
import com.koghi.nodo.snr.util.srvIntConsultaCopiaSimplePDF.LectorArchivoPropiedades;

import co.com.ubi.servgenpdfconsultaj.EntradaServGenPDFConsultaJuridica;
import co.com.ubi.servgenpdfconsultaj.SalidaServGenPDFConsultaJuridica;

public class PrcConsumirOperacionCopiaSimplePDF implements Processor {
	
	@Override
	public void process (Exchange ex) throws Exception {
		ClienteWsdlSNR cliente = ClienteWsdlSNR.getInstancia();
		
		String body = ex.getIn().getBody() != null ? ex.getIn().getBody().toString() : "";
		System.out.println("Body desde Postman: \n" + body);
		if (body.indexOf("[") >= 0) {
			body = body.substring(1, body.length() - 1);
		}
		System.out.println("Body después de quitar los brackets: \n" + body);
		JSONObject json = !body.equals("") ? new JSONObject(body) : new JSONObject();
		
		EntradaServGenPDFConsultaJuridica entradaServicio = new EntradaServGenPDFConsultaJuridica();
		SalidaServGenPDFConsultaJuridica salidaServicio = new SalidaServGenPDFConsultaJuridica();
		String pdf;
		
		entradaServicio.setCirculo(json.has("circulo") ? json.get("circulo").toString() : "");
		entradaServicio.setCiudadEntidad(json.has("ciudadEntidad") ? json.get("ciudadEntidad").toString() : "");
		entradaServicio.setEntidad(json.has("entidad") ? json.get("entidad").toString() : "");
		entradaServicio.setIpConsulta(json.has("ipConsulta") ? json.get("ipConsulta").toString() : "");
		entradaServicio.setNombreUsuario(ex.getIn().getHeader("NombreUsuario") != null ? ex.getIn().getHeader("NombreUsuario").toString() : "");
		entradaServicio.setNumeroMatricula(json.has("numeroMatricula") ? Long.parseLong(json.get("numeroMatricula").toString()) : -1);
		entradaServicio.setSistemaUsuario(ex.getIn().getHeader("SistemaUsuario") != null ? ex.getIn().getHeader("SistemaUsuario").toString() : "");
		
		LectorArchivoPropiedades.setValProperty();
		String hostURI = LectorArchivoPropiedades.getProperty("HOST_SOAP_SNR");
		if (!hostURI.isEmpty()) {
			cliente.setNewEndpointWSDL(hostURI);
		}
		
		salidaServicio = cliente.obtenerConsultaJuridica(entradaServicio);
		pdf = salidaServicio.getPdf() != null ? new String (salidaServicio.getPdf()) : "";
		
		JSONObject jsonRespuesta = new JSONObject();
		jsonRespuesta.put("codigoResultado", salidaServicio.getCodigoResultado());
		jsonRespuesta.put("logResultadoConsulta", salidaServicio.getLogResultadoConsulta());
		jsonRespuesta.put("mensajeResultado", salidaServicio.getMensajeResultado());
		jsonRespuesta.put("pdf", !pdf.isEmpty() ? pdf : salidaServicio.getPdf());
		
		System.out.println("JSON Respuesta: " + jsonRespuesta.toString());
		ex.getIn().setBody(jsonRespuesta.toString());
		ex.setOut(ex.getIn());
	}

}
