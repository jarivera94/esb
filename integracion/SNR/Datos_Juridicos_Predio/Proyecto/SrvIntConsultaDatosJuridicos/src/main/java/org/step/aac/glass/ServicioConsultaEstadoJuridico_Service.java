
package org.step.aac.glass;

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
@WebServiceClient(name = "ServicioConsultaEstadoJuridico", targetNamespace = "http://glass.aac.step.org/", wsdlLocation = "http://172.30.75.11:7010/ServicioConsultaEstadoJuridico/ServicioConsultaEstadoJuridico?wsdl")
public class ServicioConsultaEstadoJuridico_Service
    extends Service
{

    private final static URL SERVICIOCONSULTAESTADOJURIDICO_WSDL_LOCATION;
    private final static WebServiceException SERVICIOCONSULTAESTADOJURIDICO_EXCEPTION;
    private final static QName SERVICIOCONSULTAESTADOJURIDICO_QNAME = new QName("http://glass.aac.step.org/", "ServicioConsultaEstadoJuridico");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://172.30.75.11:7010/ServicioConsultaEstadoJuridico/ServicioConsultaEstadoJuridico?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOCONSULTAESTADOJURIDICO_WSDL_LOCATION = url;
        SERVICIOCONSULTAESTADOJURIDICO_EXCEPTION = e;
    }

    public ServicioConsultaEstadoJuridico_Service() {
        super(__getWsdlLocation(), SERVICIOCONSULTAESTADOJURIDICO_QNAME);
    }

    public ServicioConsultaEstadoJuridico_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOCONSULTAESTADOJURIDICO_QNAME, features);
    }

    public ServicioConsultaEstadoJuridico_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOCONSULTAESTADOJURIDICO_QNAME);
    }

    public ServicioConsultaEstadoJuridico_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOCONSULTAESTADOJURIDICO_QNAME, features);
    }

    public ServicioConsultaEstadoJuridico_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioConsultaEstadoJuridico_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioConsultaEstadoJuridico
     */
    @WebEndpoint(name = "ServicioConsultaEstadoJuridicoPort")
    public ServicioConsultaEstadoJuridico getServicioConsultaEstadoJuridicoPort() {
        return super.getPort(new QName("http://glass.aac.step.org/", "ServicioConsultaEstadoJuridicoPort"), ServicioConsultaEstadoJuridico.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioConsultaEstadoJuridico
     */
    @WebEndpoint(name = "ServicioConsultaEstadoJuridicoPort")
    public ServicioConsultaEstadoJuridico getServicioConsultaEstadoJuridicoPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://glass.aac.step.org/", "ServicioConsultaEstadoJuridicoPort"), ServicioConsultaEstadoJuridico.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOCONSULTAESTADOJURIDICO_EXCEPTION!= null) {
            throw SERVICIOCONSULTAESTADOJURIDICO_EXCEPTION;
        }
        return SERVICIOCONSULTAESTADOJURIDICO_WSDL_LOCATION;
    }

}