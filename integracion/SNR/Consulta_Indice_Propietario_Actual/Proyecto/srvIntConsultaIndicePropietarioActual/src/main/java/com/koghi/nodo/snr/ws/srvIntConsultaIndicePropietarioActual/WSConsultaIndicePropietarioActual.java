package com.koghi.nodo.snr.ws.srvIntConsultaIndicePropietarioActual;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface WSConsultaIndicePropietarioActual {
	
	@POST
	@Path("/consultar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultar(String param);

}
