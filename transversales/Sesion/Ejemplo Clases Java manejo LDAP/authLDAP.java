package com.koghi.URT.LDAP;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NameAlreadyBoundException;
import javax.naming.NamingException;
import javax.naming.directory.Attribute;
import javax.naming.directory.AttributeInUseException;
import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.NoSuchAttributeException;

public class authLDAP {
	public DirContext initConn(userLDAP userData) {
		DirContext dc;
		userData.setStatus(false);
		Hashtable<String, String> env = new Hashtable<String, String>();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, userData.getServer());
		env.put(Context.SECURITY_AUTHENTICATION, userData.getTypeAuth());
		env.put(Context.SECURITY_PRINCIPAL, userData.getDn());
		env.put(Context.SECURITY_CREDENTIALS, userData.getPass());
		try {
			dc = new InitialDirContext(env);
			System.out.println("[OK]: Usuario " + userData.getUser() + " autenticado correctamente . . .");
			userData.setStatus(true);
			return dc;
		} catch (NamingException ex) {
			System.out.println("[ERROR]: Usuario " + userData.getUser() + " NO se pudo autenticar . . .");
			return null;
		}
	}

	public void addUser(userLDAP user, userLDAP admin) {
		System.out.println(" ");
		DirContext dc = initConn(admin);
		try {
			Attributes container = new BasicAttributes();

			Attribute objClasses = new BasicAttribute("objectClass");
			objClasses.add("inetOrgPerson");

			Attribute commonName = new BasicAttribute("cn", user.getUser());
			Attribute surName = new BasicAttribute("sn", user.getSn());
			Attribute userPassword = new BasicAttribute("userpassword", user.getPass());

			container.put(objClasses);
			container.put(commonName);
			container.put(surName);
			container.put(userPassword);

			dc.createSubcontext(user.getDn(), container);
			System.out.println("[OK]: Usuario " + user.getUser() + " creado correctamente . . .");
		} catch (NameAlreadyBoundException e) {
			System.out.println("[ERROR]: Usuario " + user.getUser() + " ya existe . . .");
		} catch (NamingException e) {
			System.out.println(e);
		} finally {
			if (null != dc) {
				try {
					dc.close();
					System.out.println("[OK]: Conexión con LDAP cerrada correctamente . . .");
				} catch (NamingException e) {
					System.out.println("[ERROR]: No se logró cerrar la conexión con LDAP . . .");
				}
			}
		}
	}

	public void deleteUser(userLDAP user, userLDAP admin) {
		System.out.println(" ");
		DirContext dc = initConn(admin);
		try {
			dc.destroySubcontext(user.getDn());
			System.out.println("[OK]: Usuario " + user.getUser() + " borrado correctamente . . .");
		} catch (NamingException e) {
			System.out.println(e);
		} finally {
			if (null != dc) {
				try {
					dc.close();
					System.out.println("[OK]: Conexión con LDAP cerrada correctamente . . .");
				} catch (NamingException e) {
					System.out.println("[ERROR]: No se logró cerrar la conexión con LDAP . . .");
				}
			}
		}
	}

	public void modifyUser(String dn, String attrName, String attrValue, int ctx, userLDAP admin) {
		String notification = "";
		System.out.println(" ");
		DirContext dc = initConn(admin);
		try {
			Attributes attrs = new BasicAttributes(attrName, attrValue);
			dc.modifyAttributes(dn, ctx, attrs);
			if (ctx == DirContext.ADD_ATTRIBUTE) {
				notification = "agregado";
			} else if (ctx == DirContext.REPLACE_ATTRIBUTE) {
				notification = "reemplazado";
			} else if (ctx == DirContext.REMOVE_ATTRIBUTE) {
				notification = "borrado";
			}
			System.out.println("[OK]: Atributo " + attrName + " " + notification + " correctamente . . .");
		} catch (AttributeInUseException e) {
			System.out.println("[ERROR]: Atributo " + attrName + " ya existe . . .");
		} catch (NoSuchAttributeException e) {
			System.out.println("[ERROR]: Atributo " + attrName + " NO existe . . .");
		} catch (NamingException e) {
			System.out.println(e);
		} finally {
			if (null != dc) {
				try {
					dc.close();
					System.out.println("[OK]: Conexión con LDAP cerrada correctamente . . .");
				} catch (NamingException e) {
					System.out.println("[ERROR]: No se logró cerrar la conexión con LDAP . . .");
				}
			}
		}
	}

	public String getUser(userLDAP user, String atributo) {
		System.out.println(" ");
		String userInfo = null;
		DirContext dc = initConn(user);
		try {
			Attributes attrs = dc.getAttributes(user.getDn());
			Attribute propiedad = attrs.get(atributo);
			userInfo = propiedad.get().toString();
			System.out.println("[OK]: getUser correctamente . . .");
		} catch (NamingException e) {
			System.out.println("[ERROR]: getUser NO correctamente . . .");
		} finally {
			if (null != dc) {
				try {
					dc.close();
					System.out.println("[OK]: Conexión con LDAP cerrada correctamente . . .");
				} catch (NamingException e) {
					System.out.println("[ERROR]: No se logró cerrar la conexión con LDAP . . .");
				}
			}
		}
		return userInfo;
	}
}
