package com.koghi.nodo.urt.ws.srvIntConsultaZonasMicrofocalizadas;

import javax.jws.WebParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface WSConsultaZonasMicrofocalizadas {

	@POST
	@Path("/consultar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getJsonPersonQueryData(@WebParam String json ) ;
	
	
}
