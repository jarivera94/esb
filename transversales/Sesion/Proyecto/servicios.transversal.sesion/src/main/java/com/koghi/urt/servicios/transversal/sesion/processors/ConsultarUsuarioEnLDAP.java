package com.koghi.urt.servicios.transversal.sesion.processors;

import java.util.ArrayList;
import java.util.Arrays;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.SearchResult;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

import com.koghi.urt.servicios.transversal.sesion.modelo.ConectorLDAP;

public class ConsultarUsuarioEnLDAP implements Processor {
	
	public void process(Exchange ex) throws Exception {
		JSONObject json = new JSONObject();
		String user = ex.getIn().getHeader("user").toString();
		String entidad = ex.getIn().getHeader("entidad").toString();
		
		String base = "ou=Users,ou=" + entidad;
		String filtro = "(uid=" + user + ")";
		
		String urlLdap = ex.getIn().getHeader("URL_LDAP").toString();
		String userLdap = ex.getIn().getHeader("USER_LDAP").toString();
		String passwordLdap = ex.getIn().getHeader("PASSWORD_LDAP").toString();
		ConectorLDAP.getConexion(urlLdap, userLdap, passwordLdap);
		
		
		if (ex.getIn().getHeader("autenticado") != null){
			if ((boolean)ex.getIn().getHeader("autenticado")){
				json.put("idSesion", "");
				json.put("idAutenticacionExitosa", true);
			}else{
				json.put("idSesion", "");
				json.put("idAutenticacionExitosa", false);
			}
		}
		
		try{
			NamingEnumeration<SearchResult> resultado = ConectorLDAP.buscar(base,filtro);
			if (resultado.hasMoreElements()){
				ex.getIn().setHeader("existeUsuario", true);
				SearchResult rs = resultado.next();
				if (resultado.hasMoreElements()){
					ex.getIn().setHeader("error", "SI");
					json.put("error", "El usuario aparece más de una vez en la entidad dada. Revisar el caso con el administrador del LDAP");
					json.put("idAutenticacionExitosa", false);
				}else{
					if (user.equals(rs.getAttributes().get("uid").get(0).toString())) {
						Attribute att = rs.getAttributes().get("userpassword");
						String passwordLDAP = new String((byte[])att.get(0));
						passwordLDAP = passwordLDAP.substring(5, passwordLDAP.length());
						String passwordEncriptado = ex.getIn().getHeader("passwordEncriptado").toString();
						if (passwordEncriptado.equals(passwordLDAP)){
							ex.getIn().setHeader("autenticado", true);
							String[] roles = consultarRoles(user,entidad);
							if (roles == null){
								ex.getIn().setHeader("error", "SI");
								json.put("error", "Se produjo un error al consultar los roles en el LDAP. Es posible que la entidad suministrada no tenga ningún rol.");
								json.put("idAutenticacionExitosa", false);
							}else{
								json.put("Lista", Arrays.toString(roles).replaceAll(" ", ""));
								json.put("idAutenticacionExitosa", true);
							}
						}else{
							ex.getIn().setHeader("autenticado", false);
							//json.put("Mensaje", "Las credenciales suministradas no son correctas.");
							JSONObject error = new JSONObject();
							error.put("codError", "ERR_SESION_AUTENTICAR_002"); //ERROR 2, CREDENCIALES INCORRECTAS
							error.put("valDescripcion", "La contraseña suministrada no es correcta");
							error.put("valExcepcion", "");
							json.put("Errores", error);
							json.put("idAutenticacionExitosa", false);
						}
					}else {
						ex.getIn().setHeader("autenticado", false);
						//json.put("Mensaje", "Las credenciales suministradas no son correctas.");
						JSONObject error = new JSONObject();
						error.put("codError", "ERR_SESION_AUTENTICAR_002"); //ERROR 2, CREDENCIALES INCORRECTAS
						error.put("valDescripcion", "El usuario suministrado no fue encontrado");
						error.put("valExcepcion", "");
						json.put("Errores", error);
						json.put("idAutenticacionExitosa", false);
					}
					
				}
			}else{
				ex.getIn().setHeader("existeUsuario", false);
				JSONObject error = new JSONObject();
				error.put("codError", "ERR_SESION_AUTENTICAR_001"); //ERROR 1, USUARIO NO EXISTENTE
				error.put("valDescripcion", "El usuario suministrado no fue encontrado en la entidad dada.");
				error.put("valExcepcion", "");
				json.put("Errores", error);
				json.put("idAutenticacionExitosa", false);
			}
		}catch(NamingException e){
			ex.getIn().setHeader("error", "SI");
			//VALIDAR EL TIPO DE ERROR PARA DETERMINAR QUÉ MENSAJE ENVIAR EN EL JSON.
			//json.put("error", "Se produjo un error LDAP en el proceso. Es posible que el ID de Usuario dado no exista en la entidad dada.");
			JSONObject error = new JSONObject();
			error.put("codError", "ERR_SESION_AUTENTICAR_003"); //ERROR 3, ERROR CONEXION LDAP
			error.put("valDescripcion", "La entidad suministrada no fue encontrada.");
			error.put("valExcepcion", e.getMessage());
			json.put("Errores", error);
			json.put("idAutenticacionExitosa", false);
		}catch(Exception e){
			JSONObject error = new JSONObject();
			error.put("codError", "ERR_SESION_AUTENTICAR_004"); //ERROR 4, EXCEPCION
			error.put("valDescripcion", "Excepción generada.");
			error.put("valExcepcion", e.getMessage());
			json.put("Errores", error);
			json.put("idAutenticacionExitosa", false);
		}
		
		ex.getIn().setBody(json.toString());
		ex.setOut(ex.getIn());
	}
	
	private String[] consultarRoles(String user, String entidad) {
		String base = "ou=Roles,ou=" + entidad;
		String filtro = "(memberUid=" + user + ")";
		String[] rolesArr = null;
		 try{
			 NamingEnumeration<SearchResult> resultado = ConectorLDAP.buscar(base,filtro);
			 ArrayList<String> roles = new ArrayList<String>();
			 while (resultado.hasMoreElements()){
				 roles.add(resultado.nextElement().getAttributes().get("cn").get(0).toString());
			 }
			 rolesArr = new String[roles.size()];
			 rolesArr = roles.toArray(rolesArr);
			 return rolesArr;
		 }catch(NamingException e){
			 return rolesArr;
		 }
	}
	
}
