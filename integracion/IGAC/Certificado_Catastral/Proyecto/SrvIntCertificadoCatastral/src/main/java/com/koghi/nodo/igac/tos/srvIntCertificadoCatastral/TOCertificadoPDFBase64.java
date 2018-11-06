package com.koghi.nodo.igac.tos.srvIntCertificadoCatastral;

public class TOCertificadoPDFBase64 {
	private String certificadoPDFBase64;

	public String getCertificadoPDFBase64() {
		return certificadoPDFBase64;
	}

	public void setCertificadoPDFBase64(String certificadoPDFBase64) {
		this.certificadoPDFBase64 = certificadoPDFBase64;
	}

	@Override
	public String toString() {
		return "{\"certificadoPDFBase64\":\"" + certificadoPDFBase64 + "\"}";
	}
	
}
