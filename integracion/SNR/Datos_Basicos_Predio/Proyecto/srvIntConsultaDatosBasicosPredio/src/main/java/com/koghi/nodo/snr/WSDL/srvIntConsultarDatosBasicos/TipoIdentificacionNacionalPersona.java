
package com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoIdentificacionNacionalPersona complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoIdentificacionNacionalPersona">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grupoNumeroIdentificacion" type="{http://glass.aac.step.org/}grupoNumeroIdentificacion" minOccurs="0"/>
 *         &lt;element name="tipoIdNacionalPersona" type="{http://glass.aac.step.org/}tipoTipoIdNacionalPersona" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoIdentificacionNacionalPersona", propOrder = {
    "grupoNumeroIdentificacion",
    "tipoIdNacionalPersona"
})
public class TipoIdentificacionNacionalPersona {

    protected GrupoNumeroIdentificacion grupoNumeroIdentificacion;
    protected TipoTipoIdNacionalPersona tipoIdNacionalPersona;

    /**
     * Gets the value of the grupoNumeroIdentificacion property.
     * 
     * @return
     *     possible object is
     *     {@link GrupoNumeroIdentificacion }
     *     
     */
    public GrupoNumeroIdentificacion getGrupoNumeroIdentificacion() {
        return grupoNumeroIdentificacion;
    }

    /**
     * Sets the value of the grupoNumeroIdentificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrupoNumeroIdentificacion }
     *     
     */
    public void setGrupoNumeroIdentificacion(GrupoNumeroIdentificacion value) {
        this.grupoNumeroIdentificacion = value;
    }

    /**
     * Gets the value of the tipoIdNacionalPersona property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoIdNacionalPersona }
     *     
     */
    public TipoTipoIdNacionalPersona getTipoIdNacionalPersona() {
        return tipoIdNacionalPersona;
    }

    /**
     * Sets the value of the tipoIdNacionalPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoIdNacionalPersona }
     *     
     */
    public void setTipoIdNacionalPersona(TipoTipoIdNacionalPersona value) {
        this.tipoIdNacionalPersona = value;
    }

}
