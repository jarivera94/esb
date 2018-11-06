package com.koghi.nodo.transversales.ws.srvIntTransvParametro;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface WSParametro {	
	@POST
	@Path("/consultarPorCriterio")
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarPorCriterio(String id);
}