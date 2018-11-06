package com.koghi.nodo.uariv.util.SuperacionSituacionVulnerabilidad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadWrite {
	
	public static String leerArchivo(String ruta) throws IOException {
        String respuesta = "" , aux = "";
        try{
            FileInputStream archivo = new FileInputStream(ruta);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(archivo));
            aux += buffer.readLine();
            if (aux != null){
                while (aux != null){
                    respuesta += aux+"\n";
                    aux = buffer.readLine();
                }
            }
            buffer.close();
            return respuesta;
        }
        catch (IOException ioE){
            throw ioE;
        }
    }
	
	public static boolean guardarArchivo(String ruta, String contenido) throws IOException {
        try{
            File archivo = new File(ruta);
            FileWriter writer = new FileWriter(archivo);
            PrintWriter salida = new PrintWriter(writer);
            salida.write(contenido);
            salida.close();
            return true;
        }
        catch (IOException ioE){
            throw ioE;
        }
    }
	

}
