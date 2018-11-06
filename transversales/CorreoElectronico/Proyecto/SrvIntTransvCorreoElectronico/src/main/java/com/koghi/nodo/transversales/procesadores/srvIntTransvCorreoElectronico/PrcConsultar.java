package com.koghi.nodo.transversales.procesadores.srvIntTransvCorreoElectronico;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.google.gson.Gson;
import com.koghi.nodo.transversales.tos.srvIntTransvCorreoElectronico.TOCriterio;

public class PrcConsultar implements Processor {
	@Override
	public void process(Exchange ex) throws Exception {
		TOCriterio Data;
		List<TOCriterio> ListData;

		// Header del body de entrada
		ex.getOut().setHeader("infoJSON",
				ex.getIn().getBody(String.class)
				.replaceAll("[\n\r]", "").replaceAll("\t", ""));

		// Header del HOST
		ListData = new ArrayList<TOCriterio>();

		Data = new TOCriterio();
		Data.setCodigo("VAL_CODIGO");
		Data.setValor("HOST-001");
		ListData.add(Data);

		Data = new TOCriterio();
		Data.setCodigo("FEC_VIGENCIA");
		Data.setValor(" ");
		ListData.add(Data);

		String Host = new Gson().toJson(ListData);
		ex.getOut().setHeader("HOST", Host);

		// Header del MAIL
		ListData = new ArrayList<TOCriterio>();

		Data = new TOCriterio();
		Data.setCodigo("VAL_CODIGO");
		Data.setValor("MAIL-001");
		ListData.add(Data);

		Data = new TOCriterio();
		Data.setCodigo("FEC_VIGENCIA");
		Data.setValor(" ");
		ListData.add(Data);

		String Mail = new Gson().toJson(ListData);
		ex.getOut().setHeader("MAIL", Mail);

		// Header del PASS
		ListData = new ArrayList<TOCriterio>();

		Data = new TOCriterio();
		Data.setCodigo("VAL_CODIGO");
		Data.setValor("PASS-001");
		ListData.add(Data);

		Data = new TOCriterio();
		Data.setCodigo("FEC_VIGENCIA");
		Data.setValor(" ");
		ListData.add(Data);

		String Pass = new Gson().toJson(ListData);
		ex.getOut().setHeader("PASS", Pass);
	}
}