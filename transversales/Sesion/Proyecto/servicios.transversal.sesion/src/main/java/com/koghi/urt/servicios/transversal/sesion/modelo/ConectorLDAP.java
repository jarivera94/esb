package com.koghi.urt.servicios.transversal.sesion.modelo;

import java.util.Hashtable;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;

import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

public class ConectorLDAP {
	
	private static DirContext context;
	
	private ConectorLDAP(){
		
	}
	
	public static DirContext getConexion(String url, String user, String pass) throws NamingException {
		if (context == null) {
			Hashtable<String,String> parametros = new Hashtable<String,String>();
			parametros.put(DirContext.INITIAL_CONTEXT_FACTORY,"com.sun.jndi.ldap.LdapCtxFactory");
			//parametros.put(DirContext.PROVIDER_URL, "ldap://172.16.55.200:389/dc=koghi,dc=com");
			parametros.put(DirContext.PROVIDER_URL, url);
			parametros.put(DirContext.SECURITY_AUTHENTICATION, "simple");
			//parametros.put(DirContext.SECURITY_PRINCIPAL, "cn=Manager,dc=koghi,dc=com");
			parametros.put(DirContext.SECURITY_PRINCIPAL, user);
			//parametros.put(DirContext.SECURITY_CREDENTIALS, "mah4aephapiDo*");
			parametros.put(DirContext.SECURITY_CREDENTIALS, pass);
			context = new InitialDirContext(parametros);
		}
		return context;
	}
	
	private static DirContext getConexion() throws NamingException{ 
		return context;
	}
	
	public static NamingEnumeration<SearchResult> buscar(String filtro) throws NamingException{
		return buscar("",filtro);
	}
	
	public static NamingEnumeration<SearchResult> buscar(String base, String filtro) throws NamingException{
		SearchControls controls = new SearchControls();
		controls.setSearchScope(SearchControls.SUBTREE_SCOPE);
		NamingEnumeration<SearchResult> resultado = getConexion().search(base, filtro, controls);
		return resultado;
	}

}
