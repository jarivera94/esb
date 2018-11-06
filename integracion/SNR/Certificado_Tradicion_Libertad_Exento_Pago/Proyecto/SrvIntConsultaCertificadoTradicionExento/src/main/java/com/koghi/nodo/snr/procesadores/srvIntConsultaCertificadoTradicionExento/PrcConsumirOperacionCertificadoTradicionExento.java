package com.koghi.nodo.snr.procesadores.srvIntConsultaCertificadoTradicionExento;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.koghi.nodo.snr.tos.srvIntConsultaCertificadoTradicionExento.TOCertificadoLibertadEntrada;
import com.koghi.nodo.snr.util.srvIntConsultaCertificadoTradicionExento.ClienteWsdlSNR;
import com.koghi.nodo.snr.util.srvIntConsultaCertificadoTradicionExento.LectorArchivoPropiedades;

import co.com.ubi.enviarpdfcertificadolibertad.CertificadoLibertadPDFSal;

public class PrcConsumirOperacionCertificadoTradicionExento implements Processor {
	
	@Override
	public void process (Exchange ex) throws Exception {
		ClienteWsdlSNR cliente = ClienteWsdlSNR.getInstancia();
		
		String body = ex.getIn().getBody() != null ? ex.getIn().getBody().toString() : "";
		System.out.println("Body desde Postman: \n" + body);
		if (body.indexOf("[") >= 0) {
			body = body.substring(1, body.length() - 1);
		}
		System.out.println("Body después de quitar los brackets: \n" + body);
		
		TOCertificadoLibertadEntrada entradaServicio = new Gson().fromJson(body, TOCertificadoLibertadEntrada.class);
		
		long numeroMatricula = -1;
		long cus = -1;
		long numRecibo = -1;
		long pin = -1;
		
		System.out.println("Long values: " + numeroMatricula + " " + cus + " " + numRecibo + " " + pin);
		
		if (entradaServicio != null) {
			numeroMatricula = entradaServicio.getEntrada().getNumeroMatricula() != null ? entradaServicio.getEntrada().getNumeroMatricula() : numeroMatricula;
			cus = entradaServicio.getEntrada().getCus() != null ? entradaServicio.getEntrada().getCus() : cus;
			numRecibo = entradaServicio.getEntrada().getNumRecibo() != null ? entradaServicio.getEntrada().getNumRecibo() : numRecibo;
			pin = entradaServicio.getEntrada().getPin() != null ? entradaServicio.getEntrada().getPin() : pin;
		}
		
		entradaServicio.getEntrada().setNumeroMatricula(numeroMatricula);
		entradaServicio.getEntrada().setCus(cus);
		entradaServicio.getEntrada().setNumRecibo(numRecibo);
		entradaServicio.getEntrada().setPin(pin);
		
		entradaServicio.getEntrada().setClave(ex.getIn().getHeader("ClaveUsuario") != null ? ex.getIn().getHeader("ClaveUsuario").toString() : "");
		entradaServicio.getEntrada().setNombreUsuario(ex.getIn().getHeader("NombreUsuario") != null ? ex.getIn().getHeader("NombreUsuario").toString() : "");
		CertificadoLibertadPDFSal salidaServicio = new CertificadoLibertadPDFSal();
		
		LectorArchivoPropiedades.setValProperty();
		String hostURI = LectorArchivoPropiedades.getProperty("HOST_SOAP_SNR");
		if (!hostURI.isEmpty()) {
			cliente.setNewEndpointWSDL(hostURI);
		}
		
		salidaServicio = entradaServicio.getEntrada() != null ? cliente.obtenerConsultaJuridica(entradaServicio.getEntrada()) : new CertificadoLibertadPDFSal();
		
		String jsonRespuesta = new Gson().toJson(salidaServicio, CertificadoLibertadPDFSal.class);
		
		System.out.println("Salida servicio sin modificar: " + jsonRespuesta);
		
		JSONObject jsonORespuesta = new JSONObject(jsonRespuesta);
		
		JSONObject tipoLogResultadoConsulta = jsonORespuesta.getJSONObject("tipoLogResultadoConsulta") != null ? jsonORespuesta.getJSONObject("tipoLogResultadoConsulta") : new JSONObject();
		
		if (tipoLogResultadoConsulta.has("fechaHoraConsulta")) {
			tipoLogResultadoConsulta.put("fechaHoraConsulta", salidaServicio.getTipoLogResultadoConsulta().getFechaHoraConsulta().toString());
			jsonORespuesta.put("tipoLogResultadoConsulta", tipoLogResultadoConsulta);
		}
		
		jsonORespuesta.put("codigoResultado", salidaServicio.getCodigoResultado());
		jsonORespuesta.put("datosArchivoPDF", salidaServicio.getDatosArchivoPDF());
		jsonORespuesta.put("estado", salidaServicio.getEstado());
		jsonORespuesta.put("fecha", salidaServicio.getFecha().toString());
		jsonORespuesta.put("mensajeResultado", salidaServicio.getMensajeResultado());
		jsonORespuesta.put("numeroTurno", salidaServicio.getNumeroTurno());
		jsonORespuesta.put("pin", salidaServicio.getPin());
		jsonORespuesta.put("codigoResultado", salidaServicio.getCodigoResultado());
		
		jsonRespuesta = jsonORespuesta.toString();
		
		System.out.println("JSON Respuesta: " + jsonRespuesta);
		ex.getIn().setBody(jsonORespuesta.toString());
		ex.setOut(ex.getIn());
	}

}
