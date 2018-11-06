package com.koghi.urt.nodo.libTransaccion.processors;

import javax.ws.rs.core.Response;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ProcesorError implements Processor{

	@Override
	public void process(Exchange ex) throws Exception {
//		CamelContext context = ex.getContext();
        int status = 0;
        String idError = "ERR-001";
        Response response;
        
        try {
			Exception e = ex.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
	        String excClass = e.getClass().getName();
	        String excMess = e.getMessage();
	        
	        System.out.println("Excepción de tipo: " + excClass);
	        System.out.println("Mensaje de la excepción: " + excMess);
	        
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
	                ex.setProperty("CodEstado", -1);
	                ex.getIn().setHeader("CodEstado", "-1");
	                System.out.println("Valor CodEstado establecido en -1.");
	                break;
	            
	            case "javax.ws.rs.InternalServerErrorException":
	            case "javax.ws.rs.ServiceUnavailableException":
	            	response = (Response) e.getClass().getMethod("getResponse").invoke(e);
                    status = (int) response.getClass().getMethod("getStatus").invoke(response);
	                ex.setProperty("ErrorDescription", "Error de conexión con el proveedor.");
	                ex.setProperty("CodEstado", 1);
	                ex.getIn().setHeader("CodEstado", "1");
	                System.out.println("Valor CodEstado establecido en 1.");
	                break;
	            
	            case "org.apache.camel.http.common.HttpOperationFailedException":
	            case "org.apache.camel.component.cxf.CxfOperationException":
	            	status = (int) e.getClass().getMethod("getStatusCode").invoke(e);
	                ex.setProperty("ErrorDescription", "Error de conexión con el proveedor.");
	                if(status < 500) {                        
	                    ex.getIn().setHeader("CodEstado", "-1");
	                    ex.setProperty("CodEstado", -1);
	                    System.out.println("Valor CodEstado establecido en -1.");
	                } else {                        
	                    ex.getIn().setHeader("CodEstado", "1");
	                    ex.setProperty("CodEstado", 1);
	                    idError = "ERR-002";
	                    System.out.println("Valor CodEstado establecido en 1.");
	                }
	                break;
	                
	            default:
	                status = 512;
	                ex.setProperty("ErrorDescription", "Error general en el servicio.");
	                ex.getIn().setHeader("CodEstado", "-1");
	                ex.setProperty("CodEstado", -1);
	                System.out.println("Valor CodEstado establecido en -1.");
	                System.out.println("Error general en la aplicación. Se terminará la ruta luego de actualizar la transacción.");
	                break;
	        }
	        
	        ex.setProperty("statusCodeAnswer", status);
	        ex.getIn().setHeader("ValCodigo", status);
	        ex.getIn().setHeader("IdError", idError);
		} catch (Exception e) {
	        
	        System.out.println("Está en el Catch.\nExcepción atrapada en el PrcRedeliveryCounter: ");
	        System.out.println("Se ha lanzado una excepción adicional.");
	        System.out.println("Excepción adicional lanzada: " + ex.getException());
	        e.printStackTrace();
//	        endRouteInCourse(context, ex.getIn().getHeader("routeEndTimeout", Integer.class));
	    }
	    
	    ex.setOut(ex.getIn());
	}

//    public void endRouteInCourse( CamelContext context, int timeOut ) {
//        context.getShutdownStrategy().setLogInflightExchangesOnTimeout(false);
//        context.getShutdownStrategy().setTimeout(timeOut);
//        try {
//            context.stop();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
	
	public void getExceptionString (Exchange ex) {
		//ex.setOut(ex.getIn());
		Exception e = ex.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
		System.out.println("Exception caught: " + e.getClass().toString());
//		Message out = ex.getOut();
//		List<Message> result = Arrays.asList(out);
//		String incomingBody = result.get(0).toString();
//		
//		if (incomingBody.equals("Message: [Body is null]")) {
//			ex.getOut().setBody("Null Pointer Exception " + incomingBody);
//		}
	}
}
