
package com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tipoLogResultadoConsulta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoLogResultadoConsulta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="consecutivoConsulta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="fechaHoraConsulta" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="identificacionNotaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="traza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoLogResultadoConsulta", propOrder = {
    "consecutivoConsulta",
    "fechaHoraConsulta",
    "identificacionNotaria",
    "mensaje",
    "traza"
})
public class TipoLogResultadoConsulta {

    protected Integer consecutivoConsulta;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaHoraConsulta;
    protected String identificacionNotaria;
    protected String mensaje;
    protected String traza;

    /**
     * Gets the value of the consecutivoConsulta property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsecutivoConsulta() {
        return consecutivoConsulta;
    }

    /**
     * Sets the value of the consecutivoConsulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsecutivoConsulta(Integer value) {
        this.consecutivoConsulta = value;
    }

    /**
     * Gets the value of the fechaHoraConsulta property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHoraConsulta() {
        return fechaHoraConsulta;
    }

    /**
     * Sets the value of the fechaHoraConsulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHoraConsulta(XMLGregorianCalendar value) {
        this.fechaHoraConsulta = value;
    }

    /**
     * Gets the value of the identificacionNotaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionNotaria() {
        return identificacionNotaria;
    }

    /**
     * Sets the value of the identificacionNotaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionNotaria(String value) {
        this.identificacionNotaria = value;
    }

    /**
     * Gets the value of the mensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Sets the value of the mensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Gets the value of the traza property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTraza() {
        return traza;
    }

    /**
     * Sets the value of the traza property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTraza(String value) {
        this.traza = value;
    }

}
