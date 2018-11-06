package com.koghi.nodo.urt.tos.srvIntConsultaPersonasSolicitud;

public class TOConsulta {
	private String numeroDocumento;
	private String tipoDocumento;
	private int identificadorEntidad;
	private String departamentoPredio;
	private String municipioPredio;
	
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public int getIdentificadorEntidad() {
		return identificadorEntidad;
	}
	public void setIdentificadorEntidad(int identificadorEntidad) {
		this.identificadorEntidad = identificadorEntidad;
	}
	public String getDepartamentoPredio() {
		return departamentoPredio;
	}
	public void setDepartamentoPredio(String departamentoPredio) {
		this.departamentoPredio = departamentoPredio;
	}
	public String getMunicipioPredio() {
		return municipioPredio;
	}
	public void setMunicipioPredio(String municipioPredio) {
		this.municipioPredio = municipioPredio;
	}
}
