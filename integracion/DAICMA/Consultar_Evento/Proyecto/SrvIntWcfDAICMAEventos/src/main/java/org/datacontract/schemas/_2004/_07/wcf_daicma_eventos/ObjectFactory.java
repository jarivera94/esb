
package org.datacontract.schemas._2004._07.wcf_daicma_eventos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.wcf_daicma_eventos package. 
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

    private final static QName _ClsEventos_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", "ClsEventos");
    private final static QName _ArrayOfClsEventos_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", "ArrayOfClsEventos");
    private final static QName _ClsEventosSitio_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", "Sitio");
    private final static QName _ClsEventosTipoEvento_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", "TipoEvento");
    private final static QName _ClsEventosMunicipio_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", "Municipio");
    private final static QName _ClsEventosCodImsmaEvento_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", "CodImsmaEvento");
    private final static QName _ClsEventosTipoLugar_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", "TipoLugar");
    private final static QName _ClsEventosPresuntoActorResponsable_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", "PresuntoActorResponsable");
    private final static QName _ClsEventosDepartamento_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", "Departamento");
    private final static QName _ClsEventosEstado_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", "Estado");
    private final static QName _ClsEventosCoordenadasTomadasCon_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", "CoordenadasTomadasCon");
    private final static QName _ClsEventosEvento_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", "Evento");
    private final static QName _ClsEventosDescripcionEvento_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", "DescripcionEvento");
    private final static QName _ClsEventosTipoArea_QNAME = new QName("http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", "TipoArea");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.wcf_daicma_eventos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfClsEventos }
     * 
     */
    public ArrayOfClsEventos createArrayOfClsEventos() {
        return new ArrayOfClsEventos();
    }

    /**
     * Create an instance of {@link ClsEventos }
     * 
     */
    public ClsEventos createClsEventos() {
        return new ClsEventos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClsEventos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", name = "ClsEventos")
    public JAXBElement<ClsEventos> createClsEventos(ClsEventos value) {
        return new JAXBElement<ClsEventos>(_ClsEventos_QNAME, ClsEventos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfClsEventos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", name = "ArrayOfClsEventos")
    public JAXBElement<ArrayOfClsEventos> createArrayOfClsEventos(ArrayOfClsEventos value) {
        return new JAXBElement<ArrayOfClsEventos>(_ArrayOfClsEventos_QNAME, ArrayOfClsEventos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", name = "Sitio", scope = ClsEventos.class)
    public JAXBElement<String> createClsEventosSitio(String value) {
        return new JAXBElement<String>(_ClsEventosSitio_QNAME, String.class, ClsEventos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", name = "TipoEvento", scope = ClsEventos.class)
    public JAXBElement<String> createClsEventosTipoEvento(String value) {
        return new JAXBElement<String>(_ClsEventosTipoEvento_QNAME, String.class, ClsEventos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", name = "Municipio", scope = ClsEventos.class)
    public JAXBElement<String> createClsEventosMunicipio(String value) {
        return new JAXBElement<String>(_ClsEventosMunicipio_QNAME, String.class, ClsEventos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", name = "CodImsmaEvento", scope = ClsEventos.class)
    public JAXBElement<String> createClsEventosCodImsmaEvento(String value) {
        return new JAXBElement<String>(_ClsEventosCodImsmaEvento_QNAME, String.class, ClsEventos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", name = "TipoLugar", scope = ClsEventos.class)
    public JAXBElement<String> createClsEventosTipoLugar(String value) {
        return new JAXBElement<String>(_ClsEventosTipoLugar_QNAME, String.class, ClsEventos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", name = "PresuntoActorResponsable", scope = ClsEventos.class)
    public JAXBElement<String> createClsEventosPresuntoActorResponsable(String value) {
        return new JAXBElement<String>(_ClsEventosPresuntoActorResponsable_QNAME, String.class, ClsEventos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", name = "Departamento", scope = ClsEventos.class)
    public JAXBElement<String> createClsEventosDepartamento(String value) {
        return new JAXBElement<String>(_ClsEventosDepartamento_QNAME, String.class, ClsEventos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", name = "Estado", scope = ClsEventos.class)
    public JAXBElement<String> createClsEventosEstado(String value) {
        return new JAXBElement<String>(_ClsEventosEstado_QNAME, String.class, ClsEventos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", name = "CoordenadasTomadasCon", scope = ClsEventos.class)
    public JAXBElement<String> createClsEventosCoordenadasTomadasCon(String value) {
        return new JAXBElement<String>(_ClsEventosCoordenadasTomadasCon_QNAME, String.class, ClsEventos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", name = "Evento", scope = ClsEventos.class)
    public JAXBElement<String> createClsEventosEvento(String value) {
        return new JAXBElement<String>(_ClsEventosEvento_QNAME, String.class, ClsEventos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", name = "DescripcionEvento", scope = ClsEventos.class)
    public JAXBElement<String> createClsEventosDescripcionEvento(String value) {
        return new JAXBElement<String>(_ClsEventosDescripcionEvento_QNAME, String.class, ClsEventos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/wcf_DAICMA_Eventos", name = "TipoArea", scope = ClsEventos.class)
    public JAXBElement<String> createClsEventosTipoArea(String value) {
        return new JAXBElement<String>(_ClsEventosTipoArea_QNAME, String.class, ClsEventos.class, value);
    }

}
