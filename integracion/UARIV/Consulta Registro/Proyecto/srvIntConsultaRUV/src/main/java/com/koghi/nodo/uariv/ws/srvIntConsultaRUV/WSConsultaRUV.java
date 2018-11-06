package com.koghi.nodo.uariv.ws.srvIntConsultaRUV;

import javax.jws.WebParam;
import javax.ws.rs.Consumes;
//import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

public interface WSConsultaRUV {
	
	@POST
	@Path("/consultar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String consultaRuv(@WebParam String param);
	
	/*
	@GET
	//@Path("/LoginRest/Autentica.svc/Login/{146},{USUARIO},{PASSWORD}")
	@Path("/LoginRest/Autentica.svc/Login/{param}")
	@Produces(MediaType.APPLICATION_XML)
	//public String getLogin(@PathParam("146") String num, @PathParam("USUARIO") String usuario, @PathParam("PASSWORD") String password);
	public String getLogin(@PathParam("param") String param);
	
	@GET
	//@Path("/VivantoMovilRest/ServiceMovil.svc/Documento/{146},{ID_USUARIO},{TOKEN},{NUMERO_DOCUMENTO}")
	@Path("/VivantoMovilRest/ServiceMovil.svc/Documento/{param}")
	@Produces(MediaType.APPLICATION_XML)
	//public String getConsultaRUV(@PathParam("146") String num, @PathParam("ID_USUARIO") String idUsuario, @PathParam("TOKEN") String token, @PathParam("NUMERO_DOCUMENTO") String numeroDocumento);
	public String getConsultaRUV(@PathParam("param") String param);
	
	@GET
	//@Path("/LoginRest/Autentica.svc/Logout/{146},{ID_USUARIO},{TOKEN}")
	@Path("/LoginRest/Autentica.svc/Logout/{param}")
	@Produces(MediaType.APPLICATION_XML)
	//public String getLogOut(@PathParam("146") String num, @PathParam("ID_USUARIO") String idUsuario, @PathParam("TOKEN") String token);
	public String getLogOut(@PathParam("param") String param);
	*/

}
