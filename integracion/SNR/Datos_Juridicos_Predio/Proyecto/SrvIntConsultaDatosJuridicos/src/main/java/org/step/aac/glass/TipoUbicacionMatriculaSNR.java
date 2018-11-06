
package org.step.aac.glass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoUbicacionMatriculaSNR complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoUbicacionMatriculaSNR">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CHIPPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NITEntidad" type="{http://glass.aac.step.org/}tipoNIT" minOccurs="0"/>
 *         &lt;element name="cedulaCatastralPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direccionNacionalRuralUbicacionPredio" type="{http://glass.aac.step.org/}tipoDireccionNacionalRural" minOccurs="0"/>
 *         &lt;element name="direccionNacionalUrbanaUbicacionPredio" type="{http://glass.aac.step.org/}tipoDireccionNacionalUrbana" minOccurs="0"/>
 *         &lt;element name="estadoMatricula" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="identificacionPersona" type="{http://glass.aac.step.org/}tipoIdentificacionNacionalPersona" minOccurs="0"/>
 *         &lt;element name="nomPersonaRelacionadoMatriculaInmobiliaria" type="{http://glass.aac.step.org/}tipoNomPersona" minOccurs="0"/>
 *         &lt;element name="nombreEntidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroMatriculaInmobiliariaPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoUbicacionMatriculaSNR", propOrder = {
    "chipPredio",
    "nitEntidad",
    "cedulaCatastralPredio",
    "direccionNacionalRuralUbicacionPredio",
    "direccionNacionalUrbanaUbicacionPredio",
    "estadoMatricula",
    "identificacionPersona",
    "nomPersonaRelacionadoMatriculaInmobiliaria",
    "nombreEntidad",
    "numeroMatriculaInmobiliariaPredio"
})
public class TipoUbicacionMatriculaSNR {

    @XmlElement(name = "CHIPPredio")
    protected String chipPredio;
    @XmlElement(name = "NITEntidad")
    protected TipoNIT nitEntidad;
    protected String cedulaCatastralPredio;
    protected TipoDireccionNacionalRural direccionNacionalRuralUbicacionPredio;
    protected TipoDireccionNacionalUrbana direccionNacionalUrbanaUbicacionPredio;
    protected Integer estadoMatricula;
    protected TipoIdentificacionNacionalPersona identificacionPersona;
    protected TipoNomPersona nomPersonaRelacionadoMatriculaInmobiliaria;
    protected String nombreEntidad;
    protected String numeroMatriculaInmobiliariaPredio;

    /**
     * Gets the value of the chipPredio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHIPPredio() {
        return chipPredio;
    }

    /**
     * Sets the value of the chipPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHIPPredio(String value) {
        this.chipPredio = value;
    }

    /**
     * Gets the value of the nitEntidad property.
     * 
     * @return
     *     possible object is
     *     {@link TipoNIT }
     *     
     */
    public TipoNIT getNITEntidad() {
        return nitEntidad;
    }

    /**
     * Sets the value of the nitEntidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoNIT }
     *     
     */
    public void setNITEntidad(TipoNIT value) {
        this.nitEntidad = value;
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
     * Gets the value of the direccionNacionalRuralUbicacionPredio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDireccionNacionalRural }
     *     
     */
    public TipoDireccionNacionalRural getDireccionNacionalRuralUbicacionPredio() {
        return direccionNacionalRuralUbicacionPredio;
    }

    /**
     * Sets the value of the direccionNacionalRuralUbicacionPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDireccionNacionalRural }
     *     
     */
    public void setDireccionNacionalRuralUbicacionPredio(TipoDireccionNacionalRural value) {
        this.direccionNacionalRuralUbicacionPredio = value;
    }

    /**
     * Gets the value of the direccionNacionalUrbanaUbicacionPredio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDireccionNacionalUrbana }
     *     
     */
    public TipoDireccionNacionalUrbana getDireccionNacionalUrbanaUbicacionPredio() {
        return direccionNacionalUrbanaUbicacionPredio;
    }

    /**
     * Sets the value of the direccionNacionalUrbanaUbicacionPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDireccionNacionalUrbana }
     *     
     */
    public void setDireccionNacionalUrbanaUbicacionPredio(TipoDireccionNacionalUrbana value) {
        this.direccionNacionalUrbanaUbicacionPredio = value;
    }

    /**
     * Gets the value of the estadoMatricula property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstadoMatricula() {
        return estadoMatricula;
    }

    /**
     * Sets the value of the estadoMatricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstadoMatricula(Integer value) {
        this.estadoMatricula = value;
    }

    /**
     * Gets the value of the identificacionPersona property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificacionNacionalPersona }
     *     
     */
    public TipoIdentificacionNacionalPersona getIdentificacionPersona() {
        return identificacionPersona;
    }

    /**
     * Sets the value of the identificacionPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificacionNacionalPersona }
     *     
     */
    public void setIdentificacionPersona(TipoIdentificacionNacionalPersona value) {
        this.identificacionPersona = value;
    }

    /**
     * Gets the value of the nomPersonaRelacionadoMatriculaInmobiliaria property.
     * 
     * @return
     *     possible object is
     *     {@link TipoNomPersona }
     *     
     */
    public TipoNomPersona getNomPersonaRelacionadoMatriculaInmobiliaria() {
        return nomPersonaRelacionadoMatriculaInmobiliaria;
    }

    /**
     * Sets the value of the nomPersonaRelacionadoMatriculaInmobiliaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoNomPersona }
     *     
     */
    public void setNomPersonaRelacionadoMatriculaInmobiliaria(TipoNomPersona value) {
        this.nomPersonaRelacionadoMatriculaInmobiliaria = value;
    }

    /**
     * Gets the value of the nombreEntidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreEntidad() {
        return nombreEntidad;
    }

    /**
     * Sets the value of the nombreEntidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreEntidad(String value) {
        this.nombreEntidad = value;
    }

    /**
     * Gets the value of the numeroMatriculaInmobiliariaPredio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroMatriculaInmobiliariaPredio() {
        return numeroMatriculaInmobiliariaPredio;
    }

    /**
     * Sets the value of the numeroMatriculaInmobiliariaPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroMatriculaInmobiliariaPredio(String value) {
        this.numeroMatriculaInmobiliariaPredio = value;
    }

}
