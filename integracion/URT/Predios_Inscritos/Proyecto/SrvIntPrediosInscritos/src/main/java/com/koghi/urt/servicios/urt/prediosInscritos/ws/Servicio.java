package com.koghi.urt.servicios.urt.prediosInscritos.ws;

import javax.jws.WebParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public interface Servicio {
	
	@POST
	@Path("/consultar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.MULTIPART_FORM_DATA,MediaType.APPLICATION_JSON})
	public String getPrediosInscritos(@WebParam String json);

}
