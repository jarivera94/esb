package com.koghi.URT.pro;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;
import com.koghi.URT.LDAP.*;

public class LDAPpro implements Processor {
	@Override
	public void process(Exchange ex) throws Exception {
		String usuarioLDAP = ex.getIn().getBody(String.class);
		userLDAP usrLDAP = new Gson().fromJson(usuarioLDAP, userLDAP.class);
		
		usrLDAP.setServer("ldap://localhost:389/");
		usrLDAP.setTypeAuth("simple");
		usrLDAP.setDn("uid=" + usrLDAP.getUser() + ",ou=" + usrLDAP.getCompany() + ",dc=koghi,dc=com");
		
		authLDAP LDAP = new authLDAP();
		LDAP.initConn(usrLDAP);
		if(usrLDAP.isStatus())
			usrLDAP.setRole(LDAP.getUser(usrLDAP, "gidNumber"));
		
		usuarioLDAP = new Gson().toJson(usrLDAP);
		ex.getOut().setBody(usuarioLDAP);
	}
}