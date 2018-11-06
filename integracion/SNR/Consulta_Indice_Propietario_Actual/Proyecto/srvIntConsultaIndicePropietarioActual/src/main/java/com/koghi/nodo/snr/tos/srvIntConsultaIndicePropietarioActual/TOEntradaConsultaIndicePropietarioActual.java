package com.koghi.nodo.snr.tos.srvIntConsultaIndicePropietarioActual;

import com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.TipoParametrosBusqueda;

public class TOEntradaConsultaIndicePropietarioActual {
	
	private TipoParametrosBusqueda entrada;
	private String sistemaUsuario;
	private String clave;
	
	public TipoParametrosBusqueda getEntrada() {
		return entrada;
	}
	public void setEntrada(TipoParametrosBusqueda entrada) {
		this.entrada = entrada;
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
