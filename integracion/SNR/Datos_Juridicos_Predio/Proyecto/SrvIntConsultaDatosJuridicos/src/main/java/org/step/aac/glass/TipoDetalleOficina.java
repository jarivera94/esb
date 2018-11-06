
package org.step.aac.glass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoDetalleOficina complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoDetalleOficina">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="direccionOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="faxOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="horarioAtencionOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreRegistradorOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoOficina" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDetalleOficina", propOrder = {
    "direccionOficina",
    "faxOficina",
    "horarioAtencionOficina",
    "nombreRegistradorOficina",
    "telefonoOficina"
})
public class TipoDetalleOficina {

    protected String direccionOficina;
    protected String faxOficina;
    protected String horarioAtencionOficina;
    protected String nombreRegistradorOficina;
    protected String telefonoOficina;

    /**
     * Gets the value of the direccionOficina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionOficina() {
        return direccionOficina;
    }

    /**
     * Sets the value of the direccionOficina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionOficina(String value) {
        this.direccionOficina = value;
    }

    /**
     * Gets the value of the faxOficina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxOficina() {
        return faxOficina;
    }

    /**
     * Sets the value of the faxOficina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxOficina(String value) {
        this.faxOficina = value;
    }

    /**
     * Gets the value of the horarioAtencionOficina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHorarioAtencionOficina() {
        return horarioAtencionOficina;
    }

    /**
     * Sets the value of the horarioAtencionOficina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHorarioAtencionOficina(String value) {
        this.horarioAtencionOficina = value;
    }

    /**
     * Gets the value of the nombreRegistradorOficina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRegistradorOficina() {
        return nombreRegistradorOficina;
    }

    /**
     * Sets the value of the nombreRegistradorOficina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRegistradorOficina(String value) {
        this.nombreRegistradorOficina = value;
    }

    /**
     * Gets the value of the telefonoOficina property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoOficina() {
        return telefonoOficina;
    }

    /**
     * Sets the value of the telefonoOficina property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoOficina(String value) {
        this.telefonoOficina = value;
    }

}
