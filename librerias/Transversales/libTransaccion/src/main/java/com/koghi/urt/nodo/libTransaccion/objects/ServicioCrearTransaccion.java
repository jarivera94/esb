package com.koghi.urt.nodo.libTransaccion.objects;

public class ServicioCrearTransaccion {
	
	private String id;
	private String idServicio;
	private String idTxPrevia;
	private String numRadicado;
	private String idEntidadReceptora;
	private String idEntidadEmisora;
	private String valIpOrigen;
	private String idUsuario;
	private String idOperacion;
	
	public ServicioCrearTransaccion() {
		super();
	}
	
	public ServicioCrearTransaccion(String id, String id_servicio, String id_tx_previa, String num_radicado,
			String id_entidad_receptora, String id_entidad_emisora, String val_ip_origen, String id_usuario,
			String id_operacion) {
		super();
		this.id = id;
		this.idServicio = id_servicio;
		this.idTxPrevia = id_tx_previa;
		this.numRadicado = num_radicado;
		this.idEntidadReceptora = id_entidad_receptora;
		this.idEntidadEmisora = id_entidad_emisora;
		this.valIpOrigen = val_ip_origen;
		this.idUsuario = id_usuario;
		this.idOperacion = id_operacion;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId_servicio() {
		return idServicio;
	}
	public void setId_servicio(String id_servicio) {
		this.idServicio = id_servicio;
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
	public String getId_entidad_emisora() {
		return idEntidadEmisora;
	}
	public void setId_entidad_emisora(String id_entidad_emisora) {
		this.idEntidadEmisora = id_entidad_emisora;
	}
	public String getVal_ip_origen() {
		return valIpOrigen;
	}
	public void setVal_ip_origen(String val_ip_origen) {
		this.valIpOrigen = val_ip_origen;
	}
	public String getId_usuario() {
		return idUsuario;
	}
	public void setId_usuario(String id_usuario) {
		this.idUsuario = id_usuario;
	}
	
	public String getId_operacion() {
		return idOperacion;
	}
	public void setId_operacion(String id_operacion) {
		this.idOperacion = id_operacion;
	}

	@Override
	public String toString() {
		return "ServicioCrearTransaccion [id=" + id + ", id_servicio=" + idServicio + ", id_tx_previa=" + idTxPrevia
				+ ", num_radicado=" + numRadicado + ", id_entidad_receptora=" + idEntidadReceptora
				+ ", id_entidad_emisora=" + idEntidadEmisora + ", val_ip_origen=" + valIpOrigen + ", id_usuario="
				+ idUsuario + ", id_operacion=" + idOperacion + "]";
	}

}
