package com.koghi.urt.servicios.igac.informacionCatastral.objects;

public class ServicioCrearMensaje {
	
	private String id_transaccion;
	private String id_entidad_emisora;
	private String id_entidad_receptora;
	private String val_mensaje;
	private String id_usuario;
	public ServicioCrearMensaje(String id_transaccion, String id_entidad_emisora, String id_entidad_receptora,
			String val_mensaje, String id_usuario) {
		super();
		this.id_transaccion = id_transaccion;
		this.id_entidad_emisora = id_entidad_emisora;
		this.id_entidad_receptora = id_entidad_receptora;
		this.val_mensaje = val_mensaje;
		this.id_usuario = id_usuario;
	}
	public ServicioCrearMensaje() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId_transaccion() {
		return id_transaccion;
	}
	public void setId_transaccion(String id_transaccion) {
		this.id_transaccion = id_transaccion;
	}
	public String getId_entidad_emisora() {
		return id_entidad_emisora;
	}
	public void setId_entidad_emisora(String id_entidad_emisora) {
		this.id_entidad_emisora = id_entidad_emisora;
	}
	public String getId_entidad_receptora() {
		return id_entidad_receptora;
	}
	public void setId_entidad_receptora(String id_entidad_receptora) {
		this.id_entidad_receptora = id_entidad_receptora;
	}
	public String getVal_mensaje() {
		return val_mensaje;
	}
	public void setVal_mensaje(String val_mensaje) {
		this.val_mensaje = val_mensaje;
	}
	public String getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}
	@Override
	public String toString() {
		return "ServicioCrearMensaje [id_transaccion=" + id_transaccion + ", id_entidad_emisora=" + id_entidad_emisora
				+ ", id_entidad_receptora=" + id_entidad_receptora + ", val_mensaje=" + val_mensaje + ", id_usuario="
				+ id_usuario + "]";
	}
	
	

}
