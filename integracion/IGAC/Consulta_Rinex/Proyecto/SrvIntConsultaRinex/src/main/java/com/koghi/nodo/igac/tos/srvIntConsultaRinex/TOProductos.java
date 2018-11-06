package com.koghi.nodo.igac.tos.srvIntConsultaRinex;

public class TOProductos {

	private String error;
	private String codigo;
	private String mensaje;
	private TOArchivo archivo;
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public TOArchivo getArchivo() {
		return archivo;
	}
	public void setArchivo(TOArchivo archivo) {
		this.archivo = archivo;
	}
	
}
