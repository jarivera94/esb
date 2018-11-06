
package com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoActoTurno complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoActoTurno">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="descripcionRadicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="valorActo" type="{http://glass.aac.step.org/}tipoValorMonetario" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoActoTurno", propOrder = {
    "descripcionRadicacion",
    "valorActo"
})
public class TipoActoTurno {

    protected String descripcionRadicacion;
    protected TipoValorMonetario valorActo;

    /**
     * Gets the value of the descripcionRadicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionRadicacion() {
        return descripcionRadicacion;
    }

    /**
     * Sets the value of the descripcionRadicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionRadicacion(String value) {
        this.descripcionRadicacion = value;
    }

    /**
     * Gets the value of the valorActo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoValorMonetario }
     *     
     */
    public TipoValorMonetario getValorActo() {
        return valorActo;
    }

    /**
     * Sets the value of the valorActo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoValorMonetario }
     *     
     */
    public void setValorActo(TipoValorMonetario value) {
        this.valorActo = value;
    }

}
