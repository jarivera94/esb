package com.koghi.nodo.urt.procesadores.mockSrvIntPersonasInscritas;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcMockPersonasInscritas implements Processor {

	@Override
	public void process(Exchange exchange) {
		String outBody;
		
		exchange.setOut(exchange.getIn());
		
		outBody = "{\n" + 
				"    \"barrio\": \"\",\n" + 
				"    \"cabezaFamilia\": false,\n" + 
				"    \"celularPersona\": \"3106319898\",\n" + 
				"    \"corregimiento\": \"\",\n" + 
				"    \"departamentoUbicacionPersona\": {\n" + 
				"        \"codigoDaneDepartamento\": 23\n" + 
				"    },\n" + 
				"    \"direccionPersona\": \"BARRIO ANDALUCIA DIAGONAL 11A # 39-33\",\n" + 
				"    \"estadoCivilPersona\": \"Soltero (a)\",\n" + 
				"    \"genero\": \"Femenino\",\n" + 
				"    \"municipioUbicacionPersona\": {\n" + 
				"        \"codigoDaneMunicipio\": 23001\n" + 
				"    },\n" + 
				"    \"narracionHechosSolicitud\": \"\",\n" + 
				"    \"numeroDocumento\": \"34983745\",\n" + 
				"    \"primerApellidoPersona\": \"MENDOZA\",\n" + 
				"    \"primerNombrePersona\": \"SONIA \",\n" + 
				"    \"rolPersona\": \"Titular\",\n" + 
				"    \"segundoApellidoPersona\": \"BORJA\",\n" + 
				"    \"segundoNombrePersona\": \"ASCELA\",\n" + 
				"    \"solicitud\": [\n" + 
				"        {\n" + 
				"            \"fechaDiligenciamiento\": \"2014-08-28T00:00:00-05:00\",\n" + 
				"            \"nombreDepartamentoDeclaracion\": {\n" + 
				"                \"nombreDepartamento\": \"Antioquia\"\n" + 
				"            },\n" + 
				"            \"nombreEstadoSolicitud\": \"Inscripción\",\n" + 
				"            \"nombreMunicipioDeclaracion\": {\n" + 
				"                \"nombreMunicipio\": \"Apartadó\"\n" + 
				"            },\n" + 
				"            \"numConsecutivoSolicitud\": \"22519102108141601-013-004-004\",\n" + 
				"            \"predio\": {\n" + 
				"                \"fechaAbandonoAno\": 0,\n" + 
				"                \"fechaAbandonoAnoFin\": 0,\n" + 
				"                \"fechaAbandonoMes\": 0,\n" + 
				"                \"fechaAbandonoMesFin\": 0,\n" + 
				"                \"fechaAbandonoMesInicio\": 0,\n" + 
				"                \"fechaDespojoAno\": 0,\n" + 
				"                \"fechaDespojoAnoFin\": 0,\n" + 
				"                \"fechaDespojoMes\": 0,\n" + 
				"                \"fechaDespojoMesFin\": 0,\n" + 
				"                \"fechaDespojoMesInicio\": 0,\n" + 
				"                \"fechaDocumento\": \"2017-11-07T00:00:00-05:00\",\n" + 
				"                \"matriculaCompleto\": \"034-\",\n" + 
				"                \"nombreOtroExplotadorPredio\": \"\",\n" + 
				"                \"numeroPredial\": \"0512002000000100022000000000\",\n" + 
				"                \"numeroResolucionInscripcion\": \"RD  00733\",\n" + 
				"                \"tipoAfectacionPredio\": \"Abandono\",\n" + 
				"                \"tipoDerechoPredio\": \"Otra\"\n" + 
				"            }\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"fechaDiligenciamiento\": \"2014-08-28T00:00:00-05:00\",\n" + 
				"            \"nombreDepartamentoDeclaracion\": {\n" + 
				"                \"nombreDepartamento\": \"Antioquia\"\n" + 
				"            },\n" + 
				"            \"nombreEstadoSolicitud\": \"Inscripción\",\n" + 
				"            \"nombreMunicipioDeclaracion\": {\n" + 
				"                \"nombreMunicipio\": \"Apartadó\"\n" + 
				"            },\n" + 
				"            \"numConsecutivoSolicitud\": \"22519102108141601-013-004-004\",\n" + 
				"            \"predio\": {\n" + 
				"                \"fechaAbandonoAno\": 0,\n" + 
				"                \"fechaAbandonoAnoFin\": 0,\n" + 
				"                \"fechaAbandonoMes\": 0,\n" + 
				"                \"fechaAbandonoMesFin\": 0,\n" + 
				"                \"fechaAbandonoMesInicio\": 0,\n" + 
				"                \"fechaDespojoAno\": 0,\n" + 
				"                \"fechaDespojoAnoFin\": 0,\n" + 
				"                \"fechaDespojoMes\": 0,\n" + 
				"                \"fechaDespojoMesFin\": 0,\n" + 
				"                \"fechaDespojoMesInicio\": 0,\n" + 
				"                \"fechaDocumento\": \"2017-11-07T00:00:00-05:00\",\n" + 
				"                \"matriculaCompleto\": \"034-\",\n" + 
				"                \"nombreOtroExplotadorPredio\": \"\",\n" + 
				"                \"numeroPredial\": \"0512002000000100022000000000\",\n" + 
				"                \"numeroResolucionInscripcion\": \"RD  00733\",\n" + 
				"                \"tipoAfectacionPredio\": \"Despojo\",\n" + 
				"                \"tipoDerechoPredio\": \"Otra\"\n" + 
				"            }\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"fechaDiligenciamiento\": \"2014-08-28T00:00:00-05:00\",\n" + 
				"            \"nombreDepartamentoDeclaracion\": {\n" + 
				"                \"nombreDepartamento\": \"Antioquia\"\n" + 
				"            },\n" + 
				"            \"nombreEstadoSolicitud\": \"Inscripción\",\n" + 
				"            \"nombreMunicipioDeclaracion\": {\n" + 
				"                \"nombreMunicipio\": \"Apartadó\"\n" + 
				"            },\n" + 
				"            \"numConsecutivoSolicitud\": \"22519102108141601-013-004-004\",\n" + 
				"            \"predio\": {\n" + 
				"                \"fechaAbandonoAno\": 0,\n" + 
				"                \"fechaAbandonoAnoFin\": 0,\n" + 
				"                \"fechaAbandonoMes\": 0,\n" + 
				"                \"fechaAbandonoMesFin\": 0,\n" + 
				"                \"fechaAbandonoMesInicio\": 0,\n" + 
				"                \"fechaDespojoAno\": 0,\n" + 
				"                \"fechaDespojoAnoFin\": 0,\n" + 
				"                \"fechaDespojoMes\": 0,\n" + 
				"                \"fechaDespojoMesFin\": 0,\n" + 
				"                \"fechaDespojoMesInicio\": 0,\n" + 
				"                \"fechaDocumento\": \"2017-11-07T00:00:00-05:00\",\n" + 
				"                \"matriculaCompleto\": \"034-\",\n" + 
				"                \"nombreOtroExplotadorPredio\": \"\",\n" + 
				"                \"numeroPredial\": \"0512002000000100022000000000\",\n" + 
				"                \"numeroResolucionInscripcion\": \"RD  00732\",\n" + 
				"                \"tipoAfectacionPredio\": \"Abandono\",\n" + 
				"                \"tipoDerechoPredio\": \"Otra\"\n" + 
				"            }\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"fechaDiligenciamiento\": \"2014-08-28T00:00:00-05:00\",\n" + 
				"            \"nombreDepartamentoDeclaracion\": {\n" + 
				"                \"nombreDepartamento\": \"Antioquia\"\n" + 
				"            },\n" + 
				"            \"nombreEstadoSolicitud\": \"Inscripción\",\n" + 
				"            \"nombreMunicipioDeclaracion\": {\n" + 
				"                \"nombreMunicipio\": \"Apartadó\"\n" + 
				"            },\n" + 
				"            \"numConsecutivoSolicitud\": \"22519102108141601-013-004-004\",\n" + 
				"            \"predio\": {\n" + 
				"                \"fechaAbandonoAno\": 0,\n" + 
				"                \"fechaAbandonoAnoFin\": 0,\n" + 
				"                \"fechaAbandonoMes\": 0,\n" + 
				"                \"fechaAbandonoMesFin\": 0,\n" + 
				"                \"fechaAbandonoMesInicio\": 0,\n" + 
				"                \"fechaDespojoAno\": 0,\n" + 
				"                \"fechaDespojoAnoFin\": 0,\n" + 
				"                \"fechaDespojoMes\": 0,\n" + 
				"                \"fechaDespojoMesFin\": 0,\n" + 
				"                \"fechaDespojoMesInicio\": 0,\n" + 
				"                \"fechaDocumento\": \"2017-11-07T00:00:00-05:00\",\n" + 
				"                \"matriculaCompleto\": \"034-\",\n" + 
				"                \"nombreOtroExplotadorPredio\": \"\",\n" + 
				"                \"numeroPredial\": \"0512002000000100022000000000\",\n" + 
				"                \"numeroResolucionInscripcion\": \"RD  00732\",\n" + 
				"                \"tipoAfectacionPredio\": \"Despojo\",\n" + 
				"                \"tipoDerechoPredio\": \"Otra\"\n" + 
				"            }\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"fechaDiligenciamiento\": \"2014-08-28T00:00:00-05:00\",\n" + 
				"            \"nombreDepartamentoDeclaracion\": {\n" + 
				"                \"nombreDepartamento\": \"Antioquia\"\n" + 
				"            },\n" + 
				"            \"nombreEstadoSolicitud\": \"Inscripción\",\n" + 
				"            \"nombreMunicipioDeclaracion\": {\n" + 
				"                \"nombreMunicipio\": \"Apartadó\"\n" + 
				"            },\n" + 
				"            \"numConsecutivoSolicitud\": \"22519102108141601-013-004-004\",\n" + 
				"            \"predio\": {\n" + 
				"                \"fechaAbandonoAno\": 0,\n" + 
				"                \"fechaAbandonoAnoFin\": 0,\n" + 
				"                \"fechaAbandonoMes\": 0,\n" + 
				"                \"fechaAbandonoMesFin\": 0,\n" + 
				"                \"fechaAbandonoMesInicio\": 0,\n" + 
				"                \"fechaDespojoAno\": 0,\n" + 
				"                \"fechaDespojoAnoFin\": 0,\n" + 
				"                \"fechaDespojoMes\": 0,\n" + 
				"                \"fechaDespojoMesFin\": 0,\n" + 
				"                \"fechaDespojoMesInicio\": 0,\n" + 
				"                \"fechaDocumento\": \"2017-11-07T00:00:00-05:00\",\n" + 
				"                \"matriculaCompleto\": \"034-\",\n" + 
				"                \"nombreOtroExplotadorPredio\": \"\",\n" + 
				"                \"numeroPredial\": \"0512002000000100022000000000\",\n" + 
				"                \"numeroResolucionInscripcion\": \"RD  00731\",\n" + 
				"                \"tipoAfectacionPredio\": \"Abandono\",\n" + 
				"                \"tipoDerechoPredio\": \"Otra\"\n" + 
				"            }\n" + 
				"        }\n" + 
				"    ],\n" + 
				"    \"telefonoPersona\": \"\",\n" + 
				"    \"tipoDocumento\": \"Cédula De Ciudadanía\",\n" + 
				"    \"vereda\": \"LA ARENOSA\"\n" + 
				"}";
		
		exchange.getOut().setBody(outBody);
		
	}
	
}
