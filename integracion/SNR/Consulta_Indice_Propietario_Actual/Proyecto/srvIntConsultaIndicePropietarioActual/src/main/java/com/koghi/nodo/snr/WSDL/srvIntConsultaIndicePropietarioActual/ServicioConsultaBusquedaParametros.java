
package com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicioConsultaBusquedaParametros", targetNamespace = "http://glass.aac.step.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioConsultaBusquedaParametros {


    /**
     * 
     * @param clave
     * @param entrada
     * @param sistemaUsuario
     * @return
     *     returns com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.TipoListResultadoCompleto
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ejecutarBusqueda", targetNamespace = "http://glass.aac.step.org/", className = "com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.EjecutarBusqueda")
    @ResponseWrapper(localName = "ejecutarBusquedaResponse", targetNamespace = "http://glass.aac.step.org/", className = "com.koghi.nodo.snr.WSDL.srvIntConsultaIndicePropietarioActual.EjecutarBusquedaResponse")
    @Action(input = "http://glass.aac.step.org/ServicioConsultaBusquedaParametros/ejecutarBusquedaRequest", output = "http://glass.aac.step.org/ServicioConsultaBusquedaParametros/ejecutarBusquedaResponse")
    public TipoListResultadoCompleto ejecutarBusqueda(
        @WebParam(name = "entrada", targetNamespace = "")
        TipoParametrosBusqueda entrada,
        @WebParam(name = "sistemaUsuario", targetNamespace = "")
        String sistemaUsuario,
        @WebParam(name = "clave", targetNamespace = "")
        String clave);

}
