
package com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for grupoNumeroIdentificacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="grupoNumeroIdentificacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numCedulaExtranjeria" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="numIdAdultoSinIdentificar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numIdMenorSinIdentificar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numIdentificacionRecienNacido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numRegistroCivil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numTarjetaIdentidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCedulaCiudadania" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroCedulaExtranjero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroPasaporte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "grupoNumeroIdentificacion", propOrder = {
    "numCedulaExtranjeria",
    "numIdAdultoSinIdentificar",
    "numIdMenorSinIdentificar",
    "numIdentificacionRecienNacido",
    "numRegistroCivil",
    "numTarjetaIdentidad",
    "numeroCedulaCiudadania",
    "numeroCedulaExtranjero",
    "numeroPasaporte"
})
public class GrupoNumeroIdentificacion {

    protected Long numCedulaExtranjeria;
    protected String numIdAdultoSinIdentificar;
    protected String numIdMenorSinIdentificar;
    protected String numIdentificacionRecienNacido;
    protected String numRegistroCivil;
    protected String numTarjetaIdentidad;
    protected String numeroCedulaCiudadania;
    protected String numeroCedulaExtranjero;
    protected String numeroPasaporte;

    /**
     * Gets the value of the numCedulaExtranjeria property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumCedulaExtranjeria() {
        return numCedulaExtranjeria;
    }

    /**
     * Sets the value of the numCedulaExtranjeria property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumCedulaExtranjeria(Long value) {
        this.numCedulaExtranjeria = value;
    }

    /**
     * Gets the value of the numIdAdultoSinIdentificar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumIdAdultoSinIdentificar() {
        return numIdAdultoSinIdentificar;
    }

    /**
     * Sets the value of the numIdAdultoSinIdentificar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumIdAdultoSinIdentificar(String value) {
        this.numIdAdultoSinIdentificar = value;
    }

    /**
     * Gets the value of the numIdMenorSinIdentificar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumIdMenorSinIdentificar() {
        return numIdMenorSinIdentificar;
    }

    /**
     * Sets the value of the numIdMenorSinIdentificar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumIdMenorSinIdentificar(String value) {
        this.numIdMenorSinIdentificar = value;
    }

    /**
     * Gets the value of the numIdentificacionRecienNacido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumIdentificacionRecienNacido() {
        return numIdentificacionRecienNacido;
    }

    /**
     * Sets the value of the numIdentificacionRecienNacido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumIdentificacionRecienNacido(String value) {
        this.numIdentificacionRecienNacido = value;
    }

    /**
     * Gets the value of the numRegistroCivil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRegistroCivil() {
        return numRegistroCivil;
    }

    /**
     * Sets the value of the numRegistroCivil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRegistroCivil(String value) {
        this.numRegistroCivil = value;
    }

    /**
     * Gets the value of the numTarjetaIdentidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTarjetaIdentidad() {
        return numTarjetaIdentidad;
    }

    /**
     * Sets the value of the numTarjetaIdentidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTarjetaIdentidad(String value) {
        this.numTarjetaIdentidad = value;
    }

    /**
     * Gets the value of the numeroCedulaCiudadania property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCedulaCiudadania() {
        return numeroCedulaCiudadania;
    }

    /**
     * Sets the value of the numeroCedulaCiudadania property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCedulaCiudadania(String value) {
        this.numeroCedulaCiudadania = value;
    }

    /**
     * Gets the value of the numeroCedulaExtranjero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCedulaExtranjero() {
        return numeroCedulaExtranjero;
    }

    /**
     * Sets the value of the numeroCedulaExtranjero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCedulaExtranjero(String value) {
        this.numeroCedulaExtranjero = value;
    }

    /**
     * Gets the value of the numeroPasaporte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPasaporte() {
        return numeroPasaporte;
    }

    /**
     * Sets the value of the numeroPasaporte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPasaporte(String value) {
        this.numeroPasaporte = value;
    }

}
