package com.koghi.nodo.ant.ws.srvIntConsultaBaldios;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.jws.WebParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface WSConsultaBaldios {

	@POST
	@Path("/porActoAdministrativo")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getBaldiosActData(@WebParam String json );
	
	@POST
	@Path("/porDocumento")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getBaldiosDocData(@WebParam String json );
	
	@POST
	@Path("/porNombre")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getBaldiosNameData(@WebParam String json );
	
	
}
