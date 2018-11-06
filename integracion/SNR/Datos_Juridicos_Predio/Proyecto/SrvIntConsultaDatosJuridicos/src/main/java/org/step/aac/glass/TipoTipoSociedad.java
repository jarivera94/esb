
package org.step.aac.glass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoTipoSociedad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoTipoSociedad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codTipoSociedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomTipoSociedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoTipoSociedad", propOrder = {
    "codTipoSociedad",
    "nomTipoSociedad"
})
public class TipoTipoSociedad {

    protected String codTipoSociedad;
    protected String nomTipoSociedad;

    /**
     * Gets the value of the codTipoSociedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoSociedad() {
        return codTipoSociedad;
    }

    /**
     * Sets the value of the codTipoSociedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoSociedad(String value) {
        this.codTipoSociedad = value;
    }

    /**
     * Gets the value of the nomTipoSociedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomTipoSociedad() {
        return nomTipoSociedad;
    }

    /**
     * Sets the value of the nomTipoSociedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomTipoSociedad(String value) {
        this.nomTipoSociedad = value;
    }

}
