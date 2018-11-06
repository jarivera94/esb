
package org.step.aac.glass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoDireccionNacionalRural complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoDireccionNacionalRural">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="claseConcentracionPoblacionDireccionRural" type="{http://glass.aac.step.org/}tipoClaseConcentracionPoblacion" minOccurs="0"/>
 *         &lt;element name="concentracionPoblacion" type="{http://glass.aac.step.org/}tipoConcentracionPoblacion" minOccurs="0"/>
 *         &lt;element name="departamento" type="{http://glass.aac.step.org/}tipoDepartamento" minOccurs="0"/>
 *         &lt;element name="municipio" type="{http://glass.aac.step.org/}tipoMunicipio" minOccurs="0"/>
 *         &lt;element name="nomenclaturaDomiciliariaRural" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDireccionNacionalRural", propOrder = {
    "claseConcentracionPoblacionDireccionRural",
    "concentracionPoblacion",
    "departamento",
    "municipio",
    "nomenclaturaDomiciliariaRural"
})
public class TipoDireccionNacionalRural {

    protected TipoClaseConcentracionPoblacion claseConcentracionPoblacionDireccionRural;
    protected TipoConcentracionPoblacion concentracionPoblacion;
    protected TipoDepartamento departamento;
    protected TipoMunicipio municipio;
    protected String nomenclaturaDomiciliariaRural;

    /**
     * Gets the value of the claseConcentracionPoblacionDireccionRural property.
     * 
     * @return
     *     possible object is
     *     {@link TipoClaseConcentracionPoblacion }
     *     
     */
    public TipoClaseConcentracionPoblacion getClaseConcentracionPoblacionDireccionRural() {
        return claseConcentracionPoblacionDireccionRural;
    }

    /**
     * Sets the value of the claseConcentracionPoblacionDireccionRural property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoClaseConcentracionPoblacion }
     *     
     */
    public void setClaseConcentracionPoblacionDireccionRural(TipoClaseConcentracionPoblacion value) {
        this.claseConcentracionPoblacionDireccionRural = value;
    }

    /**
     * Gets the value of the concentracionPoblacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoConcentracionPoblacion }
     *     
     */
    public TipoConcentracionPoblacion getConcentracionPoblacion() {
        return concentracionPoblacion;
    }

    /**
     * Sets the value of the concentracionPoblacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoConcentracionPoblacion }
     *     
     */
    public void setConcentracionPoblacion(TipoConcentracionPoblacion value) {
        this.concentracionPoblacion = value;
    }

    /**
     * Gets the value of the departamento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDepartamento }
     *     
     */
    public TipoDepartamento getDepartamento() {
        return departamento;
    }

    /**
     * Sets the value of the departamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDepartamento }
     *     
     */
    public void setDepartamento(TipoDepartamento value) {
        this.departamento = value;
    }

    /**
     * Gets the value of the municipio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoMunicipio }
     *     
     */
    public TipoMunicipio getMunicipio() {
        return municipio;
    }

    /**
     * Sets the value of the municipio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoMunicipio }
     *     
     */
    public void setMunicipio(TipoMunicipio value) {
        this.municipio = value;
    }

    /**
     * Gets the value of the nomenclaturaDomiciliariaRural property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomenclaturaDomiciliariaRural() {
        return nomenclaturaDomiciliariaRural;
    }

    /**
     * Sets the value of the nomenclaturaDomiciliariaRural property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomenclaturaDomiciliariaRural(String value) {
        this.nomenclaturaDomiciliariaRural = value;
    }

}
