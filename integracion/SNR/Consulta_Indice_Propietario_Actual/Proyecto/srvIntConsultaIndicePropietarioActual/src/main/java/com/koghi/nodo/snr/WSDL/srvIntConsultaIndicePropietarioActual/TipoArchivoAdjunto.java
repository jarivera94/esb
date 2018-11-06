
package com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoArchivoAdjunto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoArchivoAdjunto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datoArchivoAdjunto" type="{http://glass.aac.step.org/}tipoDatoArchivoAdjunto" minOccurs="0"/>
 *         &lt;element name="nomArchivoAdjunto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoArchivoAjunto" type="{http://glass.aac.step.org/}tipoTipoArchivo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoArchivoAdjunto", propOrder = {
    "datoArchivoAdjunto",
    "nomArchivoAdjunto",
    "tipoArchivoAjunto"
})
public class TipoArchivoAdjunto {

    protected TipoDatoArchivoAdjunto datoArchivoAdjunto;
    protected String nomArchivoAdjunto;
    protected TipoTipoArchivo tipoArchivoAjunto;

    /**
     * Gets the value of the datoArchivoAdjunto property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDatoArchivoAdjunto }
     *     
     */
    public TipoDatoArchivoAdjunto getDatoArchivoAdjunto() {
        return datoArchivoAdjunto;
    }

    /**
     * Sets the value of the datoArchivoAdjunto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDatoArchivoAdjunto }
     *     
     */
    public void setDatoArchivoAdjunto(TipoDatoArchivoAdjunto value) {
        this.datoArchivoAdjunto = value;
    }

    /**
     * Gets the value of the nomArchivoAdjunto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomArchivoAdjunto() {
        return nomArchivoAdjunto;
    }

    /**
     * Sets the value of the nomArchivoAdjunto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomArchivoAdjunto(String value) {
        this.nomArchivoAdjunto = value;
    }

    /**
     * Gets the value of the tipoArchivoAjunto property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoArchivo }
     *     
     */
    public TipoTipoArchivo getTipoArchivoAjunto() {
        return tipoArchivoAjunto;
    }

    /**
     * Sets the value of the tipoArchivoAjunto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoArchivo }
     *     
     */
    public void setTipoArchivoAjunto(TipoTipoArchivo value) {
        this.tipoArchivoAjunto = value;
    }

}
