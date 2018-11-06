
package co.com.ubi.enviarpdfcertificadolibertad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for obtenerPDF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="obtenerPDF">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entrada" type="{http://enviarPDFCertificadoLibertad.ubi.com.co/}certificadoLibertadPDFEnt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerPDF", propOrder = {
    "entrada"
})
public class ObtenerPDF {

    protected CertificadoLibertadPDFEnt entrada;

    /**
     * Gets the value of the entrada property.
     * 
     * @return
     *     possible object is
     *     {@link CertificadoLibertadPDFEnt }
     *     
     */
    public CertificadoLibertadPDFEnt getEntrada() {
        return entrada;
    }

    /**
     * Sets the value of the entrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link CertificadoLibertadPDFEnt }
     *     
     */
    public void setEntrada(CertificadoLibertadPDFEnt value) {
        this.entrada = value;
    }

}
