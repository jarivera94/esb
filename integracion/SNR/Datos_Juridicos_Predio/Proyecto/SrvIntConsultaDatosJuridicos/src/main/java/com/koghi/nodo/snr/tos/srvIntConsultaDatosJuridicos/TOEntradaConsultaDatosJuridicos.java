package com.koghi.nodo.snr.tos.srvIntConsultaDatosJuridicos;

import org.step.aac.glass.TipoLstEstadoJuridicoInmuebleEnt;

public class TOEntradaConsultaDatosJuridicos {
	
	private TipoLstEstadoJuridicoInmuebleEnt objEntrada;
	private String sistemaUsuario;
	private String clave;
	
	public TipoLstEstadoJuridicoInmuebleEnt getObjEntrada() {
		return objEntrada;
	}
	public void setObjEntrada(TipoLstEstadoJuridicoInmuebleEnt objEntrada) {
		this.objEntrada = objEntrada;
	}
	public String getSistemaUsuario() {
		return sistemaUsuario;
	}
	public void setSistemaUsuario(String sistemaUsuario) {
		this.sistemaUsuario = sistemaUsuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	
}
