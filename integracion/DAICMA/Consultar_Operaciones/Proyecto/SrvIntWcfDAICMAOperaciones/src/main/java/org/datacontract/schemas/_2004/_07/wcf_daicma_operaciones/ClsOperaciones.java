
package org.datacontract.schemas._2004._07.wcf_daicma_operaciones;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ClsOperaciones complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClsOperaciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AreaDespejada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodDaneDepartamento" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CodDaneMunicipio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Departamento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaFinalizacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaOperacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="HazReducLocalid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitud" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Longitud" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Map" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Municipio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Muse" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Organizacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoDesminado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClsOperaciones", propOrder = {
    "areaDespejada",
    "codDaneDepartamento",
    "codDaneMunicipio",
    "departamento",
    "fechaFinalizacion",
    "fechaOperacion",
    "hazReducLocalid",
    "latitud",
    "longitud",
    "map",
    "municipio",
    "muse",
    "organizacion",
    "tipoDesminado",
    "tipoOperacion"
})
public class ClsOperaciones {

    @XmlElementRef(name = "AreaDespejada", namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> areaDespejada;
    @XmlElement(name = "CodDaneDepartamento")
    protected Integer codDaneDepartamento;
    @XmlElement(name = "CodDaneMunicipio")
    protected Integer codDaneMunicipio;
    @XmlElementRef(name = "Departamento", namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departamento;
    @XmlElement(name = "FechaFinalizacion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaFinalizacion;
    @XmlElement(name = "FechaOperacion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaOperacion;
    @XmlElementRef(name = "HazReducLocalid", namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hazReducLocalid;
    @XmlElement(name = "Latitud")
    protected Double latitud;
    @XmlElement(name = "Longitud")
    protected Double longitud;
    @XmlElement(name = "Map")
    protected Integer map;
    @XmlElementRef(name = "Municipio", namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> municipio;
    @XmlElement(name = "Muse")
    protected Integer muse;
    @XmlElementRef(name = "Organizacion", namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizacion;
    @XmlElementRef(name = "TipoDesminado", namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoDesminado;
    @XmlElementRef(name = "TipoOperacion", namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tipoOperacion;

    /**
     * Gets the value of the areaDespejada property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAreaDespejada() {
        return areaDespejada;
    }

    /**
     * Sets the value of the areaDespejada property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAreaDespejada(JAXBElement<String> value) {
        this.areaDespejada = value;
    }

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
     * Gets the value of the fechaFinalizacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    /**
     * Sets the value of the fechaFinalizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaFinalizacion(XMLGregorianCalendar value) {
        this.fechaFinalizacion = value;
    }

    /**
     * Gets the value of the fechaOperacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaOperacion() {
        return fechaOperacion;
    }

    /**
     * Sets the value of the fechaOperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaOperacion(XMLGregorianCalendar value) {
        this.fechaOperacion = value;
    }

    /**
     * Gets the value of the hazReducLocalid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHazReducLocalid() {
        return hazReducLocalid;
    }

    /**
     * Sets the value of the hazReducLocalid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHazReducLocalid(JAXBElement<String> value) {
        this.hazReducLocalid = value;
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
     * Gets the value of the map property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMap() {
        return map;
    }

    /**
     * Sets the value of the map property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMap(Integer value) {
        this.map = value;
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
     * Gets the value of the muse property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMuse() {
        return muse;
    }

    /**
     * Sets the value of the muse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMuse(Integer value) {
        this.muse = value;
    }

    /**
     * Gets the value of the organizacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizacion() {
        return organizacion;
    }

    /**
     * Sets the value of the organizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizacion(JAXBElement<String> value) {
        this.organizacion = value;
    }

    /**
     * Gets the value of the tipoDesminado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoDesminado() {
        return tipoDesminado;
    }

    /**
     * Sets the value of the tipoDesminado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoDesminado(JAXBElement<String> value) {
        this.tipoDesminado = value;
    }

    /**
     * Gets the value of the tipoOperacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Sets the value of the tipoOperacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTipoOperacion(JAXBElement<String> value) {
        this.tipoOperacion = value;
    }

}
