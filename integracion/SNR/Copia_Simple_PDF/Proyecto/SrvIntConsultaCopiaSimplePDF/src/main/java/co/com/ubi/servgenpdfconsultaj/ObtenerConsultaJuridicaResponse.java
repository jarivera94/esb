//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.04.30 at 12:20:45 PM COT 
//


package co.com.ubi.servgenpdfconsultaj;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obtenerConsultaJuridicaResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obtenerConsultaJuridicaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://servgenpdfconsultaj.ubi.com.co/}salidaServGenPDFConsultaJuridica" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerConsultaJuridicaResponse", propOrder = {
    "_return"
})
public class ObtenerConsultaJuridicaResponse {

    @XmlElement(name = "return")
    protected SalidaServGenPDFConsultaJuridica _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link SalidaServGenPDFConsultaJuridica }
     *     
     */
    public SalidaServGenPDFConsultaJuridica getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalidaServGenPDFConsultaJuridica }
     *     
     */
    public void setReturn(SalidaServGenPDFConsultaJuridica value) {
        this._return = value;
    }

}
