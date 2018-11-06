package com.koghi.urt.nodo.libTransaccion.objects;

import java.util.ArrayList;

public class ServicioErrorCrear {
	
	private String idTransaccion;
	private String idUsuario;
	private ArrayList<ServicioError> errores;
	
	public ServicioErrorCrear(String id_transaccion, String id_usuario, ArrayList<ServicioError> errores) {
		super();
		this.idTransaccion = id_transaccion;
		this.idUsuario = id_usuario;
		this.errores = errores;
	}
	public ServicioErrorCrear() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId_transaccion() {
		return idTransaccion;
	}
	public void setId_transaccion(String id_transaccion) {
		this.idTransaccion = id_transaccion;
	}
	public String getId_usuario() {
		return idUsuario;
	}
	public void setId_usuario(String id_usuario) {
		this.idUsuario = id_usuario;
	}
	public ArrayList<ServicioError> getErrores() {
		return errores;
	}
	public void setErrores(ArrayList<ServicioError> errores) {
		this.errores = errores;
	}
	@Override
	public String toString() {
		return "ServicioErrorCrear [id_transaccion=" + idTransaccion + ", id_usuario=" + idUsuario + ", errores="
				+ errores + "]";
	}
	
	
	
}
