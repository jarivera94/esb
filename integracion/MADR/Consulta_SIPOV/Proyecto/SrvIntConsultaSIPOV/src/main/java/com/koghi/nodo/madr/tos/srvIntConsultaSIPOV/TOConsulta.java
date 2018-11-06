package com.koghi.nodo.madr.tos.srvIntConsultaSIPOV;

import javax.xml.datatype.XMLGregorianCalendar;

import co.gov.gobiernoenlinea.gel_xml._1_0.schemas.proyectos.minagricultura.sipov.TipoOrden;

public class TOConsulta {
	private String accionDerivOrden;
	private String aclaraciones;
	private String diasTranscurridosPlazo;
	private XMLGregorianCalendar fechaGestion;
	private String limitacionesObstaculos;
	private String observaciones;
	private String tramiteEfectuado;
	
	public TOConsulta (TipoOrden orden) {
		super();
		this.accionDerivOrden = orden.getAccionDerivOrden();
		this.aclaraciones = orden.getAclaraciones();
		this.diasTranscurridosPlazo = orden.getDiasTranscurridosPlazo();
		this.fechaGestion = orden.getFechaGestion();
		this.limitacionesObstaculos = orden.getLimitacionesObstaculos();
		this.observaciones = orden.getObservaciones();
		this.tramiteEfectuado = orden.getTramiteEfectuado();
	}
	
	public TOConsulta () {
		super();
	}

	public String getAccionDerivOrden() {
		return accionDerivOrden;
	}

	public void setAccionDerivOrden(String accionDerivOrden) {
		this.accionDerivOrden = accionDerivOrden;
	}

	public String getAclaraciones() {
		return aclaraciones;
	}

	public void setAclaraciones(String aclaraciones) {
		this.aclaraciones = aclaraciones;
	}

	public String getDiasTranscurridosPlazo() {
		return diasTranscurridosPlazo;
	}

	public void setDiasTranscurridosPlazo(String diasTranscurridosPlazo) {
		this.diasTranscurridosPlazo = diasTranscurridosPlazo;
	}

	public XMLGregorianCalendar getFechaGestion() {
		return fechaGestion;
	}

	public void setFechaGestion(XMLGregorianCalendar fechaGestion) {
		this.fechaGestion = fechaGestion;
	}

	public String getLimitacionesObstaculos() {
		return limitacionesObstaculos;
	}

	public void setLimitacionesObstaculos(String limitacionesObstaculos) {
		this.limitacionesObstaculos = limitacionesObstaculos;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getTramiteEfectuado() {
		return tramiteEfectuado;
	}

	public void setTramiteEfectuado(String tramiteEfectuado) {
		this.tramiteEfectuado = tramiteEfectuado;
	}

	@Override
	public String toString() {
		return "TOConsulta [accionDerivOrden=" + accionDerivOrden + ", aclaraciones=" + aclaraciones
				+ ", diasTranscurridosPlazo=" + diasTranscurridosPlazo + ", fechaGestion=" + fechaGestion
				+ ", limitacionesObstaculos=" + limitacionesObstaculos + ", observaciones=" + observaciones
				+ ", tramiteEfectuado=" + tramiteEfectuado + "]";
	}
	
}
