package com.koghi.nodo.igac.procesadores.srvIntCertificadoCatastral;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;
import com.koghi.nodo.igac.tos.srvIntCertificadoCatastral.TONumeroCertificado;

public class PrcCertificadoPersistir implements Processor{

	@Override
	public void process(Exchange ex) throws Exception {
		String body = ex.getIn().getBody().toString();
		body = body.substring(1, body.length()-1);
		System.out.println("JSON Entrada: " + body );
		TONumeroCertificado numCertificado = new Gson().fromJson(body, TONumeroCertificado.class);
		if( numCertificado != null && numCertificado.getNumCertificado() != null ) {
			if(numCertificado.getNumCertificado().isEmpty()) {
				System.out.println("Num. Certificado Vacío!");
				ex.getOut().setHeader("NumCertificadoVacio", "true");
			} else {
				System.out.println("JSON Entrada numCertificado valor: " + numCertificado.getNumCertificado() );
				ex.getIn().setHeader("CamelHttpPath", "/" + numCertificado.getNumCertificado() );
				ex.getIn().setHeader("operationName", "getDescargarPdf");
				ex.getIn().setHeader("CamelHttpMethod", "GET");
				ex.getIn().setHeader("Content-Type", "");
			}
		} else {
			ex.getIn().setHeader("operationName", "getPersistirSolicitud");
			ex.getIn().setHeader("CamelHttpPath", "");
			ex.getIn().setBody(body);
		}
	}
}
