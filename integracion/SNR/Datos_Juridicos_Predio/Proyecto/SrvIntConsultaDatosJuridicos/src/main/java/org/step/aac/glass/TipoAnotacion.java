
package org.step.aac.glass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tipoAnotacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoAnotacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cancelacionAnotacion" type="{http://glass.aac.step.org/}tipoListaMagnitud" minOccurs="0"/>
 *         &lt;element name="comentario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="documentoAnotacionCertificadoTradicion" type="{http://glass.aac.step.org/}tipoDocumentoAnotacion" minOccurs="0"/>
 *         &lt;element name="dominio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entidadAnotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="especificacionAnotacionFolio" type="{http://glass.aac.step.org/}tipoEspecificacionAnotacion" minOccurs="0"/>
 *         &lt;element name="fechaAnotacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="grupo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreMunicipioAnotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroAnotacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="personaIntervieneActoAnotacionFolio" type="{http://glass.aac.step.org/}tipoPersonaIntervieneActoAnotacion" minOccurs="0"/>
 *         &lt;element name="radicacionAnotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="validez" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorActo" type="{http://glass.aac.step.org/}tipoValorMonetario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoAnotacion", propOrder = {
    "cancelacionAnotacion",
    "comentario",
    "documentoAnotacionCertificadoTradicion",
    "dominio",
    "entidadAnotacion",
    "especificacionAnotacionFolio",
    "fechaAnotacion",
    "grupo",
    "nombreMunicipioAnotacion",
    "numeroAnotacion",
    "personaIntervieneActoAnotacionFolio",
    "radicacionAnotacion",
    "validez",
    "valorActo"
})
public class TipoAnotacion {

    protected TipoListaMagnitud cancelacionAnotacion;
    protected String comentario;
    protected TipoDocumentoAnotacion documentoAnotacionCertificadoTradicion;
    protected String dominio;
    protected String entidadAnotacion;
    protected TipoEspecificacionAnotacion especificacionAnotacionFolio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAnotacion;
    protected String grupo;
    protected String nombreMunicipioAnotacion;
    protected Integer numeroAnotacion;
    protected TipoPersonaIntervieneActoAnotacion personaIntervieneActoAnotacionFolio;
    protected String radicacionAnotacion;
    protected String validez;
    protected TipoValorMonetario valorActo;

    /**
     * Gets the value of the cancelacionAnotacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoListaMagnitud }
     *     
     */
    public TipoListaMagnitud getCancelacionAnotacion() {
        return cancelacionAnotacion;
    }

    /**
     * Sets the value of the cancelacionAnotacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoListaMagnitud }
     *     
     */
    public void setCancelacionAnotacion(TipoListaMagnitud value) {
        this.cancelacionAnotacion = value;
    }

    /**
     * Gets the value of the comentario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentario() {
        return comentario;
    }

    /**
     * Sets the value of the comentario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentario(String value) {
        this.comentario = value;
    }

    /**
     * Gets the value of the documentoAnotacionCertificadoTradicion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoAnotacion }
     *     
     */
    public TipoDocumentoAnotacion getDocumentoAnotacionCertificadoTradicion() {
        return documentoAnotacionCertificadoTradicion;
    }

    /**
     * Sets the value of the documentoAnotacionCertificadoTradicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoAnotacion }
     *     
     */
    public void setDocumentoAnotacionCertificadoTradicion(TipoDocumentoAnotacion value) {
        this.documentoAnotacionCertificadoTradicion = value;
    }

    /**
     * Gets the value of the dominio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDominio() {
        return dominio;
    }

    /**
     * Sets the value of the dominio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDominio(String value) {
        this.dominio = value;
    }

    /**
     * Gets the value of the entidadAnotacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidadAnotacion() {
        return entidadAnotacion;
    }

    /**
     * Sets the value of the entidadAnotacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidadAnotacion(String value) {
        this.entidadAnotacion = value;
    }

    /**
     * Gets the value of the especificacionAnotacionFolio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEspecificacionAnotacion }
     *     
     */
    public TipoEspecificacionAnotacion getEspecificacionAnotacionFolio() {
        return especificacionAnotacionFolio;
    }

    /**
     * Sets the value of the especificacionAnotacionFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEspecificacionAnotacion }
     *     
     */
    public void setEspecificacionAnotacionFolio(TipoEspecificacionAnotacion value) {
        this.especificacionAnotacionFolio = value;
    }

    /**
     * Gets the value of the fechaAnotacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAnotacion() {
        return fechaAnotacion;
    }

    /**
     * Sets the value of the fechaAnotacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAnotacion(XMLGregorianCalendar value) {
        this.fechaAnotacion = value;
    }

    /**
     * Gets the value of the grupo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupo() {
        return grupo;
    }

    /**
     * Sets the value of the grupo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupo(String value) {
        this.grupo = value;
    }

    /**
     * Gets the value of the nombreMunicipioAnotacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreMunicipioAnotacion() {
        return nombreMunicipioAnotacion;
    }

    /**
     * Sets the value of the nombreMunicipioAnotacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreMunicipioAnotacion(String value) {
        this.nombreMunicipioAnotacion = value;
    }

    /**
     * Gets the value of the numeroAnotacion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroAnotacion() {
        return numeroAnotacion;
    }

    /**
     * Sets the value of the numeroAnotacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroAnotacion(Integer value) {
        this.numeroAnotacion = value;
    }

    /**
     * Gets the value of the personaIntervieneActoAnotacionFolio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPersonaIntervieneActoAnotacion }
     *     
     */
    public TipoPersonaIntervieneActoAnotacion getPersonaIntervieneActoAnotacionFolio() {
        return personaIntervieneActoAnotacionFolio;
    }

    /**
     * Sets the value of the personaIntervieneActoAnotacionFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPersonaIntervieneActoAnotacion }
     *     
     */
    public void setPersonaIntervieneActoAnotacionFolio(TipoPersonaIntervieneActoAnotacion value) {
        this.personaIntervieneActoAnotacionFolio = value;
    }

    /**
     * Gets the value of the radicacionAnotacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadicacionAnotacion() {
        return radicacionAnotacion;
    }

    /**
     * Sets the value of the radicacionAnotacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadicacionAnotacion(String value) {
        this.radicacionAnotacion = value;
    }

    /**
     * Gets the value of the validez property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidez() {
        return validez;
    }

    /**
     * Sets the value of the validez property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidez(String value) {
        this.validez = value;
    }

    /**
     * Gets the value of the valorActo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoValorMonetario }
     *     
     */
    public TipoValorMonetario getValorActo() {
        return valorActo;
    }

    /**
     * Sets the value of the valorActo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoValorMonetario }
     *     
     */
    public void setValorActo(TipoValorMonetario value) {
        this.valorActo = value;
    }

}
