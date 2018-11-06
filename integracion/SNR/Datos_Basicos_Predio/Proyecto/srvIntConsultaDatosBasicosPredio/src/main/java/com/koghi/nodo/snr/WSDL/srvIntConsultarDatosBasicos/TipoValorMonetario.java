
package com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoValorMonetario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoValorMonetario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantidadMonetaria" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="codTipoMoneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tasaCambio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoValorMonetario", propOrder = {
    "cantidadMonetaria",
    "codTipoMoneda",
    "tasaCambio"
})
public class TipoValorMonetario {

    protected Double cantidadMonetaria;
    protected String codTipoMoneda;
    protected Double tasaCambio;

    /**
     * Gets the value of the cantidadMonetaria property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCantidadMonetaria() {
        return cantidadMonetaria;
    }

    /**
     * Sets the value of the cantidadMonetaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCantidadMonetaria(Double value) {
        this.cantidadMonetaria = value;
    }

    /**
     * Gets the value of the codTipoMoneda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoMoneda() {
        return codTipoMoneda;
    }

    /**
     * Sets the value of the codTipoMoneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoMoneda(String value) {
        this.codTipoMoneda = value;
    }

    /**
     * Gets the value of the tasaCambio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTasaCambio() {
        return tasaCambio;
    }

    /**
     * Sets the value of the tasaCambio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTasaCambio(Double value) {
        this.tasaCambio = value;
    }

}
