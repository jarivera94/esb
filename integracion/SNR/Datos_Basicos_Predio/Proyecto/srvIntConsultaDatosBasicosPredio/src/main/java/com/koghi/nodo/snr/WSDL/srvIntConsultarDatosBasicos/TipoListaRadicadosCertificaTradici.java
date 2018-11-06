
package com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoListaRadicadosCertificaTradici complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoListaRadicadosCertificaTradici">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="radicadoCertificadoTradicion" type="{http://glass.aac.step.org/}tipoRadicado" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoListaRadicadosCertificaTradici", propOrder = {
    "radicadoCertificadoTradicion"
})
public class TipoListaRadicadosCertificaTradici {

    @XmlElement(nillable = true)
    protected List<TipoRadicado> radicadoCertificadoTradicion;

    /**
     * Gets the value of the radicadoCertificadoTradicion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radicadoCertificadoTradicion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadicadoCertificadoTradicion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoRadicado }
     * 
     * 
     */
    public List<TipoRadicado> getRadicadoCertificadoTradicion() {
        if (radicadoCertificadoTradicion == null) {
            radicadoCertificadoTradicion = new ArrayList<TipoRadicado>();
        }
        return this.radicadoCertificadoTradicion;
    }

}
