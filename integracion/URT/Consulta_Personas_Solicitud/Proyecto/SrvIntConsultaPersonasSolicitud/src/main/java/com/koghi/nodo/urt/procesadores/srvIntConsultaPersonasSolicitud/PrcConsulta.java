package com.koghi.nodo.urt.procesadores.srvIntConsultaPersonasSolicitud;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcConsulta implements Processor{
	@Override
	public void process(Exchange ex) throws Exception {
//		String body = ex.getIn().getBody(String.class);
//		TOConsulta json = new Gson().fromJson(body, TOConsulta.class);
//				
//		Date date = new Date();
//		DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		
//		TODepartamento jsonDpto = new TODepartamento();
//		jsonDpto.setNombreDepartamento(json.getDepartamentoPredio());
//		jsonDpto.setCodigoDaneDepartamento("000111222");
//		
//		TOMunicipio jsonMpo = new TOMunicipio();
//		jsonMpo.setNombreMunicipio(json.getMunicipioPredio());
//		jsonMpo.setCodigoDaneMunicipio("111222333");
//		
//		TOPredio jsonPredio = new TOPredio();
//		jsonPredio.setDepartamento(jsonDpto);
//		jsonPredio.setMunicipio(jsonMpo);
//		
//		ArrayList <TOPersona> jsonPersona = new ArrayList<TOPersona>();
//		TOPersona persona = new TOPersona();
//		jsonPersona.add(persona);
//		jsonPersona.get(0).setNumeroDocumento(json.getNumeroDocumento());
//		jsonPersona.get(0).setTipoDocumento(json.getTipoDocumento());
//		jsonPersona.get(0).setMunicipio(jsonMpo);
//		jsonPersona.get(0).setDepartamento(jsonDpto);
//		
//		TOSolicitudInscripcion jsonSolicitud = new TOSolicitudInscripcion();
//		jsonSolicitud.setFechaDocumento(hourdateFormat.format(date));
//		jsonSolicitud.setDepartamento(jsonDpto);
//		jsonSolicitud.setMunicipio(jsonMpo);
//		jsonSolicitud.setPredio(jsonPredio);
//		jsonSolicitud.setPersona(jsonPersona);
//		
//		body = new Gson().toJson(jsonSolicitud);
//		ex.getOut().setBody(body);
		ex.getOut().setBody(ex.getIn().getBody(String.class));
		ex.setOut(ex.getIn());
	}
}
