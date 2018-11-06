
package org.step.aac.glass;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoEstadoJuridicoInmuebleSal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoEstadoJuridicoInmuebleSal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="datosBasicosInmueble" type="{http://glass.aac.step.org/}tipoDatosBasicosPredio" minOccurs="0"/>
 *         &lt;element name="estadoJuridicoInmueble" type="{http://glass.aac.step.org/}tipoLstEstadoJuridicoInmuebleSal" minOccurs="0"/>
 *         &lt;element name="listaDocumentos" type="{http://glass.aac.step.org/}parametrizacionDocumentos" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listaMatriculaRelacionadaPredio" type="{http://glass.aac.step.org/}tipoListaMatriculaRelacionada" minOccurs="0"/>
 *         &lt;element name="listaMedidasCautelares" type="{http://glass.aac.step.org/}tipoAnotacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="tipoDepartamentoMunicipioDivipola" type="{http://glass.aac.step.org/}tipoDepartamentoMunicipio" minOccurs="0"/>
 *         &lt;element name="tipoLogResultadoConsulta" type="{http://glass.aac.step.org/}tipoLogResultadoConsulta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoEstadoJuridicoInmuebleSal", propOrder = {
    "datosBasicosInmueble",
    "estadoJuridicoInmueble",
    "listaDocumentos",
    "listaMatriculaRelacionadaPredio",
    "listaMedidasCautelares",
    "tipoDepartamentoMunicipioDivipola",
    "tipoLogResultadoConsulta"
})
public class TipoEstadoJuridicoInmuebleSal {

    protected TipoDatosBasicosPredio datosBasicosInmueble;
    protected TipoLstEstadoJuridicoInmuebleSal estadoJuridicoInmueble;
    @XmlElement(nillable = true)
    protected List<ParametrizacionDocumentos> listaDocumentos;
    protected TipoListaMatriculaRelacionada listaMatriculaRelacionadaPredio;
    @XmlElement(nillable = true)
    protected List<TipoAnotacion> listaMedidasCautelares;
    protected TipoDepartamentoMunicipio tipoDepartamentoMunicipioDivipola;
    protected TipoLogResultadoConsulta tipoLogResultadoConsulta;

    /**
     * Gets the value of the datosBasicosInmueble property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDatosBasicosPredio }
     *     
     */
    public TipoDatosBasicosPredio getDatosBasicosInmueble() {
        return datosBasicosInmueble;
    }

    /**
     * Sets the value of the datosBasicosInmueble property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDatosBasicosPredio }
     *     
     */
    public void setDatosBasicosInmueble(TipoDatosBasicosPredio value) {
        this.datosBasicosInmueble = value;
    }

    /**
     * Gets the value of the estadoJuridicoInmueble property.
     * 
     * @return
     *     possible object is
     *     {@link TipoLstEstadoJuridicoInmuebleSal }
     *     
     */
    public TipoLstEstadoJuridicoInmuebleSal getEstadoJuridicoInmueble() {
        return estadoJuridicoInmueble;
    }

    /**
     * Sets the value of the estadoJuridicoInmueble property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoLstEstadoJuridicoInmuebleSal }
     *     
     */
    public void setEstadoJuridicoInmueble(TipoLstEstadoJuridicoInmuebleSal value) {
        this.estadoJuridicoInmueble = value;
    }

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
     * Gets the value of the listaMatriculaRelacionadaPredio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoListaMatriculaRelacionada }
     *     
     */
    public TipoListaMatriculaRelacionada getListaMatriculaRelacionadaPredio() {
        return listaMatriculaRelacionadaPredio;
    }

    /**
     * Sets the value of the listaMatriculaRelacionadaPredio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoListaMatriculaRelacionada }
     *     
     */
    public void setListaMatriculaRelacionadaPredio(TipoListaMatriculaRelacionada value) {
        this.listaMatriculaRelacionadaPredio = value;
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

}
