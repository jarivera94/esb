
package org.step.aac.glass;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoDatosBasicosPredio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoDatosBasicosPredio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anotacionCertificadoTradicion" type="{http://glass.aac.step.org/}tipoAnotacion" minOccurs="0"/>
 *         &lt;element name="cedulaCatastral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chipPredio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departamentoPredio" type="{http://glass.aac.step.org/}tipoDepartamento" minOccurs="0"/>
 *         &lt;element name="detalleOficina" type="{http://glass.aac.step.org/}tipoDetalleOficina" minOccurs="0"/>
 *         &lt;element name="direccionInmueble" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="direcciones" type="{http://glass.aac.step.org/}tipoListaDireccionDomiciliaria" minOccurs="0"/>
 *         &lt;element name="municipioPredio" type="{http://glass.aac.step.org/}tipoMunicipio" minOccurs="0"/>
 *         &lt;element name="numeroMatricula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoCirculoRegistral" type="{http://glass.aac.step.org/}tipoCirculoRegistral" minOccurs="0"/>
 *         &lt;element name="tipoLogResultadoConsulta" type="{http://glass.aac.step.org/}tipoLogResultadoConsulta" minOccurs="0"/>
 *         &lt;element name="veredaPredio" type="{http://glass.aac.step.org/}tipoCentroPoblado" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoDatosBasicosPredio", propOrder = {
    "anotacionCertificadoTradicion",
    "cedulaCatastral",
    "chipPredio",
    "departamentoPredio",
    "detalleOficina",
    "direccionInmueble",
    "direcciones",
    "municipioPredio",
    "numeroMatricula",
    "tipoCirculoRegistral",
    "tipoLogResultadoConsulta",
    "veredaPredio"
})
public class TipoDatosBasicosPredio {

    protected TipoAnotacion anotacionCertificadoTradicion;
    protected String cedulaCatastral;
    protected String chipPredio;
    protected TipoDepartamento departamentoPredio;
    protected TipoDetalleOficina detalleOficina;
    protected String direccionInmueble;
    protected TipoListaDireccionDomiciliaria direcciones;
    protected TipoMunicipio municipioPredio;
    protected String numeroMatricula;
    protected TipoCirculoRegistral tipoCirculoRegistral;
    protected TipoLogResultadoConsulta tipoLogResultadoConsulta;
    protected TipoCentroPoblado veredaPredio;

    /**
     * Gets the value of the anotacionCertificadoTradicion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoAnotacion }
     *     
     */
    public TipoAnotacion getAnotacionCertificadoTradicion() {
        return anotacionCertificadoTradicion;
    }

    /**
     * Sets the value of the anotacionCertificadoTradicion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoAnotacion }
     *     
     */
    public void setAnotacionCertificadoTradicion(TipoAnotacion value) {
        this.anotacionCertificadoTradicion = value;
    }

    /**
     * Gets the value of the cedulaCatastral property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCedulaCatastral() {
        return cedulaCatastral;
    }

    /**
     * Sets the value of the cedulaCatastral property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCedulaCatastral(String value) {
        this.cedulaCatastral = value;
    }

    /**
     * Gets the value of the chipPredio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChipPredio() {
        return chipPredio;
    }

    /**
     * Sets the value of the chipPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChipPredio(String value) {
        this.chipPredio = value;
    }

    /**
     * Gets the value of the departamentoPredio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDepartamento }
     *     
     */
    public TipoDepartamento getDepartamentoPredio() {
        return departamentoPredio;
    }

    /**
     * Sets the value of the departamentoPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDepartamento }
     *     
     */
    public void setDepartamentoPredio(TipoDepartamento value) {
        this.departamentoPredio = value;
    }

    /**
     * Gets the value of the detalleOficina property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDetalleOficina }
     *     
     */
    public TipoDetalleOficina getDetalleOficina() {
        return detalleOficina;
    }

    /**
     * Sets the value of the detalleOficina property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDetalleOficina }
     *     
     */
    public void setDetalleOficina(TipoDetalleOficina value) {
        this.detalleOficina = value;
    }

    /**
     * Gets the value of the direccionInmueble property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionInmueble() {
        return direccionInmueble;
    }

    /**
     * Sets the value of the direccionInmueble property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionInmueble(String value) {
        this.direccionInmueble = value;
    }

    /**
     * Gets the value of the direcciones property.
     * 
     * @return
     *     possible object is
     *     {@link TipoListaDireccionDomiciliaria }
     *     
     */
    public TipoListaDireccionDomiciliaria getDirecciones() {
        return direcciones;
    }

    /**
     * Sets the value of the direcciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoListaDireccionDomiciliaria }
     *     
     */
    public void setDirecciones(TipoListaDireccionDomiciliaria value) {
        this.direcciones = value;
    }

    /**
     * Gets the value of the municipioPredio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoMunicipio }
     *     
     */
    public TipoMunicipio getMunicipioPredio() {
        return municipioPredio;
    }

    /**
     * Sets the value of the municipioPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoMunicipio }
     *     
     */
    public void setMunicipioPredio(TipoMunicipio value) {
        this.municipioPredio = value;
    }

    /**
     * Gets the value of the numeroMatricula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    /**
     * Sets the value of the numeroMatricula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroMatricula(String value) {
        this.numeroMatricula = value;
    }

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
     * Gets the value of the tipoLogResultadoConsulta property.
     * 
     * @return
     *     possible object is
     *     {@link TipoLogResultadoConsulta }
     *     
     */
    public TipoLogResultadoConsulta getTipoLogResultadoConsulta() {
        return tipoLogResultadoConsulta;
    }

    /**
     * Sets the value of the tipoLogResultadoConsulta property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoLogResultadoConsulta }
     *     
     */
    public void setTipoLogResultadoConsulta(TipoLogResultadoConsulta value) {
        this.tipoLogResultadoConsulta = value;
    }

    /**
     * Gets the value of the veredaPredio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCentroPoblado }
     *     
     */
    public TipoCentroPoblado getVeredaPredio() {
        return veredaPredio;
    }

    /**
     * Sets the value of the veredaPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCentroPoblado }
     *     
     */
    public void setVeredaPredio(TipoCentroPoblado value) {
        this.veredaPredio = value;
    }

}
