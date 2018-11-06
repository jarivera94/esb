
package com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoEstadoFolio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoEstadoFolio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="estadoTemporalidadFolio" type="{http://glass.aac.step.org/}tipoTipoRespuestaSimplificada3" minOccurs="0"/>
 *         &lt;element name="vigenciaFolioMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEstadoFolio", propOrder = {
    "estadoTemporalidadFolio",
    "vigenciaFolioMatricula"
})
public class TipoEstadoFolio {

    protected TipoTipoRespuestaSimplificada3 estadoTemporalidadFolio;
    protected String vigenciaFolioMatricula;

    /**
     * Gets the value of the estadoTemporalidadFolio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoRespuestaSimplificada3 }
     *     
     */
    public TipoTipoRespuestaSimplificada3 getEstadoTemporalidadFolio() {
        return estadoTemporalidadFolio;
    }

    /**
     * Sets the value of the estadoTemporalidadFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoRespuestaSimplificada3 }
     *     
     */
    public void setEstadoTemporalidadFolio(TipoTipoRespuestaSimplificada3 value) {
        this.estadoTemporalidadFolio = value;
    }

    /**
     * Gets the value of the vigenciaFolioMatricula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVigenciaFolioMatricula() {
        return vigenciaFolioMatricula;
    }

    /**
     * Sets the value of the vigenciaFolioMatricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVigenciaFolioMatricula(String value) {
        this.vigenciaFolioMatricula = value;
    }

}
