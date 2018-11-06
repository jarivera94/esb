
package com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoTipoTitular complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoTipoTitular">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codTitularInmueble" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomTitularInmueble" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoTipoTitular", propOrder = {
    "codTitularInmueble",
    "nomTitularInmueble"
})
public class TipoTipoTitular {

    protected String codTitularInmueble;
    protected String nomTitularInmueble;

    /**
     * Gets the value of the codTitularInmueble property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTitularInmueble() {
        return codTitularInmueble;
    }

    /**
     * Sets the value of the codTitularInmueble property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTitularInmueble(String value) {
        this.codTitularInmueble = value;
    }

    /**
     * Gets the value of the nomTitularInmueble property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomTitularInmueble() {
        return nomTitularInmueble;
    }

    /**
     * Sets the value of the nomTitularInmueble property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomTitularInmueble(String value) {
        this.nomTitularInmueble = value;
    }

}
