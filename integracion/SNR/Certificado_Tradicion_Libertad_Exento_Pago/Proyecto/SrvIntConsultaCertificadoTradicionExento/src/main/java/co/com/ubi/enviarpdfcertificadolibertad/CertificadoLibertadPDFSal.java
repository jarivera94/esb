
package co.com.ubi.enviarpdfcertificadolibertad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for certificadoLibertadPDFSal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="certificadoLibertadPDFSal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoResultado" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="datosArchivoPDF" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="estado" type="{http://enviarPDFCertificadoLibertad.ubi.com.co/}estadoCertificadoLibertadPDF" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="mensajeResultado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeroTurno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pin" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="tipoLogResultadoConsulta" type="{http://enviarPDFCertificadoLibertad.ubi.com.co/}tipoLogResultadoConsulta" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "certificadoLibertadPDFSal", propOrder = {
    "codigoResultado",
    "datosArchivoPDF",
    "estado",
    "fecha",
    "mensajeResultado",
    "numeroTurno",
    "pin",
    "tipoLogResultadoConsulta"
})
public class CertificadoLibertadPDFSal {

    protected Integer codigoResultado;
    protected byte[] datosArchivoPDF;
    @XmlSchemaType(name = "string")
    protected EstadoCertificadoLibertadPDF estado;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    protected String mensajeResultado;
    protected String numeroTurno;
    protected Long pin;
    protected TipoLogResultadoConsulta tipoLogResultadoConsulta;

    /**
     * Gets the value of the codigoResultado property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodigoResultado() {
        return codigoResultado;
    }

    /**
     * Sets the value of the codigoResultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodigoResultado(Integer value) {
        this.codigoResultado = value;
    }

    /**
     * Gets the value of the datosArchivoPDF property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDatosArchivoPDF() {
        return datosArchivoPDF;
    }

    /**
     * Sets the value of the datosArchivoPDF property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDatosArchivoPDF(byte[] value) {
        this.datosArchivoPDF = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link EstadoCertificadoLibertadPDF }
     *     
     */
    public EstadoCertificadoLibertadPDF getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoCertificadoLibertadPDF }
     *     
     */
    public void setEstado(EstadoCertificadoLibertadPDF value) {
        this.estado = value;
    }

    /**
     * Gets the value of the fecha property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Sets the value of the fecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Gets the value of the mensajeResultado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeResultado() {
        return mensajeResultado;
    }

    /**
     * Sets the value of the mensajeResultado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeResultado(String value) {
        this.mensajeResultado = value;
    }

    /**
     * Gets the value of the numeroTurno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroTurno() {
        return numeroTurno;
    }

    /**
     * Sets the value of the numeroTurno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroTurno(String value) {
        this.numeroTurno = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPin(Long value) {
        this.pin = value;
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
