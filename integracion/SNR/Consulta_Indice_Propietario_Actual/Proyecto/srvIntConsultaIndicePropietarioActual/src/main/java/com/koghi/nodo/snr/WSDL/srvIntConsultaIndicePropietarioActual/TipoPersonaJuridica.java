
package com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoPersonaJuridica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoPersonaJuridica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="esPropietario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numIdTributaria" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="porcentajeParticipacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razonSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoPersonaJuridica" type="{http://glass.aac.step.org/}tipoTipoPersonaJuridica" minOccurs="0"/>
 *         &lt;element name="tipoSociedad" type="{http://glass.aac.step.org/}tipoTipoSociedad" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoPersonaJuridica", propOrder = {
    "esPropietario",
    "numIdTributaria",
    "porcentajeParticipacion",
    "razonSocial",
    "tipoPersonaJuridica",
    "tipoSociedad"
})
public class TipoPersonaJuridica {

    protected String esPropietario;
    protected Long numIdTributaria;
    protected String porcentajeParticipacion;
    protected String razonSocial;
    protected TipoTipoPersonaJuridica tipoPersonaJuridica;
    protected TipoTipoSociedad tipoSociedad;

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
     * Gets the value of the numIdTributaria property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumIdTributaria() {
        return numIdTributaria;
    }

    /**
     * Sets the value of the numIdTributaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumIdTributaria(Long value) {
        this.numIdTributaria = value;
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

    /**
     * Gets the value of the razonSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * Sets the value of the razonSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazonSocial(String value) {
        this.razonSocial = value;
    }

    /**
     * Gets the value of the tipoPersonaJuridica property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoPersonaJuridica }
     *     
     */
    public TipoTipoPersonaJuridica getTipoPersonaJuridica() {
        return tipoPersonaJuridica;
    }

    /**
     * Sets the value of the tipoPersonaJuridica property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoPersonaJuridica }
     *     
     */
    public void setTipoPersonaJuridica(TipoTipoPersonaJuridica value) {
        this.tipoPersonaJuridica = value;
    }

    /**
     * Gets the value of the tipoSociedad property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoSociedad }
     *     
     */
    public TipoTipoSociedad getTipoSociedad() {
        return tipoSociedad;
    }

    /**
     * Sets the value of the tipoSociedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoSociedad }
     *     
     */
    public void setTipoSociedad(TipoTipoSociedad value) {
        this.tipoSociedad = value;
    }

}
