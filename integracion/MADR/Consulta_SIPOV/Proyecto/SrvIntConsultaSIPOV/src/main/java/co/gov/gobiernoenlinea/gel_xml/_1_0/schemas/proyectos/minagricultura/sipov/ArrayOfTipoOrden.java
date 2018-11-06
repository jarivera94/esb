
package co.gov.gobiernoenlinea.gel_xml._1_0.schemas.proyectos.minagricultura.sipov;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTipoOrden complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTipoOrden">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listaOrdenesSal" type="{http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/Proyectos/MinAgricultura/SIPOV}tipoOrden" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTipoOrden", propOrder = {
    "listaOrdenesSal"
})
public class ArrayOfTipoOrden {

    protected List<TipoOrden> listaOrdenesSal;

    /**
     * Gets the value of the listaOrdenesSal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaOrdenesSal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaOrdenesSal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoOrden }
     * 
     * 
     */
    public List<TipoOrden> getListaOrdenesSal() {
        if (listaOrdenesSal == null) {
            listaOrdenesSal = new ArrayList<TipoOrden>();
        }
        return this.listaOrdenesSal;
    }

}
