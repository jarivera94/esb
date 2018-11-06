package com.koghi.nodo.cant.ws.srvIntInformacionPredial;

import javax.jws.WebParam;
import javax.ws.rs.Consumes;
//import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface WSInformacionPredial {
	
	@POST
	@Path("/consultarPorDocumento")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarPorDocumento(@WebParam String param);
	
	@POST
	@Path("/consultarPorFolio")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarPorFolio(String param);
	
	@POST
	@Path("/consultarPorRazonSocial")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarPorRazonSocial(String param);
	
	@POST
	@Path("/consultarPorNombrePropietario")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarPorNombrePropietario(String param);
	
	@POST
	@Path("/consultarPorNumeroPredialNacional")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarPorNumeroPredialNacional(String param);
	
	@POST
	@Path("/consultarPorFichaPredial")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarPorFichaPredial(String param);
}
