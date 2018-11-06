
package co.gov.rnec.ani.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.rnec.ani.ws package. 
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

    private final static QName _ConsultarCedulas_QNAME = new QName("http://ws.ani.rnec.gov.co/", "consultarCedulas");
    private final static QName _ConsultarCedulasResponse_QNAME = new QName("http://ws.ani.rnec.gov.co/", "consultarCedulasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.rnec.ani.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarCedulas }
     * 
     */
    public ConsultarCedulas createConsultarCedulas() {
        return new ConsultarCedulas();
    }

    /**
     * Create an instance of {@link ConsultarCedulasResponse }
     * 
     */
    public ConsultarCedulasResponse createConsultarCedulasResponse() {
        return new ConsultarCedulasResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCedulas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ani.rnec.gov.co/", name = "consultarCedulas")
    public JAXBElement<ConsultarCedulas> createConsultarCedulas(ConsultarCedulas value) {
        return new JAXBElement<ConsultarCedulas>(_ConsultarCedulas_QNAME, ConsultarCedulas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarCedulasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.ani.rnec.gov.co/", name = "consultarCedulasResponse")
    public JAXBElement<ConsultarCedulasResponse> createConsultarCedulasResponse(ConsultarCedulasResponse value) {
        return new JAXBElement<ConsultarCedulasResponse>(_ConsultarCedulasResponse_QNAME, ConsultarCedulasResponse.class, null, value);
    }

}
