package com.koghi.nodo.csj.srvIntConsultaProcesos.procesadores;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcImprimirHeaders implements Processor{

	@Override
	public void process(Exchange ex) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("HEADERS ANTES DE CONSUMIR EL SERVICIO");
		Map<String, Object> map = ex.getIn().getHeaders();
		for (Map.Entry<String, Object> entry : map.entrySet())
		{
		    System.out.println(entry.getKey() + "|------------------------|" + entry.getValue());
		}


	}

}
