package com.koghi.nodo.csj.srvIntConsultaProcesos.util;

import org.apache.commons.codec.binary.Base64;

public class DecodificadorBase64 {
	
	public static String decodificar(String frase) {
		byte[] decoded = Base64.decodeBase64(frase);
		String fraseDecoded = new String(decoded);
		return fraseDecoded;
	}

}
