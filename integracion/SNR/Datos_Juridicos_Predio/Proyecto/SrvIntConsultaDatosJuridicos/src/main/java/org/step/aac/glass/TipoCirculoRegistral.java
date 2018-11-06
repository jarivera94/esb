
package org.step.aac.glass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoCirculoRegistral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoCirculoRegistral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departamentoCirculoRegistral" type="{http://glass.aac.step.org/}tipoDepartamento" minOccurs="0"/>
 *         &lt;element name="jurisdiccionPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="municipioCirculoRegistral" type="{http://glass.aac.step.org/}tipoMunicipio" minOccurs="0"/>
 *         &lt;element name="nombreJurisdiccionPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCirculoRegistral", propOrder = {
    "departamentoCirculoRegistral",
    "jurisdiccionPredio",
    "municipioCirculoRegistral",
    "nombreJurisdiccionPredio"
})
public class TipoCirculoRegistral {

    protected TipoDepartamento departamentoCirculoRegistral;
    protected String jurisdiccionPredio;
    protected TipoMunicipio municipioCirculoRegistral;
    protected String nombreJurisdiccionPredio;

    /**
     * Gets the value of the departamentoCirculoRegistral property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDepartamento }
     *     
     */
    public TipoDepartamento getDepartamentoCirculoRegistral() {
        return departamentoCirculoRegistral;
    }

    /**
     * Sets the value of the departamentoCirculoRegistral property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDepartamento }
     *     
     */
    public void setDepartamentoCirculoRegistral(TipoDepartamento value) {
        this.departamentoCirculoRegistral = value;
    }

    /**
     * Gets the value of the jurisdiccionPredio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJurisdiccionPredio() {
        return jurisdiccionPredio;
    }

    /**
     * Sets the value of the jurisdiccionPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJurisdiccionPredio(String value) {
        this.jurisdiccionPredio = value;
    }

    /**
     * Gets the value of the municipioCirculoRegistral property.
     * 
     * @return
     *     possible object is
     *     {@link TipoMunicipio }
     *     
     */
    public TipoMunicipio getMunicipioCirculoRegistral() {
        return municipioCirculoRegistral;
    }

    /**
     * Sets the value of the municipioCirculoRegistral property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoMunicipio }
     *     
     */
    public void setMunicipioCirculoRegistral(TipoMunicipio value) {
        this.municipioCirculoRegistral = value;
    }

    /**
     * Gets the value of the nombreJurisdiccionPredio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreJurisdiccionPredio() {
        return nombreJurisdiccionPredio;
    }

    /**
     * Sets the value of the nombreJurisdiccionPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreJurisdiccionPredio(String value) {
        this.nombreJurisdiccionPredio = value;
    }

}
