
package com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoMatriculaRelacionada complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoMatriculaRelacionada">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anotacionRelacionada" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="calificacionMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="circulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombrePredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroMatriculaPredio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="radicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoMatriculaRelacionada", propOrder = {
    "anotacionRelacionada",
    "calificacionMatriculaInmobiliaria",
    "circulo",
    "descripcion",
    "nombrePredio",
    "numeroMatriculaPredio",
    "radicacion"
})
public class TipoMatriculaRelacionada {

    protected String anotacionRelacionada;
    protected String calificacionMatriculaInmobiliaria;
    protected String circulo;
    protected String descripcion;
    protected String nombrePredio;
    protected Integer numeroMatriculaPredio;
    protected String radicacion;

    /**
     * Gets the value of the anotacionRelacionada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnotacionRelacionada() {
        return anotacionRelacionada;
    }

    /**
     * Sets the value of the anotacionRelacionada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnotacionRelacionada(String value) {
        this.anotacionRelacionada = value;
    }

    /**
     * Gets the value of the calificacionMatriculaInmobiliaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalificacionMatriculaInmobiliaria() {
        return calificacionMatriculaInmobiliaria;
    }

    /**
     * Sets the value of the calificacionMatriculaInmobiliaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalificacionMatriculaInmobiliaria(String value) {
        this.calificacionMatriculaInmobiliaria = value;
    }

    /**
     * Gets the value of the circulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCirculo() {
        return circulo;
    }

    /**
     * Sets the value of the circulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCirculo(String value) {
        this.circulo = value;
    }

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
     * Gets the value of the nombrePredio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePredio() {
        return nombrePredio;
    }

    /**
     * Sets the value of the nombrePredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePredio(String value) {
        this.nombrePredio = value;
    }

    /**
     * Gets the value of the numeroMatriculaPredio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroMatriculaPredio() {
        return numeroMatriculaPredio;
    }

    /**
     * Sets the value of the numeroMatriculaPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroMatriculaPredio(Integer value) {
        this.numeroMatriculaPredio = value;
    }

    /**
     * Gets the value of the radicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadicacion() {
        return radicacion;
    }

    /**
     * Sets the value of the radicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadicacion(String value) {
        this.radicacion = value;
    }

}
