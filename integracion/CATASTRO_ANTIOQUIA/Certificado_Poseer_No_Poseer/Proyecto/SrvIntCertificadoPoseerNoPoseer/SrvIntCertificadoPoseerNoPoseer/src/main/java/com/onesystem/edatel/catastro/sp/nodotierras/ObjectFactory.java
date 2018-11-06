
package com.onesystem.edatel.catastro.sp.nodotierras;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.onesystem.edatel.catastro.sp.nodotierras package. 
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

    private final static QName _GenerarCertificadoPredialNodoTierras_QNAME = new QName("http://nodotierras.sp.catastro.edatel.onesystem.com/", "generarCertificadoPredialNodoTierras");
    private final static QName _GenCertPoseerNoPoseerNodoTierrasResponse_QNAME = new QName("http://nodotierras.sp.catastro.edatel.onesystem.com/", "genCertPoseerNoPoseerNodoTierrasResponse");
    private final static QName _GenCertPlanoCatastralNodoTierrasResponse_QNAME = new QName("http://nodotierras.sp.catastro.edatel.onesystem.com/", "genCertPlanoCatastralNodoTierrasResponse");
    private final static QName _GenCertPoseerNoPoseerNodoTierras_QNAME = new QName("http://nodotierras.sp.catastro.edatel.onesystem.com/", "genCertPoseerNoPoseerNodoTierras");
    private final static QName _ObtenerInformacionPredialNodoTierrasResponse_QNAME = new QName("http://nodotierras.sp.catastro.edatel.onesystem.com/", "obtenerInformacionPredialNodoTierrasResponse");
    private final static QName _GenerarCertificadoPredialNodoTierrasResponse_QNAME = new QName("http://nodotierras.sp.catastro.edatel.onesystem.com/", "generarCertificadoPredialNodoTierrasResponse");
    private final static QName _GenCertPlanoCatastralNodoTierras_QNAME = new QName("http://nodotierras.sp.catastro.edatel.onesystem.com/", "genCertPlanoCatastralNodoTierras");
    private final static QName _ObtenerInformacionPredialNodoTierras_QNAME = new QName("http://nodotierras.sp.catastro.edatel.onesystem.com/", "obtenerInformacionPredialNodoTierras");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.onesystem.edatel.catastro.sp.nodotierras
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GenerarCertificadoPredialNodoTierras }
     * 
     */
    public GenerarCertificadoPredialNodoTierras createGenerarCertificadoPredialNodoTierras() {
        return new GenerarCertificadoPredialNodoTierras();
    }

    /**
     * Create an instance of {@link GenCertPoseerNoPoseerNodoTierrasResponse }
     * 
     */
    public GenCertPoseerNoPoseerNodoTierrasResponse createGenCertPoseerNoPoseerNodoTierrasResponse() {
        return new GenCertPoseerNoPoseerNodoTierrasResponse();
    }

    /**
     * Create an instance of {@link GenCertPlanoCatastralNodoTierrasResponse }
     * 
     */
    public GenCertPlanoCatastralNodoTierrasResponse createGenCertPlanoCatastralNodoTierrasResponse() {
        return new GenCertPlanoCatastralNodoTierrasResponse();
    }

    /**
     * Create an instance of {@link GenCertPoseerNoPoseerNodoTierras }
     * 
     */
    public GenCertPoseerNoPoseerNodoTierras createGenCertPoseerNoPoseerNodoTierras() {
        return new GenCertPoseerNoPoseerNodoTierras();
    }

    /**
     * Create an instance of {@link ObtenerInformacionPredialNodoTierrasResponse }
     * 
     */
    public ObtenerInformacionPredialNodoTierrasResponse createObtenerInformacionPredialNodoTierrasResponse() {
        return new ObtenerInformacionPredialNodoTierrasResponse();
    }

    /**
     * Create an instance of {@link GenerarCertificadoPredialNodoTierrasResponse }
     * 
     */
    public GenerarCertificadoPredialNodoTierrasResponse createGenerarCertificadoPredialNodoTierrasResponse() {
        return new GenerarCertificadoPredialNodoTierrasResponse();
    }

    /**
     * Create an instance of {@link GenCertPlanoCatastralNodoTierras }
     * 
     */
    public GenCertPlanoCatastralNodoTierras createGenCertPlanoCatastralNodoTierras() {
        return new GenCertPlanoCatastralNodoTierras();
    }

    /**
     * Create an instance of {@link ObtenerInformacionPredialNodoTierras }
     * 
     */
    public ObtenerInformacionPredialNodoTierras createObtenerInformacionPredialNodoTierras() {
        return new ObtenerInformacionPredialNodoTierras();
    }

    /**
     * Create an instance of {@link InfoPredio }
     * 
     */
    public InfoPredio createInfoPredio() {
        return new InfoPredio();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarCertificadoPredialNodoTierras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nodotierras.sp.catastro.edatel.onesystem.com/", name = "generarCertificadoPredialNodoTierras")
    public JAXBElement<GenerarCertificadoPredialNodoTierras> createGenerarCertificadoPredialNodoTierras(GenerarCertificadoPredialNodoTierras value) {
        return new JAXBElement<GenerarCertificadoPredialNodoTierras>(_GenerarCertificadoPredialNodoTierras_QNAME, GenerarCertificadoPredialNodoTierras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenCertPoseerNoPoseerNodoTierrasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nodotierras.sp.catastro.edatel.onesystem.com/", name = "genCertPoseerNoPoseerNodoTierrasResponse")
    public JAXBElement<GenCertPoseerNoPoseerNodoTierrasResponse> createGenCertPoseerNoPoseerNodoTierrasResponse(GenCertPoseerNoPoseerNodoTierrasResponse value) {
        return new JAXBElement<GenCertPoseerNoPoseerNodoTierrasResponse>(_GenCertPoseerNoPoseerNodoTierrasResponse_QNAME, GenCertPoseerNoPoseerNodoTierrasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenCertPlanoCatastralNodoTierrasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nodotierras.sp.catastro.edatel.onesystem.com/", name = "genCertPlanoCatastralNodoTierrasResponse")
    public JAXBElement<GenCertPlanoCatastralNodoTierrasResponse> createGenCertPlanoCatastralNodoTierrasResponse(GenCertPlanoCatastralNodoTierrasResponse value) {
        return new JAXBElement<GenCertPlanoCatastralNodoTierrasResponse>(_GenCertPlanoCatastralNodoTierrasResponse_QNAME, GenCertPlanoCatastralNodoTierrasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenCertPoseerNoPoseerNodoTierras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nodotierras.sp.catastro.edatel.onesystem.com/", name = "genCertPoseerNoPoseerNodoTierras")
    public JAXBElement<GenCertPoseerNoPoseerNodoTierras> createGenCertPoseerNoPoseerNodoTierras(GenCertPoseerNoPoseerNodoTierras value) {
        return new JAXBElement<GenCertPoseerNoPoseerNodoTierras>(_GenCertPoseerNoPoseerNodoTierras_QNAME, GenCertPoseerNoPoseerNodoTierras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerInformacionPredialNodoTierrasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nodotierras.sp.catastro.edatel.onesystem.com/", name = "obtenerInformacionPredialNodoTierrasResponse")
    public JAXBElement<ObtenerInformacionPredialNodoTierrasResponse> createObtenerInformacionPredialNodoTierrasResponse(ObtenerInformacionPredialNodoTierrasResponse value) {
        return new JAXBElement<ObtenerInformacionPredialNodoTierrasResponse>(_ObtenerInformacionPredialNodoTierrasResponse_QNAME, ObtenerInformacionPredialNodoTierrasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerarCertificadoPredialNodoTierrasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nodotierras.sp.catastro.edatel.onesystem.com/", name = "generarCertificadoPredialNodoTierrasResponse")
    public JAXBElement<GenerarCertificadoPredialNodoTierrasResponse> createGenerarCertificadoPredialNodoTierrasResponse(GenerarCertificadoPredialNodoTierrasResponse value) {
        return new JAXBElement<GenerarCertificadoPredialNodoTierrasResponse>(_GenerarCertificadoPredialNodoTierrasResponse_QNAME, GenerarCertificadoPredialNodoTierrasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenCertPlanoCatastralNodoTierras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nodotierras.sp.catastro.edatel.onesystem.com/", name = "genCertPlanoCatastralNodoTierras")
    public JAXBElement<GenCertPlanoCatastralNodoTierras> createGenCertPlanoCatastralNodoTierras(GenCertPlanoCatastralNodoTierras value) {
        return new JAXBElement<GenCertPlanoCatastralNodoTierras>(_GenCertPlanoCatastralNodoTierras_QNAME, GenCertPlanoCatastralNodoTierras.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerInformacionPredialNodoTierras }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://nodotierras.sp.catastro.edatel.onesystem.com/", name = "obtenerInformacionPredialNodoTierras")
    public JAXBElement<ObtenerInformacionPredialNodoTierras> createObtenerInformacionPredialNodoTierras(ObtenerInformacionPredialNodoTierras value) {
        return new JAXBElement<ObtenerInformacionPredialNodoTierras>(_ObtenerInformacionPredialNodoTierras_QNAME, ObtenerInformacionPredialNodoTierras.class, null, value);
    }

}
