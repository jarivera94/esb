package com.koghi.nodo.transversales.utils;

import java.util.HashMap;
import java.util.Map;

import com.koghi.nodo.transversales.tos.srvIntTransvServicio.TOServicio;

public class UtlCacheServicio {
	private static UtlCacheServicio instance = null;
	private Map<String,TOServicio> cache = null;
	
	private UtlCacheServicio(){
		this.cache = new HashMap<String,TOServicio>();
	}
	public static UtlCacheServicio getInstance (){
		if (instance == null)
			instance = new UtlCacheServicio();
		return instance;
	}
	public Map<String, TOServicio> getCache() {
		return cache;
	}
	public void setCache(Map<String, TOServicio> cache) {
		this.cache = cache;
	}
}