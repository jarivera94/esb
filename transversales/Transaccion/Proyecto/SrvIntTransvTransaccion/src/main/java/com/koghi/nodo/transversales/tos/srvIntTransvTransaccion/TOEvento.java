package com.koghi.nodo.transversales.tos.srvIntTransvTransaccion;

public class TOEvento {
	private String idTransaccion;
	private String valDescripcion;
	private String valSeveridad;
	private String idUsuario;
	
	public String getIdTransaccion() {
		return idTransaccion;
	}
	public void setIdTransaccion(String idTransaccion) {
		this.idTransaccion = idTransaccion;
	}
	public String getValDescripcion() {
		return valDescripcion;
	}
	public void setValDescripcion(String valDescripcion) {
		this.valDescripcion = valDescripcion;
	}
	public String getValSeveridad() {
		return valSeveridad;
	}
	public void setValSeveridad(String valSeveridad) {
		this.valSeveridad = valSeveridad;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}	
}
