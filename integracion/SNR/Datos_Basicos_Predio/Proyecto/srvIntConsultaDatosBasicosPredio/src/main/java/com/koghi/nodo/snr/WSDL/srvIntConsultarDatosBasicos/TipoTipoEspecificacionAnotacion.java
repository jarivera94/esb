
package com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoTipoEspecificacionAnotacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoTipoEspecificacionAnotacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codTipoEspecificacionAnotacionFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomTipoEspecificacionAnotacionFolio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoTipoEspecificacionAnotacion", propOrder = {
    "codTipoEspecificacionAnotacionFolio",
    "nomTipoEspecificacionAnotacionFolio"
})
public class TipoTipoEspecificacionAnotacion {

    protected String codTipoEspecificacionAnotacionFolio;
    protected String nomTipoEspecificacionAnotacionFolio;

    /**
     * Gets the value of the codTipoEspecificacionAnotacionFolio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoEspecificacionAnotacionFolio() {
        return codTipoEspecificacionAnotacionFolio;
    }

    /**
     * Sets the value of the codTipoEspecificacionAnotacionFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoEspecificacionAnotacionFolio(String value) {
        this.codTipoEspecificacionAnotacionFolio = value;
    }

    /**
     * Gets the value of the nomTipoEspecificacionAnotacionFolio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomTipoEspecificacionAnotacionFolio() {
        return nomTipoEspecificacionAnotacionFolio;
    }

    /**
     * Sets the value of the nomTipoEspecificacionAnotacionFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomTipoEspecificacionAnotacionFolio(String value) {
        this.nomTipoEspecificacionAnotacionFolio = value;
    }

}
