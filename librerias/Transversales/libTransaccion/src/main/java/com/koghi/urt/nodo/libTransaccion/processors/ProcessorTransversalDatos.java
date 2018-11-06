package com.koghi.urt.nodo.libTransaccion.processors;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.UUID;

//import javax.servlet.ServletRequest;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
//import org.apache.camel.component.cxf.common.message.CxfConstants;
//import org.apache.cxf.message.*;

public class ProcessorTransversalDatos implements Processor {

	@Override
	public void process(Exchange ex) throws Exception {
		
		ex.setOut(ex.getIn());
		String operacion = ex.getIn().getHeader("operacionTransversal").toString();
		if (operacion.equals("crearTransaccion")) {			
			ex.getOut().setHeader("IdTx", UUID.randomUUID().toString());
			ex.getOut().setHeader("NumRadicado", (ex.getIn().getHeader("NumRadicado")!=null?ex.getIn().getHeader("NumRadicado").toString():""));
			ex.getOut().setHeader("IdUSuario", ex.getIn().getHeader("IdUsuario")!=null?ex.getIn().getHeader("IdUsuario").toString():"Vacio");
			ex.getOut().setHeader("IdOperacion", ex.getIn().getHeader("IdOperacion")!=null?ex.getIn().getHeader("IdOperacion").toString():"Vacio");
//			ex.getOut().setHeader("valIpOrigen", strIpOrigen);
		}else if(operacion.equals("actualizarTransaccion")){
			SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
			ex.getOut().setHeader("FechaTerminacion", dt.format(new Date()));
			ex.getOut().setHeader("IdUsuario", ex.getIn().getHeader("IdUsuario")!=null?ex.getIn().getHeader("IdUsuario").toString():"Vacio");
			ex.getOut().setHeader("NumRadicado", (ex.getIn().getHeader("NumRadicado")!=null?ex.getIn().getHeader("NumRadicado").toString():""));
		}else if(operacion.equals("crearMensaje")){
			//En este header se pone la entrada del servicio en este caso viene en el body
			ex.getOut().setHeader("ValMensaje", ex.getIn().getBody(String.class));
			ex.getOut().setHeader("IdUsuario", ex.getIn().getHeader("IdUsuario")!=null?ex.getIn().getHeader("IdUsuario"):"Vacio");
		}else if(operacion.equals("crearError")){
			Exception e = ex.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
			ex.getOut().setHeader("IdUsuario", ex.getIn().getHeader("IdUsuario")!=null?ex.getIn().getHeader("IdUsuario"):"Vacio");
			ex.getOut().setHeader("ValDescripcion", e!=null?e.getMessage():"Se generó un error al ejecutar la operación");
			ex.getOut().setHeader("ValException", e!=null?e.getClass().getName():"Null");
//			ex.getOut().setHeader("ValCodigo", "100");
		}
	}

}
