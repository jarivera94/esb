
package com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tipoRadicado complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoRadicado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entidadRadicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaRadicacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nombreMunicipioRadicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroRadicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoActoTurno" type="{http://glass.aac.step.org/}tipoActoTurno" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoRadicado", propOrder = {
    "descripcion",
    "entidadRadicacion",
    "fechaRadicacion",
    "nombreMunicipioRadicacion",
    "numeroRadicacion",
    "origen",
    "tipoActoTurno"
})
public class TipoRadicado {

    protected String descripcion;
    protected String entidadRadicacion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRadicacion;
    protected String nombreMunicipioRadicacion;
    protected String numeroRadicacion;
    protected String origen;
    @XmlElement(nillable = true)
    protected List<TipoActoTurno> tipoActoTurno;

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the entidadRadicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidadRadicacion() {
        return entidadRadicacion;
    }

    /**
     * Sets the value of the entidadRadicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidadRadicacion(String value) {
        this.entidadRadicacion = value;
    }

    /**
     * Gets the value of the fechaRadicacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRadicacion() {
        return fechaRadicacion;
    }

    /**
     * Sets the value of the fechaRadicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRadicacion(XMLGregorianCalendar value) {
        this.fechaRadicacion = value;
    }

    /**
     * Gets the value of the nombreMunicipioRadicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreMunicipioRadicacion() {
        return nombreMunicipioRadicacion;
    }

    /**
     * Sets the value of the nombreMunicipioRadicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreMunicipioRadicacion(String value) {
        this.nombreMunicipioRadicacion = value;
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
     * Gets the value of the origen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Sets the value of the origen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigen(String value) {
        this.origen = value;
    }

    /**
     * Gets the value of the tipoActoTurno property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoActoTurno property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoActoTurno().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoActoTurno }
     * 
     * 
     */
    public List<TipoActoTurno> getTipoActoTurno() {
        if (tipoActoTurno == null) {
            tipoActoTurno = new ArrayList<TipoActoTurno>();
        }
        return this.tipoActoTurno;
    }

}
