
package com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoDireccionNacionalUrbana complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoDireccionNacionalUrbana">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departamento" type="{http://glass.aac.step.org/}tipoDepartamento" minOccurs="0"/>
 *         &lt;element name="localidad" type="{http://glass.aac.step.org/}tipoLocalidad" minOccurs="0"/>
 *         &lt;element name="municipio" type="{http://glass.aac.step.org/}tipoMunicipio" minOccurs="0"/>
 *         &lt;element name="nomBarrio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomenclaturaDomiciliariaUrbana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroDireccion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDireccionNacionalUrbana", propOrder = {
    "departamento",
    "localidad",
    "municipio",
    "nomBarrio",
    "nomenclaturaDomiciliariaUrbana",
    "numeroDireccion"
})
public class TipoDireccionNacionalUrbana {

    protected TipoDepartamento departamento;
    protected TipoLocalidad localidad;
    protected TipoMunicipio municipio;
    protected String nomBarrio;
    protected String nomenclaturaDomiciliariaUrbana;
    protected int numeroDireccion;

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
     * Gets the value of the localidad property.
     * 
     * @return
     *     possible object is
     *     {@link TipoLocalidad }
     *     
     */
    public TipoLocalidad getLocalidad() {
        return localidad;
    }

    /**
     * Sets the value of the localidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoLocalidad }
     *     
     */
    public void setLocalidad(TipoLocalidad value) {
        this.localidad = value;
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
     * Gets the value of the nomBarrio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomBarrio() {
        return nomBarrio;
    }

    /**
     * Sets the value of the nomBarrio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomBarrio(String value) {
        this.nomBarrio = value;
    }

    /**
     * Gets the value of the nomenclaturaDomiciliariaUrbana property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomenclaturaDomiciliariaUrbana() {
        return nomenclaturaDomiciliariaUrbana;
    }

    /**
     * Sets the value of the nomenclaturaDomiciliariaUrbana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomenclaturaDomiciliariaUrbana(String value) {
        this.nomenclaturaDomiciliariaUrbana = value;
    }

    /**
     * Gets the value of the numeroDireccion property.
     * 
     */
    public int getNumeroDireccion() {
        return numeroDireccion;
    }

    /**
     * Sets the value of the numeroDireccion property.
     * 
     */
    public void setNumeroDireccion(int value) {
        this.numeroDireccion = value;
    }

}
