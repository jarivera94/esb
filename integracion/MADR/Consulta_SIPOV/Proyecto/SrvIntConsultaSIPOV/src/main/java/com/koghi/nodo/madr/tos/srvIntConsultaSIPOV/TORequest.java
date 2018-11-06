package com.koghi.nodo.madr.tos.srvIntConsultaSIPOV;

public class TORequest {
	private String fechaInicio;
	private String fechaFin;
	private String user;
	private String pass;
	
	public TORequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TORequest(String fechaInicio, String fechaFin) {
		super();
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "TORequest [fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + "]";
	}
}
