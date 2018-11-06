
package org.step.aac.glass;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoInformacionPersonaAnotacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoInformacionPersonaAnotacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personaIntervieneParteActoAnotacion" type="{http://glass.aac.step.org/}tipoTipoPersona" minOccurs="0"/>
 *         &lt;element name="personaJuridicaIntervieneActo" type="{http://glass.aac.step.org/}tipoPersonaJuridica" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="personaNacionalIntervieneActo" type="{http://glass.aac.step.org/}tipoPersonaNacional" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="porcentajeParticipacionParte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="titularParteActo" type="{http://glass.aac.step.org/}tipoTipoTitular" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoInformacionPersonaAnotacion", propOrder = {
    "personaIntervieneParteActoAnotacion",
    "personaJuridicaIntervieneActo",
    "personaNacionalIntervieneActo",
    "porcentajeParticipacionParte",
    "titularParteActo"
})
public class TipoInformacionPersonaAnotacion {

    protected TipoTipoPersona personaIntervieneParteActoAnotacion;
    @XmlElement(nillable = true)
    protected List<TipoPersonaJuridica> personaJuridicaIntervieneActo;
    @XmlElement(nillable = true)
    protected List<TipoPersonaNacional> personaNacionalIntervieneActo;
    protected String porcentajeParticipacionParte;
    protected TipoTipoTitular titularParteActo;

    /**
     * Gets the value of the personaIntervieneParteActoAnotacion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoPersona }
     *     
     */
    public TipoTipoPersona getPersonaIntervieneParteActoAnotacion() {
        return personaIntervieneParteActoAnotacion;
    }

    /**
     * Sets the value of the personaIntervieneParteActoAnotacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoPersona }
     *     
     */
    public void setPersonaIntervieneParteActoAnotacion(TipoTipoPersona value) {
        this.personaIntervieneParteActoAnotacion = value;
    }

    /**
     * Gets the value of the personaJuridicaIntervieneActo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personaJuridicaIntervieneActo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonaJuridicaIntervieneActo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoPersonaJuridica }
     * 
     * 
     */
    public List<TipoPersonaJuridica> getPersonaJuridicaIntervieneActo() {
        if (personaJuridicaIntervieneActo == null) {
            personaJuridicaIntervieneActo = new ArrayList<TipoPersonaJuridica>();
        }
        return this.personaJuridicaIntervieneActo;
    }

    /**
     * Gets the value of the personaNacionalIntervieneActo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personaNacionalIntervieneActo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonaNacionalIntervieneActo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoPersonaNacional }
     * 
     * 
     */
    public List<TipoPersonaNacional> getPersonaNacionalIntervieneActo() {
        if (personaNacionalIntervieneActo == null) {
            personaNacionalIntervieneActo = new ArrayList<TipoPersonaNacional>();
        }
        return this.personaNacionalIntervieneActo;
    }

    /**
     * Gets the value of the porcentajeParticipacionParte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPorcentajeParticipacionParte() {
        return porcentajeParticipacionParte;
    }

    /**
     * Sets the value of the porcentajeParticipacionParte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPorcentajeParticipacionParte(String value) {
        this.porcentajeParticipacionParte = value;
    }

    /**
     * Gets the value of the titularParteActo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTipoTitular }
     *     
     */
    public TipoTipoTitular getTitularParteActo() {
        return titularParteActo;
    }

    /**
     * Sets the value of the titularParteActo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTipoTitular }
     *     
     */
    public void setTitularParteActo(TipoTipoTitular value) {
        this.titularParteActo = value;
    }

}
