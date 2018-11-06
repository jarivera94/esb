package com.koghi.urt.nodo.libTransaccion.processors;

import java.util.ArrayList;

import javax.servlet.ServletRequest;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.component.cxf.common.message.CxfConstants;
import org.apache.cxf.message.Message;

import com.google.gson.Gson;
import com.koghi.urt.nodo.libTransaccion.objects.ServicioActualizarTransaccion;
import com.koghi.urt.nodo.libTransaccion.objects.ServicioCrearMensaje;
import com.koghi.urt.nodo.libTransaccion.objects.ServicioCrearTransaccion;
import com.koghi.urt.nodo.libTransaccion.objects.ServicioError;
import com.koghi.urt.nodo.libTransaccion.objects.ServicioErrorCrear;
import com.koghi.urt.nodo.libTransaccion.objects.ServicioTransaccion;



public class ProcessorTransversal implements Processor {

	@Override
	public void process(Exchange ex) throws Exception {
		String operacion = ex.getIn().getHeader("operacionTransversal").toString();
		ex.getExchangeId();
		System.out.println("ENTRA A ProcessorTransversal DE LA LIBRERIA, OPERACIÓN: " + operacion);
				
		if (operacion.equals("crearTransaccion")) {
			ServicioCrearTransaccion svrCrearTrn = new ServicioCrearTransaccion();
			Message cxfMessage = ex.getIn().getHeader(CxfConstants.CAMEL_CXF_MESSAGE, Message.class);
			ServletRequest request = (ServletRequest) cxfMessage.get("HTTP.REQUEST");
			String strIpOrigen = request.getRemoteAddr();
			System.out.println("IP Origen en ProcessorTransversal: " + strIpOrigen);
			
			svrCrearTrn.setId(ex.getIn().getHeader("IdTx").toString());
			svrCrearTrn.setId_servicio( ex.getIn().getHeader("IdServicio") != null ? ex.getIn().getHeader("IdServicio", String.class) : "Vacio");
			svrCrearTrn.setId_entidad_emisora( ex.getIn().getHeader("EntidadEmisora") != null ? ex.getIn().getHeader("EntidadEmisora", String.class) : "Vacio");
			svrCrearTrn.setId_entidad_receptora(ex.getIn().getHeader("EntidadReceptora") !=null ? ex.getIn().getHeader("EntidadReceptora", String.class) : "Vacio");
			svrCrearTrn.setVal_ip_origen(ex.getIn().getHeader("valIpOrigen") != null ? ex.getIn().getHeader("valIpOrigen", String.class) : strIpOrigen);
			svrCrearTrn.setId_usuario(ex.getIn().getHeader("IdUsuario") != null ? ex.getIn().getHeader("IdUsuario", String.class) : "Vacio");
			svrCrearTrn.setId_operacion(ex.getIn().getHeader("IdOperacion") != null ? ex.getIn().getHeader("IdOperacion", String.class) : "Vacio");
			
			
			ServicioTransaccion.setId(ex.getProperty("idExchange").toString() , svrCrearTrn.getId());

			String jsonServicoCrearTransaccion = new Gson().toJson(svrCrearTrn);
			ex.getOut().setBody(jsonServicoCrearTransaccion);
			System.out.println("JSON TRANSA = " + jsonServicoCrearTransaccion);
		}else if(operacion.equals("actualizarTransaccion")){
			ServicioActualizarTransaccion servicioActualizarTransaccion = new ServicioActualizarTransaccion();
			servicioActualizarTransaccion.setId(ServicioTransaccion.getId(ex.getProperty("idExchange").toString()));
			
			if(ex.getIn().getHeader("CodEstado") != null)
				servicioActualizarTransaccion.setCod_estado(Integer.parseInt(ex.getIn().getHeader("CodEstado").toString()));
			if(ex.getIn().getHeader("FechaTerminacion") != null)
				servicioActualizarTransaccion.setFec_terminacion(ex.getIn().getHeader("FechaTerminacion").toString());
			if(ex.getIn().getHeader("EntidadReceptora") != null)
				servicioActualizarTransaccion.setId_entidad_receptora(ex.getIn().getHeader("EntidadReceptora").toString());
			if(ex.getIn().getHeader("IdUsuario") != null)
				servicioActualizarTransaccion.setId_usuario(ex.getIn().getHeader("IdUsuario").toString());
			if(ex.getIn().getHeader("ValReintentos") != null)
				servicioActualizarTransaccion.setVal_reintentos(Integer.parseInt(ex.getIn().getHeader("ValReintentos").toString()));

			String jsonActualizar = new Gson().toJson(servicioActualizarTransaccion);
			ex.getOut().setBody(jsonActualizar);
		}else if(operacion.equals("crearMensaje")){
			ServicioCrearMensaje crearMensaje = new ServicioCrearMensaje();
			crearMensaje.setId_transaccion(ServicioTransaccion.getId(ex.getProperty("idExchange").toString()));
			crearMensaje.setId_entidad_receptora(ex.getIn().getHeader("EntidadReceptora")!=null?ex.getIn().getHeader("EntidadReceptora").toString():"Vacio");
			crearMensaje.setId_entidad_emisora(ex.getIn().getHeader("EntidadReceptotra")!=null?ex.getIn().getHeader("EntidadReceptotra").toString():"Vacio");
			crearMensaje.setVal_mensaje(ex.getIn().getHeader("ValMensaje")!=null?ex.getIn().getHeader("ValMensaje").toString():"Vacio");
			crearMensaje.setId_usuario(ex.getIn().getHeader("IdUsuario")!=null?ex.getIn().getHeader("IdUsuario").toString():"Vacio");
			
			String jsonCrearMensaje = new Gson().toJson(crearMensaje);
			ex.getOut().setBody(jsonCrearMensaje);
		}else if(operacion.equals("crearError")){
			ServicioErrorCrear crearError = new ServicioErrorCrear();
			crearError.setId_transaccion(ServicioTransaccion.getId(ex.getProperty("idExchange").toString()));
			crearError.setId_usuario(ex.getIn().getHeader("IdUsuario")!=null?ex.getIn().getHeader("IdUsuario").toString():"Vacio");
			ArrayList<ServicioError> errores  = new ArrayList<ServicioError>();
			ServicioError error = new ServicioError();
			error.setId_errores(ex.getIn().getHeader("IdError")!=null?ex.getIn().getHeader("IdError").toString():"Vacio");
			error.setVal_codigo(ex.getIn().getHeader("ValCodigo")!=null?ex.getIn().getHeader("ValCodigo").toString():"Vacio");
			error.setVal_descripcion(ex.getIn().getHeader("ValDescripcion")!=null?ex.getIn().getHeader("ValDescripcion").toString():"Vacio");
			error.setVal_excepcion(ex.getIn().getHeader("ValException")!=null?ex.getIn().getHeader("ValException").toString():"Vacio");
			errores.add(error);
			crearError.setErrores(errores);
			
			
			String jsonCrearError = new Gson().toJson(crearError);
			System.out.println("JSOOOOn = " + jsonCrearError);
			ex.getOut().setBody(jsonCrearError);
		}else if(operacion.equals("limpiarCacheTransaccion")) {
			ServicioTransaccion.setId(ex.getProperty("idExchange").toString(), null);
		}

	}

}
