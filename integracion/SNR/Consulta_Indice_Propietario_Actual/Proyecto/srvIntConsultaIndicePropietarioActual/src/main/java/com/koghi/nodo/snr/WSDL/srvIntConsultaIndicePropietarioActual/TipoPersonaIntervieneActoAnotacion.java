
package com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoPersonaIntervieneActoAnotacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoPersonaIntervieneActoAnotacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personaCedePredio" type="{http://glass.aac.step.org/}tipoInformacionPersonaAnotacion" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="personaRecibePredio" type="{http://glass.aac.step.org/}tipoInformacionPersonaAnotacion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoPersonaIntervieneActoAnotacion", propOrder = {
    "personaCedePredio",
    "personaRecibePredio"
})
public class TipoPersonaIntervieneActoAnotacion {

    @XmlElement(nillable = true)
    protected List<TipoInformacionPersonaAnotacion> personaCedePredio;
    @XmlElement(nillable = true)
    protected List<TipoInformacionPersonaAnotacion> personaRecibePredio;

    /**
     * Gets the value of the personaCedePredio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personaCedePredio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonaCedePredio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoInformacionPersonaAnotacion }
     * 
     * 
     */
    public List<TipoInformacionPersonaAnotacion> getPersonaCedePredio() {
        if (personaCedePredio == null) {
            personaCedePredio = new ArrayList<TipoInformacionPersonaAnotacion>();
        }
        return this.personaCedePredio;
    }

    /**
     * Gets the value of the personaRecibePredio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personaRecibePredio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonaRecibePredio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoInformacionPersonaAnotacion }
     * 
     * 
     */
    public List<TipoInformacionPersonaAnotacion> getPersonaRecibePredio() {
        if (personaRecibePredio == null) {
            personaRecibePredio = new ArrayList<TipoInformacionPersonaAnotacion>();
        }
        return this.personaRecibePredio;
    }

}
