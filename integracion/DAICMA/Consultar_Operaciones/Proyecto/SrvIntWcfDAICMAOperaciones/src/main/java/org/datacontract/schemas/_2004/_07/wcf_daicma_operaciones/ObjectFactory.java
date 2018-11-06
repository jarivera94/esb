
package org.datacontract.schemas._2004._07.wcf_daicma_operaciones;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.wcf_daicma_operaciones package. 
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

    private final static QName _ArrayOfClsOperaciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", "ArrayOfClsOperaciones");
    private final static QName _ClsOperaciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", "ClsOperaciones");
    private final static QName _ClsOperacionesDepartamento_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", "Departamento");
    private final static QName _ClsOperacionesOrganizacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", "Organizacion");
    private final static QName _ClsOperacionesHazReducLocalid_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", "HazReducLocalid");
    private final static QName _ClsOperacionesTipoDesminado_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", "TipoDesminado");
    private final static QName _ClsOperacionesAreaDespejada_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", "AreaDespejada");
    private final static QName _ClsOperacionesMunicipio_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", "Municipio");
    private final static QName _ClsOperacionesTipoOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", "TipoOperacion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.wcf_daicma_operaciones
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfClsOperaciones }
     * 
     */
    public ArrayOfClsOperaciones createArrayOfClsOperaciones() {
        return new ArrayOfClsOperaciones();
    }

    /**
     * Create an instance of {@link ClsOperaciones }
     * 
     */
    public ClsOperaciones createClsOperaciones() {
        return new ClsOperaciones();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClsOperaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", name = "ArrayOfClsOperaciones")
    public JAXBElement<ArrayOfClsOperaciones> createArrayOfClsOperaciones(ArrayOfClsOperaciones value) {
        return new JAXBElement<ArrayOfClsOperaciones>(_ArrayOfClsOperaciones_QNAME, ArrayOfClsOperaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsOperaciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", name = "ClsOperaciones")
    public JAXBElement<ClsOperaciones> createClsOperaciones(ClsOperaciones value) {
        return new JAXBElement<ClsOperaciones>(_ClsOperaciones_QNAME, ClsOperaciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", name = "Departamento", scope = ClsOperaciones.class)
    public JAXBElement<String> createClsOperacionesDepartamento(String value) {
        return new JAXBElement<String>(_ClsOperacionesDepartamento_QNAME, String.class, ClsOperaciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", name = "Organizacion", scope = ClsOperaciones.class)
    public JAXBElement<String> createClsOperacionesOrganizacion(String value) {
        return new JAXBElement<String>(_ClsOperacionesOrganizacion_QNAME, String.class, ClsOperaciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", name = "HazReducLocalid", scope = ClsOperaciones.class)
    public JAXBElement<String> createClsOperacionesHazReducLocalid(String value) {
        return new JAXBElement<String>(_ClsOperacionesHazReducLocalid_QNAME, String.class, ClsOperaciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", name = "TipoDesminado", scope = ClsOperaciones.class)
    public JAXBElement<String> createClsOperacionesTipoDesminado(String value) {
        return new JAXBElement<String>(_ClsOperacionesTipoDesminado_QNAME, String.class, ClsOperaciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", name = "AreaDespejada", scope = ClsOperaciones.class)
    public JAXBElement<String> createClsOperacionesAreaDespejada(String value) {
        return new JAXBElement<String>(_ClsOperacionesAreaDespejada_QNAME, String.class, ClsOperaciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", name = "Municipio", scope = ClsOperaciones.class)
    public JAXBElement<String> createClsOperacionesMunicipio(String value) {
        return new JAXBElement<String>(_ClsOperacionesMunicipio_QNAME, String.class, ClsOperaciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Operaciones", name = "TipoOperacion", scope = ClsOperaciones.class)
    public JAXBElement<String> createClsOperacionesTipoOperacion(String value) {
        return new JAXBElement<String>(_ClsOperacionesTipoOperacion_QNAME, String.class, ClsOperaciones.class, value);
    }

}
