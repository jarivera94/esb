package com.koghi.nodo.urt.procesadores.mockSrvIntPersonasInscritas;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.koghi.nodo.urt.util.mockSrvIntPersonasInscritas.DecodificadorBase64;

public class PrcConfigurarHeadersTx implements Processor {

	@Override
	public void process(Exchange ex) {
		String hdrEntidadEmisora = ex.getIn().getHeader("IdEntidadConsumidora") != null ? ex.getIn().getHeader("IdEntidadConsumidora").toString() : "" ;
		String hdrIdUsuario = ex.getIn().getHeader("Authorization") != null ? ex.getIn().getHeader("Authorization").toString() : "";

		if (!hdrIdUsuario.isEmpty()) {
			hdrIdUsuario = hdrIdUsuario.substring(6);
//			System.out.println("Authorization: " + hdrIdUsuario);
			hdrIdUsuario = DecodificadorBase64.decodificar(hdrIdUsuario);
//			System.out.println("Usuario y contraseña: " + hdrIdUsuario);
			hdrIdUsuario = hdrIdUsuario.substring(0, hdrIdUsuario.indexOf(":"));
//			System.out.println("\n\n\n*********************************************************************\n");
//			System.out.println("IdUsuario: " + hdrIdUsuario);
			ex.getIn().getHeaders().put("IdUsuario", hdrIdUsuario);
		}
		
		ex.setOut(ex.getIn());
		ex.getOut().getHeaders().put("EntidadEmisora", hdrEntidadEmisora);
		
//		System.out.println("EntidadEmisora: " + ex.getOut().getHeader("EntidadEmisora"));
//		System.out.println("Body In: " + ex.getIn().getBody().toString());
//		System.out.println("Body Out: " + ex.getOut().getBody().toString());
//		System.out.println("\n*********************************************************************\n\n\n");
	}
	
}
