
package com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoConcentracionPoblacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoConcentracionPoblacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codConcentracionPoblacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomConcentracionPoblacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoConcentracionPoblacion", propOrder = {
    "codConcentracionPoblacion",
    "nomConcentracionPoblacion"
})
public class TipoConcentracionPoblacion {

    protected String codConcentracionPoblacion;
    protected String nomConcentracionPoblacion;

    /**
     * Gets the value of the codConcentracionPoblacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodConcentracionPoblacion() {
        return codConcentracionPoblacion;
    }

    /**
     * Sets the value of the codConcentracionPoblacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodConcentracionPoblacion(String value) {
        this.codConcentracionPoblacion = value;
    }

    /**
     * Gets the value of the nomConcentracionPoblacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomConcentracionPoblacion() {
        return nomConcentracionPoblacion;
    }

    /**
     * Sets the value of the nomConcentracionPoblacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomConcentracionPoblacion(String value) {
        this.nomConcentracionPoblacion = value;
    }

}
