package com.koghi.nodo.igac.tos.srvIntConsultaRinex;

public class TOEntradaRinex {
	
	private String idEstacion = "";
	private String fechaCalendario = "";
	private String tipoArchivo = "";
	private String idEntidad = "";
	
	public String getIdEstacion() {
		return idEstacion;
	}
	public void setIdEstacion(String idEstacion) {
		this.idEstacion = idEstacion;
	}
	public String getFechaCalendario() {
		return fechaCalendario;
	}
	public void setFechaCalendario(String fechaCalendario) {
		this.fechaCalendario = fechaCalendario;
	}
	public String getTipoArchivo() {
		return tipoArchivo;
	}
	public void setTipoArchivo(String tipoArchivo) {
		this.tipoArchivo = tipoArchivo;
	}
	public String getIdEntidad() {
		return idEntidad;
	}
	public void setIdEntidad(String idEntidad) {
		this.idEntidad = idEntidad;
	}

	@Override
	public String toString() {
		return "{\"idEstacion\"=\"" + idEstacion + "\", \n\"fechaCalendario\"=\"" + fechaCalendario + "\", \n\"tipoArchivo\"=\""
				+ tipoArchivo + "\", \n\"idEntidad\"=\"" + idEntidad + "\"}";
	}
	
}
