package com.koghi.nodo.transversales.procesadores.srvIntTransvTransaccion;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;
import com.koghi.nodo.transversales.tos.srvIntTransvTransaccion.*;

public class PrcActualizar implements Processor{
	@Override
	public void process(Exchange ex) throws Exception {
		String body = ex.getIn().getBody(String.class);
		TOTransaccion Data = new Gson().fromJson(body, TOTransaccion.class);
		
		if (Data.getId()!=null && !Data.getId().replace(" ","").isEmpty() &&
				Data.getIdUsuario()!=null && !Data.getIdUsuario().replace(" ","").isEmpty()){
		
			String TX_Query;
			String EVT_Descripcion = "";
			Date date = new Date();
			DateFormat hourdateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			Data.setFecModificacion(hourdateFormat.format(date));
			
			if (Data.getIdOperacion()!=null && !Data.getIdOperacion().replace(" ","").isEmpty()){
				TX_Query = "sqlComponent:UPDATE ESB_TRANSACCION " + 
				"SET ID_OPERACION='" + Data.getIdOperacion() + 
				"',FEC_MODIFICACION='" + Data.getFecModificacion() + 
				"',ID_USUARIO_MODIFICACION='" + Data.getIdUsuario() +  
				"' WHERE ID='" + Data.getId() + "'";
				
				ex.getContext().createProducerTemplate().send(TX_Query,ex);
				EVT_Descripcion = EVT_Descripcion + ", Id_operación = " + Data.getIdOperacion();
			}
			
			if (Data.getCodEstado()!=0){
				TX_Query = "sqlComponent:UPDATE ESB_TRANSACCION " + 
				"SET COD_ESTADO='" + Data.getCodEstado() + 
				"',FEC_MODIFICACION='" + Data.getFecModificacion() + 
				"',ID_USUARIO_MODIFICACION='" + Data.getIdUsuario() +  
				"' WHERE ID='" + Data.getId() + "'";
				
				ex.getContext().createProducerTemplate().send(TX_Query,ex);
				EVT_Descripcion = EVT_Descripcion + ", Cod_estado = " + Data.getCodEstado();
			}
			
			if (Data.getValReintentos()!=0){
				TX_Query = "sqlComponent:UPDATE ESB_TRANSACCION " + 
				"SET VAL_REINTENTOS='" + Data.getValReintentos() + 
				"',FEC_MODIFICACION='" + Data.getFecModificacion() + 
				"',ID_USUARIO_MODIFICACION='" + Data.getIdUsuario() +  
				"' WHERE ID='" + Data.getId() + "'";
				
				ex.getContext().createProducerTemplate().send(TX_Query,ex);
				EVT_Descripcion = EVT_Descripcion + ", Val_reintentos = " + Data.getValReintentos();
			}
			
			if (Data.getIdTxPrevia()!=null && !Data.getIdTxPrevia().replace(" ","").isEmpty()){
				TX_Query = "sqlComponent:UPDATE ESB_TRANSACCION " + 
				"SET ID_TX_PREVIA='" + Data.getIdTxPrevia() + 
				"',FEC_MODIFICACION='" + Data.getFecModificacion() + 
				"',ID_USUARIO_MODIFICACION='" + Data.getIdUsuario() +  
				"' WHERE ID='" + Data.getId() + "'";
				
				ex.getContext().createProducerTemplate().send(TX_Query,ex);
				EVT_Descripcion = EVT_Descripcion + ", Id_tx_previa = " + Data.getIdTxPrevia();
			}
			
//			if (Data.getNumRadicado()!=null && !Data.getNumRadicado().replace(" ","").isEmpty()){
//				TX_Query = "sqlComponent:UPDATE ESB_TRANSACCION " + 
//				"SET NUM_RADICADO='" + Data.getNumRadicado() + 
//				"',FEC_MODIFICACION='" + Data.getFecModificacion() + 
//				"',ID_USUARIO_MODIFICACION='" + Data.getIdUsuario() +  
//				"' WHERE ID='" + Data.getId() + "'";
//				
//				ex.getContext().createProducerTemplate().send(TX_Query,ex);
//				EVT_Descripcion = EVT_Descripcion + ", Num_radicado = " + Data.getNumRadicado();
//			}
			
			if (Data.getIdEntidadReceptora()!=null && !Data.getIdEntidadReceptora().replace(" ","").isEmpty()){
				TX_Query = "sqlComponent:UPDATE ESB_TRANSACCION " + 
				"SET ID_ENTIDAD_RECEPTORA='" + Data.getIdEntidadReceptora() + 
				"',FEC_MODIFICACION='" + Data.getFecModificacion() + 
				"',ID_USUARIO_MODIFICACION='" + Data.getIdUsuario() +  
				"' WHERE ID='" + Data.getId() + "'";
				
				ex.getContext().createProducerTemplate().send(TX_Query,ex);
				EVT_Descripcion = EVT_Descripcion + ", Id_entidad_receptora = " + Data.getIdEntidadReceptora();
			}
			
			if (Data.getFecTerminacion()!=null && !Data.getFecTerminacion().replace(" ","").isEmpty()){
				TX_Query = "sqlComponent:UPDATE ESB_TRANSACCION " + 
				"SET FEC_TERMINACION='" + Data.getFecTerminacion() + 
				"',FEC_MODIFICACION='" + Data.getFecModificacion() + 
				"',ID_USUARIO_MODIFICACION='" + Data.getIdUsuario() +  
				"' WHERE ID='" + Data.getId() + "'";
				
				ex.getContext().createProducerTemplate().send(TX_Query,ex);
				EVT_Descripcion = EVT_Descripcion + ", Fec_terminacion = " + Data.getFecTerminacion();
			}
			
			TOEvento DataEVT = new TOEvento ();
			DataEVT.setValDescripcion("Actualización de transacción: " + Data.getId() + ", con fecha: " + Data.getFecModificacion() + EVT_Descripcion + ".");
			DataEVT.setValSeveridad("INFO");
			DataEVT.setIdTransaccion(Data.getId());
			DataEVT.setIdUsuario(Data.getIdUsuario());
			String EVT_Query = new Gson().toJson(DataEVT);
			
			ex.getOut().setHeader("TX_Id", Data.getId());
			ex.getOut().setHeader("EVT_Query", EVT_Query);
			body = "true";
			
		} else {
			body = "[0] : Datos insuficientes para crear la transacción . .	.";
		}
		ex.getOut().setBody(body);
	}
}
