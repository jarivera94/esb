
package org.datacontract.schemas._2004._07.wcf_daicma_eventos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ClsEventos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClsEventos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodDaneDepartamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CodDaneMunicipio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CodImsmaEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CoordenadasTomadasCon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescripcionEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Evento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaEvento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Latitud" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Longitud" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Municipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PresuntoActorResponsable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sitio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoEvento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoLugar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsEventos", propOrder = {
    "codDaneDepartamento",
    "codDaneMunicipio",
    "codImsmaEvento",
    "coordenadasTomadasCon",
    "departamento",
    "descripcionEvento",
    "estado",
    "evento",
    "fechaEvento",
    "latitud",
    "longitud",
    "municipio",
    "presuntoActorResponsable",
    "sitio",
    "tipoArea",
    "tipoEvento",
    "tipoLugar"
})
public class ClsEventos {

    @XmlElement(name = "CodDaneDepartamento")
    protected Integer codDaneDepartamento;
    @XmlElement(name = "CodDaneMunicipio")
    protected Integer codDaneMunicipio;
    @XmlElementRef(name = "CodImsmaEvento", namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codImsmaEvento;
    @XmlElementRef(name = "CoordenadasTomadasCon", namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> coordenadasTomadasCon;
    @XmlElementRef(name = "Departamento", namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departamento;
    @XmlElementRef(name = "DescripcionEvento", namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionEvento;
    @XmlElementRef(name = "Estado", namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> estado;
    @XmlElementRef(name = "Evento", namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> evento;
    @XmlElement(name = "FechaEvento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEvento;
    @XmlElement(name = "Latitud")
    protected Double latitud;
    @XmlElement(name = "Longitud")
    protected Double longitud;
    @XmlElementRef(name = "Municipio", namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> municipio;
    @XmlElementRef(name = "PresuntoActorResponsable", namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> presuntoActorResponsable;
    @XmlElementRef(name = "Sitio", namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sitio;
    @XmlElementRef(name = "TipoArea", namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoArea;
    @XmlElementRef(name = "TipoEvento", namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoEvento;
    @XmlElementRef(name = "TipoLugar", namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoLugar;

    /**
     * Gets the value of the codDaneDepartamento property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodDaneDepartamento() {
        return codDaneDepartamento;
    }

    /**
     * Sets the value of the codDaneDepartamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodDaneDepartamento(Integer value) {
        this.codDaneDepartamento = value;
    }

    /**
     * Gets the value of the codDaneMunicipio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodDaneMunicipio() {
        return codDaneMunicipio;
    }

    /**
     * Sets the value of the codDaneMunicipio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodDaneMunicipio(Integer value) {
        this.codDaneMunicipio = value;
    }

    /**
     * Gets the value of the codImsmaEvento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodImsmaEvento() {
        return codImsmaEvento;
    }

    /**
     * Sets the value of the codImsmaEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodImsmaEvento(JAXBElement<String> value) {
        this.codImsmaEvento = value;
    }

    /**
     * Gets the value of the coordenadasTomadasCon property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCoordenadasTomadasCon() {
        return coordenadasTomadasCon;
    }

    /**
     * Sets the value of the coordenadasTomadasCon property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCoordenadasTomadasCon(JAXBElement<String> value) {
        this.coordenadasTomadasCon = value;
    }

    /**
     * Gets the value of the departamento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartamento() {
        return departamento;
    }

    /**
     * Sets the value of the departamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartamento(JAXBElement<String> value) {
        this.departamento = value;
    }

    /**
     * Gets the value of the descripcionEvento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionEvento() {
        return descripcionEvento;
    }

    /**
     * Sets the value of the descripcionEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionEvento(JAXBElement<String> value) {
        this.descripcionEvento = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEstado(JAXBElement<String> value) {
        this.estado = value;
    }

    /**
     * Gets the value of the evento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEvento() {
        return evento;
    }

    /**
     * Sets the value of the evento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEvento(JAXBElement<String> value) {
        this.evento = value;
    }

    /**
     * Gets the value of the fechaEvento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEvento() {
        return fechaEvento;
    }

    /**
     * Sets the value of the fechaEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEvento(XMLGregorianCalendar value) {
        this.fechaEvento = value;
    }

    /**
     * Gets the value of the latitud property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLatitud() {
        return latitud;
    }

    /**
     * Sets the value of the latitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLatitud(Double value) {
        this.latitud = value;
    }

    /**
     * Gets the value of the longitud property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLongitud() {
        return longitud;
    }

    /**
     * Sets the value of the longitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLongitud(Double value) {
        this.longitud = value;
    }

    /**
     * Gets the value of the municipio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMunicipio() {
        return municipio;
    }

    /**
     * Sets the value of the municipio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMunicipio(JAXBElement<String> value) {
        this.municipio = value;
    }

    /**
     * Gets the value of the presuntoActorResponsable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPresuntoActorResponsable() {
        return presuntoActorResponsable;
    }

    /**
     * Sets the value of the presuntoActorResponsable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPresuntoActorResponsable(JAXBElement<String> value) {
        this.presuntoActorResponsable = value;
    }

    /**
     * Gets the value of the sitio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSitio() {
        return sitio;
    }

    /**
     * Sets the value of the sitio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSitio(JAXBElement<String> value) {
        this.sitio = value;
    }

    /**
     * Gets the value of the tipoArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoArea() {
        return tipoArea;
    }

    /**
     * Sets the value of the tipoArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoArea(JAXBElement<String> value) {
        this.tipoArea = value;
    }

    /**
     * Gets the value of the tipoEvento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoEvento() {
        return tipoEvento;
    }

    /**
     * Sets the value of the tipoEvento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoEvento(JAXBElement<String> value) {
        this.tipoEvento = value;
    }

    /**
     * Gets the value of the tipoLugar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoLugar() {
        return tipoLugar;
    }

    /**
     * Sets the value of the tipoLugar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoLugar(JAXBElement<String> value) {
        this.tipoLugar = value;
    }

	@Override
	public String toString() {
		return "ClsEventos [codDaneDepartamento=" + codDaneDepartamento + ", codDaneMunicipio=" + codDaneMunicipio
				+ ", codImsmaEvento=" + codImsmaEvento + ", coordenadasTomadasCon=" + coordenadasTomadasCon
				+ ", departamento=" + departamento + ", descripcionEvento=" + descripcionEvento + ", estado=" + estado
				+ ", evento=" + evento + ", fechaEvento=" + fechaEvento + ", latitud=" + latitud + ", longitud="
				+ longitud + ", municipio=" + municipio + ", presuntoActorResponsable=" + presuntoActorResponsable
				+ ", sitio=" + sitio + ", tipoArea=" + tipoArea + ", tipoEvento=" + tipoEvento + ", tipoLugar="
				+ tipoLugar + "]";
	}
    
    

}
