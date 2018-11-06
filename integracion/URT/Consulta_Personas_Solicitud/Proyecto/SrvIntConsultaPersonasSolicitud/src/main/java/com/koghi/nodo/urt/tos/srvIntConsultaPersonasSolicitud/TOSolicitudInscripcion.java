package com.koghi.nodo.urt.tos.srvIntConsultaPersonasSolicitud;

import java.util.ArrayList;

public class TOSolicitudInscripcion {
	private int estadoSolicitudTramite;
	private int solicitudRestitucion;
	private String consecutivoSolicitud = " ";
	private String fechaDeclaracion = " ";
	private String narracionHechos = " ";
	private String fechaAbandono = " ";
	private String fechaAbandonoAno = " ";
	private String fechaAbandonoMes = " ";
	private String fechaAbandonoAnoInicio = " ";
	private String fechaAbandonoMesInicio = " ";
	private String fechaAbandonoAnoFin = " ";
	private String fechaAbandonoMesFin = " ";
	private String fechaDespojo = " ";
	private String fechaDespojoAno = " ";
	private String fechaDespojoMes = " ";
	private String fechaDespojoAnoInicio = " ";
	private String fechaDespojoMesInicio = " ";
	private String fechaDespojoAnoFin = " ";
	private String fechaDespojoMesFin = " ";
	private String numeroDocumento = " ";
	private String fechaDocumento;
	private TODepartamento departamento;
	private TOMunicipio municipio;
	private TOPredio predio;
	private ArrayList<TOPersona> persona;
	
	public int getEstadoSolicitudTramite() {
		return estadoSolicitudTramite;
	}
	public void setEstadoSolicitudTramite(int estadoSolicitudTramite) {
		this.estadoSolicitudTramite = estadoSolicitudTramite;
	}
	public int getSolicitudRestitucion() {
		return solicitudRestitucion;
	}
	public void setSolicitudRestitucion(int solicitudRestitucion) {
		this.solicitudRestitucion = solicitudRestitucion;
	}
	public String getConsecutivoSolicitud() {
		return consecutivoSolicitud;
	}
	public void setConsecutivoSolicitud(String consecutivoSolicitud) {
		this.consecutivoSolicitud = consecutivoSolicitud;
	}
	public String getFechaDeclaracion() {
		return fechaDeclaracion;
	}
	public void setFechaDeclaracion(String fechaDeclaracion) {
		this.fechaDeclaracion = fechaDeclaracion;
	}
	public String getNarracionHechos() {
		return narracionHechos;
	}
	public void setNarracionHechos(String narracionHechos) {
		this.narracionHechos = narracionHechos;
	}
	public String getFechaAbandono() {
		return fechaAbandono;
	}
	public void setFechaAbandono(String fechaAbandono) {
		this.fechaAbandono = fechaAbandono;
	}
	public String getFechaAbandonoAno() {
		return fechaAbandonoAno;
	}
	public void setFechaAbandonoAno(String fechaAbandonoAno) {
		this.fechaAbandonoAno = fechaAbandonoAno;
	}
	public String getFechaAbandonoMes() {
		return fechaAbandonoMes;
	}
	public void setFechaAbandonoMes(String fechaAbandonoMes) {
		this.fechaAbandonoMes = fechaAbandonoMes;
	}
	public String getFechaAbandonoAnoInicio() {
		return fechaAbandonoAnoInicio;
	}
	public void setFechaAbandonoAnoInicio(String fechaAbandonoAnoInicio) {
		this.fechaAbandonoAnoInicio = fechaAbandonoAnoInicio;
	}
	public String getFechaAbandonoMesInicio() {
		return fechaAbandonoMesInicio;
	}
	public void setFechaAbandonoMesInicio(String fechaAbandonoMesInicio) {
		this.fechaAbandonoMesInicio = fechaAbandonoMesInicio;
	}
	public String getFechaAbandonoAnoFin() {
		return fechaAbandonoAnoFin;
	}
	public void setFechaAbandonoAnoFin(String fechaAbandonoAnoFin) {
		this.fechaAbandonoAnoFin = fechaAbandonoAnoFin;
	}
	public String getFechaAbandonoMesFin() {
		return fechaAbandonoMesFin;
	}
	public void setFechaAbandonoMesFin(String fechaAbandonoMesFin) {
		this.fechaAbandonoMesFin = fechaAbandonoMesFin;
	}
	public String getFechaDespojo() {
		return fechaDespojo;
	}
	public void setFechaDespojo(String fechaDespojo) {
		this.fechaDespojo = fechaDespojo;
	}
	public String getFechaDespojoAno() {
		return fechaDespojoAno;
	}
	public void setFechaDespojoAno(String fechaDespojoAno) {
		this.fechaDespojoAno = fechaDespojoAno;
	}
	public String getFechaDespojoMes() {
		return fechaDespojoMes;
	}
	public void setFechaDespojoMes(String fechaDespojoMes) {
		this.fechaDespojoMes = fechaDespojoMes;
	}
	public String getFechaDespojoAnoInicio() {
		return fechaDespojoAnoInicio;
	}
	public void setFechaDespojoAnoInicio(String fechaDespojoAnoInicio) {
		this.fechaDespojoAnoInicio = fechaDespojoAnoInicio;
	}
	public String getFechaDespojoMesInicio() {
		return fechaDespojoMesInicio;
	}
	public void setFechaDespojoMesInicio(String fechaDespojoMesInicio) {
		this.fechaDespojoMesInicio = fechaDespojoMesInicio;
	}
	public String getFechaDespojoAnoFin() {
		return fechaDespojoAnoFin;
	}
	public void setFechaDespojoAnoFin(String fechaDespojoAnoFin) {
		this.fechaDespojoAnoFin = fechaDespojoAnoFin;
	}
	public String getFechaDespojoMesFin() {
		return fechaDespojoMesFin;
	}
	public void setFechaDespojoMesFin(String fechaDespojoMesFin) {
		this.fechaDespojoMesFin = fechaDespojoMesFin;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getFechaDocumento() {
		return fechaDocumento;
	}
	public void setFechaDocumento(String fechaDocumento) {
		this.fechaDocumento = fechaDocumento;
	}
	public TODepartamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(TODepartamento departamento) {
		this.departamento = departamento;
	}
	public TOMunicipio getMunicipio() {
		return municipio;
	}
	public void setMunicipio(TOMunicipio municipio) {
		this.municipio = municipio;
	}
	public TOPredio getPredio() {
		return predio;
	}
	public void setPredio(TOPredio predio) {
		this.predio = predio;
	}
	public ArrayList<TOPersona> getPersona() {
		return persona;
	}
	public void setPersona(ArrayList<TOPersona> persona) {
		this.persona = persona;
	}
}