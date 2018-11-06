package com.koghi.nodo.transversales.ws.srvIntTransvOperacion;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface WSOperacion {	
	@POST
	@Path("/consultar")
	@Produces(MediaType.APPLICATION_JSON)
	public String consultar(String id);
}