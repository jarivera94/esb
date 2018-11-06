package com.koghi.urt.servicios.transversal.sesion.modelo;

public class ParserStringToArray {
	
	public static String[] castearRoles(String lista){
		lista = lista.substring(1,lista.length()-1);
		String[] listaArr = lista.split(",");
//		int n = listaArr.length;
//		for (int i=0; i<n; i++){
//			listaArr[i] = listaArr[i].substring(1, listaArr[i].length()-1);
//		}
		return listaArr;
	}
}
