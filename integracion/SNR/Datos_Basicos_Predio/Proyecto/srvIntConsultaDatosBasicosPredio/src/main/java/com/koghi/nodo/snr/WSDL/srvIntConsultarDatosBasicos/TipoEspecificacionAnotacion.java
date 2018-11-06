
package com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoEspecificacionAnotacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoEspecificacionAnotacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comentarioEspecificaAnotacionFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naturalezaJuridicaFolio" type="{http://glass.aac.step.org/}tipoNaturalezaJuridica" minOccurs="0"/>
 *         &lt;element name="tipoEspecificacionAnotacionCertificado" type="{http://glass.aac.step.org/}tipoTipoEspecificacionAnotacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEspecificacionAnotacion", propOrder = {
    "comentarioEspecificaAnotacionFolio",
    "naturalezaJuridicaFolio",
    "tipoEspecificacionAnotacionCertificado"
})
public class TipoEspecificacionAnotacion {

    protected String comentarioEspecificaAnotacionFolio;
    protected TipoNaturalezaJuridica naturalezaJuridicaFolio;
    protected TipoTipoEspecificacionAnotacion tipoEspecificacionAnotacionCertificado;

    /**
     * Gets the value of the comentarioEspecificaAnotacionFolio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComentarioEspecificaAnotacionFolio() {
        return comentarioEspecificaAnotacionFolio;
    }

    /**
     * Sets the value of the comentarioEspecificaAnotacionFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComentarioEspecificaAnotacionFolio(String value) {
        this.comentarioEspecificaAnotacionFolio = value;
    }

    /**
     * Gets the value of the naturalezaJuridicaFolio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoNaturalezaJuridica }
     *     
     */
    public TipoNaturalezaJuridica getNaturalezaJuridicaFolio() {
        return naturalezaJuridicaFolio;
    }

    /**
     * Sets the value of the naturalezaJuridicaFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoNaturalezaJuridica }
     *     
     */
    public void setNaturalezaJuridicaFolio(TipoNaturalezaJuridica value) {
        this.naturalezaJuridicaFolio = value;
    }

    /**
     * Gets the value of the tipoEspecificacionAnotacionCertificado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoEspecificacionAnotacion }
     *     
     */
    public TipoTipoEspecificacionAnotacion getTipoEspecificacionAnotacionCertificado() {
        return tipoEspecificacionAnotacionCertificado;
    }

    /**
     * Sets the value of the tipoEspecificacionAnotacionCertificado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoEspecificacionAnotacion }
     *     
     */
    public void setTipoEspecificacionAnotacionCertificado(TipoTipoEspecificacionAnotacion value) {
        this.tipoEspecificacionAnotacionCertificado = value;
    }

}
