
package com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ejecutar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ejecutar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entrada" type="{http://glass.aac.step.org/}tipoLstCertificadoTradiciLibertEnt" minOccurs="0"/>
 *         &lt;element name="sistemaUsuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ejecutar", propOrder = {
    "entrada",
    "sistemaUsuario",
    "clave"
})
public class Ejecutar {

    protected TipoLstCertificadoTradiciLibertEnt entrada;
    protected String sistemaUsuario;
    protected String clave;

    /**
     * Gets the value of the entrada property.
     * 
     * @return
     *     possible object is
     *     {@link TipoLstCertificadoTradiciLibertEnt }
     *     
     */
    public TipoLstCertificadoTradiciLibertEnt getEntrada() {
        return entrada;
    }

    /**
     * Sets the value of the entrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoLstCertificadoTradiciLibertEnt }
     *     
     */
    public void setEntrada(TipoLstCertificadoTradiciLibertEnt value) {
        this.entrada = value;
    }

    /**
     * Gets the value of the sistemaUsuario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaUsuario() {
        return sistemaUsuario;
    }

    /**
     * Sets the value of the sistemaUsuario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaUsuario(String value) {
        this.sistemaUsuario = value;
    }

    /**
     * Gets the value of the clave property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClave() {
        return clave;
    }

    /**
     * Sets the value of the clave property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClave(String value) {
        this.clave = value;
    }

}
