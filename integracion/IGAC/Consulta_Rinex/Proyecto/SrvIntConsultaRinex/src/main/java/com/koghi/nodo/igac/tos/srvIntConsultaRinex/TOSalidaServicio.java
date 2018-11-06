package com.koghi.nodo.igac.tos.srvIntConsultaRinex;

public class TOSalidaServicio {
	
	private String idEstacion;
	private String nombreEstacion;
	private String estadoEstacion;
	private String ciudadEstacion;
	private double longitudUbicacionEstacion;
	private double latitudUbicacionEstacion;
	private String accionEstadoEstacion;
	private String error;
	private String codigo;
	private String mensaje;
	private TOArchivo archivo;
	
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
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public TOArchivo getArchivo() {
		return archivo;
	}
	public void setArchivo(TOArchivo archivo) {
		this.archivo = archivo;
	}
	@Override
	public String toString() {
		return "{\"idEstacion\":\"" + idEstacion + "\", \"nombreEstacion\":\"" + nombreEstacion + "\", \"estadoEstacion\":\""
				+ estadoEstacion + "\", \"ciudadEstacion\":\"" + ciudadEstacion + "\", \"longitudUbicacionEstacion\":\""
				+ longitudUbicacionEstacion + "\", \"latitudUbicacionEstacion\":\"" + latitudUbicacionEstacion
				+ "\", \"accionEstadoEstacion\":\"" + accionEstadoEstacion + "\", \"error\":\"" + error + "\", \"codigo\":\"" + codigo
				+ "\", \"mensaje\":\"" + mensaje + "\", \"archivo\":" + archivo.toString() + "}";
	}
	
}
