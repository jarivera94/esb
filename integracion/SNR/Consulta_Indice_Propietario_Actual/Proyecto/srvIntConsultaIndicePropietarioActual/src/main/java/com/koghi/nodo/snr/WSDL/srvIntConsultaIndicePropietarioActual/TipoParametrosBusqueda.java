
package com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoParametrosBusqueda complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoParametrosBusqueda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoConsulta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoLstCertificadoTradiciLibertEnt" type="{http://glass.aac.step.org/}tipoLstCertificadoTradiciLibertEnt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoParametrosBusqueda", propOrder = {
    "tipoConsulta",
    "tipoLstCertificadoTradiciLibertEnt"
})
public class TipoParametrosBusqueda {

    protected String tipoConsulta;
    protected TipoLstCertificadoTradiciLibertEnt tipoLstCertificadoTradiciLibertEnt;

    /**
     * Gets the value of the tipoConsulta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoConsulta() {
        return tipoConsulta;
    }

    /**
     * Sets the value of the tipoConsulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoConsulta(String value) {
        this.tipoConsulta = value;
    }

    /**
     * Gets the value of the tipoLstCertificadoTradiciLibertEnt property.
     * 
     * @return
     *     possible object is
     *     {@link TipoLstCertificadoTradiciLibertEnt }
     *     
     */
    public TipoLstCertificadoTradiciLibertEnt getTipoLstCertificadoTradiciLibertEnt() {
        return tipoLstCertificadoTradiciLibertEnt;
    }

    /**
     * Sets the value of the tipoLstCertificadoTradiciLibertEnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoLstCertificadoTradiciLibertEnt }
     *     
     */
    public void setTipoLstCertificadoTradiciLibertEnt(TipoLstCertificadoTradiciLibertEnt value) {
        this.tipoLstCertificadoTradiciLibertEnt = value;
    }

}
