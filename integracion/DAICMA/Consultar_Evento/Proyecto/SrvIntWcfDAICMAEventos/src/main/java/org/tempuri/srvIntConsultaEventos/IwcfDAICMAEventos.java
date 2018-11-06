
package org.tempuri.srvIntConsultaEventos;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.datacontract.schemas._2004._07.wcf_daicma_eventos.ArrayOfClsEventos;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Iwcf_DAICMA_Eventos", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    org.datacontract.schemas._2004._07.wcf_daicma_eventos.ObjectFactory.class,
    org.tempuri.srvIntConsultaEventos.ObjectFactory.class
})
public interface IwcfDAICMAEventos {


    /**
     * 
     * @param intCodDaneMunicipio
     * @param intMmFechaEvento
     * @param intCodDaneDepto
     * @param intAaaaFechaEvento
     * @return
     *     returns org.datacontract.schemas._2004._07.wcf_daicma_eventos.ArrayOfClsEventos
     */
    @WebMethod(operationName = "fnt_DAICMA_ConsultarEventos", action = "http://tempuri.org/Iwcf_DAICMA_Eventos/fnt_DAICMA_ConsultarEventos")
    @WebResult(name = "fnt_DAICMA_ConsultarEventosResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "fnt_DAICMA_ConsultarEventos", targetNamespace = "http://tempuri.org/", className = "org.tempuri.FntDAICMAConsultarEventos")
    @ResponseWrapper(localName = "fnt_DAICMA_ConsultarEventosResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.FntDAICMAConsultarEventosResponse")
    public ArrayOfClsEventos fntDAICMAConsultarEventos(
        @WebParam(name = "intCodDaneDepto", targetNamespace = "http://tempuri.org/")
        Integer intCodDaneDepto,
        @WebParam(name = "intCodDaneMunicipio", targetNamespace = "http://tempuri.org/")
        Integer intCodDaneMunicipio,
        @WebParam(name = "intAaaaFechaEvento", targetNamespace = "http://tempuri.org/")
        Integer intAaaaFechaEvento,
        @WebParam(name = "intMmFechaEvento", targetNamespace = "http://tempuri.org/")
        Integer intMmFechaEvento);

}
