
package org.step.aac.glass;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoListaMatriculaRelacionada complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tipoListaMatriculaRelacionada">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matriculaRelacionadaSNR" type="{http://glass.aac.step.org/}tipoMatriculaRelacionada" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoListaMatriculaRelacionada", propOrder = {
    "matriculaRelacionadaSNR"
})
public class TipoListaMatriculaRelacionada {

    @XmlElement(nillable = true)
    protected List<TipoMatriculaRelacionada> matriculaRelacionadaSNR;

    /**
     * Gets the value of the matriculaRelacionadaSNR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matriculaRelacionadaSNR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatriculaRelacionadaSNR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoMatriculaRelacionada }
     * 
     * 
     */
    public List<TipoMatriculaRelacionada> getMatriculaRelacionadaSNR() {
        if (matriculaRelacionadaSNR == null) {
            matriculaRelacionadaSNR = new ArrayList<TipoMatriculaRelacionada>();
        }
        return this.matriculaRelacionadaSNR;
    }

}
