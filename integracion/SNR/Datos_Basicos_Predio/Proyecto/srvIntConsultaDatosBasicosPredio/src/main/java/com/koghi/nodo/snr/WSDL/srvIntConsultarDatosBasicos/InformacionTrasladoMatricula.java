
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
 * <p>Java class for informacionTrasladoMatricula complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="informacionTrasladoMatricula">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="circuloOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaTraslado" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fundamentos" type="{http://glass.aac.step.org/}fundamento" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="matriculaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "informacionTrasladoMatricula", propOrder = {
    "circuloOrigen",
    "fechaTraslado",
    "fundamentos",
    "matriculaOrigen"
})
public class InformacionTrasladoMatricula {

    protected String circuloOrigen;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaTraslado;
    @XmlElement(nillable = true)
    protected List<Fundamento> fundamentos;
    protected String matriculaOrigen;

    /**
     * Gets the value of the circuloOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCirculoOrigen() {
        return circuloOrigen;
    }

    /**
     * Sets the value of the circuloOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCirculoOrigen(String value) {
        this.circuloOrigen = value;
    }

    /**
     * Gets the value of the fechaTraslado property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaTraslado() {
        return fechaTraslado;
    }

    /**
     * Sets the value of the fechaTraslado property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaTraslado(XMLGregorianCalendar value) {
        this.fechaTraslado = value;
    }

    /**
     * Gets the value of the fundamentos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fundamentos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFundamentos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fundamento }
     * 
     * 
     */
    public List<Fundamento> getFundamentos() {
        if (fundamentos == null) {
            fundamentos = new ArrayList<Fundamento>();
        }
        return this.fundamentos;
    }

    /**
     * Gets the value of the matriculaOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatriculaOrigen() {
        return matriculaOrigen;
    }

    /**
     * Sets the value of the matriculaOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatriculaOrigen(String value) {
        this.matriculaOrigen = value;
    }

}
