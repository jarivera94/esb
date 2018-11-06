package com.koghi.nodo.uariv.util.srvIntAnexo11;

import java.io.IOException;

import org.json.JSONObject;

public class CacheLoginUariv {
	
	private static CacheLoginUariv instance;
	
	private JSONObject cache = null;
	
	public void actualizarCache(String ruta) throws IOException{
		String jsonString = ReadWrite.leerArchivo(ruta);
		cache = (jsonString.trim()).isEmpty() ? new JSONObject() : new JSONObject(jsonString);
	}
	
	public static CacheLoginUariv getInstance(String ruta) throws IOException{
		if (instance == null) {
			instance = new CacheLoginUariv();
		}
		instance.actualizarCache(ruta);
		return instance;
	}
	
	public JSONObject getCache() {
		return cache;
	}
	
	private void setCache(JSONObject json) {
		cache = json;
	}
	
	public void setCache(JSONObject json, String ruta) throws IOException {
		setCache(json);
		ReadWrite.guardarArchivo(ruta, cache.toString());
	}
	
}
