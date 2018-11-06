package com.koghi.nodo.igac.ws.srvIntConsultaInformacionPredial;

import javax.jws.WebParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface WSInformacionPredial {

	@POST
	@Path("/registrarSolicitudAdministrativa")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String registrarSolicitudAdministrativa(@WebParam String json);
	
	@POST
	@Path("/registrarSolicitudJudicial")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String registrarSolicitudJudicial(@WebParam String json);
	
	@POST
	@Path("/registrarSolicitudPostfallo")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String registrarSolicitudPostfallo(@WebParam String json);
	
}
