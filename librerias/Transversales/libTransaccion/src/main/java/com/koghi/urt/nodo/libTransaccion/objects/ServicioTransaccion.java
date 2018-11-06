package com.koghi.urt.nodo.libTransaccion.objects;

import org.json.JSONObject;

public class ServicioTransaccion {

	private static JSONObject json;

	private static JSONObject getInstance() {
		if (json == null) {
			json = new JSONObject();
		}
		System.out.println("ESTADO DEL CACHE DE ID DE TRANSACCIONES:");
		System.out.println(json.toString());
		return json;
	}
	
	public static String getId(String llave) {
		System.out.println("OBTENIENDO LA TRANSACCION, CON ID DE EXCHANGE: " + llave);
		JSONObject json = ServicioTransaccion.getInstance();
		String valor = json.has(llave) ? json.getString(llave) : "";
		System.out.println("ID DE TRANSACCION OBTENIDO: " + valor);
		return valor;
	}
	
	public static void setId(String llave, String id) {
		System.out.println("SETEANDO LA TRANSACCION DE ID " + id + " CON ID DE EXCHANGE (LLAVE) DE " + llave);
		JSONObject json = ServicioTransaccion.getInstance();
		json.put(llave , id);
		System.out.println("ESTADO DEL CACHÉ DE TRANSACCIONES: " + json.toString());
	}
	
}
