package com.koghi.urt.servicios.igac.informacionCatastral.objects;

public class ServicioActualizarTransaccion {
	
	private String id; 
	private int cod_estado;
	private int val_reintentos;
	private String id_tx_previa;
	private String num_radicado;
	private String id_entidad_receptora;
	private String fec_terminacion;
	private String id_usuario;
	public ServicioActualizarTransaccion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServicioActualizarTransaccion(String id, int cod_estado, int val_reintentos, String id_tx_previa,
			String num_radicado, String id_entidad_receptora, String fec_terminacion, String id_usuario) {
		super();
		this.id = id;
		this.cod_estado = cod_estado;
		this.val_reintentos = val_reintentos;
		this.id_tx_previa = id_tx_previa;
		this.num_radicado = num_radicado;
		this.id_entidad_receptora = id_entidad_receptora;
		this.fec_terminacion = fec_terminacion;
		this.id_usuario = id_usuario;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCod_estado() {
		return cod_estado;
	}
	public void setCod_estado(int cod_estado) {
		this.cod_estado = cod_estado;
	}
	public int getVal_reintentos() {
		return val_reintentos;
	}
	public void setVal_reintentos(int val_reintentos) {
		this.val_reintentos = val_reintentos;
	}
	public String getId_tx_previa() {
		return id_tx_previa;
	}
	public void setId_tx_previa(String id_tx_previa) {
		this.id_tx_previa = id_tx_previa;
	}
	public String getNum_radicado() {
		return num_radicado;
	}
	public void setNum_radicado(String num_radicado) {
		this.num_radicado = num_radicado;
	}
	public String getId_entidad_receptora() {
		return id_entidad_receptora;
	}
	public void setId_entidad_receptora(String id_entidad_receptora) {
		this.id_entidad_receptora = id_entidad_receptora;
	}
	public String getFec_terminacion() {
		return fec_terminacion;
	}
	public void setFec_terminacion(String fec_terminacion) {
		this.fec_terminacion = fec_terminacion;
	}
	public String getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}
	@Override
	public String toString() {
		return "ServicioActualizarTransaccion [id=" + id + ", cod_estado=" + cod_estado + ", val_reintentos="
				+ val_reintentos + ", id_tx_previa=" + id_tx_previa + ", num_radicado=" + num_radicado
				+ ", id_entidad_receptora=" + id_entidad_receptora + ", fec_terminacion=" + fec_terminacion
				+ ", id_usuario=" + id_usuario + "]";
	} 
	
	

}
