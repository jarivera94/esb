
package com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tipoDocumentoAnotacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoDocumentoAnotacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codDocumentoAnotacionFolio" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="fechaDocumentoAnotacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nomDocumentoAnotacionFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDocumentoAnotacion", propOrder = {
    "codDocumentoAnotacionFolio",
    "fechaDocumentoAnotacion",
    "nomDocumentoAnotacionFolio"
})
public class TipoDocumentoAnotacion {

    protected Long codDocumentoAnotacionFolio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDocumentoAnotacion;
    protected String nomDocumentoAnotacionFolio;

    /**
     * Gets the value of the codDocumentoAnotacionFolio property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodDocumentoAnotacionFolio() {
        return codDocumentoAnotacionFolio;
    }

    /**
     * Sets the value of the codDocumentoAnotacionFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodDocumentoAnotacionFolio(Long value) {
        this.codDocumentoAnotacionFolio = value;
    }

    /**
     * Gets the value of the fechaDocumentoAnotacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDocumentoAnotacion() {
        return fechaDocumentoAnotacion;
    }

    /**
     * Sets the value of the fechaDocumentoAnotacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDocumentoAnotacion(XMLGregorianCalendar value) {
        this.fechaDocumentoAnotacion = value;
    }

    /**
     * Gets the value of the nomDocumentoAnotacionFolio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomDocumentoAnotacionFolio() {
        return nomDocumentoAnotacionFolio;
    }

    /**
     * Sets the value of the nomDocumentoAnotacionFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomDocumentoAnotacionFolio(String value) {
        this.nomDocumentoAnotacionFolio = value;
    }

}
