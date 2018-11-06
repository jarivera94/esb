
package com.onesystem.edatel.catastro.sp.nodotierras;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for infoPredio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="infoPredio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="circuloMatriculaInmobiliaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fichaPredial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombresPropietarios" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numeroPredialNacional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="razonesSociales" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "infoPredio", propOrder = {
    "circuloMatriculaInmobiliaria",
    "fichaPredial",
    "nombresPropietarios",
    "numeroPredialNacional",
    "razonesSociales"
})
public class InfoPredio {

    protected String circuloMatriculaInmobiliaria;
    protected String fichaPredial;
    @XmlElement(nillable = true)
    protected List<String> nombresPropietarios;
    protected String numeroPredialNacional;
    @XmlElement(nillable = true)
    protected List<String> razonesSociales;

    /**
     * Gets the value of the circuloMatriculaInmobiliaria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCirculoMatriculaInmobiliaria() {
        return circuloMatriculaInmobiliaria;
    }

    /**
     * Sets the value of the circuloMatriculaInmobiliaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCirculoMatriculaInmobiliaria(String value) {
        this.circuloMatriculaInmobiliaria = value;
    }

    /**
     * Gets the value of the fichaPredial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFichaPredial() {
        return fichaPredial;
    }

    /**
     * Sets the value of the fichaPredial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFichaPredial(String value) {
        this.fichaPredial = value;
    }

    /**
     * Gets the value of the nombresPropietarios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nombresPropietarios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNombresPropietarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNombresPropietarios() {
        if (nombresPropietarios == null) {
            nombresPropietarios = new ArrayList<String>();
        }
        return this.nombresPropietarios;
    }

    /**
     * Gets the value of the numeroPredialNacional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPredialNacional() {
        return numeroPredialNacional;
    }

    /**
     * Sets the value of the numeroPredialNacional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPredialNacional(String value) {
        this.numeroPredialNacional = value;
    }

    /**
     * Gets the value of the razonesSociales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the razonesSociales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRazonesSociales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRazonesSociales() {
        if (razonesSociales == null) {
            razonesSociales = new ArrayList<String>();
        }
        return this.razonesSociales;
    }

}
