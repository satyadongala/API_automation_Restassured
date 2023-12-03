package com.cucumber.framework.util;

public interface APIParameters {

	String getClinicalDataService = "https://qa1hrs.elevancehealth.com/v1/clinicalsearch-service/getclinicaldata";
	String getClinicalDataService_invalid_404 = "https://qa1hrs.elevancehealth.com/v1/clinicalsearch-service/getclinicaldat";
	String getClinicalDataService_invalid_400= "https://qa4hrs.antheminc.com:443/v1/clinicalsearch-service/getclinicaldata%?cached=false";
	String getClinicalDataService_405 = "https://qa1hrs.elevancehealth.com/v1/clinicalsearch-service/getclinicaldata";

	String inactivationService="https://sit-hrsentsvcs.va.internal.das/inactivationSearch-ws/2.0/";
}
