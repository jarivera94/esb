package com.koghi.nodo.cant.ws.srvIntConsultaActosAdministrativos;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface WSConsultaActosAdministrativos {
	
	@POST
	@Path("/consultarActosPorAnoYMunicipio")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarActosPorAnoYMunicipio(String param);
	
	@POST
	@Path("/consultarActosPorNumeroResolucion")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarActosPorNumeroResolucion(String param);
	
}
