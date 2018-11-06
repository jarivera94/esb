
package org.step.aac.glass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoTipoIdNacionalPersona complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoTipoIdNacionalPersona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codTipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomTipoIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoTipoIdNacionalPersona", propOrder = {
    "codTipoIdentificacion",
    "nomTipoIdentificacion"
})
public class TipoTipoIdNacionalPersona {

    protected String codTipoIdentificacion;
    protected String nomTipoIdentificacion;

    /**
     * Gets the value of the codTipoIdentificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoIdentificacion() {
        return codTipoIdentificacion;
    }

    /**
     * Sets the value of the codTipoIdentificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoIdentificacion(String value) {
        this.codTipoIdentificacion = value;
    }

    /**
     * Gets the value of the nomTipoIdentificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomTipoIdentificacion() {
        return nomTipoIdentificacion;
    }

    /**
     * Sets the value of the nomTipoIdentificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomTipoIdentificacion(String value) {
        this.nomTipoIdentificacion = value;
    }

}
