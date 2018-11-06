package com.koghi.nodo.transversales.tos.srvIntTransvServicio;

import java.util.ArrayList;

public class TOServicio {
	private String id;
	private String valNombre;
	private int valVersion;
	private String valEmailNotificacion;
	private String idEntidad;
	private String codTipo;
	private String fecCreacion;
	private String fecModificacion;
	private String idUsuarioCreacion;
	private String idUsuarioModificacion;
	private ArrayList<TOOperacion> operaciones;
	
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
	public int getValVersion() {
		return valVersion;
	}
	public void setValVersion(int valVersion) {
		this.valVersion = valVersion;
	}
	public String getValEmailNotificacion() {
		return valEmailNotificacion;
	}
	public void setValEmailNotificacion(String valEmailNotificacion) {
		this.valEmailNotificacion = valEmailNotificacion;
	}
	public String getIdEntidad() {
		return idEntidad;
	}
	public void setIdEntidad(String idEntidad) {
		this.idEntidad = idEntidad;
	}
	public String getCodTipo() {
		return codTipo;
	}
	public void setCodTipo(String codTipo) {
		this.codTipo = codTipo;
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
	public ArrayList<TOOperacion> getOperaciones() {
		return operaciones;
	}
	public void setOperaciones(ArrayList<TOOperacion> operaciones) {
		this.operaciones = operaciones;
	}
}
