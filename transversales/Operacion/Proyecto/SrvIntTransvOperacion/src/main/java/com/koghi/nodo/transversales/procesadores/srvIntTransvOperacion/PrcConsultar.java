package com.koghi.nodo.transversales.procesadores.srvIntTransvOperacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;
import com.koghi.nodo.transversales.tos.srvIntTransvOperacion.*;
import com.koghi.nodo.transversales.util.srvIntTransvOperacion.UtlCacheOperacion;

public class PrcConsultar implements Processor{
	@Override
	public void process(Exchange ex) throws Exception {
		String body = ex.getIn().getBody(String.class);
		
		if (body!=null && !body.replace(" ","").isEmpty()){
			
			ArrayList <TORol> roles = new ArrayList<TORol>();
			TORol rol;
			TOOperacion opr = new TOOperacion();
			UtlCacheOperacion instanciaCache = UtlCacheOperacion.getInstance();
			String json = null;
			
			if (instanciaCache.getCache().containsKey(body) && false){
				opr = instanciaCache.getCache().get(body);
				json = new Gson().toJson(opr);
			}else{						
				String query = "sqlComponent:select * from ESB_OPERACION where ID='" + body + "'";
				ex.getContext().createProducerTemplate().send(query, ex);
				
				@SuppressWarnings("unchecked")
				List<Map<String, Object>> operaciones = ex.getOut().getBody(List.class);
				if (!operaciones.isEmpty()){
					Map<String, Object> operacion = operaciones.get(0);
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
					
					query = "sqlComponent:select * from ESB_ROL_OPERACION where ID_OPERACION='" + body + "'";
					ex.getContext().createProducerTemplate().send(query,ex);
					
					@SuppressWarnings("unchecked")
					List<Map<String, Object>> roles_opr = ex.getOut().getBody(List.class);			
					for (Map<String, Object> rol_opr : roles_opr) {
						rol = new TORol();
						
						rol.setId(rol_opr.get("ID").toString());
						rol.setIdRol(rol_opr.get("ID_ROL").toString());
						rol.setIdOperacion(rol_opr.get("ID_OPERACION").toString());
						rol.setFecCreacion(rol_opr.get("FEC_CREACION").toString());
						rol.setIdUsuarioCreacion(rol_opr.get("ID_USUARIO_CREACION").toString());
						
						if (rol_opr.get("FEC_MODIFICACION")!=null)
							rol.setFecModificacion(rol_opr.get("FEC_MODIFICACION").toString());
						if (rol_opr.get("ID_USUARIO_MODIFICACION")!=null)
							rol.setIdUsuarioModificacion(rol_opr.get("ID_USUARIO_MODIFICACION").toString());

						roles.add(rol);
					}				
					if(!roles.isEmpty())
						opr.setRoles(roles);
					
					instanciaCache.getCache().put(body, opr);
					json = new Gson().toJson(opr);
				}
			}
			
			body = json;
			
		} else {
			body = "[0] : Datos insuficientes para crear la transacción . .	.";
		}
		ex.getOut().setBody(body);
	}
}
