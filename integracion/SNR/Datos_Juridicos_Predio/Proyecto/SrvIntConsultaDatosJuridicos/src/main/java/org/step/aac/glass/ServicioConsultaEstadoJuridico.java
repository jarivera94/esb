
package org.step.aac.glass;

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
@WebService(name = "ServicioConsultaEstadoJuridico", targetNamespace = "http://glass.aac.step.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioConsultaEstadoJuridico {


    /**
     * 
     * @param objEntrada
     * @param clave
     * @param sistemaUsuario
     * @return
     *     returns org.step.aac.glass.TipoEstadoJuridicoInmuebleSal
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaEstadoJuridico", targetNamespace = "http://glass.aac.step.org/", className = "org.step.aac.glass.ConsultaEstadoJuridico")
    @ResponseWrapper(localName = "consultaEstadoJuridicoResponse", targetNamespace = "http://glass.aac.step.org/", className = "org.step.aac.glass.ConsultaEstadoJuridicoResponse")
    @Action(input = "http://glass.aac.step.org/ServicioConsultaEstadoJuridico/consultaEstadoJuridicoRequest", output = "http://glass.aac.step.org/ServicioConsultaEstadoJuridico/consultaEstadoJuridicoResponse")
    public TipoEstadoJuridicoInmuebleSal consultaEstadoJuridico(
        @WebParam(name = "objEntrada", targetNamespace = "")
        TipoLstEstadoJuridicoInmuebleEnt objEntrada,
        @WebParam(name = "sistemaUsuario", targetNamespace = "")
        String sistemaUsuario,
        @WebParam(name = "clave", targetNamespace = "")
        String clave);

}
