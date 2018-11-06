
package com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoTipoRespuestaSimplificada3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoTipoRespuestaSimplificada3">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codTipoRespuestaSimplificadaTemporalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomTipoRespuestaSimplificadaTemporalidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoTipoRespuestaSimplificada3", propOrder = {
    "codTipoRespuestaSimplificadaTemporalidad",
    "nomTipoRespuestaSimplificadaTemporalidad"
})
public class TipoTipoRespuestaSimplificada3 {

    protected String codTipoRespuestaSimplificadaTemporalidad;
    protected String nomTipoRespuestaSimplificadaTemporalidad;

    /**
     * Gets the value of the codTipoRespuestaSimplificadaTemporalidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoRespuestaSimplificadaTemporalidad() {
        return codTipoRespuestaSimplificadaTemporalidad;
    }

    /**
     * Sets the value of the codTipoRespuestaSimplificadaTemporalidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoRespuestaSimplificadaTemporalidad(String value) {
        this.codTipoRespuestaSimplificadaTemporalidad = value;
    }

    /**
     * Gets the value of the nomTipoRespuestaSimplificadaTemporalidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomTipoRespuestaSimplificadaTemporalidad() {
        return nomTipoRespuestaSimplificadaTemporalidad;
    }

    /**
     * Sets the value of the nomTipoRespuestaSimplificadaTemporalidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomTipoRespuestaSimplificadaTemporalidad(String value) {
        this.nomTipoRespuestaSimplificadaTemporalidad = value;
    }

}
