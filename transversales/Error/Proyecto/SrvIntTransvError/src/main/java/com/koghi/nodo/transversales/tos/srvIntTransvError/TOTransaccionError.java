package com.koghi.nodo.transversales.tos.srvIntTransvError;

import java.util.ArrayList;

public class TOTransaccionError {
	private String idTransaccion;
	private String fecCreacion;
	private String fecModificacion;	
	private String idUsuario;
	private ArrayList<TOError> errores;
	
	public String getIdTransaccion() {
		return idTransaccion;
	}
	public void setIdTransaccion(String idTransaccion) {
		this.idTransaccion = idTransaccion;
	}
	public String getFecCreacion() {
		return fecCreacion;
	}
	public void setFecCreacion(String fecCreacion) {
		this.fecCreacion = fecCreacion;
	}
	public String getFecModificacion() {
		return fecModificacion;
	}
	public void setFecModificacion(String fecModificacion) {
		this.fecModificacion = fecModificacion;
	}
	public String getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}
	public ArrayList<TOError> getErrores() {
		return errores;
	}
	public void setErrores(ArrayList<TOError> errores) {
		this.errores = errores;
	}
}