package com.koghi.urt.nodo.srvIntWcfDAICMAEventos.objects;

import org.datacontract.schemas._2004._07.wcf_daicma_eventos.ClsEventos;

public class EventosObject {

	private int codDaneDepartamento;
	private int codDaneMunicipio;
	private String codImsmaEvento;
	private String coordenadasTomadasCon;
	private String departamento;
	private String descripcionEvento;
	private String estado;
	private String evento;
	private String fechaEvento;
	private Double latitud;
	private Double longitud;
	private String municipio;
	private String presuntoActorResponsable;
	private String sitio;
	private String tipoArea;
	private String tipoEvento;
	private String tipoLugar;

	public EventosObject(ClsEventos eventos) {
		super();
		this.codDaneDepartamento = eventos.getCodDaneDepartamento();
		this.codDaneMunicipio = eventos.getCodDaneMunicipio();
		this.codImsmaEvento = eventos.getCodImsmaEvento().getValue();
		this.coordenadasTomadasCon = eventos.getCoordenadasTomadasCon().getValue();
		this.departamento = eventos.getDepartamento().getValue();
		this.descripcionEvento = eventos.getDescripcionEvento().getValue();
		this.estado = eventos.getEstado().getValue();
		this.evento = eventos.getEvento().getValue();
		this.fechaEvento = eventos.getFechaEvento().toString();
		this.latitud = eventos.getLatitud();
		this.longitud = eventos.getLongitud();
		this.municipio = eventos.getMunicipio().getValue();
		this.presuntoActorResponsable = eventos.getPresuntoActorResponsable().getValue();
		this.sitio = eventos.getSitio().getValue();
		this.tipoArea = eventos.getTipoArea().getValue();
		this.tipoEvento = eventos.getTipoEvento().getValue();
		this.tipoLugar = eventos.getTipoLugar().getValue();

	}

	public EventosObject() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getCodImsmaEvento() {
		return codImsmaEvento;
	}

	public void setCodImsmaEvento(String codImsmaEvento) {
		this.codImsmaEvento = codImsmaEvento;
	}

	public String getCoordenadasTomadasCon() {
		return coordenadasTomadasCon;
	}

	public void setCoordenadasTomadasCon(String coordenadasTomadasCon) {
		this.coordenadasTomadasCon = coordenadasTomadasCon;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getDescripcionEvento() {
		return descripcionEvento;
	}

	public void setDescripcionEvento(String descripcionEvento) {
		this.descripcionEvento = descripcionEvento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public String getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(String fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getPresuntoActorResponsable() {
		return presuntoActorResponsable;
	}

	public void setPresuntoActorResponsable(String presuntoActorResponsable) {
		this.presuntoActorResponsable = presuntoActorResponsable;
	}

	public String getSitio() {
		return sitio;
	}

	public void setSitio(String sitio) {
		this.sitio = sitio;
	}

	public String getTipoArea() {
		return tipoArea;
	}

	public void setTipoArea(String tipoArea) {
		this.tipoArea = tipoArea;
	}

	public String getTipoEvento() {
		return tipoEvento;
	}

	public void setTipoEvento(String tipoEvento) {
		this.tipoEvento = tipoEvento;
	}

	public String getTipoLugar() {
		return tipoLugar;
	}

	public void setTipoLugar(String tipoLugar) {
		this.tipoLugar = tipoLugar;
	}

	@Override
	public String toString() {
		return "EventosObject [codDaneDepartamento=" + codDaneDepartamento + ", codDaneMunicipio=" + codDaneMunicipio
				+ ", codImsmaEvento=" + codImsmaEvento + ", coordenadasTomadasCon=" + coordenadasTomadasCon
				+ ", departamento=" + departamento + ", descripcionEvento=" + descripcionEvento + ", estado=" + estado
				+ ", evento=" + evento + ", fechaEvento=" + fechaEvento + ", latitud=" + latitud + ", longitud="
				+ longitud + ", municipio=" + municipio + ", presuntoActorResponsable=" + presuntoActorResponsable
				+ ", sitio=" + sitio + ", tipoArea=" + tipoArea + ", tipoEvento=" + tipoEvento + ", tipoLugar="
				+ tipoLugar + "]";
	}

	
	
	

}
