
package org.tempuri.operaciones;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import org.datacontract.schemas._2004._07.wcf_daicma_operaciones.ArrayOfClsOperaciones;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Iwcf_DAICMA_Operaciones", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class,
    org.datacontract.schemas._2004._07.wcf_daicma_operaciones.ObjectFactory.class,
    org.tempuri.operaciones.ObjectFactory.class
})
public interface IwcfDAICMAOperaciones {


    /**
     * 
     * @param intCodDaneMunicipio
     * @param intCodDaneDepto
     * @param intMmFechaOperacion
     * @param intAaaaFechaOperacion
     * @return
     *     returns org.datacontract.schemas._2004._07.wcf_daicma_operaciones.ArrayOfClsOperaciones
     */
    @WebMethod(operationName = "fnt_DAICMA_ConsultarOperaciones", action = "http://tempuri.org/Iwcf_DAICMA_Operaciones/fnt_DAICMA_ConsultarOperaciones")
    @WebResult(name = "fnt_DAICMA_ConsultarOperacionesResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "fnt_DAICMA_ConsultarOperaciones", targetNamespace = "http://tempuri.org/", className = "org.tempuri.FntDAICMAConsultarOperaciones")
    @ResponseWrapper(localName = "fnt_DAICMA_ConsultarOperacionesResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.FntDAICMAConsultarOperacionesResponse")
    public ArrayOfClsOperaciones fntDAICMAConsultarOperaciones(
        @WebParam(name = "intCodDaneDepto", targetNamespace = "http://tempuri.org/")
        Integer intCodDaneDepto,
        @WebParam(name = "intCodDaneMunicipio", targetNamespace = "http://tempuri.org/")
        Integer intCodDaneMunicipio,
        @WebParam(name = "intAaaaFechaOperacion", targetNamespace = "http://tempuri.org/")
        Integer intAaaaFechaOperacion,
        @WebParam(name = "intMmFechaOperacion", targetNamespace = "http://tempuri.org/")
        Integer intMmFechaOperacion);

}