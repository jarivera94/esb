
package co.com.ubi.enviarpdfcertificadolibertad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultarPDFPorPinResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultarPDFPorPinResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://enviarPDFCertificadoLibertad.ubi.com.co/}consultarCertificadoSal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultarPDFPorPinResponse", propOrder = {
    "_return"
})
public class ConsultarPDFPorPinResponse {

    @XmlElement(name = "return")
    protected ConsultarCertificadoSal _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link ConsultarCertificadoSal }
     *     
     */
    public ConsultarCertificadoSal getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsultarCertificadoSal }
     *     
     */
    public void setReturn(ConsultarCertificadoSal value) {
        this._return = value;
    }

}
