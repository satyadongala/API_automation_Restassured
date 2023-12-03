package com.cucumber.framework.model;

public class DBGAPIModel {

	private String caseID;
	private String dateSORequested;
	private String memberID;
	private String memberReferralID;
	private String dbgProgramType;

	public String getCaseID() {
		return caseID;
	}

	public void setCaseID(String caseID) {
		this.caseID = caseID;
	}

	public String getDateSORequested() {
		return dateSORequested;
	}

	public void setDateSORequested(String dateSORequested) {
		this.dateSORequested = dateSORequested;
	}

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getMemberReferralID() {
		return memberReferralID;
	}

	public void setMemberReferralID(String memberReferralID) {
		this.memberReferralID = memberReferralID;
	}

	public String getDbgProgramType() {
		return dbgProgramType;
	}

	public void setDbgProgramType(String dbgProgramType) {
		this.dbgProgramType = dbgProgramType;
	}

	@Override
	public String toString() {
		return "DBGAPIModel [caseID=" + caseID + ", dateSORequested=" + dateSORequested + ", memberID=" + memberID
				+ ", memberReferralID=" + memberReferralID + ", dbgProgramType=" + dbgProgramType + "]";
	}

}
