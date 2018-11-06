
package com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoResultadoCompleto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoResultadoCompleto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoLstCertificadoTradiciLibertEnt" type="{http://glass.aac.step.org/}tipoLstCertificadoTradiciLibertEnt" minOccurs="0"/>
 *         &lt;element name="tipoLstCertificadoTradiciLibertSal" type="{http://glass.aac.step.org/}tipoLstCertificadoTradiciLibertSal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoResultadoCompleto", propOrder = {
    "tipoLstCertificadoTradiciLibertEnt",
    "tipoLstCertificadoTradiciLibertSal"
})
public class TipoResultadoCompleto {

    protected TipoLstCertificadoTradiciLibertEnt tipoLstCertificadoTradiciLibertEnt;
    protected TipoLstCertificadoTradiciLibertSal tipoLstCertificadoTradiciLibertSal;

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

    /**
     * Gets the value of the tipoLstCertificadoTradiciLibertSal property.
     * 
     * @return
     *     possible object is
     *     {@link TipoLstCertificadoTradiciLibertSal }
     *     
     */
    public TipoLstCertificadoTradiciLibertSal getTipoLstCertificadoTradiciLibertSal() {
        return tipoLstCertificadoTradiciLibertSal;
    }

    /**
     * Sets the value of the tipoLstCertificadoTradiciLibertSal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoLstCertificadoTradiciLibertSal }
     *     
     */
    public void setTipoLstCertificadoTradiciLibertSal(TipoLstCertificadoTradiciLibertSal value) {
        this.tipoLstCertificadoTradiciLibertSal = value;
    }

}
