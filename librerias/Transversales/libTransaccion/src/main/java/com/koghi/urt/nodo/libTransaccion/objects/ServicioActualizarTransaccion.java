package com.koghi.urt.nodo.libTransaccion.objects;

public class ServicioActualizarTransaccion {
	
	private String id; 
	private int codEstado;
	private int valReintentos;
	private String idTxPrevia;
	private String numRadicado;
	private String idEntidadReceptora;
	private String fecTerminacion;
	private String idUsuario;
	public ServicioActualizarTransaccion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServicioActualizarTransaccion(String id, int cod_estado, int val_reintentos, String id_tx_previa,
			String num_radicado, String id_entidad_receptora, String fec_terminacion, String id_usuario) {
		super();
		this.id = id;
		this.codEstado = cod_estado;
		this.valReintentos = val_reintentos;
		this.idTxPrevia = id_tx_previa;
		this.numRadicado = num_radicado;
		this.idEntidadReceptora = id_entidad_receptora;
		this.fecTerminacion = fec_terminacion;
		this.idUsuario = id_usuario;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCod_estado() {
		return codEstado;
	}
	public void setCod_estado(int cod_estado) {
		this.codEstado = cod_estado;
	}
	public int getVal_reintentos() {
		return valReintentos;
	}
	public void setVal_reintentos(int val_reintentos) {
		this.valReintentos = val_reintentos;
	}
	public String getId_tx_previa() {
		return idTxPrevia;
	}
	public void setId_tx_previa(String id_tx_previa) {
		this.idTxPrevia = id_tx_previa;
	}
	public String getNum_radicado() {
		return numRadicado;
	}
	public void setNum_radicado(String num_radicado) {
		this.numRadicado = num_radicado;
	}
	public String getId_entidad_receptora() {
		return idEntidadReceptora;
	}
	public void setId_entidad_receptora(String id_entidad_receptora) {
		this.idEntidadReceptora = id_entidad_receptora;
	}
	public String getFec_terminacion() {
		return fecTerminacion;
	}
	public void setFec_terminacion(String fec_terminacion) {
		this.fecTerminacion = fec_terminacion;
	}
	public String getId_usuario() {
		return idUsuario;
	}
	public void setId_usuario(String id_usuario) {
		this.idUsuario = id_usuario;
	}
	@Override
	public String toString() {
		return "ServicioActualizarTransaccion [id=" + id + ", cod_estado=" + codEstado + ", val_reintentos="
				+ valReintentos + ", id_tx_previa=" + idTxPrevia + ", num_radicado=" + numRadicado
				+ ", id_entidad_receptora=" + idEntidadReceptora + ", fec_terminacion=" + fecTerminacion
				+ ", id_usuario=" + idUsuario + "]";
	} 
	
	

}
