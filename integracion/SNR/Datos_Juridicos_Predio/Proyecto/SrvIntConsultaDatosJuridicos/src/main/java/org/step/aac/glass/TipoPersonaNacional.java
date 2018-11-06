
package org.step.aac.glass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoPersonaNacional complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoPersonaNacional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esPropietario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificacionPersona" type="{http://glass.aac.step.org/}tipoIdentificacionNacionalPersona" minOccurs="0"/>
 *         &lt;element name="nomPersonaIndividual" type="{http://glass.aac.step.org/}tipoNomPersona" minOccurs="0"/>
 *         &lt;element name="porcentajeParticipacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoPersonaNacional", propOrder = {
    "esPropietario",
    "identificacionPersona",
    "nomPersonaIndividual",
    "porcentajeParticipacion"
})
public class TipoPersonaNacional {

    protected String esPropietario;
    protected TipoIdentificacionNacionalPersona identificacionPersona;
    protected TipoNomPersona nomPersonaIndividual;
    protected String porcentajeParticipacion;

    /**
     * Gets the value of the esPropietario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsPropietario() {
        return esPropietario;
    }

    /**
     * Sets the value of the esPropietario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsPropietario(String value) {
        this.esPropietario = value;
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
     * Gets the value of the nomPersonaIndividual property.
     * 
     * @return
     *     possible object is
     *     {@link TipoNomPersona }
     *     
     */
    public TipoNomPersona getNomPersonaIndividual() {
        return nomPersonaIndividual;
    }

    /**
     * Sets the value of the nomPersonaIndividual property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoNomPersona }
     *     
     */
    public void setNomPersonaIndividual(TipoNomPersona value) {
        this.nomPersonaIndividual = value;
    }

    /**
     * Gets the value of the porcentajeParticipacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPorcentajeParticipacion() {
        return porcentajeParticipacion;
    }

    /**
     * Sets the value of the porcentajeParticipacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPorcentajeParticipacion(String value) {
        this.porcentajeParticipacion = value;
    }

}
