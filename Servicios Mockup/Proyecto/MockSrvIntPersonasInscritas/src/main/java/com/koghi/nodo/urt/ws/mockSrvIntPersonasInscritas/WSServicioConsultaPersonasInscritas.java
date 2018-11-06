package com.koghi.nodo.urt.ws.mockSrvIntPersonasInscritas;

import javax.jws.WebParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface WSServicioConsultaPersonasInscritas {

	@POST
	@Path("/consultar")
	//@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
	@Produces(MediaType.APPLICATION_JSON)
	public String getJsonPersonQueryData(@WebParam String json ) ;
	
	@GET
	@Path("/consultar")
	public String getJsonGETPersonQueryData(@WebParam String CodigoCiudad,
											@WebParam String FechaInicial,
											@WebParam String FechaFinal ) ;
	@GET
	@Path("/consultar/{parametro}")
	public String getJsonGETPersonQueryData(@WebParam String CodigoCiudad ) ;
	
}
