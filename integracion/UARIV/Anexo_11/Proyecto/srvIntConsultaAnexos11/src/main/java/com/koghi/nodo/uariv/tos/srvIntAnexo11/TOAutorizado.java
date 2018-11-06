package com.koghi.nodo.uariv.tos.srvIntAnexo11;

public class TOAutorizado {
	
	private String IdUsuario;
	private String Token;
	public TOAutorizado() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TOAutorizado(String idUsuario, String token) {
		super();
		IdUsuario = idUsuario;
		Token = token;
	}
	public String getIdUsuario() {
		return IdUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		IdUsuario = idUsuario;
	}
	public String getToken() {
		return Token;
	}
	public void setToken(String token) {
		Token = token;
	}
	@Override
	public String toString() {
		return "{\"IdUsuario\":\"" + IdUsuario + "\", \"Token\":\"" + Token + "\"}";
	}

}
