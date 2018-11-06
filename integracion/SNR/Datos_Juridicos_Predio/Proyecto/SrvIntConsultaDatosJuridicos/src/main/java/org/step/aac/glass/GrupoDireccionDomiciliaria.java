
package org.step.aac.glass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for grupoDireccionDomiciliaria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="grupoDireccionDomiciliaria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="direccionNacionalRural" type="{http://glass.aac.step.org/}tipoDireccionNacionalRural" minOccurs="0"/>
 *         &lt;element name="direccionNacionalUrbana" type="{http://glass.aac.step.org/}tipoDireccionNacionalUrbana" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grupoDireccionDomiciliaria", propOrder = {
    "direccionNacionalRural",
    "direccionNacionalUrbana"
})
public class GrupoDireccionDomiciliaria {

    protected TipoDireccionNacionalRural direccionNacionalRural;
    protected TipoDireccionNacionalUrbana direccionNacionalUrbana;

    /**
     * Gets the value of the direccionNacionalRural property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDireccionNacionalRural }
     *     
     */
    public TipoDireccionNacionalRural getDireccionNacionalRural() {
        return direccionNacionalRural;
    }

    /**
     * Sets the value of the direccionNacionalRural property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDireccionNacionalRural }
     *     
     */
    public void setDireccionNacionalRural(TipoDireccionNacionalRural value) {
        this.direccionNacionalRural = value;
    }

    /**
     * Gets the value of the direccionNacionalUrbana property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDireccionNacionalUrbana }
     *     
     */
    public TipoDireccionNacionalUrbana getDireccionNacionalUrbana() {
        return direccionNacionalUrbana;
    }

    /**
     * Sets the value of the direccionNacionalUrbana property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDireccionNacionalUrbana }
     *     
     */
    public void setDireccionNacionalUrbana(TipoDireccionNacionalUrbana value) {
        this.direccionNacionalUrbana = value;
    }

}
