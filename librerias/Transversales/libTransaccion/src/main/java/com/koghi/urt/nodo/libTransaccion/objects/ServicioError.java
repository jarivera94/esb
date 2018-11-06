package com.koghi.urt.nodo.libTransaccion.objects;

public class ServicioError {
	
	private String idError;
	private String valCodigo;
	private String valDescripcion;
	private String valExcepcion;
	
	public ServicioError(String id_errores, String val_codigo, String val_descripcion, String val_excepcion) {
		super();
		this.idError = id_errores;
		this.valCodigo = val_codigo;
		this.valDescripcion = val_descripcion;
		this.valExcepcion = val_excepcion;
	}
	
	public ServicioError() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId_errores() {
		return idError;
	}

	public void setId_errores(String id_errores) {
		this.idError = id_errores;
	}

	public String getVal_codigo() {
		return valCodigo;
	}

	public void setVal_codigo(String val_codigo) {
		this.valCodigo = val_codigo;
	}

	public String getVal_descripcion() {
		return valDescripcion;
	}

	public void setVal_descripcion(String val_descripcion) {
		this.valDescripcion = val_descripcion;
	}

	public String getVal_excepcion() {
		return valExcepcion;
	}

	public void setVal_excepcion(String val_excepcion) {
		this.valExcepcion = val_excepcion;
	}

	@Override
	public String toString() {
		return "ServicioError [id_errores=" + idError + ", val_codigo=" + valCodigo + ", val_descripcion="
				+ valDescripcion + ", val_excepcion=" + valExcepcion + "]";
	}
	
	
	

}
