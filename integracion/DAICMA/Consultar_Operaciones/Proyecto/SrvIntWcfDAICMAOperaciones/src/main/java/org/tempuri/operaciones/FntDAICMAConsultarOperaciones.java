
package org.tempuri.operaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="intCodDaneDepto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="intCodDaneMunicipio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="intAaaaFechaOperacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="intMmFechaOperacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "intCodDaneDepto",
    "intCodDaneMunicipio",
    "intAaaaFechaOperacion",
    "intMmFechaOperacion"
})
@XmlRootElement(name = "fnt_DAICMA_ConsultarOperaciones")
public class FntDAICMAConsultarOperaciones {

    protected Integer intCodDaneDepto;
    protected Integer intCodDaneMunicipio;
    protected Integer intAaaaFechaOperacion;
    protected Integer intMmFechaOperacion;

    /**
     * Gets the value of the intCodDaneDepto property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntCodDaneDepto() {
        return intCodDaneDepto;
    }

    /**
     * Sets the value of the intCodDaneDepto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntCodDaneDepto(Integer value) {
        this.intCodDaneDepto = value;
    }

    /**
     * Gets the value of the intCodDaneMunicipio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntCodDaneMunicipio() {
        return intCodDaneMunicipio;
    }

    /**
     * Sets the value of the intCodDaneMunicipio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntCodDaneMunicipio(Integer value) {
        this.intCodDaneMunicipio = value;
    }

    /**
     * Gets the value of the intAaaaFechaOperacion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntAaaaFechaOperacion() {
        return intAaaaFechaOperacion;
    }

    /**
     * Sets the value of the intAaaaFechaOperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntAaaaFechaOperacion(Integer value) {
        this.intAaaaFechaOperacion = value;
    }

    /**
     * Gets the value of the intMmFechaOperacion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntMmFechaOperacion() {
        return intMmFechaOperacion;
    }

    /**
     * Sets the value of the intMmFechaOperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntMmFechaOperacion(Integer value) {
        this.intMmFechaOperacion = value;
    }

}
