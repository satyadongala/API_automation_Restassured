package com.cucumber.framework.model;

import java.io.Serializable;

public class ClinicalAPIModel implements Serializable {

	private String mcid;
	private String caseStatus;
	private String senderApp;
	private String sourceSystemCD;
	private String subscriberID;

	public String getMcid() {
		return mcid;
	}

	public void setMcid(String mcid) {
		this.mcid = mcid;
	}

	public String getCaseStatus() {
		return caseStatus;
	}

	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}

	public String getSenderApp() {
		return senderApp;
	}

	public void setSenderApp(String senderApp) {
		this.senderApp = senderApp;
	}

	public String getSourceSystemCD() {
		return sourceSystemCD;
	}

	public void setSourceSystemCD(String sourceSystemCD) {
		this.sourceSystemCD = sourceSystemCD;
	}

	public String getSubscriberID() {
		return subscriberID;
	}

	public void setSubscriberID(String subscriberID) {
		this.subscriberID = subscriberID;
	}

	@Override
	public String toString() {
		return "ClinicalAPIModel [mcid=" + mcid + ", caseStatus=" + caseStatus + ", senderApp=" + senderApp
				+ ", sourceSystemCD=" + sourceSystemCD + ", subscriberID=" + subscriberID + "]";
	}

	public static String requestPayload() {
		
		return "{\r\n" + 
				"    \"caseStatus\": \"Open\",\r\n" + 
				"    \"mcid\": 205323395,\r\n" + 
				"    \"senderApp\": \"CAPI\",\r\n" + 
				"    \"sourceSystemCD\": \"WGS20\",\r\n" + 
				"    \"subscriberID\": \"129890525\"\r\n" + 
				"}";
	}
}
