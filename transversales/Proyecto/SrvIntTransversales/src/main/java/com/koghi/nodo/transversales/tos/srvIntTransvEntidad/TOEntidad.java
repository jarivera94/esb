package com.koghi.nodo.transversales.tos.srvIntTransvEntidad;

import java.util.ArrayList;

public class TOEntidad {
	private String id;
	private String valNombre;
	private String fecCreacion;
	private String fecModificacion;
	private String idUsuarioCreacion;
	private String idUsuarioModificacion;
	private ArrayList<TOEntidadIp> ips;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getValNombre() {
		return valNombre;
	}
	public void setValNombre(String valNombre) {
		this.valNombre = valNombre;
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
	public String getIdUsuarioCreacion() {
		return idUsuarioCreacion;
	}
	public void setIdUsuarioCreacion(String idUsuarioCreacion) {
		this.idUsuarioCreacion = idUsuarioCreacion;
	}
	public String getIdUsuarioModificacion() {
		return idUsuarioModificacion;
	}
	public void setIdUsuarioModificacion(String idUsuarioModificacion) {
		this.idUsuarioModificacion = idUsuarioModificacion;
	}
	public ArrayList<TOEntidadIp> getIps() {
		return ips;
	}
	public void setIps(ArrayList<TOEntidadIp> ips) {
		this.ips = ips;
	}	
}
