
package org.step.aac.glass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultaEstadoJuridicoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultaEstadoJuridicoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://glass.aac.step.org/}tipoEstadoJuridicoInmuebleSal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaEstadoJuridicoResponse", propOrder = {
    "_return"
})
public class ConsultaEstadoJuridicoResponse {

    @XmlElement(name = "return")
    protected TipoEstadoJuridicoInmuebleSal _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstadoJuridicoInmuebleSal }
     *     
     */
    public TipoEstadoJuridicoInmuebleSal getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstadoJuridicoInmuebleSal }
     *     
     */
    public void setReturn(TipoEstadoJuridicoInmuebleSal value) {
        this._return = value;
    }

}
