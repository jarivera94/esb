
package co.gov.gobiernoenlinea.gel_xml._1_0.schemas.proyectos.minagricultura.sipov;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tipoOrden complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoOrden">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accionDerivOrden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aclaraciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diasTranscurridosPlazo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaGestion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="limitacionesObstaculos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tramiteEfectuado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoOrden", propOrder = {
    "accionDerivOrden",
    "aclaraciones",
    "diasTranscurridosPlazo",
    "fechaGestion",
    "limitacionesObstaculos",
    "observaciones",
    "tramiteEfectuado"
})
public class TipoOrden {

    protected String accionDerivOrden;
    protected String aclaraciones;
    protected String diasTranscurridosPlazo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaGestion;
    protected String limitacionesObstaculos;
    protected String observaciones;
    protected String tramiteEfectuado;

    /**
     * Gets the value of the accionDerivOrden property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccionDerivOrden() {
        return accionDerivOrden;
    }

    /**
     * Sets the value of the accionDerivOrden property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccionDerivOrden(String value) {
        this.accionDerivOrden = value;
    }

    /**
     * Gets the value of the aclaraciones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAclaraciones() {
        return aclaraciones;
    }

    /**
     * Sets the value of the aclaraciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAclaraciones(String value) {
        this.aclaraciones = value;
    }

    /**
     * Gets the value of the diasTranscurridosPlazo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiasTranscurridosPlazo() {
        return diasTranscurridosPlazo;
    }

    /**
     * Sets the value of the diasTranscurridosPlazo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiasTranscurridosPlazo(String value) {
        this.diasTranscurridosPlazo = value;
    }

    /**
     * Gets the value of the fechaGestion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaGestion() {
        return fechaGestion;
    }

    /**
     * Sets the value of the fechaGestion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaGestion(XMLGregorianCalendar value) {
        this.fechaGestion = value;
    }

    /**
     * Gets the value of the limitacionesObstaculos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitacionesObstaculos() {
        return limitacionesObstaculos;
    }

    /**
     * Sets the value of the limitacionesObstaculos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitacionesObstaculos(String value) {
        this.limitacionesObstaculos = value;
    }

    /**
     * Gets the value of the observaciones property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Sets the value of the observaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    /**
     * Gets the value of the tramiteEfectuado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTramiteEfectuado() {
        return tramiteEfectuado;
    }

    /**
     * Sets the value of the tramiteEfectuado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTramiteEfectuado(String value) {
        this.tramiteEfectuado = value;
    }

}
