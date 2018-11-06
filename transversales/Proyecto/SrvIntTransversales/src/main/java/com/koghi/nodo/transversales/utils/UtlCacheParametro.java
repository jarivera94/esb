package com.koghi.nodo.transversales.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.koghi.nodo.transversales.tos.srvIntTransvParametro.TOParametro;

public class UtlCacheParametro {
	private static UtlCacheParametro instance = null;
	private Map<String,List<TOParametro>> cache = null;
	
	private UtlCacheParametro(){
		this.cache = new HashMap<String,List<TOParametro>>();
	}
	public static UtlCacheParametro getInstance (){
		if (instance == null)
			instance = new UtlCacheParametro();
		return instance;
	}
	public Map<String,List<TOParametro>> getCache() {
		return cache;
	}
	public void setCache(Map<String,List<TOParametro>> cache) {
		this.cache = cache;
	}
}