package com.koghi.nodo.csj.tos.srvIntConsultaSentencias;

public class TOConsultaSentencias {
//	private String username;
//	private String password;
//	private String grantType;
	private String codigoCiudad;
	private String fechaInicial;
	private String fechaFinal;
	private boolean error;
	
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getGrantType() {
//		return grantType;
//	}
//	public void setGrantType(String grantType) {
//		this.grantType = grantType;
//	}
	public String getCodigoCiudad() {
		return codigoCiudad;
	}
	public void setCodigoCiudad(String codigoCiudad) {
		this.codigoCiudad = codigoCiudad;
	}
	public String getFechaInicial() {
		return fechaInicial;
	}
	public void setFechaInicial(String fechaInicial) {
		this.fechaInicial = fechaInicial;
	}
	public String getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(String fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
}