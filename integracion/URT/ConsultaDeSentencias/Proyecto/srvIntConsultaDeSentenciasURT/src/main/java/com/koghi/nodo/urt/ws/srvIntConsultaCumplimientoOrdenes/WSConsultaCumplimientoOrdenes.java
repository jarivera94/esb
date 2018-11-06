package com.koghi.nodo.urt.ws.srvIntConsultaCumplimientoOrdenes;

import javax.jws.WebParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface WSConsultaCumplimientoOrdenes {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/consultarPorSentencia")
	public String consultarPorSentencia(@WebParam String body);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/consultarPorRadicado")
	public String consultarPorRadicado(@WebParam String body);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/consultarPorFecha")
	public String consultarPorFecha(@WebParam String body);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/consultarPredioPorSentencia")
	public String consultarPredioPorSentencia(@WebParam String body);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/consultarPredioPorCedulaCatastral")
	public String consultarPredioPorCedulaCatastral(@WebParam String body);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/consultarPersonaPorDocumento")
	public String consultarPersonaPorDocumento(@WebParam String body);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/consultarOrdenesSentenciaPorIdSentencia")
	public String consultarOrdenesSentenciaPorIdSentencia(@WebParam String body);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/consultarOrdenesSentenciaPorIdOrden")
	public String consultarOrdenesSentenciaPorIdOrden(@WebParam String body);
}
