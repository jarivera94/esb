package com.koghi.nodo.urt.ws.srvIntCopiaFormularioSolicitud;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface WSCopiaFormularioSolicitud {
	
	@POST
	@Path("/solicitar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.MULTIPART_FORM_DATA)
	public String solicitar(String json);
}
