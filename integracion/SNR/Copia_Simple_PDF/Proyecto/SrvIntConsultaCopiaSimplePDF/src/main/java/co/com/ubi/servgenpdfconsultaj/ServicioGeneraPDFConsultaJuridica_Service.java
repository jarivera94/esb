
package co.com.ubi.servgenpdfconsultaj;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicioGeneraPDFConsultaJuridica", targetNamespace = "http://servgenpdfconsultaj.ubi.com.co/", wsdlLocation = "http://172.30.75.10:7010/ServicioGeneraPDFConsultaJuridica/ServicioGeneraPDFConsultaJuridica?wsdl")
public class ServicioGeneraPDFConsultaJuridica_Service
    extends Service
{

    private final static URL SERVICIOGENERAPDFCONSULTAJURIDICA_WSDL_LOCATION;
    private final static WebServiceException SERVICIOGENERAPDFCONSULTAJURIDICA_EXCEPTION;
    private final static QName SERVICIOGENERAPDFCONSULTAJURIDICA_QNAME = new QName("http://servgenpdfconsultaj.ubi.com.co/", "ServicioGeneraPDFConsultaJuridica");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://172.30.75.10:7010/ServicioGeneraPDFConsultaJuridica/ServicioGeneraPDFConsultaJuridica?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOGENERAPDFCONSULTAJURIDICA_WSDL_LOCATION = url;
        SERVICIOGENERAPDFCONSULTAJURIDICA_EXCEPTION = e;
    }

    public ServicioGeneraPDFConsultaJuridica_Service() {
        super(__getWsdlLocation(), SERVICIOGENERAPDFCONSULTAJURIDICA_QNAME);
    }

    public ServicioGeneraPDFConsultaJuridica_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOGENERAPDFCONSULTAJURIDICA_QNAME, features);
    }

    public ServicioGeneraPDFConsultaJuridica_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOGENERAPDFCONSULTAJURIDICA_QNAME);
    }

    public ServicioGeneraPDFConsultaJuridica_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOGENERAPDFCONSULTAJURIDICA_QNAME, features);
    }

    public ServicioGeneraPDFConsultaJuridica_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioGeneraPDFConsultaJuridica_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioGeneraPDFConsultaJuridica
     */
    @WebEndpoint(name = "ServicioGeneraPDFConsultaJuridicaPort")
    public ServicioGeneraPDFConsultaJuridica getServicioGeneraPDFConsultaJuridicaPort() {
        return super.getPort(new QName("http://servgenpdfconsultaj.ubi.com.co/", "ServicioGeneraPDFConsultaJuridicaPort"), ServicioGeneraPDFConsultaJuridica.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioGeneraPDFConsultaJuridica
     */
    @WebEndpoint(name = "ServicioGeneraPDFConsultaJuridicaPort")
    public ServicioGeneraPDFConsultaJuridica getServicioGeneraPDFConsultaJuridicaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servgenpdfconsultaj.ubi.com.co/", "ServicioGeneraPDFConsultaJuridicaPort"), ServicioGeneraPDFConsultaJuridica.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOGENERAPDFCONSULTAJURIDICA_EXCEPTION!= null) {
            throw SERVICIOGENERAPDFCONSULTAJURIDICA_EXCEPTION;
        }
        return SERVICIOGENERAPDFCONSULTAJURIDICA_WSDL_LOCATION;
    }

}