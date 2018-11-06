
package com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoTipoPersonaJuridica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoTipoPersonaJuridica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codTipoPersonaJuridica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomTipoPersonaJuridica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoTipoPersonaJuridica", propOrder = {
    "codTipoPersonaJuridica",
    "nomTipoPersonaJuridica"
})
public class TipoTipoPersonaJuridica {

    protected String codTipoPersonaJuridica;
    protected String nomTipoPersonaJuridica;

    /**
     * Gets the value of the codTipoPersonaJuridica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoPersonaJuridica() {
        return codTipoPersonaJuridica;
    }

    /**
     * Sets the value of the codTipoPersonaJuridica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoPersonaJuridica(String value) {
        this.codTipoPersonaJuridica = value;
    }

    /**
     * Gets the value of the nomTipoPersonaJuridica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomTipoPersonaJuridica() {
        return nomTipoPersonaJuridica;
    }

    /**
     * Sets the value of the nomTipoPersonaJuridica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomTipoPersonaJuridica(String value) {
        this.nomTipoPersonaJuridica = value;
    }

}
