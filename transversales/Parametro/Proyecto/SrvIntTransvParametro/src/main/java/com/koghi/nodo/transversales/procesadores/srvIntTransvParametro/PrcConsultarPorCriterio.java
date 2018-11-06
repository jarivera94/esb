package com.koghi.nodo.transversales.procesadores.srvIntTransvParametro;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;
import com.koghi.nodo.transversales.tos.srvIntTransvParametro.*;
import com.koghi.nodo.transversales.util.SrvIntTransvParametro.UtlCacheParametro;

public class PrcConsultarPorCriterio implements Processor{
	@Override
	public void process(Exchange ex) throws Exception {
		String body = ex.getIn().getBody(String.class);
		TOCriterio[] Data = new Gson().fromJson(body, TOCriterio[].class);				
		
		if (Data[0].getValor()!=null && !Data[0].getValor().replace(" ","").isEmpty()){
			
			List <TOParametro> prms = new ArrayList <TOParametro>();
			List <TOParametro> params = new ArrayList <TOParametro>();
			TOParametro prm;
			UtlCacheParametro instanciaCache = UtlCacheParametro.getInstance();
			String json = null;
			Date date = new Date();
			DateFormat hourdateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			
			if (Data[1].getValor()==null || Data[1].getValor().replace(" ","").isEmpty())				
				Data[1].setValor(hourdateFormat.format(date));
			
			if (instanciaCache.getCache().containsKey(Data[0].getValor()) && false){
				prms = instanciaCache.getCache().get(Data[0].getValor());
			}else{			
				String query = "sqlComponent:select * from ESB_PARAMETRO where " + Data[0].getCodigo() + "='" + Data[0].getValor() + "'";
				ex.getContext().createProducerTemplate().send(query,ex);
				
				@SuppressWarnings("unchecked")
				List<Map<String, Object>> parametros = ex.getOut().getBody(List.class);			
				if (!parametros.isEmpty()){					
					for (Map<String, Object> parametro : parametros) {
						prm = new TOParametro();
						
						prm.setId(parametro.get("ID").toString());
						prm.setValCodigo(parametro.get("VAL_CODIGO").toString());
						prm.setValDescripcion(parametro.get("VAL_DESCRIPCION").toString());
						prm.setValValor(parametro.get("VAL_VALOR").toString());
						prm.setFecIniVigencia(parametro.get("FEC_INI_VIGENCIA").toString());
						prm.setFecCreacion(parametro.get("FEC_CREACION").toString());
						prm.setIdUsuarioCreacion(parametro.get("ID_USUARIO_CREACION").toString());
						
						if (parametro.get("FEC_FIN_VIGENCIA")!=null)
							prm.setFecFinVigencia(parametro.get("FEC_FIN_VIGENCIA").toString());
						if (parametro.get("FEC_MODIFICACION")!=null)
							prm.setFecModificacion(parametro.get("FEC_MODIFICACION").toString());
						if (parametro.get("ID_USUARIO_MODIFICACION")!=null)
							prm.setIdUsuarioModificacion(parametro.get("ID_USUARIO_MODIFICACION").toString());

						prms.add(prm);						
					}					
					instanciaCache.getCache().put(Data[0].getValor(), prms);					
				}
			}
			
			for (TOParametro param : prms){
				if (hourdateFormat.parse(param.getFecIniVigencia()).before(hourdateFormat.parse(Data[1].getValor()))){
					if (param.getFecFinVigencia()!=null && !param.getFecFinVigencia().replace(" ","").isEmpty()){
						if (hourdateFormat.parse(param.getFecFinVigencia()).after(hourdateFormat.parse(Data[1].getValor())))
							params.add(param);
					}
					else
						params.add(param);
				}
			}
			
			json = new Gson().toJson(params);
			body = json;
			
		} else {
			body = "[0] : Datos insuficientes para crear la transacción . .	.";
		}
		ex.getOut().setBody(body);
	}
}
