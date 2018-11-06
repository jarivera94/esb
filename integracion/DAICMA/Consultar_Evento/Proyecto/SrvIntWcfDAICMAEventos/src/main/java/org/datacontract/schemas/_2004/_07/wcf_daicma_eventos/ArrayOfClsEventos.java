
package org.datacontract.schemas._2004._07.wcf_daicma_eventos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClsEventos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClsEventos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClsEventos" type="{http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos}ClsEventos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClsEventos", propOrder = {
    "clsEventos"
})
public class ArrayOfClsEventos {

    @XmlElement(name = "ClsEventos", nillable = true)
    protected List<ClsEventos> clsEventos;

    /**
     * Gets the value of the clsEventos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clsEventos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsEventos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClsEventos }
     * 
     * 
     */
    public List<ClsEventos> getClsEventos() {
        if (clsEventos == null) {
            clsEventos = new ArrayList<ClsEventos>();
        }
        return this.clsEventos;
    }

}
