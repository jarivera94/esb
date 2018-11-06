package com.koghi.nodo.urt.procesadores.srvIntConsultaPersonasInscritas;

import javax.ws.rs.core.Response;

import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class PrcRedeliveryCounter implements Processor {
	
	@Override
	public void process(Exchange ex) throws Exception {

		CamelContext context = ex.getContext();
		int rCounter = 0, status = 0;
		Response response;
		
		try {
			
			int redevCounter = ex.getProperty("redevCounter") != null ? ex.getProperty("redevProperty", Integer.class) : 0 ;
			
			System.out.println("Se produjo una excepción!");
			
			System.out.println("********************************************************");
			System.out.println("****** Esto sucede dentro de PrcRedeliveryCounter ******");
			System.out.println("********************************************************");

			Exception e = ex.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
			String excClass = e.getClass().getName();
//			String excSuperClass = e.getClass().getSuperclass().getName();
			String excMess = e.getMessage();
			
			System.out.println("Excepción de tipo: " + excClass);
			System.out.println("Mensaje de la excepción: " + excMess);
			
			// e.printStackTrace();
			
			System.out.println("Redirigiendo a la ruta de crear error.");
			switch (excClass) {
				case "javax.ws.rs.RedirectionException":
				case "javax.ws.rs.ClientErrorException":
				case "javax.ws.rs.BadRequestException":
				case "javax.ws.rs.ForbiddenException":
				case "javax.ws.rs.NotAcceptableException":
				case "javax.ws.rs.NotAllowedException":
				case "javax.ws.rs.NotAuthorizedException":
				case "javax.ws.rs.NotFoundException":
				case "javax.ws.rs.NotSupportedException":
					response = (Response) e.getClass().getMethod("getResponse").invoke(e);
					status = (int) response.getClass().getMethod("getStatus").invoke(response);
					ex.setProperty("ErrorDescription", "Error en la petición de consumo del servicio.");
					ex.setProperty("propCodEstado", -1);
					ex.getIn().getHeaders().put("CodEstado", "-1");
					System.out.println("Valor CodEstado establecido en -1.");
					System.out.println("Counter: " + redevCounter );
					break;
				
				case "javax.ws.rs.InternalServerErrorException":
				case "javax.ws.rs.ServiceUnavailableException":
					response = (Response) e.getClass().getMethod("getResponse").invoke(e);
					status = (int) response.getClass().getMethod("getStatus").invoke(response);
					ex.setProperty("ErrorDescription", "Error de conexión con el proveedor.");
					ex.setProperty("propCodEstado", 1);
					ex.getIn().getHeaders().put("CodEstado", "1");
					System.out.println("Valor CodEstado establecido en 1.");
					System.out.println("Counter: " + redevCounter );
					break;
				
				case "org.apache.camel.http.common.HttpOperationFailedException":
					status = (int) e.getClass().getMethod("getStatusCode").invoke(e);
					ex.setProperty("ErrorDescription", "Error de conexión con el proveedor.");
					if(status < 500) {						
						ex.getIn().getHeaders().put("CodEstado", "-1");
						ex.setProperty("propCodEstado", -1);
					} else {						
						ex.getIn().getHeaders().put("CodEstado", "1");
						ex.setProperty("propCodEstado", 1);
					}
					System.out.println("Valor CodEstado establecido en 1.");
					System.out.println("Counter: " + redevCounter );
					break;
					
				default:
					status = 512;
					ex.setProperty("ErrorDescription", "Error general en el servicio.");
					ex.getIn().getHeaders().put("CodEstado", "-1");
					ex.setProperty("propCodEstado", -1);
					System.out.println("Valor CodEstado establecido en -1.");
					System.out.println("Error general en la aplicación. Se terminará la ruta luego de actualizar la transacción.");
					break;
			}
			
			if (ex.getProperty("contador_redelivery") == null) {
				rCounter = 1;
				ex.setProperty("contador_redelivery", rCounter);
			} else {
				rCounter = Integer.parseInt(ex.getProperty("contador_redelivery").toString());
				rCounter++;
				ex.setProperty("contador_redelivery", rCounter);
			}
			
			ex.setProperty("statusCodeAnswer", status);
			System.out.println("Código HTTP de la respuesta: " + status);
			System.out.println("Contador errores: " + redevCounter);
			context.createProducerTemplate().send("direct:endPointException", ex);
			
		} catch (Exception e) {
			
			System.out.println("Está en el Catch.\nExcepción atrapada en el PrcRedeliveryCounter: ");
			System.out.println("Se ha lanzado una excepción adicional.");
			System.out.println("Excepción adicional lanzada: " + ex.getException());
			e.printStackTrace();
			endRouteInCourse(context, ex.getIn().getHeader("routeEndTimeout", Integer.class));
			
		}
		
		ex.setOut(ex.getIn());

	}
	
	public void endRouteInCourse( CamelContext context, int timeOut ) {
		context.getShutdownStrategy().setLogInflightExchangesOnTimeout(false);
		context.getShutdownStrategy().setTimeout(timeOut);
		try {
			context.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
