package com.koghi.urt.servicios.igac.informacionCatastral.objects;

public class ServicioCrearTransaccion {
	
	private String id;
	private String id_servicio;
	private String id_tx_previa;
	private String num_radicado;
	private String id_entidad_receptora;
	private String id_entidad_emisora;
	private String val_ip_origen;
	private String id_usuario;
	private String id_operacion;
	
	public ServicioCrearTransaccion() {
		super();
	}
	
	public ServicioCrearTransaccion(String id, String id_servicio, String id_tx_previa, String num_radicado,
			String id_entidad_receptora, String id_entidad_emisora, String val_ip_origen, String id_usuario,
			String id_operacion) {
		super();
		this.id = id;
		this.id_servicio = id_servicio;
		this.id_tx_previa = id_tx_previa;
		this.num_radicado = num_radicado;
		this.id_entidad_receptora = id_entidad_receptora;
		this.id_entidad_emisora = id_entidad_emisora;
		this.val_ip_origen = val_ip_origen;
		this.id_usuario = id_usuario;
		this.id_operacion = id_operacion;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId_servicio() {
		return id_servicio;
	}
	public void setId_servicio(String id_servicio) {
		this.id_servicio = id_servicio;
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
	public String getId_entidad_emisora() {
		return id_entidad_emisora;
	}
	public void setId_entidad_emisora(String id_entidad_emisora) {
		this.id_entidad_emisora = id_entidad_emisora;
	}
	public String getVal_ip_origen() {
		return val_ip_origen;
	}
	public void setVal_ip_origen(String val_ip_origen) {
		this.val_ip_origen = val_ip_origen;
	}
	public String getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}
	
	public String getId_operacion() {
		return id_operacion;
	}
	public void setId_operacion(String id_operacion) {
		this.id_operacion = id_operacion;
	}

	@Override
	public String toString() {
		return "ServicioCrearTransaccion [id=" + id + ", id_servicio=" + id_servicio + ", id_tx_previa=" + id_tx_previa
				+ ", num_radicado=" + num_radicado + ", id_entidad_receptora=" + id_entidad_receptora
				+ ", id_entidad_emisora=" + id_entidad_emisora + ", val_ip_origen=" + val_ip_origen + ", id_usuario="
				+ id_usuario + ", id_operacion=" + id_operacion + "]";
	}

}
