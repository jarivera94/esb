package com.koghi.nodo.igac.procesadores.srvIntCertificadoCatastral;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.commons.codec.binary.Base64;

import com.koghi.nodo.igac.tos.srvIntCertificadoCatastral.TOCertificadoPDFBase64;

public class PrcCertificadoDescargar implements Processor{

	@Override
	public void process(Exchange ex) throws Exception {
		byte[] bodyBytes = ex.getIn().getBody(byte[].class);
		String body = new String(bodyBytes);
		System.out.println("Body desde IGAC: " + body);
		if (body.substring(0, 4).equals("%PDF")) {
			String encoded = new String(Base64.encodeBase64(bodyBytes));
//			System.out.println(encoded);
			TOCertificadoPDFBase64 certificadoPDFBase64 = new TOCertificadoPDFBase64();
			certificadoPDFBase64.setCertificadoPDFBase64(encoded);
			ex.getOut().setBody(certificadoPDFBase64.toString());
		}
	}
}
