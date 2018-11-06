package com.koghi.urt.servicios.igac.informacionCatastral.objects;

import java.util.ArrayList;

public class ServicioErrorCrear {
	
	private String id_transaccion;
	private String id_usuario;
	private ArrayList<ServicioError> errores;
	public ServicioErrorCrear(String id_transaccion, String id_usuario, ArrayList<ServicioError> errores) {
		super();
		this.id_transaccion = id_transaccion;
		this.id_usuario = id_usuario;
		this.errores = errores;
	}
	public ServicioErrorCrear() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId_transaccion() {
		return id_transaccion;
	}
	public void setId_transaccion(String id_transaccion) {
		this.id_transaccion = id_transaccion;
	}
	public String getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}
	public ArrayList<ServicioError> getErrores() {
		return errores;
	}
	public void setErrores(ArrayList<ServicioError> errores) {
		this.errores = errores;
	}
	@Override
	public String toString() {
		return "ServicioErrorCrear [id_transaccion=" + id_transaccion + ", id_usuario=" + id_usuario + ", errores="
				+ errores + "]";
	}
	
	
	
}
