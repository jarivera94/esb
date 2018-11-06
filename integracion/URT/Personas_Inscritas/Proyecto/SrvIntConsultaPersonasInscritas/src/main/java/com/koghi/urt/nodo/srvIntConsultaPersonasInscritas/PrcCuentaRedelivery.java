package com.koghi.urt.nodo.srvIntConsultaPersonasInscritas;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcCuentaRedelivery implements Processor
{
	
	public void process(Exchange exchange) 
	{
		int cuentaIntentos=0;		
		if (exchange.getProperty("reintentosProp") == null) {
			exchange.setProperty("reintentosProp", 1);
			cuentaIntentos =(int) exchange.getProperty("reintentosProp");
		} else {		
			cuentaIntentos =(int) exchange.getProperty("reintentosProp");
			cuentaIntentos++;
			exchange.setProperty("reintentosProp", cuentaIntentos);
		}
	System.out.println(cuentaIntentos + " Intento(s)");
	
	}
}
