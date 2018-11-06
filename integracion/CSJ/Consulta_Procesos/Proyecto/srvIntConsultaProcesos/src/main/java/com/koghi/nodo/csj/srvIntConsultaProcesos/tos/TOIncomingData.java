package com.koghi.nodo.csj.srvIntConsultaProcesos.tos;

import com.google.gson.JsonObject;

public class TOIncomingData {
	private String grant_type;
	private String username;
	private String password;
	private JsonObject demandJSONData;
	private boolean error;
	
	public String getGrant_type() {
		return grant_type;
	}
	public void setGrant_type(String grant_type) {
		this.grant_type = grant_type;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDemandJSONData() {
		return demandJSONData.toString();
	}
	public void setDemandJSONData(JsonObject demandJSONData) {
		this.demandJSONData = demandJSONData;
	}
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
}
