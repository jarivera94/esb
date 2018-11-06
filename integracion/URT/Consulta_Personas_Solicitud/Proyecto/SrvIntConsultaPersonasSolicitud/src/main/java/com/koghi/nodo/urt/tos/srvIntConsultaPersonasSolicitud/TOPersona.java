package com.koghi.nodo.urt.tos.srvIntConsultaPersonasSolicitud;

public class TOPersona {
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido = " ";
	private String segundoApellido = " ";
	private String genero = " ";
	private String tipoDocumento;
	private String numeroDocumento;
	private String fechaNacimiento = " ";
	private int idGrupoEtnico;
	private boolean orfandadDoble;
	private String estadoCivil = " ";
	private int tipoDiscapacidad;
	private boolean personaCabezaFamilia;
	private int edadPersona;
	private int rolPersona;
	private String corregimientoPer = " ";
	private String vereda = " ";
	private String inspeccion = " ";
	private String barrio = " ";
	private String direccionPersona = " ";
	private String telefonoPersona = " ";
	private String celularPersona = " ";
	private String correoElectronico = " ";
	private TODepartamento departamento;
	private TOMunicipio municipio;
	
	public TOPersona(){
		setPrimerNombre(" ");
		setSegundoNombre(" ");
		//.
		//.
		//.
	}
	
	public TOPersona(String primerNombre, String segundoNombre){
		setPrimerNombre(primerNombre);
		setSegundoNombre(segundoNombre);
		//.
		//.
		//.
	}
	
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getIdGrupoEtnico() {
		return idGrupoEtnico;
	}
	public void setIdGrupoEtnico(int idGrupoEtnico) {
		this.idGrupoEtnico = idGrupoEtnico;
	}
	public boolean isOrfandadDoble() {
		return orfandadDoble;
	}
	public void setOrfandadDoble(boolean orfandadDoble) {
		this.orfandadDoble = orfandadDoble;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public int getTipoDiscapacidad() {
		return tipoDiscapacidad;
	}
	public void setTipoDiscapacidad(int tipoDiscapacidad) {
		this.tipoDiscapacidad = tipoDiscapacidad;
	}
	public boolean isPersonaCabezaFamilia() {
		return personaCabezaFamilia;
	}
	public void setPersonaCabezaFamilia(boolean personaCabezaFamilia) {
		this.personaCabezaFamilia = personaCabezaFamilia;
	}
	public int getEdadPersona() {
		return edadPersona;
	}
	public void setEdadPersona(int edadPersona) {
		this.edadPersona = edadPersona;
	}
	public int getRolPersona() {
		return rolPersona;
	}
	public void setRolPersona(int rolPersona) {
		this.rolPersona = rolPersona;
	}
	public String getCorregimientoPer() {
		return corregimientoPer;
	}
	public void setCorregimientoPer(String corregimientoPer) {
		this.corregimientoPer = corregimientoPer;
	}
	public String getVereda() {
		return vereda;
	}
	public void setVereda(String vereda) {
		this.vereda = vereda;
	}
	public String getInspeccion() {
		return inspeccion;
	}
	public void setInspeccion(String inspeccion) {
		this.inspeccion = inspeccion;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	public String getDireccionPersona() {
		return direccionPersona;
	}
	public void setDireccionPersona(String direccionPersona) {
		this.direccionPersona = direccionPersona;
	}
	public String getTelefonoPersona() {
		return telefonoPersona;
	}
	public void setTelefonoPersona(String telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}
	public String getCelularPersona() {
		return celularPersona;
	}
	public void setCelularPersona(String celularPersona) {
		this.celularPersona = celularPersona;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public TODepartamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(TODepartamento departamento) {
		this.departamento = departamento;
	}
	public TOMunicipio getMunicipio() {
		return municipio;
	}
	public void setMunicipio(TOMunicipio municipio) {
		this.municipio = municipio;
	}
}
