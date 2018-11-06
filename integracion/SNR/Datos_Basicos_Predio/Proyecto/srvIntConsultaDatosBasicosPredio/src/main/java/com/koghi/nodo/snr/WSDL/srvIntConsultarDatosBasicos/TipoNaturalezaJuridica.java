
package com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoNaturalezaJuridica complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoNaturalezaJuridica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomNaturalezaJuridicaFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoNaturalezaJuridica", propOrder = {
    "codNaturalezaJuridicaFolio",
    "nomNaturalezaJuridicaFolio"
})
public class TipoNaturalezaJuridica {

    protected String codNaturalezaJuridicaFolio;
    protected String nomNaturalezaJuridicaFolio;

    /**
     * Gets the value of the codNaturalezaJuridicaFolio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodNaturalezaJuridicaFolio() {
        return codNaturalezaJuridicaFolio;
    }

    /**
     * Sets the value of the codNaturalezaJuridicaFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodNaturalezaJuridicaFolio(String value) {
        this.codNaturalezaJuridicaFolio = value;
    }

    /**
     * Gets the value of the nomNaturalezaJuridicaFolio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomNaturalezaJuridicaFolio() {
        return nomNaturalezaJuridicaFolio;
    }

    /**
     * Sets the value of the nomNaturalezaJuridicaFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomNaturalezaJuridicaFolio(String value) {
        this.nomNaturalezaJuridicaFolio = value;
    }

}
