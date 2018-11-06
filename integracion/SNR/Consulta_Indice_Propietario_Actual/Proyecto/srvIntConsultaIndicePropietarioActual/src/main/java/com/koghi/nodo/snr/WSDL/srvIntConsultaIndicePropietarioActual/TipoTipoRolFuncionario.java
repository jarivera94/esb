
package com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoTipoRolFuncionario complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoTipoRolFuncionario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codTipoRolPersonalFuncionario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomTipoRolPersonalFuncionario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoTipoRolFuncionario", propOrder = {
    "codTipoRolPersonalFuncionario",
    "nomTipoRolPersonalFuncionario"
})
public class TipoTipoRolFuncionario {

    protected String codTipoRolPersonalFuncionario;
    protected String nomTipoRolPersonalFuncionario;

    /**
     * Gets the value of the codTipoRolPersonalFuncionario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoRolPersonalFuncionario() {
        return codTipoRolPersonalFuncionario;
    }

    /**
     * Sets the value of the codTipoRolPersonalFuncionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoRolPersonalFuncionario(String value) {
        this.codTipoRolPersonalFuncionario = value;
    }

    /**
     * Gets the value of the nomTipoRolPersonalFuncionario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomTipoRolPersonalFuncionario() {
        return nomTipoRolPersonalFuncionario;
    }

    /**
     * Sets the value of the nomTipoRolPersonalFuncionario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomTipoRolPersonalFuncionario(String value) {
        this.nomTipoRolPersonalFuncionario = value;
    }

}
