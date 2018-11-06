
package org.tempuri.operaciones;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.wcf_daicma_operaciones.ArrayOfClsOperaciones;


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
 *         &lt;element name="fnt_DAICMA_ConsultarOperacionesResult" type="{http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones}ArrayOfClsOperaciones" minOccurs="0"/>
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
    "fntDAICMAConsultarOperacionesResult"
})
@XmlRootElement(name = "fnt_DAICMA_ConsultarOperacionesResponse")
public class FntDAICMAConsultarOperacionesResponse {

    @XmlElementRef(name = "fnt_DAICMA_ConsultarOperacionesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfClsOperaciones> fntDAICMAConsultarOperacionesResult;

    /**
     * Gets the value of the fntDAICMAConsultarOperacionesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClsOperaciones }{@code >}
     *     
     */
    public JAXBElement<ArrayOfClsOperaciones> getFntDAICMAConsultarOperacionesResult() {
        return fntDAICMAConsultarOperacionesResult;
    }

    /**
     * Sets the value of the fntDAICMAConsultarOperacionesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfClsOperaciones }{@code >}
     *     
     */
    public void setFntDAICMAConsultarOperacionesResult(JAXBElement<ArrayOfClsOperaciones> value) {
        this.fntDAICMAConsultarOperacionesResult = value;
    }

}
