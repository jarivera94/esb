package com.koghi.nodo.rnec.util.srvIntConsultaCedula;

import java.util.List;

public class CedulasXmlParser {
	
	public static String getCedulasXml(List<Long> listaCedulas) throws Exception {
		
		String cedulas = "";
		int n = listaCedulas.size();
		for (Long cedula : listaCedulas) {
			cedulas += "<NUIP>" + cedula + "</NUIP>";
			if (listaCedulas.indexOf(cedula) != n-1) {
				cedulas += "\n";
			}
		}
		return cedulas;
		
	}

}
