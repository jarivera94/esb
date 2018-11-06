package com.koghi.nodo.uariv.ws.srvIntSuperacionSituacionVulnerabilidad;

import javax.jws.WebParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface WSssv {
	@POST
	@Path("/consultar")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarSSV(@WebParam String json);
}
