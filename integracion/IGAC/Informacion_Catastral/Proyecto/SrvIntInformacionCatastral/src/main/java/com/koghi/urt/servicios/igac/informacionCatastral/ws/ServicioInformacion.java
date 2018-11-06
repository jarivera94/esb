package com.koghi.urt.servicios.igac.informacionCatastral.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/consultar")
public interface ServicioInformacion {

	
	@GET
	@Path("/predial")
	@Produces(MediaType.APPLICATION_JSON)
	public String getPredial(@QueryParam("origen") String origen, 
			@QueryParam("idRequerimiento") String idRequerimiento, 
			@QueryParam("numPredial") String numPredial, @QueryParam("usuario") String usuario);
	
	@GET
	@Path("/predios")
	@Produces(MediaType.APPLICATION_JSON)
	public String getPredios(@QueryParam("origen") String origen, 
			@QueryParam("idRequerimiento") String idRequerimiento,
			@QueryParam("usuario") String usuario, 
			@QueryParam("nombre") String nombre, 
			@QueryParam("numDoc") String numDoc,
			@QueryParam("tipoDoc") String tipoDoc,
			@QueryParam("pagina") String pagina);
	
	@GET
	@Path("/prediosParams")
	@Produces({MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN})
	public String getPrediosParams(@QueryParam("origen") String origen,
			@QueryParam("usuario") String usuario,
			@QueryParam("idRequerimiento") String idRequerimiento,
			@QueryParam("primerNombre") String primerNombre,
			@QueryParam("segundoNombre") String segundoNombre,
			@QueryParam("primerApellido") String primerApellido,
			@QueryParam("segundoApellido") String segundoApellido,
			@QueryParam("numDoc") String numDoc,
			@QueryParam("tipoDoc") String tipoDoc,
			@QueryParam("razonSocial") String razonSocial,
			@QueryParam("direccion") String direccion,
			@QueryParam("matricula") String matricula,
			@QueryParam("nroPredial") String nroPredial,
			@QueryParam("pagina") String paginan);
}
