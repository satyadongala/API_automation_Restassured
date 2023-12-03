package com.cucumber.framework.stepDef;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.testng.Assert;

import com.cucumber.framework.model.ClinicalAPIModel;
import com.cucumber.framework.util.APIParameters;

import groovyjarjarantlr4.v4.parse.ANTLRParser.element_return;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class ClinicalAPI implements APIParameters {

	ClinicalAPIModel clinical = new ClinicalAPIModel();
	Response res;
	ValidatableResponse response;
	RequestSpecification request;

	@Given("User has access to endpoint with MCID {string}, Case status {string},Source System CD {string}, SubscriberID {string} and SenderApp {string}")
	public void user_has_access_to_endpoint_with_mcid_case_status_and_sender_app(String mcid, String caseStatus,
			String sourceSystemCD, String subscriberId, String senderApp) {
		clinical.setMcid(mcid);
		clinical.setCaseStatus(caseStatus);
		clinical.setSenderApp(senderApp);
		clinical.setSubscriberID(subscriberId);
		clinical.setSourceSystemCD(sourceSystemCD);
		request = given().contentType("application/json").body(clinical);

	}

	@When("The valid endpoint fatch the clinical data ConditionData {string} and Method type {string}")
	public void the_valid_endpoint_fatch_the_clinical_data_url_and_method_type(String conditionData, String methodType) {
		if(conditionData.contentEquals("correctURL")) {
			res = request.that().post(APIParameters.getClinicalDataService);
		}
		else if (conditionData.contentEquals("wrongtURL")) {
			res = request.that().post(APIParameters.getClinicalDataService_invalid_404);
		}
		else if (conditionData.contentEquals("methodChange")) {
			res = request.that().get(APIParameters.getClinicalDataService_405);
		}
		else {
			System.out.println("satya");
		}
	}

	@Then("Validate the clinical response with status code {string} and ConditionData {string}")
	public void validate_the_clinical_response_with_status_code(String statusCode, String conditionData) {
		
		if(conditionData.contentEquals("correctURL")) {
		res.then().statusCode(200);
		ResponseBody resBody1 = res.getBody();
		String data1 = resBody1.asString();
		//System.out.println(data1);
		System.out.println(data1.contains("18669904"));
		}
		else if (conditionData.contentEquals("wrongtURL")) {
			res.then().statusCode(404);
		}
		else if (conditionData.contentEquals("methodChange")) {
			res.then().statusCode(405);
		}
		else {
			System.out.println("satya");
		}
	}

}
