
package org.tempuri.srvIntConsultaEventos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcf_daicma_eventos.ArrayOfClsEventos;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _FntDAICMAConsultarEventosResponseFntDAICMAConsultarEventosResult_QNAME = new QName("http://tempuri.org/", "fnt_DAICMA_ConsultarEventosResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FntDAICMAConsultarEventosResponse }
     * 
     */
    public FntDAICMAConsultarEventosResponse createFntDAICMAConsultarEventosResponse() {
        return new FntDAICMAConsultarEventosResponse();
    }

    /**
     * Create an instance of {@link FntDAICMAConsultarEventos }
     * 
     */
    public FntDAICMAConsultarEventos createFntDAICMAConsultarEventos() {
        return new FntDAICMAConsultarEventos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClsEventos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fnt_DAICMA_ConsultarEventosResult", scope = FntDAICMAConsultarEventosResponse.class)
    public JAXBElement<ArrayOfClsEventos> createFntDAICMAConsultarEventosResponseFntDAICMAConsultarEventosResult(ArrayOfClsEventos value) {
        return new JAXBElement<ArrayOfClsEventos>(_FntDAICMAConsultarEventosResponseFntDAICMAConsultarEventosResult_QNAME, ArrayOfClsEventos.class, FntDAICMAConsultarEventosResponse.class, value);
    }

}
