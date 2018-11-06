
package org.step.aac.glass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoLstEstadoJuridicoInmuebleEnt complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoLstEstadoJuridicoInmuebleEnt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoCirculoRegistral" type="{http://glass.aac.step.org/}tipoCirculoRegistral" minOccurs="0"/>
 *         &lt;element name="ubicacionMatriculaSistemaSNR" type="{http://glass.aac.step.org/}tipoUbicacionMatriculaSNR" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoLstEstadoJuridicoInmuebleEnt", propOrder = {
    "tipoCirculoRegistral",
    "ubicacionMatriculaSistemaSNR"
})
public class TipoLstEstadoJuridicoInmuebleEnt {

    protected TipoCirculoRegistral tipoCirculoRegistral;
    protected TipoUbicacionMatriculaSNR ubicacionMatriculaSistemaSNR;

    /**
     * Gets the value of the tipoCirculoRegistral property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCirculoRegistral }
     *     
     */
    public TipoCirculoRegistral getTipoCirculoRegistral() {
        return tipoCirculoRegistral;
    }

    /**
     * Sets the value of the tipoCirculoRegistral property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCirculoRegistral }
     *     
     */
    public void setTipoCirculoRegistral(TipoCirculoRegistral value) {
        this.tipoCirculoRegistral = value;
    }

    /**
     * Gets the value of the ubicacionMatriculaSistemaSNR property.
     * 
     * @return
     *     possible object is
     *     {@link TipoUbicacionMatriculaSNR }
     *     
     */
    public TipoUbicacionMatriculaSNR getUbicacionMatriculaSistemaSNR() {
        return ubicacionMatriculaSistemaSNR;
    }

    /**
     * Sets the value of the ubicacionMatriculaSistemaSNR property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoUbicacionMatriculaSNR }
     *     
     */
    public void setUbicacionMatriculaSistemaSNR(TipoUbicacionMatriculaSNR value) {
        this.ubicacionMatriculaSistemaSNR = value;
    }

}
