
package co.gov.gobiernoenlinea.gel_xml._1_0.schemas.proyectos.minagricultura.sipov;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.gobiernoenlinea.gel_xml._1_0.schemas.proyectos.minagricultura.sipov package. 
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

    private final static QName _OrdenesSal_QNAME = new QName("http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/Proyectos/MinAgricultura/SIPOV", "ordenesSal");
    private final static QName _OrdenesEnt_QNAME = new QName("http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/Proyectos/MinAgricultura/SIPOV", "ordenesEnt");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.gobiernoenlinea.gel_xml._1_0.schemas.proyectos.minagricultura.sipov
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfTipoOrden }
     * 
     */
    public ArrayOfTipoOrden createArrayOfTipoOrden() {
        return new ArrayOfTipoOrden();
    }

    /**
     * Create an instance of {@link TipoOrdenesEnt }
     * 
     */
    public TipoOrdenesEnt createTipoOrdenesEnt() {
        return new TipoOrdenesEnt();
    }

    /**
     * Create an instance of {@link TipoOrden }
     * 
     */
    public TipoOrden createTipoOrden() {
        return new TipoOrden();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTipoOrden }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/Proyectos/MinAgricultura/SIPOV", name = "ordenesSal")
    public JAXBElement<ArrayOfTipoOrden> createOrdenesSal(ArrayOfTipoOrden value) {
        return new JAXBElement<ArrayOfTipoOrden>(_OrdenesSal_QNAME, ArrayOfTipoOrden.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoOrdenesEnt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.gobiernoenlinea.gov.co/GEL-XML/1.0/schemas/Proyectos/MinAgricultura/SIPOV", name = "ordenesEnt")
    public JAXBElement<TipoOrdenesEnt> createOrdenesEnt(TipoOrdenesEnt value) {
        return new JAXBElement<TipoOrdenesEnt>(_OrdenesEnt_QNAME, TipoOrdenesEnt.class, null, value);
    }

}
