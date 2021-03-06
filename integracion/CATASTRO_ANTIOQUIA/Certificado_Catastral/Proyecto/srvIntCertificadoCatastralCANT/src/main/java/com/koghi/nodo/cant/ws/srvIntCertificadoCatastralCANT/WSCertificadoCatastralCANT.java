package com.koghi.nodo.cant.ws.srvIntCertificadoCatastralCANT;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface WSCertificadoCatastralCANT {
	
	@POST
	@Path("/consultarPorFichaPredial")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarPorFichaPredial(String param);
	
	@POST
	@Path("/consultarPorFolioDeMatricula")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarPorFolioDeMatricula(String param);
	
	@POST
	@Path("/consultarPorCedulaCatastral")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarPorCedulaCatastral(String param);
}
