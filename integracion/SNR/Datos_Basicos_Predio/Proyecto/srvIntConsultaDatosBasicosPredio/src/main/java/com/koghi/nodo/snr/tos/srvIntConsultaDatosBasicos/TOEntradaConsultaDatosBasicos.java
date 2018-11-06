package com.koghi.nodo.snr.tos.srvIntConsultaDatosBasicos;

import com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos.TipoLstCertificadoTradiciLibertEnt;

public class TOEntradaConsultaDatosBasicos {
	
	private TipoLstCertificadoTradiciLibertEnt entrada;
	private String sistemaUsuario;
	private String clave;
	
	public TipoLstCertificadoTradiciLibertEnt getEntrada() {
		return entrada;
	}
	public void setEntrada(TipoLstCertificadoTradiciLibertEnt entrada) {
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
