package com.koghi.nodo.uariv.tos.srvIntAnexo11;

public class TOEntradaServicioURT {
	
	private String IdUsuario;
	private String Token;
	private String numero2;
	private String periodo;
	private String mes;
	private String vigencia;
	
	public String getIdUsuario() {
		return IdUsuario;
	}
	public String getToken() {
		return Token;
	}
	public String getNumero2() {
		return numero2;
	}
	public String getPeriodo() {
		return periodo;
	}
	public String getMes() {
		return mes;
	}
	public String getVigencia() {
		return vigencia;
	}
	public void setIdUsuario(String idUsuario) {
		IdUsuario = idUsuario;
	}
	public void setToken(String token) {
		Token = token;
	}
	public void setNumero2(String numero2) {
		this.numero2 = numero2;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public void setVigencia(String vigencia) {
		this.vigencia = vigencia;
	}
	
}
