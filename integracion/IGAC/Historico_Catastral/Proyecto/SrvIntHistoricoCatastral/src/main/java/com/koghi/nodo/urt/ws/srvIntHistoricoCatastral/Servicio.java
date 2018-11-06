package com.koghi.nodo.urt.ws.srvIntHistoricoCatastral;

import javax.jws.WebParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/consultar")
public interface Servicio {

	@POST
	@Path("/porPersona")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN})
	@Produces({MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN})
	public String consultaPorPersona(@WebParam String consulta);
	
	@POST
	@Path("/porPredio")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN})
	@Produces({MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN})
	public String consultaPorPredio(@WebParam String consulta);
	
	@POST
	@Path("/porUbicacion")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN})
	@Produces({MediaType.APPLICATION_JSON,MediaType.TEXT_PLAIN})
	public String consultaPorUbicacion(@WebParam String consulta);
	
}
