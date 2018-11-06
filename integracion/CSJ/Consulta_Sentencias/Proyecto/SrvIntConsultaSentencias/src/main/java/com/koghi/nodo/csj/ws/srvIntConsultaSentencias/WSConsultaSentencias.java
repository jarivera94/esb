package com.koghi.nodo.csj.ws.srvIntConsultaSentencias;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface WSConsultaSentencias {
	@POST
	@Path("/consultar")
	@Consumes(MediaType.APPLICATION_JSON)
//	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultar(String json);
}
