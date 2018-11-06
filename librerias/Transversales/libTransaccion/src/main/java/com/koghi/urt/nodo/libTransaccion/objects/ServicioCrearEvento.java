package com.koghi.urt.nodo.libTransaccion.objects;

public class ServicioCrearEvento {
	
	private String id_transaccion;
	private String val_descripcion;
	private String val_severidad;
	private String id_usuario;
	
	public ServicioCrearEvento() {
		super();
	}
	
	public ServicioCrearEvento(String id_transaccion, String val_descripcion, String val_severidad, String id_usuario) {
		super();
		this.id_transaccion = id_transaccion;
		this.val_descripcion = val_descripcion;
		this.val_severidad = val_severidad;
		this.id_usuario = id_usuario;
	}
	
	public String getId_transaccion() {
		return id_transaccion;
	}
	public void setId_transaccion(String id_transaccion) {
		this.id_transaccion = id_transaccion;
	}
	public String getVal_descripcion() {
		return val_descripcion;
	}
	public void setVal_descripcion(String val_descripcion) {
		this.val_descripcion = val_descripcion;
	}
	public String getVal_severidad() {
		return val_severidad;
	}
	public void setVal_severidad(String val_severidad) {
		this.val_severidad = val_severidad;
	}
	public String getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}
	@Override
	public String toString() {
		return "ServicioCrearEvento [id_transaccion=" + id_transaccion + ", val_descripcion=" + val_descripcion
				+ ", val_severidad=" + val_severidad + ", id_usuario=" + id_usuario + "]";
	}
	
	

}
