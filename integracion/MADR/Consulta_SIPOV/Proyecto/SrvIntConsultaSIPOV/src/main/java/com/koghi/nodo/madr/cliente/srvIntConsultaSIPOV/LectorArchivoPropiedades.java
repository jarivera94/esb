package com.koghi.nodo.madr.cliente.srvIntConsultaSIPOV;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectorArchivoPropiedades {

	private static final String PROPERTIES_FILE_NAME = "etc/configSrvIntConsultaSIPOV.properties.cfg";
	private static String valProperty = "";
	
	public static void setValPropiedad() {
		valProperty = "";
	}
	
	public static String getProperty(String property) {
		List<String> lines = new ArrayList<>();
		System.out.println("\n*********************\nEntró a getIdServicio\n*********************\n");
		
		try {
			Path path = Paths.get(PROPERTIES_FILE_NAME);
			path = path.toAbsolutePath();
//			System.out.println("Absolute path: " + path);
			lines = Files.readAllLines(path, StandardCharsets.UTF_8);
		} catch (Exception e) {
			System.out.println("Error al leer archivo: " + e.getMessage() + " " + e.getCause());
		}
		int i=0;
		for (String line : lines) {
			System.out.println("Línea: " + i++  + ": " + line);
			line = line.replaceAll(" ", "");
			valProperty = line.startsWith(property) ? line.substring(line.indexOf("=") + 1) : valProperty ;
			if (!valProperty.isEmpty()) {break;}
		}
		
		System.out.println("ValPropiedad: " + valProperty);
		
		return valProperty;
	}
	
}
