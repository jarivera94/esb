package com.koghi.nodo.madr.procesadores.srvIntConsultaSIPOV;

import java.util.Calendar;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.json.JSONObject;

public class PrcVerificarFecha implements Processor {

	@Override
	public void process(Exchange ex) throws Exception {
		// TODO Auto-generated method stub
		int dia1, mes1, annio1, dia2, mes2, annio2;
		boolean f1, f2;
		String cuerpo = ex.getIn().getBody().toString();
		System.out.println("Antes de SubString: " + cuerpo);
		cuerpo = cuerpo.substring(1, cuerpo.length()-1);
		System.out.println("Despues de SubString: " + cuerpo);
		JSONObject datosEnt = new JSONObject(cuerpo);
		if (datosEnt.has("fechaInicio")) {
			
		}
		String[] fechaArri = datosEnt.has("fechaInicio") ? datosEnt.getString("fechaInicio").split("-") : new String[0];
		String[] fechaArrf =  datosEnt.has("fechaFin") ? datosEnt.getString("fechaFin").split("-") : new String[0];
		
		if (fechaArri.length < 1 || fechaArrf.length < 1) {
			f1 = false;
			f2 = false;
		} else {
			try {
				dia1 = Integer.parseInt(fechaArri[2]);
				mes1 = Integer.parseInt(fechaArri[1]);
				annio1 = Integer.parseInt(fechaArri[0]);
				dia2 = Integer.parseInt(fechaArrf[2]);
				mes2 = Integer.parseInt(fechaArrf[1]);
				annio2 = Integer.parseInt(fechaArrf[0]);
				f1 = verificarFecha( annio1, mes1, dia1);
				f2 = verificarFecha( annio2, mes2, dia2);
			}catch (Exception exception) {
				f1 = false;
				f2 = false;
			}
		}
		ex.getIn().setHeader("continuar", "true");
		System.out.println("Despues de SETHEADER" + ex.getIn().getHeader("continuar"));
		
		if(f1 && f2)
		{
			
		}else
		{
			falla(ex);
			ex.getIn().setHeader("continuar", "false");
		}
	}
	
	public boolean verificarFecha(int annio, int mes, int dia) {
		Calendar c = Calendar.getInstance();
		c.setLenient(false);
		c.set(Calendar.YEAR, annio);
		c.set(Calendar.MONTH, mes);
		c.set(Calendar.DAY_OF_MONTH, dia);
		boolean valido;
		try {
		c.getTime();
		valido = true;
		}catch (IllegalArgumentException e) {
		valido = false;
		}
		System.out.println(valido);
		return valido;
	}
//		String[] fechaArri =  datosEnt.getFechaInicio().split("/");
//		String[] fechaArrf =  datosEnt.getFechaFin().split("/");
//		dia1 = fechaArri[2];
//		mes1 = fechaArri[1];
//		annio1 = fechaArri[0];
//		dia2 = fechaArrf[2];
//		mes2 = fechaArrf[1];
//		annio2 = fechaArrf[0];
//		
//		ex.getOut().setHeader("continuar", "true");
//		System.out.println("Despues de SETHEADER" + ex.getOut().getHeader("continuar"));
//
//		if (!((Integer.parseInt(mes1) < 1 || Integer.parseInt(mes1) > 12) 
//			|| (Integer.parseInt(dia1) < 1 || Integer.parseInt(dia1) > 30)
//			|| (Integer.parseInt(mes2) < 1 || Integer.parseInt(mes2) > 12)
//			|| (Integer.parseInt(dia2) < 1 || Integer.parseInt(dia2) > 30))) 
//		{
//			if	((validarMes(annio1, Integer.parseInt(mes1), Integer.parseInt(dia1)))
//				&& (validarMes(annio2, Integer.parseInt(mes2), Integer.parseInt(dia2)))){}
//			else 
//			{
//				falla(ex);
//				ex.getOut().setHeader("continuar", "false");
//				
//			}
//		}
//	
//	}
	
//	public boolean bisiesto(String annio) 
//	{
//		return (Math.abs(Integer.parseInt(annio) - 2016) % 4 == 0);
//	}
//	
	public void falla(Exchange ex) 
	{
		JSONObject json = new JSONObject();
		json.put("Error", "true");
		json.put("Código", "-1");
		json.put("Descripción", "Error Técnico");
		json.put("Mensaje", "Formato de fecha incorrecto o atributo inexistente." );
		ex.getIn().setBody(json.toString());
		ex.setOut(ex.getIn());
	}
//	
//	public boolean validarMes(String annio, int mes, int dia)  
//	{
//		int lims = 0;
//		switch (mes) {
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//			lims = 31;
//			break;
//		case 2:
//			lims = bisiesto(annio) ? 29 : 28;
//			break;
//		default:
//			lims = 30;
//			break;
//		}
//		
//		return (dia <= lims);
//	}
}
