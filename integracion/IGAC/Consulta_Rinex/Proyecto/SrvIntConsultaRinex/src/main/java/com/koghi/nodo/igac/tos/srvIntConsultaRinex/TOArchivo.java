package com.koghi.nodo.igac.tos.srvIntConsultaRinex;

public class TOArchivo {
	
	private String nombreArchivoRinex;
	private String extensionArchivoRinex;
	private String nombreTipoArchivo;
    private String tamano;
    private String archivo;
    
	public String getNombreArchivoRinex() {
		return nombreArchivoRinex;
	}
	public void setNombreArchivoRinex(String nombreArchivoRinex) {
		this.nombreArchivoRinex = nombreArchivoRinex;
	}
	public String getExtensionArchivoRinex() {
		return extensionArchivoRinex;
	}
	public void setExtensionArchivoRinex(String extensionArchivoRinex) {
		this.extensionArchivoRinex = extensionArchivoRinex;
	}
	public String getNombreTipoArchivo() {
		return nombreTipoArchivo;
	}
	public void setNombreTipoArchivo(String nombreTipoArchivo) {
		this.nombreTipoArchivo = nombreTipoArchivo;
	}
	public String getTamano() {
		return tamano;
	}
	public void setTamano(String tamano) {
		this.tamano = tamano;
	}
	public String getArchivo() {
		return archivo;
	}
	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}
	
	@Override
	public String toString() {
		return "{\"nombreArchivoRinex\":\"" + nombreArchivoRinex + "\", \"extensionArchivoRinex\":\""
				+ extensionArchivoRinex + "\", \"nombreTipoArchivo\":\"" + nombreTipoArchivo + "\", \"tamano\":\"" + tamano
				+ "\", \"archivo\":\"" + archivo + "\"}";
	}
    
}
