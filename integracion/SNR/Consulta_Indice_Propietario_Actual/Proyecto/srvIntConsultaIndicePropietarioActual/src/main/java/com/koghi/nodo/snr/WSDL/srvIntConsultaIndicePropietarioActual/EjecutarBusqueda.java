
package com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ejecutarBusqueda complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ejecutarBusqueda">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entrada" type="{http://glass.aac.step.org/}tipoParametrosBusqueda" minOccurs="0"/>
 *         &lt;element name="sistemaUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ejecutarBusqueda", propOrder = {
    "entrada",
    "sistemaUsuario",
    "clave"
})
public class EjecutarBusqueda {

    protected TipoParametrosBusqueda entrada;
    protected String sistemaUsuario;
    protected String clave;

    /**
     * Gets the value of the entrada property.
     * 
     * @return
     *     possible object is
     *     {@link TipoParametrosBusqueda }
     *     
     */
    public TipoParametrosBusqueda getEntrada() {
        return entrada;
    }

    /**
     * Sets the value of the entrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoParametrosBusqueda }
     *     
     */
    public void setEntrada(TipoParametrosBusqueda value) {
        this.entrada = value;
    }

    /**
     * Gets the value of the sistemaUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaUsuario() {
        return sistemaUsuario;
    }

    /**
     * Sets the value of the sistemaUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaUsuario(String value) {
        this.sistemaUsuario = value;
    }

    /**
     * Gets the value of the clave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Sets the value of the clave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

}
