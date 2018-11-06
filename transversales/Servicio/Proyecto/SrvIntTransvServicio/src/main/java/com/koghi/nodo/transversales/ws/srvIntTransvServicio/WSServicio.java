package com.koghi.nodo.transversales.ws.srvIntTransvServicio;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface WSServicio {
	@POST
	@Path("/consultar")
	@Produces(MediaType.APPLICATION_JSON)
	public String consultar(String id);
}