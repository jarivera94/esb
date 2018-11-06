package com.koghi.urt.servicios.igac.informacionCatastral.objects;

public class ServicioTransaccion {

	public static String id = null;

	public static void load(String _id) {
		id = _id;
	}

	public static String getInstance(String _id, String operacion) {

		if (operacion.equals("crearTransaccion")) {
			load(_id);
		}
		return id;
	}
	
}
