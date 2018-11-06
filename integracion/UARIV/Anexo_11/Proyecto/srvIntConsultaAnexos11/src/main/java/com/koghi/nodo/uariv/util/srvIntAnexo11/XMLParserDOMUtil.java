package com.koghi.nodo.uariv.util.srvIntAnexo11;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.camel.model.SamplingDefinition;
import org.json.JSONArray;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class XMLParserDOMUtil {
	
	public static JSONArray parseXML(String filePath) {

		JSONArray salidaServicio = new JSONArray();
		
		try {
	
			File fXmlFile = new File(filePath);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
					
			doc.getDocumentElement().normalize();
	
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
					
			NodeList nList = doc.getElementsByTagName("Table");
					
			System.out.println("----------------------------");
			
			System.out.println("Node list size: " + nList.getLength());
				
			JSONObject jsonAuxiliar = new JSONObject();
	
			String nodeContent = "";
			String nodeName = "";
			for (int temp = 0; temp < nList.getLength(); temp++) {
	
				Node nNode = nList.item(temp);
						
//				System.out.println("\nCurrent Element content: " + nNode.getTextContent());

				NodeList tableNList = nNode.getChildNodes();
				jsonAuxiliar = new JSONObject();
				for (int iterator = 0; iterator < tableNList.getLength(); iterator++) {
					Node tableNode = tableNList.item(iterator);
					if (tableNode.getNodeType() == Node.ELEMENT_NODE) {
						nodeName = tableNode.getNodeName();
//						System.out.println("\nTable Node: " + nodeName);
						nodeContent = tableNode.getTextContent();
//						System.out.println("Node contents: " + nodeContent);
						jsonAuxiliar.put(nodeName, nodeContent);
					}
				}
//				System.out.println("\n\nJSON Auxiliar: " + jsonAuxiliar);
				salidaServicio.put(jsonAuxiliar);

				System.out.println("Tabla #: " + temp);
			}
//			System.out.println("\n\nSalida servicio: " + salidaServicio);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return salidaServicio;
	}	
}
