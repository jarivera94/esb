
package com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tipoLstCertificadoTradiciLibertSal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoLstCertificadoTradiciLibertSal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="archivoAdjunto" type="{http://glass.aac.step.org/}tipoArchivoAdjunto" minOccurs="0"/>
 *         &lt;element name="cedulaCatastral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cedulaCatastralPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="centroPoblado" type="{http://glass.aac.step.org/}tipoCentroPoblado" minOccurs="0"/>
 *         &lt;element name="chipCertificadoTradicionActual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chipCertificadoTradicionAnterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoCatastralActual" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigoCatastralAnterior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complementacionInmuebleCertificadoTradicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departamentoPredio" type="{http://glass.aac.step.org/}tipoDepartamento" minOccurs="0"/>
 *         &lt;element name="direccionInmueble" type="{http://glass.aac.step.org/}tipoListaDireccionDomiciliaria" minOccurs="0"/>
 *         &lt;element name="documentoEncabezado" type="{http://glass.aac.step.org/}tipoDocumentoAnotacion" minOccurs="0"/>
 *         &lt;element name="estadotFolioCertificadoTradicion" type="{http://glass.aac.step.org/}tipoEstadoFolio" minOccurs="0"/>
 *         &lt;element name="fechaAperturaCertificado" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaHoraExpedicionCertificado" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fechaRadicacionCertificado" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="informacionApertura" type="{http://glass.aac.step.org/}tipoInformacionApertura" minOccurs="0"/>
 *         &lt;element name="informacionTrasladoMatricula" type="{http://glass.aac.step.org/}informacionTrasladoMatricula" minOccurs="0"/>
 *         &lt;element name="jurisdiccionPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="linderoPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="listaAnotacionTramiteCertificadoTradicion" type="{http://glass.aac.step.org/}tipoListaAnotacionCertificaTradici" minOccurs="0"/>
 *         &lt;element name="listaMatriculaRelacionadaPredio" type="{http://glass.aac.step.org/}tipoListaMatriculaRelacionada" minOccurs="0"/>
 *         &lt;element name="listaSalvedadCertificado" type="{http://glass.aac.step.org/}tipoListaSalvedad" minOccurs="0"/>
 *         &lt;element name="municipioPredio" type="{http://glass.aac.step.org/}tipoMunicipio" minOccurs="0"/>
 *         &lt;element name="numeroRadicacionMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personaRegistrador" type="{http://glass.aac.step.org/}tipoNomPersona" minOccurs="0"/>
 *         &lt;element name="rolFuncionarioCargoPublico" type="{http://glass.aac.step.org/}tipoTipoRolFuncionario" minOccurs="0"/>
 *         &lt;element name="tipoDepartamentoMunicipioDivipola" type="{http://glass.aac.step.org/}tipoDepartamentoMunicipio" minOccurs="0"/>
 *         &lt;element name="tipoPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalAnotacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="turnoCertificadoTradicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuarioImpresion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuarioRealizaCertificadoTradicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vereda" type="{http://glass.aac.step.org/}tipoCentroPoblado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoLstCertificadoTradiciLibertSal", propOrder = {
    "archivoAdjunto",
    "cedulaCatastral",
    "cedulaCatastralPredio",
    "centroPoblado",
    "chipCertificadoTradicionActual",
    "chipCertificadoTradicionAnterior",
    "codigoCatastralActual",
    "codigoCatastralAnterior",
    "complementacionInmuebleCertificadoTradicion",
    "departamentoPredio",
    "direccionInmueble",
    "documentoEncabezado",
    "estadotFolioCertificadoTradicion",
    "fechaAperturaCertificado",
    "fechaHoraExpedicionCertificado",
    "fechaRadicacionCertificado",
    "informacionApertura",
    "informacionTrasladoMatricula",
    "jurisdiccionPredio",
    "linderoPredio",
    "listaAnotacionTramiteCertificadoTradicion",
    "listaMatriculaRelacionadaPredio",
    "listaSalvedadCertificado",
    "municipioPredio",
    "numeroRadicacionMatricula",
    "personaRegistrador",
    "rolFuncionarioCargoPublico",
    "tipoDepartamentoMunicipioDivipola",
    "tipoPredio",
    "totalAnotacion",
    "turnoCertificadoTradicion",
    "usuarioImpresion",
    "usuarioRealizaCertificadoTradicion",
    "vereda"
})
public class TipoLstCertificadoTradiciLibertSal {

    protected TipoArchivoAdjunto archivoAdjunto;
    protected String cedulaCatastral;
    protected String cedulaCatastralPredio;
    protected TipoCentroPoblado centroPoblado;
    protected String chipCertificadoTradicionActual;
    protected String chipCertificadoTradicionAnterior;
    protected String codigoCatastralActual;
    protected String codigoCatastralAnterior;
    protected String complementacionInmuebleCertificadoTradicion;
    protected TipoDepartamento departamentoPredio;
    protected TipoListaDireccionDomiciliaria direccionInmueble;
    protected TipoDocumentoAnotacion documentoEncabezado;
    protected TipoEstadoFolio estadotFolioCertificadoTradicion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAperturaCertificado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraExpedicionCertificado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRadicacionCertificado;
    protected TipoInformacionApertura informacionApertura;
    protected InformacionTrasladoMatricula informacionTrasladoMatricula;
    protected String jurisdiccionPredio;
    protected String linderoPredio;
    protected TipoListaAnotacionCertificaTradici listaAnotacionTramiteCertificadoTradicion;
    protected TipoListaMatriculaRelacionada listaMatriculaRelacionadaPredio;
    protected TipoListaSalvedad listaSalvedadCertificado;
    protected TipoMunicipio municipioPredio;
    protected String numeroRadicacionMatricula;
    protected TipoNomPersona personaRegistrador;
    protected TipoTipoRolFuncionario rolFuncionarioCargoPublico;
    protected TipoDepartamentoMunicipio tipoDepartamentoMunicipioDivipola;
    protected String tipoPredio;
    protected Integer totalAnotacion;
    protected String turnoCertificadoTradicion;
    protected String usuarioImpresion;
    protected String usuarioRealizaCertificadoTradicion;
    protected TipoCentroPoblado vereda;

    /**
     * Gets the value of the archivoAdjunto property.
     * 
     * @return
     *     possible object is
     *     {@link TipoArchivoAdjunto }
     *     
     */
    public TipoArchivoAdjunto getArchivoAdjunto() {
        return archivoAdjunto;
    }

    /**
     * Sets the value of the archivoAdjunto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoArchivoAdjunto }
     *     
     */
    public void setArchivoAdjunto(TipoArchivoAdjunto value) {
        this.archivoAdjunto = value;
    }

    /**
     * Gets the value of the cedulaCatastral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedulaCatastral() {
        return cedulaCatastral;
    }

    /**
     * Sets the value of the cedulaCatastral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedulaCatastral(String value) {
        this.cedulaCatastral = value;
    }

    /**
     * Gets the value of the cedulaCatastralPredio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedulaCatastralPredio() {
        return cedulaCatastralPredio;
    }

    /**
     * Sets the value of the cedulaCatastralPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedulaCatastralPredio(String value) {
        this.cedulaCatastralPredio = value;
    }

    /**
     * Gets the value of the centroPoblado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCentroPoblado }
     *     
     */
    public TipoCentroPoblado getCentroPoblado() {
        return centroPoblado;
    }

    /**
     * Sets the value of the centroPoblado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCentroPoblado }
     *     
     */
    public void setCentroPoblado(TipoCentroPoblado value) {
        this.centroPoblado = value;
    }

    /**
     * Gets the value of the chipCertificadoTradicionActual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChipCertificadoTradicionActual() {
        return chipCertificadoTradicionActual;
    }

    /**
     * Sets the value of the chipCertificadoTradicionActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChipCertificadoTradicionActual(String value) {
        this.chipCertificadoTradicionActual = value;
    }

    /**
     * Gets the value of the chipCertificadoTradicionAnterior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChipCertificadoTradicionAnterior() {
        return chipCertificadoTradicionAnterior;
    }

    /**
     * Sets the value of the chipCertificadoTradicionAnterior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChipCertificadoTradicionAnterior(String value) {
        this.chipCertificadoTradicionAnterior = value;
    }

    /**
     * Gets the value of the codigoCatastralActual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCatastralActual() {
        return codigoCatastralActual;
    }

    /**
     * Sets the value of the codigoCatastralActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCatastralActual(String value) {
        this.codigoCatastralActual = value;
    }

    /**
     * Gets the value of the codigoCatastralAnterior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoCatastralAnterior() {
        return codigoCatastralAnterior;
    }

    /**
     * Sets the value of the codigoCatastralAnterior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoCatastralAnterior(String value) {
        this.codigoCatastralAnterior = value;
    }

    /**
     * Gets the value of the complementacionInmuebleCertificadoTradicion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplementacionInmuebleCertificadoTradicion() {
        return complementacionInmuebleCertificadoTradicion;
    }

    /**
     * Sets the value of the complementacionInmuebleCertificadoTradicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplementacionInmuebleCertificadoTradicion(String value) {
        this.complementacionInmuebleCertificadoTradicion = value;
    }

    /**
     * Gets the value of the departamentoPredio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDepartamento }
     *     
     */
    public TipoDepartamento getDepartamentoPredio() {
        return departamentoPredio;
    }

    /**
     * Sets the value of the departamentoPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDepartamento }
     *     
     */
    public void setDepartamentoPredio(TipoDepartamento value) {
        this.departamentoPredio = value;
    }

    /**
     * Gets the value of the direccionInmueble property.
     * 
     * @return
     *     possible object is
     *     {@link TipoListaDireccionDomiciliaria }
     *     
     */
    public TipoListaDireccionDomiciliaria getDireccionInmueble() {
        return direccionInmueble;
    }

    /**
     * Sets the value of the direccionInmueble property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoListaDireccionDomiciliaria }
     *     
     */
    public void setDireccionInmueble(TipoListaDireccionDomiciliaria value) {
        this.direccionInmueble = value;
    }

    /**
     * Gets the value of the documentoEncabezado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoAnotacion }
     *     
     */
    public TipoDocumentoAnotacion getDocumentoEncabezado() {
        return documentoEncabezado;
    }

    /**
     * Sets the value of the documentoEncabezado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoAnotacion }
     *     
     */
    public void setDocumentoEncabezado(TipoDocumentoAnotacion value) {
        this.documentoEncabezado = value;
    }

    /**
     * Gets the value of the estadotFolioCertificadoTradicion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstadoFolio }
     *     
     */
    public TipoEstadoFolio getEstadotFolioCertificadoTradicion() {
        return estadotFolioCertificadoTradicion;
    }

    /**
     * Sets the value of the estadotFolioCertificadoTradicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstadoFolio }
     *     
     */
    public void setEstadotFolioCertificadoTradicion(TipoEstadoFolio value) {
        this.estadotFolioCertificadoTradicion = value;
    }

    /**
     * Gets the value of the fechaAperturaCertificado property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAperturaCertificado() {
        return fechaAperturaCertificado;
    }

    /**
     * Sets the value of the fechaAperturaCertificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAperturaCertificado(XMLGregorianCalendar value) {
        this.fechaAperturaCertificado = value;
    }

    /**
     * Gets the value of the fechaHoraExpedicionCertificado property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraExpedicionCertificado() {
        return fechaHoraExpedicionCertificado;
    }

    /**
     * Sets the value of the fechaHoraExpedicionCertificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraExpedicionCertificado(XMLGregorianCalendar value) {
        this.fechaHoraExpedicionCertificado = value;
    }

    /**
     * Gets the value of the fechaRadicacionCertificado property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRadicacionCertificado() {
        return fechaRadicacionCertificado;
    }

    /**
     * Sets the value of the fechaRadicacionCertificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRadicacionCertificado(XMLGregorianCalendar value) {
        this.fechaRadicacionCertificado = value;
    }

    /**
     * Gets the value of the informacionApertura property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInformacionApertura }
     *     
     */
    public TipoInformacionApertura getInformacionApertura() {
        return informacionApertura;
    }

    /**
     * Sets the value of the informacionApertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInformacionApertura }
     *     
     */
    public void setInformacionApertura(TipoInformacionApertura value) {
        this.informacionApertura = value;
    }

    /**
     * Gets the value of the informacionTrasladoMatricula property.
     * 
     * @return
     *     possible object is
     *     {@link InformacionTrasladoMatricula }
     *     
     */
    public InformacionTrasladoMatricula getInformacionTrasladoMatricula() {
        return informacionTrasladoMatricula;
    }

    /**
     * Sets the value of the informacionTrasladoMatricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link InformacionTrasladoMatricula }
     *     
     */
    public void setInformacionTrasladoMatricula(InformacionTrasladoMatricula value) {
        this.informacionTrasladoMatricula = value;
    }

    /**
     * Gets the value of the jurisdiccionPredio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdiccionPredio() {
        return jurisdiccionPredio;
    }

    /**
     * Sets the value of the jurisdiccionPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdiccionPredio(String value) {
        this.jurisdiccionPredio = value;
    }

    /**
     * Gets the value of the linderoPredio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinderoPredio() {
        return linderoPredio;
    }

    /**
     * Sets the value of the linderoPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinderoPredio(String value) {
        this.linderoPredio = value;
    }

    /**
     * Gets the value of the listaAnotacionTramiteCertificadoTradicion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoListaAnotacionCertificaTradici }
     *     
     */
    public TipoListaAnotacionCertificaTradici getListaAnotacionTramiteCertificadoTradicion() {
        return listaAnotacionTramiteCertificadoTradicion;
    }

    /**
     * Sets the value of the listaAnotacionTramiteCertificadoTradicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoListaAnotacionCertificaTradici }
     *     
     */
    public void setListaAnotacionTramiteCertificadoTradicion(TipoListaAnotacionCertificaTradici value) {
        this.listaAnotacionTramiteCertificadoTradicion = value;
    }

    /**
     * Gets the value of the listaMatriculaRelacionadaPredio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoListaMatriculaRelacionada }
     *     
     */
    public TipoListaMatriculaRelacionada getListaMatriculaRelacionadaPredio() {
        return listaMatriculaRelacionadaPredio;
    }

    /**
     * Sets the value of the listaMatriculaRelacionadaPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoListaMatriculaRelacionada }
     *     
     */
    public void setListaMatriculaRelacionadaPredio(TipoListaMatriculaRelacionada value) {
        this.listaMatriculaRelacionadaPredio = value;
    }

    /**
     * Gets the value of the listaSalvedadCertificado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoListaSalvedad }
     *     
     */
    public TipoListaSalvedad getListaSalvedadCertificado() {
        return listaSalvedadCertificado;
    }

    /**
     * Sets the value of the listaSalvedadCertificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoListaSalvedad }
     *     
     */
    public void setListaSalvedadCertificado(TipoListaSalvedad value) {
        this.listaSalvedadCertificado = value;
    }

    /**
     * Gets the value of the municipioPredio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoMunicipio }
     *     
     */
    public TipoMunicipio getMunicipioPredio() {
        return municipioPredio;
    }

    /**
     * Sets the value of the municipioPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoMunicipio }
     *     
     */
    public void setMunicipioPredio(TipoMunicipio value) {
        this.municipioPredio = value;
    }

    /**
     * Gets the value of the numeroRadicacionMatricula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRadicacionMatricula() {
        return numeroRadicacionMatricula;
    }

    /**
     * Sets the value of the numeroRadicacionMatricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRadicacionMatricula(String value) {
        this.numeroRadicacionMatricula = value;
    }

    /**
     * Gets the value of the personaRegistrador property.
     * 
     * @return
     *     possible object is
     *     {@link TipoNomPersona }
     *     
     */
    public TipoNomPersona getPersonaRegistrador() {
        return personaRegistrador;
    }

    /**
     * Sets the value of the personaRegistrador property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoNomPersona }
     *     
     */
    public void setPersonaRegistrador(TipoNomPersona value) {
        this.personaRegistrador = value;
    }

    /**
     * Gets the value of the rolFuncionarioCargoPublico property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoRolFuncionario }
     *     
     */
    public TipoTipoRolFuncionario getRolFuncionarioCargoPublico() {
        return rolFuncionarioCargoPublico;
    }

    /**
     * Sets the value of the rolFuncionarioCargoPublico property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoRolFuncionario }
     *     
     */
    public void setRolFuncionarioCargoPublico(TipoTipoRolFuncionario value) {
        this.rolFuncionarioCargoPublico = value;
    }

    /**
     * Gets the value of the tipoDepartamentoMunicipioDivipola property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDepartamentoMunicipio }
     *     
     */
    public TipoDepartamentoMunicipio getTipoDepartamentoMunicipioDivipola() {
        return tipoDepartamentoMunicipioDivipola;
    }

    /**
     * Sets the value of the tipoDepartamentoMunicipioDivipola property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDepartamentoMunicipio }
     *     
     */
    public void setTipoDepartamentoMunicipioDivipola(TipoDepartamentoMunicipio value) {
        this.tipoDepartamentoMunicipioDivipola = value;
    }

    /**
     * Gets the value of the tipoPredio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPredio() {
        return tipoPredio;
    }

    /**
     * Sets the value of the tipoPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPredio(String value) {
        this.tipoPredio = value;
    }

    /**
     * Gets the value of the totalAnotacion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalAnotacion() {
        return totalAnotacion;
    }

    /**
     * Sets the value of the totalAnotacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalAnotacion(Integer value) {
        this.totalAnotacion = value;
    }

    /**
     * Gets the value of the turnoCertificadoTradicion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTurnoCertificadoTradicion() {
        return turnoCertificadoTradicion;
    }

    /**
     * Sets the value of the turnoCertificadoTradicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTurnoCertificadoTradicion(String value) {
        this.turnoCertificadoTradicion = value;
    }

    /**
     * Gets the value of the usuarioImpresion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioImpresion() {
        return usuarioImpresion;
    }

    /**
     * Sets the value of the usuarioImpresion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioImpresion(String value) {
        this.usuarioImpresion = value;
    }

    /**
     * Gets the value of the usuarioRealizaCertificadoTradicion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioRealizaCertificadoTradicion() {
        return usuarioRealizaCertificadoTradicion;
    }

    /**
     * Sets the value of the usuarioRealizaCertificadoTradicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioRealizaCertificadoTradicion(String value) {
        this.usuarioRealizaCertificadoTradicion = value;
    }

    /**
     * Gets the value of the vereda property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCentroPoblado }
     *     
     */
    public TipoCentroPoblado getVereda() {
        return vereda;
    }

    /**
     * Sets the value of the vereda property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCentroPoblado }
     *     
     */
    public void setVereda(TipoCentroPoblado value) {
        this.vereda = value;
    }

}
