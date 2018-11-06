package com.koghi.nodo.cant.srvIntConsultaGeograficoPredial.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface WSConsultaGeograficoPredial {
	
	@POST
	@Path("/porMatricula")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultaPorMatricula(String param);
	
	@POST
	@Path("/porPropietario")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultaPorPropietario(String param);
	
	@POST
	@Path("/porPredio")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultaPorPredio(String param);

}
