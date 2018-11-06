
package com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tipoInformacionApertura complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionApertura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechaInstrumento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numeroRadicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoInstrumentoApertura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionApertura", propOrder = {
    "fechaInstrumento",
    "numeroRadicacion",
    "tipoInstrumentoApertura"
})
public class TipoInformacionApertura {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInstrumento;
    protected String numeroRadicacion;
    protected String tipoInstrumentoApertura;

    /**
     * Gets the value of the fechaInstrumento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInstrumento() {
        return fechaInstrumento;
    }

    /**
     * Sets the value of the fechaInstrumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInstrumento(XMLGregorianCalendar value) {
        this.fechaInstrumento = value;
    }

    /**
     * Gets the value of the numeroRadicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroRadicacion() {
        return numeroRadicacion;
    }

    /**
     * Sets the value of the numeroRadicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroRadicacion(String value) {
        this.numeroRadicacion = value;
    }

    /**
     * Gets the value of the tipoInstrumentoApertura property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoInstrumentoApertura() {
        return tipoInstrumentoApertura;
    }

    /**
     * Sets the value of the tipoInstrumentoApertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoInstrumentoApertura(String value) {
        this.tipoInstrumentoApertura = value;
    }

}
