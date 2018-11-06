
package com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoClaseConcentracionPoblacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoClaseConcentracionPoblacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codClaseConcentracionPoblacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomClaseConcentracionPoblacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoClaseConcentracionPoblacion", propOrder = {
    "codClaseConcentracionPoblacion",
    "nomClaseConcentracionPoblacion"
})
public class TipoClaseConcentracionPoblacion {

    protected String codClaseConcentracionPoblacion;
    protected String nomClaseConcentracionPoblacion;

    /**
     * Gets the value of the codClaseConcentracionPoblacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodClaseConcentracionPoblacion() {
        return codClaseConcentracionPoblacion;
    }

    /**
     * Sets the value of the codClaseConcentracionPoblacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodClaseConcentracionPoblacion(String value) {
        this.codClaseConcentracionPoblacion = value;
    }

    /**
     * Gets the value of the nomClaseConcentracionPoblacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomClaseConcentracionPoblacion() {
        return nomClaseConcentracionPoblacion;
    }

    /**
     * Sets the value of the nomClaseConcentracionPoblacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomClaseConcentracionPoblacion(String value) {
        this.nomClaseConcentracionPoblacion = value;
    }

}
