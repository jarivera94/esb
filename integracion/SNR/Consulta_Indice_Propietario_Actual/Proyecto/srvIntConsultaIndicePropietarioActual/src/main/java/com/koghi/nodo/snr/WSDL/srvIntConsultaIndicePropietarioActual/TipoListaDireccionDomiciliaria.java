
package com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoListaDireccionDomiciliaria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoListaDireccionDomiciliaria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grupoDireccionDomiciliaria" type="{http://glass.aac.step.org/}grupoDireccionDomiciliaria" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoListaDireccionDomiciliaria", propOrder = {
    "grupoDireccionDomiciliaria"
})
public class TipoListaDireccionDomiciliaria {

    @XmlElement(nillable = true)
    protected List<GrupoDireccionDomiciliaria> grupoDireccionDomiciliaria;

    /**
     * Gets the value of the grupoDireccionDomiciliaria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the grupoDireccionDomiciliaria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGrupoDireccionDomiciliaria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GrupoDireccionDomiciliaria }
     * 
     * 
     */
    public List<GrupoDireccionDomiciliaria> getGrupoDireccionDomiciliaria() {
        if (grupoDireccionDomiciliaria == null) {
            grupoDireccionDomiciliaria = new ArrayList<GrupoDireccionDomiciliaria>();
        }
        return this.grupoDireccionDomiciliaria;
    }

}
