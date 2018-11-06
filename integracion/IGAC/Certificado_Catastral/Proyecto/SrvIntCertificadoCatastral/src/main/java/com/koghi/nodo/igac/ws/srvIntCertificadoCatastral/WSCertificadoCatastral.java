package com.koghi.nodo.igac.ws.srvIntCertificadoCatastral;

import javax.jws.WebParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface WSCertificadoCatastral {
		
	@POST
	@Path("/generacion")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String getPersistirSolicitud(@WebParam String json);

}
