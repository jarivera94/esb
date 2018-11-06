package com.koghi.nodo.transversales.util.srvIntTransvEntidad;

import java.util.HashMap;
import java.util.Map;

import com.koghi.nodo.transversales.tos.srvIntTransvEntidad.TOEntidad;

public class UtlCacheEntidad {
	private static UtlCacheEntidad instance = null;
	private Map<String,TOEntidad> cache = null;
	
	private UtlCacheEntidad(){
		this.cache = new HashMap<String,TOEntidad>();
	}
	public static UtlCacheEntidad getInstance (){
		if (instance == null)
			instance = new UtlCacheEntidad();
		return instance;
	}
	public Map<String, TOEntidad> getCache() {
		return cache;
	}
	public void setCache(Map<String, TOEntidad> cache) {
		this.cache = cache;
	}
}