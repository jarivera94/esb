
package com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoTipoPersona complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoTipoPersona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codTipoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomTipoPersona" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoTipoPersona", propOrder = {
    "codTipoPersona",
    "nomTipoPersona"
})
public class TipoTipoPersona {

    protected String codTipoPersona;
    protected String nomTipoPersona;

    /**
     * Gets the value of the codTipoPersona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoPersona() {
        return codTipoPersona;
    }

    /**
     * Sets the value of the codTipoPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoPersona(String value) {
        this.codTipoPersona = value;
    }

    /**
     * Gets the value of the nomTipoPersona property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomTipoPersona() {
        return nomTipoPersona;
    }

    /**
     * Sets the value of the nomTipoPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomTipoPersona(String value) {
        this.nomTipoPersona = value;
    }

}
