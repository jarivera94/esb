package com.koghi.nodo.transversales.tos.srvIntTransvMensaje;

public class TOMensaje {
	private String id;
	private String idTransaccion;
	private String idEntidadEmisora;
	private String idEntidadReceptora;
	private String valMensaje;
	private String fecCreacion;
	private String fecModificacion;
	private String idUsuario;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdTransaccion() {
		return idTransaccion;
	}
	public void setIdTransaccion(String idTransaccion) {
		this.idTransaccion = idTransaccion;
	}
	public String getIdEntidadEmisora() {
		return idEntidadEmisora;
	}
	public void setIdEntidadEmisora(String idEntidadEmisora) {
		this.idEntidadEmisora = idEntidadEmisora;
	}
	public String getIdEntidadReceptora() {
		return idEntidadReceptora;
	}
	public void setIdEntidadReceptora(String idEntidadReceptora) {
		this.idEntidadReceptora = idEntidadReceptora;
	}
	public String getValMensaje() {
		return valMensaje;
	}
	public void setValMensaje(String valMensaje) {
		this.valMensaje = valMensaje;
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
}
