
package com.koghi.nodo.snr.WSDL.srvIntConsultarDatosBasicos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoCertificadoTradiciLibertSal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoCertificadoTradiciLibertSal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaDocumentos" type="{http://glass.aac.step.org/}parametrizacionDocumentos" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listaMedidasCautelares" type="{http://glass.aac.step.org/}tipoAnotacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listaRadicadosEstadoJuridico" type="{http://glass.aac.step.org/}tipoListaRadicadosCertificaTradici" minOccurs="0"/>
 *         &lt;element name="tipoDepartamentoMunicipioDivipola" type="{http://glass.aac.step.org/}tipoDepartamentoMunicipio" minOccurs="0"/>
 *         &lt;element name="tipoLogResultadoConsulta" type="{http://glass.aac.step.org/}tipoLogResultadoConsulta" minOccurs="0"/>
 *         &lt;element name="tipoLstCertificadoTradiciLibertSal" type="{http://glass.aac.step.org/}tipoLstCertificadoTradiciLibertSal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoCertificadoTradiciLibertSal", propOrder = {
    "listaDocumentos",
    "listaMedidasCautelares",
    "listaRadicadosEstadoJuridico",
    "tipoDepartamentoMunicipioDivipola",
    "tipoLogResultadoConsulta",
    "tipoLstCertificadoTradiciLibertSal"
})
public class TipoCertificadoTradiciLibertSal {

    @XmlElement(nillable = true)
    protected List<ParametrizacionDocumentos> listaDocumentos;
    @XmlElement(nillable = true)
    protected List<TipoAnotacion> listaMedidasCautelares;
    protected TipoListaRadicadosCertificaTradici listaRadicadosEstadoJuridico;
    protected TipoDepartamentoMunicipio tipoDepartamentoMunicipioDivipola;
    protected TipoLogResultadoConsulta tipoLogResultadoConsulta;
    protected TipoLstCertificadoTradiciLibertSal tipoLstCertificadoTradiciLibertSal;

    /**
     * Gets the value of the listaDocumentos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaDocumentos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaDocumentos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParametrizacionDocumentos }
     * 
     * 
     */
    public List<ParametrizacionDocumentos> getListaDocumentos() {
        if (listaDocumentos == null) {
            listaDocumentos = new ArrayList<ParametrizacionDocumentos>();
        }
        return this.listaDocumentos;
    }

    /**
     * Gets the value of the listaMedidasCautelares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaMedidasCautelares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaMedidasCautelares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoAnotacion }
     * 
     * 
     */
    public List<TipoAnotacion> getListaMedidasCautelares() {
        if (listaMedidasCautelares == null) {
            listaMedidasCautelares = new ArrayList<TipoAnotacion>();
        }
        return this.listaMedidasCautelares;
    }

    /**
     * Gets the value of the listaRadicadosEstadoJuridico property.
     * 
     * @return
     *     possible object is
     *     {@link TipoListaRadicadosCertificaTradici }
     *     
     */
    public TipoListaRadicadosCertificaTradici getListaRadicadosEstadoJuridico() {
        return listaRadicadosEstadoJuridico;
    }

    /**
     * Sets the value of the listaRadicadosEstadoJuridico property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoListaRadicadosCertificaTradici }
     *     
     */
    public void setListaRadicadosEstadoJuridico(TipoListaRadicadosCertificaTradici value) {
        this.listaRadicadosEstadoJuridico = value;
    }

    /**
     * Gets the value of the tipoDepartamentoMunicipioDivipola property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDepartamentoMunicipio }
     *     
     */
    public TipoDepartamentoMunicipio getTipoDepartamentoMunicipioDivipola() {
        return tipoDepartamentoMunicipioDivipola;
    }

    /**
     * Sets the value of the tipoDepartamentoMunicipioDivipola property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDepartamentoMunicipio }
     *     
     */
    public void setTipoDepartamentoMunicipioDivipola(TipoDepartamentoMunicipio value) {
        this.tipoDepartamentoMunicipioDivipola = value;
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
     * Gets the value of the tipoLstCertificadoTradiciLibertSal property.
     * 
     * @return
     *     possible object is
     *     {@link TipoLstCertificadoTradiciLibertSal }
     *     
     */
    public TipoLstCertificadoTradiciLibertSal getTipoLstCertificadoTradiciLibertSal() {
        return tipoLstCertificadoTradiciLibertSal;
    }

    /**
     * Sets the value of the tipoLstCertificadoTradiciLibertSal property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoLstCertificadoTradiciLibertSal }
     *     
     */
    public void setTipoLstCertificadoTradiciLibertSal(TipoLstCertificadoTradiciLibertSal value) {
        this.tipoLstCertificadoTradiciLibertSal = value;
    }

}
