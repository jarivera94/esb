
package org.datacontract.schemas._2004._07.wcf_daicma_operaciones;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfClsOperaciones complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfClsOperaciones">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClsOperaciones" type="{http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones}ClsOperaciones" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfClsOperaciones", propOrder = {
    "clsOperaciones"
})
public class ArrayOfClsOperaciones {

    @XmlElement(name = "ClsOperaciones", nillable = true)
    protected List<ClsOperaciones> clsOperaciones;

    /**
     * Gets the value of the clsOperaciones property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clsOperaciones property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClsOperaciones().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClsOperaciones }
     * 
     * 
     */
    public List<ClsOperaciones> getClsOperaciones() {
        if (clsOperaciones == null) {
            clsOperaciones = new ArrayList<ClsOperaciones>();
        }
        return this.clsOperaciones;
    }

}
