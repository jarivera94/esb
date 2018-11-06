package com.koghi.nodo.transversales.procesadores.srvIntTransvServicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;

import com.koghi.nodo.transversales.tos.srvIntTransvServicio.*;
import com.koghi.nodo.transversales.utils.UtlCacheServicio;

public class PrcConsultar implements Processor{
	@Override
	public void process(Exchange ex) throws Exception {
		String body = ex.getIn().getBody(String.class);
		
		if (body!=null && !body.replace(" ","").isEmpty()){
			
			ArrayList <TOOperacion> oprs= new ArrayList<TOOperacion>();
			TOOperacion opr;
			TOServicio srv = new TOServicio();
			String json = null;
			
			UtlCacheServicio instanciaCache = UtlCacheServicio.getInstance();
			if (instanciaCache.getCache().containsKey(body) && false){
				srv = instanciaCache.getCache().get(body);
				json = new Gson().toJson(srv);
			}else{
				String query = "sqlComponent:select * from ESB_SERVICIO where ID='" + body + "'";
				ex.getContext().createProducerTemplate().send(query,ex);
				
				@SuppressWarnings("unchecked")
				List<Map<String, Object>> servicios = ex.getOut().getBody(List.class);
				if (!servicios.isEmpty()){
					Map<String, Object> servicio = servicios.get(0);

					srv.setId(servicio.get("ID").toString());
					srv.setValNombre(servicio.get("VAL_NOMBRE").toString());
					srv.setValVersion(Integer.parseInt(servicio.get("VAL_VERSION").toString()));
					srv.setFecCreacion(servicio.get("FEC_CREACION").toString());
					srv.setIdUsuarioCreacion(servicio.get("ID_USUARIO_CREACION").toString());
					
					if (servicio.get("VAL_EMAIL_NOTIFICACION")!=null)
						srv.setValEmailNotificacion(servicio.get("VAL_EMAIL_NOTIFICACION").toString());
					if (servicio.get("ID_ENTIDAD")!=null)
						srv.setIdEntidad(servicio.get("ID_ENTIDAD").toString());
					if (servicio.get("COD_TIPO")!=null)
						srv.setCodTipo(servicio.get("COD_TIPO").toString());
					if (servicio.get("FEC_MODIFICACION")!=null)
						srv.setFecModificacion(servicio.get("FEC_MODIFICACION").toString());
					if (servicio.get("ID_USUARIO_MODIFICACION")!=null)
						srv.setIdUsuarioModificacion(servicio.get("ID_USUARIO_MODIFICACION").toString());
											
					query = "sqlComponent:select * from ESB_OPERACION where ID_SERVICIO='" + body + "'";
					ex.getContext().createProducerTemplate().send(query,ex);
					
					@SuppressWarnings("unchecked")
					List<Map<String, Object>> operaciones = ex.getOut().getBody(List.class);			
					for (Map<String, Object> operacion : operaciones) {
						opr = new TOOperacion();
						
						opr.setId(operacion.get("ID").toString());
						opr.setIdServicio(operacion.get("ID_SERVICIO").toString());
						opr.setIdUsuarioCreacion(operacion.get("ID_USUARIO_CREACION").toString());
						
						if (operacion.get("VAL_NOMBRE")!=null)
							opr.setValNombre(operacion.get("VAL_NOMBRE").toString());
						if (operacion.get("VAL_ENDPOINT_DESARROLLO")!=null)
							opr.setValEndpointDesarrollo(operacion.get("VAL_ENDPOINT_DESARROLLO").toString());
						if (operacion.get("VAL_ENDPOINT_PRUEBAS")!=null)
							opr.setValEndpointPruebas(operacion.get("VAL_ENDPOINT_PRUEBAS").toString());
						if (operacion.get("VAL_ENDPOINT_PRODUCCION")!=null)
							opr.setValEndpointProduccion(operacion.get("VAL_ENDPOINT_PRODUCCION").toString());
						if (operacion.get("VAL_ENDPOINT_PREPRODUCCION")!=null)
							opr.setValEndpointPreproduccion(operacion.get("VAL_ENDPOINT_PREPRODUCCION").toString());
						if (operacion.get("IND_EXISTE_AUTENTICACION")!=null)
							opr.setIndExisteAutenticacion(Integer.parseInt(operacion.get("IND_EXISTE_AUTENTICACION").toString()));
						if (operacion.get("IND_EXISTE_AUTORIZACION")!=null)
							opr.setIndExisteAutorizacion(Integer.parseInt(operacion.get("IND_EXISTE_AUTORIZACION").toString()));
						if (operacion.get("FEC_CREACION")!=null)
							opr.setFecCreacion(operacion.get("FEC_CREACION").toString());
						if (operacion.get("FEC_MODIFICACION")!=null)
							opr.setFecModificacion(operacion.get("FEC_MODIFICACION").toString());
						if (operacion.get("ID_USUARIO_MODIFICACION")!=null)
							opr.setIdUsuarioModificacion(operacion.get("ID_USUARIO_MODIFICACION").toString());
						
						oprs.add(opr);
					}				
					if(!oprs.isEmpty())
						srv.setOperaciones(oprs);
					instanciaCache.getCache().put(body, srv);
					json = new Gson().toJson(srv);
				}
			}			
			body = json;
			
		} else {
			body = "[0] : Datos insuficientes para crear la transacción . .	.";
		}
		ex.getOut().setBody(body);
	}
}
