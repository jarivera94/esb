package com.koghi.nodo.csj.ws.srvIntConsultaProcesos;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface WSConsultaProcesos {

//	@POST
//	@Path("/token")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public String token(String json ) ;
	
	@POST
	@Path("/consultaProcesos")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultaProcesos(String json );
	
	@POST
	@Path("/consulta")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consulta(String json );
	
	@POST
	@Path("/sentenciasPorRadicacion")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String sentenciasPorRadicacion(String json );
	
	@POST
	@Path("/sentenciasDespacho")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String sentenciasDespacho(String json );
	
	@POST
	@Path("/sentenciasPDF")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String sentenciasPDF(String json );
}
