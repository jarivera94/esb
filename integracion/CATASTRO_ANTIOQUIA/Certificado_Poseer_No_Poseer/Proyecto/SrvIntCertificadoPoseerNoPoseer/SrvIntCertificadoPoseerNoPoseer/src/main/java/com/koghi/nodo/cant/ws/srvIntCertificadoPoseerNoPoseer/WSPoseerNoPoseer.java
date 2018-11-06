package com.koghi.nodo.cant.ws.srvIntCertificadoPoseerNoPoseer;

import javax.jws.WebParam;
import javax.ws.rs.Consumes;
//import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface WSPoseerNoPoseer {
	
	@POST
	@Path("/consultarCertificado")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultarCertificado(@WebParam String param);
	
}
