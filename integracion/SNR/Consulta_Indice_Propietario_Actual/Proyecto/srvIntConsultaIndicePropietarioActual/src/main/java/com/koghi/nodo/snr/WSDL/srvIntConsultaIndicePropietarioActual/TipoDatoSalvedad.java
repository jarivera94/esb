
package com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tipoDatoSalvedad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoDatoSalvedad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comentarioSalvedadFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcionSalvedadFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaSalvedad" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="numeroAnotacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="numeroCorreccion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="radicacionAnotacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="radicacionSalvedad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDatoSalvedad", propOrder = {
    "comentarioSalvedadFolio",
    "descripcionSalvedadFolio",
    "fechaSalvedad",
    "numeroAnotacion",
    "numeroCorreccion",
    "radicacionAnotacion",
    "radicacionSalvedad"
})
public class TipoDatoSalvedad {

    protected String comentarioSalvedadFolio;
    protected String descripcionSalvedadFolio;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaSalvedad;
    protected Integer numeroAnotacion;
    protected Integer numeroCorreccion;
    protected String radicacionAnotacion;
    protected String radicacionSalvedad;

    /**
     * Gets the value of the comentarioSalvedadFolio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentarioSalvedadFolio() {
        return comentarioSalvedadFolio;
    }

    /**
     * Sets the value of the comentarioSalvedadFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentarioSalvedadFolio(String value) {
        this.comentarioSalvedadFolio = value;
    }

    /**
     * Gets the value of the descripcionSalvedadFolio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionSalvedadFolio() {
        return descripcionSalvedadFolio;
    }

    /**
     * Sets the value of the descripcionSalvedadFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionSalvedadFolio(String value) {
        this.descripcionSalvedadFolio = value;
    }

    /**
     * Gets the value of the fechaSalvedad property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaSalvedad() {
        return fechaSalvedad;
    }

    /**
     * Sets the value of the fechaSalvedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaSalvedad(XMLGregorianCalendar value) {
        this.fechaSalvedad = value;
    }

    /**
     * Gets the value of the numeroAnotacion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroAnotacion() {
        return numeroAnotacion;
    }

    /**
     * Sets the value of the numeroAnotacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroAnotacion(Integer value) {
        this.numeroAnotacion = value;
    }

    /**
     * Gets the value of the numeroCorreccion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroCorreccion() {
        return numeroCorreccion;
    }

    /**
     * Sets the value of the numeroCorreccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroCorreccion(Integer value) {
        this.numeroCorreccion = value;
    }

    /**
     * Gets the value of the radicacionAnotacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadicacionAnotacion() {
        return radicacionAnotacion;
    }

    /**
     * Sets the value of the radicacionAnotacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadicacionAnotacion(String value) {
        this.radicacionAnotacion = value;
    }

    /**
     * Gets the value of the radicacionSalvedad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadicacionSalvedad() {
        return radicacionSalvedad;
    }

    /**
     * Sets the value of the radicacionSalvedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadicacionSalvedad(String value) {
        this.radicacionSalvedad = value;
    }

}
