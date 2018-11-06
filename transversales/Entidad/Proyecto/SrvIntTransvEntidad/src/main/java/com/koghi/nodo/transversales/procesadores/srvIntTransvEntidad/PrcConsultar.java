package com.koghi.nodo.transversales.procesadores.srvIntTransvEntidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;
import com.koghi.nodo.transversales.tos.srvIntTransvEntidad.*;
import com.koghi.nodo.transversales.util.srvIntTransvEntidad.UtlCacheEntidad;

public class PrcConsultar implements Processor{
	@Override
	public void process(Exchange ex) throws Exception {
		String body = ex.getIn().getBody(String.class);
		
		if (body!=null && !body.replace(" ","").isEmpty()){
			
			ArrayList <TOEntidadIp> ips = new ArrayList<TOEntidadIp>();
			TOEntidadIp ip;
			TOEntidad ent = new TOEntidad();
			UtlCacheEntidad instanciaCache = UtlCacheEntidad.getInstance();
			String json = null;
			
			if (instanciaCache.getCache().containsKey(body) && false){
				ent = instanciaCache.getCache().get(body);
				json = new Gson().toJson(ent);
			}else{						
				String query = "sqlComponent:select * from ESB_ENTIDAD where ID='" + body + "'";
				ex.getContext().createProducerTemplate().send(query,ex);
				
				@SuppressWarnings("unchecked")
				List<Map<String, Object>> entidades = ex.getOut().getBody(List.class);			
				if (entidades != null) {
					if (!entidades.isEmpty()){
						Map<String, Object> entidad = entidades.get(0);
						ent.setId(entidad.get("ID").toString());
						ent.setValNombre(entidad.get("VAL_NOMBRE").toString());
						ent.setFecCreacion(entidad.get("FEC_CREACION").toString());
						ent.setIdUsuarioCreacion(entidad.get("ID_USUARIO_CREACION").toString());
						
						if (entidad.get("FEC_MODIFICACION")!=null)
							ent.setFecModificacion(entidad.get("FEC_MODIFICACION").toString());
						if (entidad.get("ID_USUARIO_MODIFICACION")!=null)
							ent.setIdUsuarioModificacion(entidad.get("ID_USUARIO_MODIFICACION").toString());
						
						query = "sqlComponent:select * from ESB_ENTIDAD_IP where ID_ENTIDAD='" + body + "'";
						ex.getContext().createProducerTemplate().send(query,ex);
						
						@SuppressWarnings("unchecked")
						List<Map<String, Object>> entidades_ip = ex.getOut().getBody(List.class);
						
						for (Map<String, Object> entidad_ip : entidades_ip) {
							ip = new TOEntidadIp();
							
							ip.setId(entidad_ip.get("ID").toString());
							ip.setIdEntidad(entidad_ip.get("ID_ENTIDAD").toString());
							ip.setValIpPermitido(entidad_ip.get("VAL_IP_PERMITIDO").toString());
							ip.setFecCreacion(entidad_ip.get("FEC_CREACION").toString());
							ip.setIdUsuarioCreacion(entidad_ip.get("ID_USUARIO_CREACION").toString());
							
							if (entidad_ip.get("FEC_MODIFICACION")!=null)
								ip.setFecModificacion(entidad_ip.get("FEC_MODIFICACION").toString());
							if (entidad_ip.get("ID_USUARIO_MODIFICACION")!=null)
								ip.setIdUsuarioModificacion(entidad_ip.get("ID_USUARIO_MODIFICACION").toString());

							ips.add(ip);
						}
						if(!ips.isEmpty())
							ent.setIps(ips);
						
						instanciaCache.getCache().put(body, ent);
						json = new Gson().toJson(ent);
					}
				}
			}
			
			body = json;
			
		} else {
			body = "[0] : Datos insuficientes para crear la transacción . .	.";
		}
		ex.getOut().setBody(body);
	}
}
