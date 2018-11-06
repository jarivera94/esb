package com.koghi.nodo.transversales.tos.srvIntTransvServicio;

public class TOOperacion {
	private String id;
	private String valNombre;
	private String idServicio;
	private String valEndpointDesarrollo;
	private String valEndpointPruebas;
	private String valEndpointProduccion;
	private String valEndpointPreproduccion;
	private int indExisteAutenticacion;
	private int indExisteAutorizacion;
	private String fecCreacion;
	private String fecModificacion;
	private String idUsuarioCreacion;
	private String idUsuarioModificacion;
	
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
	public String getIdServicio() {
		return idServicio;
	}
	public void setIdServicio(String idServicio) {
		this.idServicio = idServicio;
	}
	public String getValEndpointDesarrollo() {
		return valEndpointDesarrollo;
	}
	public void setValEndpointDesarrollo(String valEndpointDesarrollo) {
		this.valEndpointDesarrollo = valEndpointDesarrollo;
	}
	public String getValEndpointPruebas() {
		return valEndpointPruebas;
	}
	public void setValEndpointPruebas(String valEndpointPruebas) {
		this.valEndpointPruebas = valEndpointPruebas;
	}
	public String getValEndpointProduccion() {
		return valEndpointProduccion;
	}
	public void setValEndpointProduccion(String valEndpointProduccion) {
		this.valEndpointProduccion = valEndpointProduccion;
	}
	public String getValEndpointPreproduccion() {
		return valEndpointPreproduccion;
	}
	public void setValEndpointPreproduccion(String valEndpointPreproduccion) {
		this.valEndpointPreproduccion = valEndpointPreproduccion;
	}
	public int getIndExisteAutenticacion() {
		return indExisteAutenticacion;
	}
	public void setIndExisteAutenticacion(int indExisteAutenticacion) {
		this.indExisteAutenticacion = indExisteAutenticacion;
	}
	public int getIndExisteAutorizacion() {
		return indExisteAutorizacion;
	}
	public void setIndExisteAutorizacion(int indExisteAutorizacion) {
		this.indExisteAutorizacion = indExisteAutorizacion;
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
}
