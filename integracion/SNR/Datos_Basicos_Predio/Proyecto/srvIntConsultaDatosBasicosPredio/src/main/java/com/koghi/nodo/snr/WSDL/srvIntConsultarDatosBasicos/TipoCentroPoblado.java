
package com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoCentroPoblado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoCentroPoblado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codCentroPobladoTerritorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomCentroPobladoTerritorio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCentroPoblado", propOrder = {
    "codCentroPobladoTerritorio",
    "nomCentroPobladoTerritorio"
})
public class TipoCentroPoblado {

    protected String codCentroPobladoTerritorio;
    protected String nomCentroPobladoTerritorio;

    /**
     * Gets the value of the codCentroPobladoTerritorio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCentroPobladoTerritorio() {
        return codCentroPobladoTerritorio;
    }

    /**
     * Sets the value of the codCentroPobladoTerritorio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCentroPobladoTerritorio(String value) {
        this.codCentroPobladoTerritorio = value;
    }

    /**
     * Gets the value of the nomCentroPobladoTerritorio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomCentroPobladoTerritorio() {
        return nomCentroPobladoTerritorio;
    }

    /**
     * Sets the value of the nomCentroPobladoTerritorio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomCentroPobladoTerritorio(String value) {
        this.nomCentroPobladoTerritorio = value;
    }

}
