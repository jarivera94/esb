
package com.onesystem.edatel.catastro.sp.nodotierras;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for genCertPoseerNoPoseerNodoTierras complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="genCertPoseerNoPoseerNodoTierras">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombrePropietario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificadorEntidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "genCertPoseerNoPoseerNodoTierras", propOrder = {
    "tipoDocumento",
    "numeroDocumento",
    "nombrePropietario",
    "identificadorEntidad"
})
public class GenCertPoseerNoPoseerNodoTierras {

    protected String tipoDocumento;
    protected String numeroDocumento;
    protected String nombrePropietario;
    protected int identificadorEntidad;

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the numeroDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    /**
     * Sets the value of the numeroDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDocumento(String value) {
        this.numeroDocumento = value;
    }

    /**
     * Gets the value of the nombrePropietario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePropietario() {
        return nombrePropietario;
    }

    /**
     * Sets the value of the nombrePropietario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePropietario(String value) {
        this.nombrePropietario = value;
    }

    /**
     * Gets the value of the identificadorEntidad property.
     * 
     */
    public int getIdentificadorEntidad() {
        return identificadorEntidad;
    }

    /**
     * Sets the value of the identificadorEntidad property.
     * 
     */
    public void setIdentificadorEntidad(int value) {
        this.identificadorEntidad = value;
    }

}
