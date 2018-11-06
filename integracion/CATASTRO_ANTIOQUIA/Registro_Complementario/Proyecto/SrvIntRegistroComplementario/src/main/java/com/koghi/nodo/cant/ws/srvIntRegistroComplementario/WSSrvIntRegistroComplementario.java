package com.koghi.nodo.cant.ws.srvIntRegistroComplementario;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface WSSrvIntRegistroComplementario {

	@POST
	@Path("/consultarPorNPN")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarPorNPN(String param);
	
	@POST
	@Path("/consultarPorFMI")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarPorFMI(String param);
	
}
