package com.koghi.urt.servicios.igac.informacionCatastral.objects;

public class ServicioError {
	
	private String id_error;
	private String val_codigo;
	private String val_descripcion;
	private String val_excepcion;
	
	public ServicioError(String id_errores, String val_codigo, String val_descripcion, String val_excepcion) {
		super();
		this.id_error = id_errores;
		this.val_codigo = val_codigo;
		this.val_descripcion = val_descripcion;
		this.val_excepcion = val_excepcion;
	}
	
	public ServicioError() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId_errores() {
		return id_error;
	}

	public void setId_errores(String id_errores) {
		this.id_error = id_errores;
	}

	public String getVal_codigo() {
		return val_codigo;
	}

	public void setVal_codigo(String val_codigo) {
		this.val_codigo = val_codigo;
	}

	public String getVal_descripcion() {
		return val_descripcion;
	}

	public void setVal_descripcion(String val_descripcion) {
		this.val_descripcion = val_descripcion;
	}

	public String getVal_excepcion() {
		return val_excepcion;
	}

	public void setVal_excepcion(String val_excepcion) {
		this.val_excepcion = val_excepcion;
	}

	@Override
	public String toString() {
		return "ServicioError [id_errores=" + id_error + ", val_codigo=" + val_codigo + ", val_descripcion="
				+ val_descripcion + ", val_excepcion=" + val_excepcion + "]";
	}
	
	
	

}
