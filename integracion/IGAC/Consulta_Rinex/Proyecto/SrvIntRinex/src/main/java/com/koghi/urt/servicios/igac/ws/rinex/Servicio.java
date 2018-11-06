package com.koghi.urt.servicios.igac.ws.rinex;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("")
public interface Servicio{

	
	@GET
	@Path("/estaciones")
	@Produces({MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN})
	public String getEstaciones();
	
	@GET
	@Path("/productos")
	public String getProductos(@QueryParam("idEstacion") String idEstacion, @QueryParam("fechaCalendario") String fechaCalendario, 
			@QueryParam("tipoArchivo") String tipoArchivo);
	
	
}
