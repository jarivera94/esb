package com.koghi.nodo.igac.ws.srvIntInformacionGeograficaPredial;

import javax.jws.WebParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface WSInformacionGeograficaPredial {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/consultar")
	public String consultarInformacionGeograficaPredial(@WebParam String body);

}
