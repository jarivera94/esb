package com.koghi.urt.nodo.srvIntWcfDAICMAEventos.objects;

public class EventosRequest {

    private int intCodDaneDepto;
    private int intCodDaneMunicipio;
    private int intAaaaFechaEvento;
    private int intMmFechaEvento;
	public EventosRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EventosRequest(int intCodDaneDepto, int intCodDaneMunicipio, int intAaaaFechaEvento, int intMmFechaEvento) {
		super();
		this.intCodDaneDepto = intCodDaneDepto;
		this.intCodDaneMunicipio = intCodDaneMunicipio;
		this.intAaaaFechaEvento = intAaaaFechaEvento;
		this.intMmFechaEvento = intMmFechaEvento;
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
	public int getIntAaaaFechaEvento() {
		return intAaaaFechaEvento;
	}
	public void setIntAaaaFechaEvento(int intAaaaFechaEvento) {
		this.intAaaaFechaEvento = intAaaaFechaEvento;
	}
	public int getIntMmFechaEvento() {
		return intMmFechaEvento;
	}
	public void setIntMmFechaEvento(int intMmFechaEvento) {
		this.intMmFechaEvento = intMmFechaEvento;
	}
	@Override
	public String toString() {
		return "EventosRequest [intCodDaneDepto=" + intCodDaneDepto + ", intCodDaneMunicipio=" + intCodDaneMunicipio
				+ ", intAaaaFechaEvento=" + intAaaaFechaEvento + ", intMmFechaEvento=" + intMmFechaEvento + "]";
	}
    
    
}
