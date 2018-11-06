
package org.tempuri.operaciones;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.wcf_daicma_operaciones.ArrayOfClsOperaciones;


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

    private final static QName _FntDAICMAConsultarOperacionesResponseFntDAICMAConsultarOperacionesResult_QNAME = new QName("http://tempuri.org/", "fnt_DAICMA_ConsultarOperacionesResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FntDAICMAConsultarOperacionesResponse }
     * 
     */
    public FntDAICMAConsultarOperacionesResponse createFntDAICMAConsultarOperacionesResponse() {
        return new FntDAICMAConsultarOperacionesResponse();
    }

    /**
     * Create an instance of {@link FntDAICMAConsultarOperaciones }
     * 
     */
    public FntDAICMAConsultarOperaciones createFntDAICMAConsultarOperaciones() {
        return new FntDAICMAConsultarOperaciones();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClsOperaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "fnt_DAICMA_ConsultarOperacionesResult", scope = FntDAICMAConsultarOperacionesResponse.class)
    public JAXBElement<ArrayOfClsOperaciones> createFntDAICMAConsultarOperacionesResponseFntDAICMAConsultarOperacionesResult(ArrayOfClsOperaciones value) {
        return new JAXBElement<ArrayOfClsOperaciones>(_FntDAICMAConsultarOperacionesResponseFntDAICMAConsultarOperacionesResult_QNAME, ArrayOfClsOperaciones.class, FntDAICMAConsultarOperacionesResponse.class, value);
    }

}
