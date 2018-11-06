package com.koghi.nodo.transversales.tos.srvIntTransvCorreoElectronico;

public class TOCorreoElectronico {
	private String idUsuario;
	private String idTx;
	private String asunto;
	private String cuerpoMensaje;
	private String valDestinatario;
	
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getIdTx() {
		return idTx;
	}
	public void setIdTx(String idTx) {
		this.idTx = idTx;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getCuerpoMensaje() {
		return cuerpoMensaje;
	}
	public void setCuerpoMensaje(String cuerpoMensaje) {
		this.cuerpoMensaje = cuerpoMensaje;
	}
	public String getValDestinatario() {
		return valDestinatario;
	}
	public void setValDestinatario(String valDestinatario) {
		this.valDestinatario = valDestinatario;
	}	
}
