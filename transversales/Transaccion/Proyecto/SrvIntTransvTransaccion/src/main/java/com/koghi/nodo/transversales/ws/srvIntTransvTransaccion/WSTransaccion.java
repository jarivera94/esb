package com.koghi.nodo.transversales.ws.srvIntTransvTransaccion;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface WSTransaccion {	
	@POST
	@Path("/crear")
	@Consumes(MediaType.APPLICATION_JSON)
	public String crear(String json);
	
	@POST
	@Path("/actualizar")
	@Consumes(MediaType.APPLICATION_JSON)
	public String actualizar(String json);
}