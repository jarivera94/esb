
package com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoListaAnotacionCertificaTradici complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoListaAnotacionCertificaTradici">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anotacionCertificadoTradicion" type="{http://glass.aac.step.org/}tipoAnotacion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoListaAnotacionCertificaTradici", propOrder = {
    "anotacionCertificadoTradicion"
})
public class TipoListaAnotacionCertificaTradici {

    @XmlElement(nillable = true)
    protected List<TipoAnotacion> anotacionCertificadoTradicion;

    /**
     * Gets the value of the anotacionCertificadoTradicion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the anotacionCertificadoTradicion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnotacionCertificadoTradicion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoAnotacion }
     * 
     * 
     */
    public List<TipoAnotacion> getAnotacionCertificadoTradicion() {
        if (anotacionCertificadoTradicion == null) {
            anotacionCertificadoTradicion = new ArrayList<TipoAnotacion>();
        }
        return this.anotacionCertificadoTradicion;
    }

}
