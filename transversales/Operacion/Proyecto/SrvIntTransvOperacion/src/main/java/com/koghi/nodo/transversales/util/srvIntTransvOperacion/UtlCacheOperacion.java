package com.koghi.nodo.transversales.util.srvIntTransvOperacion;

import java.util.HashMap;
import java.util.Map;

import com.koghi.nodo.transversales.tos.srvIntTransvOperacion.TOOperacion;

public class UtlCacheOperacion {
	private static UtlCacheOperacion instance = null;
	private Map<String,TOOperacion> cache = null;
	
	private UtlCacheOperacion(){
		this.cache = new HashMap<String,TOOperacion>();
	}
	public static UtlCacheOperacion getInstance (){
		if (instance == null)
			instance = new UtlCacheOperacion();
		return instance;
	}
	public Map<String, TOOperacion> getCache() {
		return cache;
	}
	public void setCache(Map<String, TOOperacion> cache) {
		this.cache = cache;
	}
}