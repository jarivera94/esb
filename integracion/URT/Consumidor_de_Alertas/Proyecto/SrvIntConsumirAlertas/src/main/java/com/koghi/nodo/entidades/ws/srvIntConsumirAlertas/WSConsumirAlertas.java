package com.koghi.nodo.entidades.ws.srvIntConsumirAlertas;

import javax.jws.WebParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//@Path("/{entidad}")
public interface WSConsumirAlertas {
	
	@POST
	@Path("{parameter: urt|URT}/consumir")
	@Consumes({MediaType.MULTIPART_FORM_DATA,MediaType.APPLICATION_FORM_URLENCODED})
	@Produces(MediaType.APPLICATION_JSON)
	public String consumirAlertasURT(@WebParam String json);
	
	@POST
	@Path("{parameter: igac|IGAC}/consumir")
	@Consumes({MediaType.MULTIPART_FORM_DATA,MediaType.APPLICATION_FORM_URLENCODED})
	@Produces(MediaType.APPLICATION_JSON)
	public String consumirAlertasIGAC(@WebParam String json);
		
	@POST
	@Path("{parameter: uariv|UARIV}/consumir")
	@Consumes({MediaType.MULTIPART_FORM_DATA,MediaType.APPLICATION_FORM_URLENCODED})
	@Produces(MediaType.APPLICATION_JSON)
	public String consumirAlertasUARIV(@WebParam String json);

}
