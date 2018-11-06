
package org.step.aac.glass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoLstEstadoJuridicoInmuebleSal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoLstEstadoJuridicoInmuebleSal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaAnotacionEstadoJuridico" type="{http://glass.aac.step.org/}tipoListaAnotacionCertificaTradici" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoLstEstadoJuridicoInmuebleSal", propOrder = {
    "listaAnotacionEstadoJuridico"
})
public class TipoLstEstadoJuridicoInmuebleSal {

    protected TipoListaAnotacionCertificaTradici listaAnotacionEstadoJuridico;

    /**
     * Gets the value of the listaAnotacionEstadoJuridico property.
     * 
     * @return
     *     possible object is
     *     {@link TipoListaAnotacionCertificaTradici }
     *     
     */
    public TipoListaAnotacionCertificaTradici getListaAnotacionEstadoJuridico() {
        return listaAnotacionEstadoJuridico;
    }

    /**
     * Sets the value of the listaAnotacionEstadoJuridico property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoListaAnotacionCertificaTradici }
     *     
     */
    public void setListaAnotacionEstadoJuridico(TipoListaAnotacionCertificaTradici value) {
        this.listaAnotacionEstadoJuridico = value;
    }

}
