
package org.tempuri.srvIntConsultaEventos;

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
 *         &lt;element name="intAaaaFechaEvento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="intMmFechaEvento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "intAaaaFechaEvento",
    "intMmFechaEvento"
})
@XmlRootElement(name = "fnt_DAICMA_ConsultarEventos")
public class FntDAICMAConsultarEventos {

    protected Integer intCodDaneDepto;
    protected Integer intCodDaneMunicipio;
    protected Integer intAaaaFechaEvento;
    protected Integer intMmFechaEvento;

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
     * Gets the value of the intAaaaFechaEvento property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntAaaaFechaEvento() {
        return intAaaaFechaEvento;
    }

    /**
     * Sets the value of the intAaaaFechaEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntAaaaFechaEvento(Integer value) {
        this.intAaaaFechaEvento = value;
    }

    /**
     * Gets the value of the intMmFechaEvento property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIntMmFechaEvento() {
        return intMmFechaEvento;
    }

    /**
     * Sets the value of the intMmFechaEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIntMmFechaEvento(Integer value) {
        this.intMmFechaEvento = value;
    }

}
