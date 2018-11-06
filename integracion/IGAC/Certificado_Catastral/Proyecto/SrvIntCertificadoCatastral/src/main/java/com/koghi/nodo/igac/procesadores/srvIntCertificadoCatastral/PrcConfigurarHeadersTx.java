package com.koghi.nodo.igac.procesadores.srvIntCertificadoCatastral;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;
import com.koghi.nodo.igac.modelo.srvIntCertificadoCatastral.DecodificadorBase64;
import com.koghi.nodo.igac.tos.srvIntCertificadoCatastral.TONumeroCertificado;

public class PrcConfigurarHeadersTx implements Processor {

	@Override
	public void process(Exchange ex) {
		String hdrEntidadEmisora = ex.getIn().getHeader("IdEntidadConsumidora") != null ? ex.getIn().getHeader("IdEntidadConsumidora").toString() : "" ;
		String hdrIdUsuario = ex.getIn().getHeader("Authorization") != null ? ex.getIn().getHeader("Authorization").toString() : "";

		if (!hdrIdUsuario.isEmpty()) {
			hdrIdUsuario = hdrIdUsuario.substring(6);
//			System.out.println("Authorization: " + hdrIdUsuario);
			hdrIdUsuario = DecodificadorBase64.decodificar(hdrIdUsuario);
//			System.out.println("Usuario y contraseña: " + hdrIdUsuario);
			hdrIdUsuario = hdrIdUsuario.substring(0, hdrIdUsuario.indexOf(":"));
//			System.out.println("\n\n\n*********************************************************************\n");
//			System.out.println("IdUsuario: " + hdrIdUsuario);
			ex.getIn().getHeaders().put("IdUsuario", hdrIdUsuario);
		}
		
		ex.setOut(ex.getIn());
		ex.getOut().getHeaders().put("EntidadEmisora", hdrEntidadEmisora);
		
		String body = ex.getIn().getBody().toString();
		body = body.substring(1, body.length()-1);
		System.out.println("JSON Entrada: " + body );
		TONumeroCertificado numCertificado = new Gson().fromJson(body, TONumeroCertificado.class);
		
		if (numCertificado != null) {
			if (numCertificado.getNumCertificado() != null) {
				ex.getIn().setHeader("operationName", "getDescargarPdf");
			}else {
				ex.getIn().setHeader("operationName", "getPersistirSolicitud");
			}
		}else {
			ex.getIn().setHeader("operationName", "getPersistirSolicitud");
		}
		
//		System.out.println("EntidadEmisora: " + ex.getOut().getHeader("EntidadEmisora"));
//		System.out.println("Body In: " + ex.getIn().getBody().toString());
//		System.out.println("Body Out: " + ex.getOut().getBody().toString());
//		System.out.println("\n*********************************************************************\n\n\n");
	}
	
}
