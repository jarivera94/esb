package com.koghi.nodo.uariv.tos.srvIntAnexo11;

public class TOEntrada {
	
	private String numero;
	private String usuario;
	private String password;
	private String numero2;
	private String periodo;
	private String mes;
	private String vigencia;
	
	public TOEntrada() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TOEntrada(String numero, String usuario, String password, String numero2, String periodo, String mes, String vigencia) {
		super();
		this.numero = numero;
		this.usuario = usuario;
		this.password = password;
		this.numero2 = numero2;
		this.periodo = periodo;
		this.mes = mes;
		this.vigencia = vigencia;
	}

	public String getNumero() {
		return numero;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getPassword() {
		return password;
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

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setPassword(String password) {
		this.password = password;
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

	@Override
	public String toString() {
		return "{\"numero\":\"" + numero + "\", \"usuario\":\"" + usuario + "\", \"password\":\"" + password + "\", \"numero2\":\"" + numero2
				+ "\", \"periodo\":" + periodo + "\", \"mes\":\"" + mes + "\", \"vigencia\":" + vigencia + "\"}";
	}	

}
