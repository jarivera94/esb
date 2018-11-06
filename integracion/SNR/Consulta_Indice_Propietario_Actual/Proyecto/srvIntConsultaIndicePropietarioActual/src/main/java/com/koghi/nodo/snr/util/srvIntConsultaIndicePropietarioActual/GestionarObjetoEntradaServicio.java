package com.koghi.nodo.snr.util.srvIntConsultaIndicePropietarioActual;

import org.json.JSONObject;

import com.google.gson.Gson;
import com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.GrupoNumeroIdentificacion;
import com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.TipoCirculoRegistral;
import com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.TipoDireccionNacionalRural;
import com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.TipoDireccionNacionalUrbana;
import com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.TipoIdentificacionNacionalPersona;
import com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.TipoLstCertificadoTradiciLibertEnt;
import com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.TipoMunicipio;
import com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.TipoNIT;
import com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.TipoNomPersona;
import com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.TipoParametrosBusqueda;
import com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.TipoTipoIdNacionalPersona;
import com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.TipoUbicacionMatriculaSNR;

public class GestionarObjetoEntradaServicio {
	
	private String body;
	private TipoParametrosBusqueda entrada_WSDL = new TipoParametrosBusqueda();
	private TipoLstCertificadoTradiciLibertEnt tipoLstCertificadoTradiciLibertEnt2_WSDL = new TipoLstCertificadoTradiciLibertEnt();
	private TipoCirculoRegistral tipoCirculoRegistral_WSDL = new TipoCirculoRegistral();
    private TipoUbicacionMatriculaSNR ubicacionMatriculaSistemaSNR_WSDL = new TipoUbicacionMatriculaSNR();
    private TipoMunicipio municipioCirculoRegistral_WSDL = new TipoMunicipio();
    private TipoNIT nitEntidad_WSDL = new TipoNIT();
    private TipoDireccionNacionalRural direccionNacionalRuralUbicacionPredio_WSDL = new TipoDireccionNacionalRural();
    private TipoDireccionNacionalUrbana direccionNacionalUrbanaUbicacionPredio_WSDL = new TipoDireccionNacionalUrbana();
    private TipoIdentificacionNacionalPersona identificacionPersona_WSDL = new TipoIdentificacionNacionalPersona();
    private TipoNomPersona nomPersonaRelacionadoMatriculaInmobiliaria_WSDL = new TipoNomPersona();
    private GrupoNumeroIdentificacion grupoNumeroIdentificacion_WSDL = new GrupoNumeroIdentificacion();
    private TipoTipoIdNacionalPersona tipoIdNacionalPersona_WSDL = new TipoTipoIdNacionalPersona();
    private String tipoConsulta;
    private int numeroDirecciones;
    private int numeroPropietarios;
    private String chipPredio;
    private String cedulaCatastralPredio;
    private Long estadoMatricula;
    private Long numCedulaExtranjeria;
    private String numIdAdultoSinIdentificar;
    private String numIdMenorSinIdentificar;
    private String numIdentificacionRecienNacido;
    private String numRegistroCivil;
    private String numTarjetaIdentidad;
    private String numeroCedulaCiudadania;
    private String numeroCedulaExtranjero;
    private String numeroPasaporte;
    private String codTipoIdentificacion;
    private String nomTipoIdentificacion;
    private String nombreEntidad;
    private String numeroMatriculaInmobiliariaPredio;
    private String primerApellido;
    private String primerNombre;
    private String segundoApellido;
    private String segundoNombre;
    private String sistemaUsuario;
    private String clave;
    
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getPrimerNombre() {
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getSegundoNombre() {
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getTipoConsulta() {
		return tipoConsulta;
	}
	public void setTipoConsulta(String tipoConsulta) {
		this.tipoConsulta = tipoConsulta;
	}
	public int getNumeroDirecciones() {
		return numeroDirecciones;
	}
	public void setNumeroDirecciones(int numeroDirecciones) {
		this.numeroDirecciones = numeroDirecciones;
	}
	public int getNumeroPropietarios() {
		return numeroPropietarios;
	}
	public void setNumeroPropietarios(int numeroPropietarios) {
		this.numeroPropietarios = numeroPropietarios;
	}
	public String getChipPredio() {
		return chipPredio;
	}
	public void setChipPredio(String chipPredio) {
		this.chipPredio = chipPredio;
	}
	public String getCedulaCatastralPredio() {
		return cedulaCatastralPredio;
	}
	public void setCedulaCatastralPredio(String cedulaCatastralPredio) {
		this.cedulaCatastralPredio = cedulaCatastralPredio;
	}
	public Long getEstadoMatricula() {
		return estadoMatricula;
	}
	public void setEstadoMatricula(Long estadoMatricula) {
		this.estadoMatricula = estadoMatricula;
	}
	public Long getNumCedulaExtranjeria() {
		return numCedulaExtranjeria;
	}
	public void setNumCedulaExtranjeria(Long numCedulaExtranjeria) {
		this.numCedulaExtranjeria = numCedulaExtranjeria;
	}
	public String getNumIdAdultoSinIdentificar() {
		return numIdAdultoSinIdentificar;
	}
	public void setNumIdAdultoSinIdentificar(String numIdAdultoSinIdentificar) {
		this.numIdAdultoSinIdentificar = numIdAdultoSinIdentificar;
	}
	public String getNumIdMenorSinIdentificar() {
		return numIdMenorSinIdentificar;
	}
	public void setNumIdMenorSinIdentificar(String numIdMenorSinIdentificar) {
		this.numIdMenorSinIdentificar = numIdMenorSinIdentificar;
	}
	public String getNumIdentificacionRecienNacido() {
		return numIdentificacionRecienNacido;
	}
	public void setNumIdentificacionRecienNacido(String numIdentificacionRecienNacido) {
		this.numIdentificacionRecienNacido = numIdentificacionRecienNacido;
	}
	public String getNumRegistroCivil() {
		return numRegistroCivil;
	}
	public void setNumRegistroCivil(String numRegistroCivil) {
		this.numRegistroCivil = numRegistroCivil;
	}
	public String getNumTarjetaIdentidad() {
		return numTarjetaIdentidad;
	}
	public void setNumTarjetaIdentidad(String numTarjetaIdentidad) {
		this.numTarjetaIdentidad = numTarjetaIdentidad;
	}
	public String getNumeroCedulaCiudadania() {
		return numeroCedulaCiudadania;
	}
	public void setNumeroCedulaCiudadania(String numeroCedulaCiudadania) {
		this.numeroCedulaCiudadania = numeroCedulaCiudadania;
	}
	public String getNumeroCedulaExtranjero() {
		return numeroCedulaExtranjero;
	}
	public void setNumeroCedulaExtranjero(String numeroCedulaExtranjero) {
		this.numeroCedulaExtranjero = numeroCedulaExtranjero;
	}
	public String getNumeroPasaporte() {
		return numeroPasaporte;
	}
	public void setNumeroPasaporte(String numeroPasaporte) {
		this.numeroPasaporte = numeroPasaporte;
	}
	public String getCodTipoIdentificacion() {
		return codTipoIdentificacion;
	}
	public void setCodTipoIdentificacion(String codTipoIdentificacion) {
		this.codTipoIdentificacion = codTipoIdentificacion;
	}
	public String getNomTipoIdentificacion() {
		return nomTipoIdentificacion;
	}
	public void setNomTipoIdentificacion(String nomTipoIdentificacion) {
		this.nomTipoIdentificacion = nomTipoIdentificacion;
	}
	public String getNombreEntidad() {
		return nombreEntidad;
	}
	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}
	public String getNumeroMatriculaInmobiliariaPredio() {
		return numeroMatriculaInmobiliariaPredio;
	}
	public void setNumeroMatriculaInmobiliariaPredio(String numeroMatriculaInmobiliariaPredio) {
		this.numeroMatriculaInmobiliariaPredio = numeroMatriculaInmobiliariaPredio;
	}
	public String getSistemaUsuario() {
		return sistemaUsuario;
	}
	public void setSistemaUsuario(String sistemaUsuario) {
		this.sistemaUsuario = sistemaUsuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public TipoParametrosBusqueda getEntrada_WSDL() {
		return entrada_WSDL;
	}
	public void setEntrada_WSDL(JSONObject entrada) {
		this.entrada_WSDL = new Gson().fromJson(entrada.toString(), TipoParametrosBusqueda.class);
	}
	public TipoLstCertificadoTradiciLibertEnt getTipoLstCertificadoTradiciLibertEnt2_WSDL() {
		return tipoLstCertificadoTradiciLibertEnt2_WSDL;
	}
	public void setTipoLstCertificadoTradiciLibertEnt2_WSDL(JSONObject tipoLstCertificadoTradiciLibertEnt2) {
		this.tipoLstCertificadoTradiciLibertEnt2_WSDL = new Gson().fromJson(tipoLstCertificadoTradiciLibertEnt2.toString(), TipoLstCertificadoTradiciLibertEnt.class);
	}
	public TipoCirculoRegistral getTipoCirculoRegistral_WSDL() {
		return tipoCirculoRegistral_WSDL;
	}
	public void setTipoCirculoRegistral_WSDL(JSONObject tipoCirculoRegistral) {
		this.tipoCirculoRegistral_WSDL = new Gson().fromJson(tipoCirculoRegistral.toString(), TipoCirculoRegistral.class);
	}
	public TipoUbicacionMatriculaSNR getUbicacionMatriculaSistemaSNR_WSDL() {
		return ubicacionMatriculaSistemaSNR_WSDL;
	}
	public void setUbicacionMatriculaSistemaSNR_WSDL(JSONObject ubicacionMatriculaSistemaSNR) {
		this.ubicacionMatriculaSistemaSNR_WSDL = new Gson().fromJson(ubicacionMatriculaSistemaSNR.toString(), TipoUbicacionMatriculaSNR.class);
	}
	public TipoMunicipio getMunicipioCirculoRegistral_WSDL() {
		return municipioCirculoRegistral_WSDL;
	}
	public void setMunicipioCirculoRegistral_WSDL(JSONObject municipioCirculoRegistral) {
		this.municipioCirculoRegistral_WSDL = new Gson().fromJson(municipioCirculoRegistral.toString(), TipoMunicipio.class);
	}
	public TipoNIT getNitEntidad_WSDL() {
		return nitEntidad_WSDL;
	}
	public void setNitEntidad_WSDL(JSONObject nitEntidad) {
		this.nitEntidad_WSDL = new Gson().fromJson(nitEntidad.toString(), TipoNIT.class);
	}
	public TipoDireccionNacionalRural getDireccionNacionalRuralUbicacionPredio_WSDL() {
		return direccionNacionalRuralUbicacionPredio_WSDL;
	}
	public void setDireccionNacionalRuralUbicacionPredio_WSDL(JSONObject direccionNacionalRuralUbicacionPredio) {
		this.direccionNacionalRuralUbicacionPredio_WSDL = new Gson().fromJson(direccionNacionalRuralUbicacionPredio.toString(), TipoDireccionNacionalRural.class);
	}
	public TipoDireccionNacionalUrbana getDireccionNacionalUrbanaUbicacionPredio_WSDL() {
		return direccionNacionalUrbanaUbicacionPredio_WSDL;
	}
	public void setDireccionNacionalUrbanaUbicacionPredio_WSDL(JSONObject direccionNacionalUrbanaUbicacionPredio) {
		this.direccionNacionalUrbanaUbicacionPredio_WSDL = new Gson().fromJson(direccionNacionalUrbanaUbicacionPredio.toString(), TipoDireccionNacionalUrbana.class);
	}
	public TipoIdentificacionNacionalPersona getIdentificacionPersona_WSDL() {
		return identificacionPersona_WSDL;
	}
	public void setIdentificacionPersona_WSDL(JSONObject identificacionPersona) {
		this.identificacionPersona_WSDL.setGrupoNumeroIdentificacion(getGrupoNumeroIdentificacion_WSDL());
		this.identificacionPersona_WSDL.setTipoIdNacionalPersona(getTipoIdNacionalPersona_WSDL());
//		this.identificacionPersona_WSDL = new Gson().fromJson(identificacionPersona.toString(), TipoIdentificacionNacionalPersona.class);
	}
	public TipoNomPersona getNomPersonaRelacionadoMatriculaInmobiliaria_WSDL() {
		return nomPersonaRelacionadoMatriculaInmobiliaria_WSDL;
	}
	public void setNomPersonaRelacionadoMatriculaInmobiliaria_WSDL(JSONObject nomPersonaRelacionadoMatriculaInmobiliaria) {
		this.nomPersonaRelacionadoMatriculaInmobiliaria_WSDL.setPrimerApellido(getPrimerApellido());
		this.nomPersonaRelacionadoMatriculaInmobiliaria_WSDL.setPrimerNombre(getPrimerNombre());
		this.nomPersonaRelacionadoMatriculaInmobiliaria_WSDL.setSegundoApellido(getSegundoApellido());
		this.nomPersonaRelacionadoMatriculaInmobiliaria_WSDL.setSegundoNombre(getSegundoNombre());
//		this.nomPersonaRelacionadoMatriculaInmobiliaria_WSDL = new Gson().fromJson(nomPersonaRelacionadoMatriculaInmobiliaria.toString(), TipoNomPersona.class);
	}
	public GrupoNumeroIdentificacion getGrupoNumeroIdentificacion_WSDL() {
		return grupoNumeroIdentificacion_WSDL;
	}
	public void setGrupoNumeroIdentificacion_WSDL(JSONObject grupoNumeroIdentificacion) {
		this.grupoNumeroIdentificacion_WSDL = new Gson().fromJson(grupoNumeroIdentificacion.toString(), GrupoNumeroIdentificacion.class);
	}
	public TipoTipoIdNacionalPersona getTipoIdNacionalPersona_WSDL() {
		return tipoIdNacionalPersona_WSDL;
	}
	public void setTipoIdNacionalPersona_WSDL(JSONObject tipoIdNacionalPersona) {
		this.tipoIdNacionalPersona_WSDL = new Gson().fromJson(tipoIdNacionalPersona.toString(), TipoTipoIdNacionalPersona.class);
	}
	
	public void generarObjetosJSON(String body) {
		
		// JSON de entrada desde postman
		JSONObject jsonEntrada = new JSONObject(body);
		
		JSONObject entrada = jsonEntrada.has("entrada") ? jsonEntrada.getJSONObject("entrada") : new JSONObject();
		this.tipoConsulta = entrada.has("tipoConsulta") ? entrada.getString("tipoConsulta") : "";
		
		JSONObject tipoLstCertificadoTradiciLibertEnt = entrada.has("tipoLstCertificadoTradiciLibertEnt") ? entrada.getJSONObject("tipoLstCertificadoTradiciLibertEnt") : new JSONObject();
		this.numeroDirecciones = tipoLstCertificadoTradiciLibertEnt.has("numeroDirecciones") ? tipoLstCertificadoTradiciLibertEnt.getInt("numeroDirecciones") : 0;
		this.numeroPropietarios = tipoLstCertificadoTradiciLibertEnt.has("numeroPropietarios") ? tipoLstCertificadoTradiciLibertEnt.getInt("numeroPropietarios") : 0;
		
		JSONObject tipoCirculoRegistral = tipoLstCertificadoTradiciLibertEnt.has("tipoCirculoRegistral") ? tipoLstCertificadoTradiciLibertEnt.getJSONObject("tipoCirculoRegistral") : new JSONObject();
		
		JSONObject ubicacionMatriculaSistemaSNR = tipoLstCertificadoTradiciLibertEnt.has("ubicacionMatriculaSistemaSNR") ? tipoLstCertificadoTradiciLibertEnt.getJSONObject("ubicacionMatriculaSistemaSNR") : new JSONObject();
		this.chipPredio = ubicacionMatriculaSistemaSNR.has("chipPredio") ? ubicacionMatriculaSistemaSNR.getString("chipPredio") : "";
		
		JSONObject nitEntidad = ubicacionMatriculaSistemaSNR.has("nitEntidad") ? ubicacionMatriculaSistemaSNR.getJSONObject("nitEntidad") : new JSONObject();
		this.cedulaCatastralPredio = ubicacionMatriculaSistemaSNR.has("cedulaCatastralPredio") ? ubicacionMatriculaSistemaSNR.getString("cedulaCatastralPredio") : "";
		
		JSONObject direccionNacionalRuralUbicacionPredio = ubicacionMatriculaSistemaSNR.has("direccionNacionalRuralUbicacionPredio") ? ubicacionMatriculaSistemaSNR.getJSONObject("direccionNacionalRuralUbicacionPredio") : new JSONObject();
		
		JSONObject direccionNacionalUrbanaUbicacionPredio = ubicacionMatriculaSistemaSNR.has("direccionNacionalUrbanaUbicacionPredio") ? ubicacionMatriculaSistemaSNR.getJSONObject("direccionNacionalUrbanaUbicacionPredio") : new JSONObject();
		this.estadoMatricula = ubicacionMatriculaSistemaSNR.has("estadoMatricula") ? ubicacionMatriculaSistemaSNR.getLong("estadoMatricula") : 0;
		
		JSONObject identificacionPersona = ubicacionMatriculaSistemaSNR.has("identificacionPersona") ? ubicacionMatriculaSistemaSNR.getJSONObject("identificacionPersona") : new JSONObject();
		
		JSONObject grupoNumeroIdentificacion = identificacionPersona.has("grupoNumeroIdentificacion") ? identificacionPersona.getJSONObject("grupoNumeroIdentificacion") : new JSONObject();
		this.numCedulaExtranjeria = grupoNumeroIdentificacion.has("numCedulaExtranjeria") ? grupoNumeroIdentificacion.getLong("numCedulaExtranjeria") : 0;
		this.numIdAdultoSinIdentificar = grupoNumeroIdentificacion.has("numIdAdultoSinIdentificar") ? grupoNumeroIdentificacion.getString("numIdAdultoSinIdentificar") : "";
		this.numIdMenorSinIdentificar = grupoNumeroIdentificacion.has("numIdMenorSinIdentificar") ? grupoNumeroIdentificacion.getString("numIdMenorSinIdentificar") : "";
		this.numIdentificacionRecienNacido = grupoNumeroIdentificacion.has("numIdentificacionRecienNacido") ? grupoNumeroIdentificacion.getString("numIdentificacionRecienNacido") : "";
		this.numRegistroCivil = grupoNumeroIdentificacion.has("numRegistroCivil") ? grupoNumeroIdentificacion.getString("numRegistroCivil") : "";
		this.numTarjetaIdentidad = grupoNumeroIdentificacion.has("numTarjetaIdentidad") ? grupoNumeroIdentificacion.getString("numTarjetaIdentidad") : "";
		this.numeroCedulaCiudadania = grupoNumeroIdentificacion.has("numeroCedulaCiudadania") ? grupoNumeroIdentificacion.getString("numeroCedulaCiudadania") : "";
		this.numeroCedulaExtranjero = grupoNumeroIdentificacion.has("numeroCedulaExtranjero") ? grupoNumeroIdentificacion.getString("numeroCedulaExtranjero") : "";
		this.numeroPasaporte = grupoNumeroIdentificacion.has("numeroPasaporte") ? grupoNumeroIdentificacion.getString("numeroPasaporte") : "";
		
		JSONObject tipoIdNacionalPersona = identificacionPersona.has("tipoIdNacionalPersona") ? identificacionPersona.getJSONObject("tipoIdNacionalPersona") : new JSONObject();
		this.codTipoIdentificacion = tipoIdNacionalPersona.has("codTipoIdentificacion") ? tipoIdNacionalPersona.getString("codTipoIdentificacion") : "";
		this.nomTipoIdentificacion = tipoIdNacionalPersona.has("nomTipoIdentificacion") ? tipoIdNacionalPersona.getString("nomTipoIdentificacion") : "";
		
		JSONObject nomPersonaRelacionadoMatriculaInmobiliaria = ubicacionMatriculaSistemaSNR.has("nomPersonaRelacionadoMatriculaInmobiliaria") ? ubicacionMatriculaSistemaSNR.getJSONObject("nomPersonaRelacionadoMatriculaInmobiliaria") : new JSONObject();
		this.primerApellido = nomPersonaRelacionadoMatriculaInmobiliaria.getString("primerApellido");
		this.segundoApellido = nomPersonaRelacionadoMatriculaInmobiliaria.getString("segundoApellido");
		this.primerNombre = nomPersonaRelacionadoMatriculaInmobiliaria.getString("primerNombre");
		this.segundoNombre = nomPersonaRelacionadoMatriculaInmobiliaria.getString("segundoNombre");
		this.nombreEntidad = ubicacionMatriculaSistemaSNR.has("nombreEntidad") ? ubicacionMatriculaSistemaSNR.getString("nombreEntidad") : "";
		this.numeroMatriculaInmobiliariaPredio = ubicacionMatriculaSistemaSNR.has("numeroMatriculaInmobiliariaPredio") ? ubicacionMatriculaSistemaSNR.getString("numeroMatriculaInmobiliariaPredio") : "";
		
		this.sistemaUsuario = entrada.has("sistemaUsuario") ? entrada.getString("sistemaUsuario") : "";
		this.clave = entrada.has("clave") ? entrada.getString("clave") : "";
		
		setTipoIdNacionalPersona_WSDL(tipoIdNacionalPersona);
		setGrupoNumeroIdentificacion_WSDL(grupoNumeroIdentificacion);
		setIdentificacionPersona_WSDL(identificacionPersona);
		
		
		setEntrada_WSDL(entrada);
		setTipoLstCertificadoTradiciLibertEnt2_WSDL(tipoLstCertificadoTradiciLibertEnt);
		setTipoCirculoRegistral_WSDL(tipoCirculoRegistral);
		setUbicacionMatriculaSistemaSNR_WSDL(ubicacionMatriculaSistemaSNR);
		setNitEntidad_WSDL(nitEntidad);
		setDireccionNacionalRuralUbicacionPredio_WSDL(direccionNacionalRuralUbicacionPredio);
		setDireccionNacionalUrbanaUbicacionPredio_WSDL(direccionNacionalUrbanaUbicacionPredio);
		
		setNomPersonaRelacionadoMatriculaInmobiliaria_WSDL(nomPersonaRelacionadoMatriculaInmobiliaria);		

	}
}
