
package com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoListaMagnitud complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoListaMagnitud">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroAnotacion" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoListaMagnitud", propOrder = {
    "numeroAnotacion"
})
public class TipoListaMagnitud {

    @XmlElement(nillable = true)
    protected List<Integer> numeroAnotacion;

    /**
     * Gets the value of the numeroAnotacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numeroAnotacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumeroAnotacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getNumeroAnotacion() {
        if (numeroAnotacion == null) {
            numeroAnotacion = new ArrayList<Integer>();
        }
        return this.numeroAnotacion;
    }

}
