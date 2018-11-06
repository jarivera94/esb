
package org.step.aac.glass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for consultaEstadoJuridico complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="consultaEstadoJuridico">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="objEntrada" type="{http://glass.aac.step.org/}tipoLstEstadoJuridicoInmuebleEnt" minOccurs="0"/>
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
@XmlType(name = "consultaEstadoJuridico", propOrder = {
    "objEntrada",
    "sistemaUsuario",
    "clave"
})
public class ConsultaEstadoJuridico {

    protected TipoLstEstadoJuridicoInmuebleEnt objEntrada;
    protected String sistemaUsuario;
    protected String clave;

    /**
     * Gets the value of the objEntrada property.
     * 
     * @return
     *     possible object is
     *     {@link TipoLstEstadoJuridicoInmuebleEnt }
     *     
     */
    public TipoLstEstadoJuridicoInmuebleEnt getObjEntrada() {
        return objEntrada;
    }

    /**
     * Sets the value of the objEntrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoLstEstadoJuridicoInmuebleEnt }
     *     
     */
    public void setObjEntrada(TipoLstEstadoJuridicoInmuebleEnt value) {
        this.objEntrada = value;
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
