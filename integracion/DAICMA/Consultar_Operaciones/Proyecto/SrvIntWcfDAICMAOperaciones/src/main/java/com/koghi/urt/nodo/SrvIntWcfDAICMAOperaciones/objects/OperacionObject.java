package com.koghi.urt.nodo.SrvIntWcfDAICMAOperaciones.objects;

import org.datacontract.schemas._2004._07.wcf_daicma_operaciones.ClsOperaciones;

public class OperacionObject {

	private String areaDespejada;
	private int codDaneDepartamento;
	private int codDaneMunicipio;
	private String departamento;
	private String fechaFinalizacion;
	private String fechaOperacion;
	private String hazReducLocalid;
	private double latitud;
	private double longitud;
	private int map;
	private String municipio;
	private int muse;
	private String organizacion;
	private String tipoDesminado;
	private String tipoOperacion;
	
	public OperacionObject(ClsOperaciones clsOperaciones){
		this.areaDespejada = clsOperaciones.getAreaDespejada().getValue().toString();
		this.codDaneDepartamento = clsOperaciones.getCodDaneDepartamento();
		this.codDaneMunicipio = clsOperaciones.getCodDaneMunicipio();
		this.departamento = clsOperaciones.getDepartamento().getValue().toString();
		this.fechaFinalizacion = clsOperaciones.getFechaFinalizacion().toString();
		this.fechaOperacion = clsOperaciones.getFechaOperacion().toString();
		this.hazReducLocalid = clsOperaciones.getHazReducLocalid().getValue().toString();
		this.latitud = clsOperaciones.getLatitud();
		this.longitud = clsOperaciones.getLongitud();
		this.map = clsOperaciones.getMap();
		this.municipio = clsOperaciones.getMunicipio().getValue().toString();
		this.muse = clsOperaciones.getMuse();
		this.organizacion = clsOperaciones.getOrganizacion().getValue().toString();
		this.tipoDesminado = clsOperaciones.getTipoDesminado().getValue().toString();
		this.tipoOperacion = clsOperaciones.getTipoOperacion().getValue().toString();
	}

	public OperacionObject() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getAreaDespejada() {
		return areaDespejada;
	}

	public void setAreaDespejada(String areaDespejada) {
		this.areaDespejada = areaDespejada;
	}

	public int getCodDaneDepartamento() {
		return codDaneDepartamento;
	}

	public void setCodDaneDepartamento(int codDaneDepartamento) {
		this.codDaneDepartamento = codDaneDepartamento;
	}

	public int getCodDaneMunicipio() {
		return codDaneMunicipio;
	}

	public void setCodDaneMunicipio(int codDaneMunicipio) {
		this.codDaneMunicipio = codDaneMunicipio;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getFechaFinalizacion() {
		return fechaFinalizacion;
	}

	public void setFechaFinalizacion(String fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}

	public String getFechaOperacion() {
		return fechaOperacion;
	}

	public void setFechaOperacion(String fechaOperacion) {
		this.fechaOperacion = fechaOperacion;
	}

	public String getHazReducLocalid() {
		return hazReducLocalid;
	}

	public void setHazReducLocalid(String hazReducLocalid) {
		this.hazReducLocalid = hazReducLocalid;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public int getMap() {
		return map;
	}

	public void setMap(int map) {
		this.map = map;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public int getMuse() {
		return muse;
	}

	public void setMuse(int muse) {
		this.muse = muse;
	}

	public String getOrganizacion() {
		return organizacion;
	}

	public void setOrganizacion(String organizacion) {
		this.organizacion = organizacion;
	}

	public String getTipoDesminado() {
		return tipoDesminado;
	}

	public void setTipoDesminado(String tipoDesminado) {
		this.tipoDesminado = tipoDesminado;
	}

	public String getTipoOperacion() {
		return tipoOperacion;
	}

	public void setTipoOperacion(String tipoOperacion) {
		this.tipoOperacion = tipoOperacion;
	}

	@Override
	public String toString() {
		return "OperacionObject [areaDespejada=" + areaDespejada + ", codDaneDepartamento=" + codDaneDepartamento
				+ ", codDaneMunicipio=" + codDaneMunicipio + ", departamento=" + departamento + ", fechaFinalizacion="
				+ fechaFinalizacion + ", fechaOperacion=" + fechaOperacion + ", hazReducLocalid=" + hazReducLocalid
				+ ", latitud=" + latitud + ", longitud=" + longitud + ", map=" + map + ", municipio=" + municipio
				+ ", muse=" + muse + ", organizacion=" + organizacion + ", tipoDesminado=" + tipoDesminado
				+ ", tipoOperacion=" + tipoOperacion + "]";
	}
	

}
