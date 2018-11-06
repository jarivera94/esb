
package co.com.ubi.enviarpdfcertificadolibertad;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.ubi.enviarpdfcertificadolibertad package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObtenerPDF_QNAME = new QName("http://enviarPDFCertificadoLibertad.ubi.com.co/", "obtenerPDF");
    private final static QName _EjecutarCopiaArchivosCTLResponse_QNAME = new QName("http://enviarPDFCertificadoLibertad.ubi.com.co/", "ejecutarCopiaArchivosCTLResponse");
    private final static QName _ConsultarPDFPorPin_QNAME = new QName("http://enviarPDFCertificadoLibertad.ubi.com.co/", "consultarPDFPorPin");
    private final static QName _ObtenerPDFResponse_QNAME = new QName("http://enviarPDFCertificadoLibertad.ubi.com.co/", "obtenerPDFResponse");
    private final static QName _ConsultarPDFPorPinResponse_QNAME = new QName("http://enviarPDFCertificadoLibertad.ubi.com.co/", "consultarPDFPorPinResponse");
    private final static QName _EjecutarCopiaArchivosCTL_QNAME = new QName("http://enviarPDFCertificadoLibertad.ubi.com.co/", "ejecutarCopiaArchivosCTL");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.ubi.enviarpdfcertificadolibertad
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ObtenerPDFResponse }
     * 
     */
    public ObtenerPDFResponse createObtenerPDFResponse() {
        return new ObtenerPDFResponse();
    }

    /**
     * Create an instance of {@link EjecutarCopiaArchivosCTL }
     * 
     */
    public EjecutarCopiaArchivosCTL createEjecutarCopiaArchivosCTL() {
        return new EjecutarCopiaArchivosCTL();
    }

    /**
     * Create an instance of {@link ConsultarPDFPorPinResponse }
     * 
     */
    public ConsultarPDFPorPinResponse createConsultarPDFPorPinResponse() {
        return new ConsultarPDFPorPinResponse();
    }

    /**
     * Create an instance of {@link ObtenerPDF }
     * 
     */
    public ObtenerPDF createObtenerPDF() {
        return new ObtenerPDF();
    }

    /**
     * Create an instance of {@link ConsultarPDFPorPin }
     * 
     */
    public ConsultarPDFPorPin createConsultarPDFPorPin() {
        return new ConsultarPDFPorPin();
    }

    /**
     * Create an instance of {@link EjecutarCopiaArchivosCTLResponse }
     * 
     */
    public EjecutarCopiaArchivosCTLResponse createEjecutarCopiaArchivosCTLResponse() {
        return new EjecutarCopiaArchivosCTLResponse();
    }

    /**
     * Create an instance of {@link CertificadoLibertadPDFSal }
     * 
     */
    public CertificadoLibertadPDFSal createCertificadoLibertadPDFSal() {
        return new CertificadoLibertadPDFSal();
    }

    /**
     * Create an instance of {@link ConsultarCertificadoEnt }
     * 
     */
    public ConsultarCertificadoEnt createConsultarCertificadoEnt() {
        return new ConsultarCertificadoEnt();
    }

    /**
     * Create an instance of {@link ConsultarCertificadoSal }
     * 
     */
    public ConsultarCertificadoSal createConsultarCertificadoSal() {
        return new ConsultarCertificadoSal();
    }

    /**
     * Create an instance of {@link CertificadoLibertadPDFEnt }
     * 
     */
    public CertificadoLibertadPDFEnt createCertificadoLibertadPDFEnt() {
        return new CertificadoLibertadPDFEnt();
    }

    /**
     * Create an instance of {@link TipoLogResultadoConsulta }
     * 
     */
    public TipoLogResultadoConsulta createTipoLogResultadoConsulta() {
        return new TipoLogResultadoConsulta();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPDF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://enviarPDFCertificadoLibertad.ubi.com.co/", name = "obtenerPDF")
    public JAXBElement<ObtenerPDF> createObtenerPDF(ObtenerPDF value) {
        return new JAXBElement<ObtenerPDF>(_ObtenerPDF_QNAME, ObtenerPDF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutarCopiaArchivosCTLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://enviarPDFCertificadoLibertad.ubi.com.co/", name = "ejecutarCopiaArchivosCTLResponse")
    public JAXBElement<EjecutarCopiaArchivosCTLResponse> createEjecutarCopiaArchivosCTLResponse(EjecutarCopiaArchivosCTLResponse value) {
        return new JAXBElement<EjecutarCopiaArchivosCTLResponse>(_EjecutarCopiaArchivosCTLResponse_QNAME, EjecutarCopiaArchivosCTLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPDFPorPin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://enviarPDFCertificadoLibertad.ubi.com.co/", name = "consultarPDFPorPin")
    public JAXBElement<ConsultarPDFPorPin> createConsultarPDFPorPin(ConsultarPDFPorPin value) {
        return new JAXBElement<ConsultarPDFPorPin>(_ConsultarPDFPorPin_QNAME, ConsultarPDFPorPin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPDFResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://enviarPDFCertificadoLibertad.ubi.com.co/", name = "obtenerPDFResponse")
    public JAXBElement<ObtenerPDFResponse> createObtenerPDFResponse(ObtenerPDFResponse value) {
        return new JAXBElement<ObtenerPDFResponse>(_ObtenerPDFResponse_QNAME, ObtenerPDFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPDFPorPinResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://enviarPDFCertificadoLibertad.ubi.com.co/", name = "consultarPDFPorPinResponse")
    public JAXBElement<ConsultarPDFPorPinResponse> createConsultarPDFPorPinResponse(ConsultarPDFPorPinResponse value) {
        return new JAXBElement<ConsultarPDFPorPinResponse>(_ConsultarPDFPorPinResponse_QNAME, ConsultarPDFPorPinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EjecutarCopiaArchivosCTL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://enviarPDFCertificadoLibertad.ubi.com.co/", name = "ejecutarCopiaArchivosCTL")
    public JAXBElement<EjecutarCopiaArchivosCTL> createEjecutarCopiaArchivosCTL(EjecutarCopiaArchivosCTL value) {
        return new JAXBElement<EjecutarCopiaArchivosCTL>(_EjecutarCopiaArchivosCTL_QNAME, EjecutarCopiaArchivosCTL.class, null, value);
    }

}
