package com.koghi.nodo.igac.tos.srvIntConsultaRinex;

public class TOEstaciones {

	private String idEstacion;
	private String nombreEstacion;
	private String estadoEstacion;
	private String ciudadEstacion;
	private double longitudUbicacionEstacion;
	private double latitudUbicacionEstacion;
	private String accionEstadoEstacion;
	
	public String getIdEstacion() {
		return idEstacion;
	}
	public void setIdEstacion(String idEstacion) {
		this.idEstacion = idEstacion;
	}
	public String getNombreEstacion() {
		return nombreEstacion;
	}
	public void setNombreEstacion(String nombreEstacion) {
		this.nombreEstacion = nombreEstacion;
	}
	public String getEstadoEstacion() {
		return estadoEstacion;
	}
	public void setEstadoEstacion(String estadoEstacion) {
		this.estadoEstacion = estadoEstacion;
	}
	public String getCiudadEstacion() {
		return ciudadEstacion;
	}
	public void setCiudadEstacion(String ciudadEstacion) {
		this.ciudadEstacion = ciudadEstacion;
	}
	public double getLongitudUbicacionEstacion() {
		return longitudUbicacionEstacion;
	}
	public void setLongitudUbicacionEstacion(double longitudUbicacionEstacion) {
		this.longitudUbicacionEstacion = longitudUbicacionEstacion;
	}
	public double getLatitudUbicacionEstacion() {
		return latitudUbicacionEstacion;
	}
	public void setLatitudUbicacionEstacion(double latitudUbicacionEstacion) {
		this.latitudUbicacionEstacion = latitudUbicacionEstacion;
	}
	public String getAccionEstadoEstacion() {
		return accionEstadoEstacion;
	}
	public void setAccionEstadoEstacion(String accionEstadoEstacion) {
		this.accionEstadoEstacion = accionEstadoEstacion;
	}

	@Override
	public String toString() {
		return "{\n\"idEstacion\"=\"" + idEstacion + "\",\n\"nombreEstacion\"=\"" + nombreEstacion + "\",\n\"estadoEstacion\"=\""
				+ estadoEstacion + "\",\n\"ciudadEstacion\"=\"" + ciudadEstacion + "\",\n\"longitudUbicacionEstacion\"=\""
				+ longitudUbicacionEstacion + "\",\n\"latitudUbicacionEstacion\"=\"" + latitudUbicacionEstacion
				+ "\",\n\"accionEstadoEstacion\"=\"" + accionEstadoEstacion + "\"\n}";
	}

}
