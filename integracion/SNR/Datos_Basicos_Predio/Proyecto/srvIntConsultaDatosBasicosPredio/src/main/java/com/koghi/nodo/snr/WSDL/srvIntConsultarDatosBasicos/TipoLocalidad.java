
package com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoLocalidad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoLocalidad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codLocalidad" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nomLocalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoLocalidad", propOrder = {
    "codLocalidad",
    "nomLocalidad"
})
public class TipoLocalidad {

    protected Long codLocalidad;
    protected String nomLocalidad;

    /**
     * Gets the value of the codLocalidad property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodLocalidad() {
        return codLocalidad;
    }

    /**
     * Sets the value of the codLocalidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodLocalidad(Long value) {
        this.codLocalidad = value;
    }

    /**
     * Gets the value of the nomLocalidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomLocalidad() {
        return nomLocalidad;
    }

    /**
     * Sets the value of the nomLocalidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomLocalidad(String value) {
        this.nomLocalidad = value;
    }

}
