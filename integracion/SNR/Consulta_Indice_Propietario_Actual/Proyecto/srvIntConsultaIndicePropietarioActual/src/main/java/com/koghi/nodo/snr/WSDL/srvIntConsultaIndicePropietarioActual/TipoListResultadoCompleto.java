
package com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoListResultadoCompleto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoListResultadoCompleto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaDocumentos" type="{http://glass.aac.step.org/}parametrizacionDocumentos" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listaMedidasCautelares" type="{http://glass.aac.step.org/}tipoAnotacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipoLogResultadoConsulta" type="{http://glass.aac.step.org/}tipoLogResultadoConsulta" minOccurs="0"/>
 *         &lt;element name="tipoResultadoCompleto" type="{http://glass.aac.step.org/}tipoResultadoCompleto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoListResultadoCompleto", propOrder = {
    "listaDocumentos",
    "listaMedidasCautelares",
    "tipoLogResultadoConsulta",
    "tipoResultadoCompleto"
})
public class TipoListResultadoCompleto {

    @XmlElement(nillable = true)
    protected List<ParametrizacionDocumentos> listaDocumentos;
    @XmlElement(nillable = true)
    protected List<TipoAnotacion> listaMedidasCautelares;
    protected TipoLogResultadoConsulta tipoLogResultadoConsulta;
    @XmlElement(nillable = true)
    protected List<TipoResultadoCompleto> tipoResultadoCompleto;

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
     * Gets the value of the tipoResultadoCompleto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipoResultadoCompleto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipoResultadoCompleto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoResultadoCompleto }
     * 
     * 
     */
    public List<TipoResultadoCompleto> getTipoResultadoCompleto() {
        if (tipoResultadoCompleto == null) {
            tipoResultadoCompleto = new ArrayList<TipoResultadoCompleto>();
        }
        return this.tipoResultadoCompleto;
    }

}
