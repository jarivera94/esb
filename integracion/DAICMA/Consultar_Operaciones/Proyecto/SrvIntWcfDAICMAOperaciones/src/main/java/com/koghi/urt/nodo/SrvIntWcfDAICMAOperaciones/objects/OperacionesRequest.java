package com.koghi.urt.nodo.SrvIntWcfDAICMAOperaciones.objects;

public class OperacionesRequest {
	
	private int intCodDaneDepto;
    private int intCodDaneMunicipio;
    private int intAaaaFechaOperacion;
    private int intMmFechaOperacion;
    
	public OperacionesRequest(int intCodDaneDepto, int intCodDaneMunicipio, int intAaaaFechaOperacion,
			int intMmFechaOperacion) {
		super();
		this.intCodDaneDepto = intCodDaneDepto;
		this.intCodDaneMunicipio = intCodDaneMunicipio;
		this.intAaaaFechaOperacion = intAaaaFechaOperacion;
		this.intMmFechaOperacion = intMmFechaOperacion;
	}
	public OperacionesRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIntCodDaneDepto() {
		return intCodDaneDepto;
	}
	public void setIntCodDaneDepto(int intCodDaneDepto) {
		this.intCodDaneDepto = intCodDaneDepto;
	}
	public int getIntCodDaneMunicipio() {
		return intCodDaneMunicipio;
	}
	public void setIntCodDaneMunicipio(int intCodDaneMunicipio) {
		this.intCodDaneMunicipio = intCodDaneMunicipio;
	}
	public int getIntAaaaFechaOperacion() {
		return intAaaaFechaOperacion;
	}
	public void setIntAaaaFechaOperacion(int intAaaaFechaOperacion) {
		this.intAaaaFechaOperacion = intAaaaFechaOperacion;
	}
	public int getIntMmFechaOperacion() {
		return intMmFechaOperacion;
	}
	public void setIntMmFechaOperacion(int intMmFechaOperacion) {
		this.intMmFechaOperacion = intMmFechaOperacion;
	}
	@Override
	public String toString() {
		return "OperacionesRequest [intCodDaneDepto=" + intCodDaneDepto + ", intCodDaneMunicipio=" + intCodDaneMunicipio
				+ ", intAaaaFechaOperacion=" + intAaaaFechaOperacion + ", intMmFechaOperacion=" + intMmFechaOperacion
				+ "]";
	}
    
    

}
