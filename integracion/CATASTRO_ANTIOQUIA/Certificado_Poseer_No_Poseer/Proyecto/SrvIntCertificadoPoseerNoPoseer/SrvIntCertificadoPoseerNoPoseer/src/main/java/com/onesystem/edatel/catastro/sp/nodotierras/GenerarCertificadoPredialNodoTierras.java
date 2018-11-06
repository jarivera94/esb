
package com.onesystem.edatel.catastro.sp.nodotierras;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generarCertificadoPredialNodoTierras complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generarCertificadoPredialNodoTierras">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fichaPredial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="matriculaCompleta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroPredialNacional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "generarCertificadoPredialNodoTierras", propOrder = {
    "fichaPredial",
    "matriculaCompleta",
    "numeroPredialNacional",
    "identificadorEntidad"
})
public class GenerarCertificadoPredialNodoTierras {

    protected String fichaPredial;
    protected String matriculaCompleta;
    protected String numeroPredialNacional;
    protected int identificadorEntidad;

    /**
     * Gets the value of the fichaPredial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFichaPredial() {
        return fichaPredial;
    }

    /**
     * Sets the value of the fichaPredial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFichaPredial(String value) {
        this.fichaPredial = value;
    }

    /**
     * Gets the value of the matriculaCompleta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculaCompleta() {
        return matriculaCompleta;
    }

    /**
     * Sets the value of the matriculaCompleta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculaCompleta(String value) {
        this.matriculaCompleta = value;
    }

    /**
     * Gets the value of the numeroPredialNacional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPredialNacional() {
        return numeroPredialNacional;
    }

    /**
     * Sets the value of the numeroPredialNacional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPredialNacional(String value) {
        this.numeroPredialNacional = value;
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
