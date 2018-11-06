package com.koghi.urt.servicios.transversal.sesion.modelo;

import java.security.MessageDigest;

import org.apache.commons.codec.binary.Base64;

public class CodificarBase64 {
	
	public static String MD5 = "MD5";
	
	public static String encriptar(String frase, String algoritmo) throws Exception {
		MessageDigest md = MessageDigest.getInstance(algoritmo);
		md.update(frase.getBytes());
		byte[] cifrado = md.digest();
		byte[] cifradoBase64 = Base64.encodeBase64(cifrado);
		return new String(cifradoBase64);
	}
	
	public static String decodificar(String frase) {
		byte[] decoded = Base64.decodeBase64(frase);
		String fraseDecoded = new String(decoded);
		return fraseDecoded;
	}

}
