package com.cucumber.framework.stepDef;

import static io.restassured.RestAssured.given;

import java.awt.image.SampleModel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.hamcrest.Matchers;
import org.testng.Assert;

import com.cucumber.framework.model.InactivationAPIModel;
import com.cucumber.framework.util.APIParameters;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class InactivationApiStepDefinition implements APIParameters {
	Response res;
	ValidatableResponse response;
	RequestSpecification request;
	InactivationAPIModel inactivation = new InactivationAPIModel();

	@Given("User has access to endpoint with Subscriber ID {string}, MemberSequenceNumber {string}, SourceSystem {string} and SenderApp {string}")
	public void user_has_access_to_endpoint_with_subscriber_id_member_sequence_number_source_system_and_sender_app(
			String subscriberID, String memberSequenceNumber, String sourceSystem, String senderApp) throws IOException {
		//FileInputStream fis=new FileInputStream("C:\\Users\\AH35156\\OneDrive - Anthem\\Desktop\\HRS\\bdd_framework\\API\\HRS\\src\\main\\java\\com\\cucumber\\framework\\model\\RequestPayload.xml");
		inactivation.setSubscriberID(subscriberID);
		inactivation.setMemberSequenceNumber(memberSequenceNumber);
		inactivation.setSourceSystem(sourceSystem);
		inactivation.setSenderApp(senderApp);
		//request = given().contentType("text/xml").body(IOUtils.toString(fis,"UTF-8"));
		request = given().contentType("text/xml").body(InactivationAPIModel.getIn());

	}

	@When("The valid endpoint fatch the Inactivation data")
	public void the_valid_endpoint_fatch_the_inactivation_data() {
		res = request.that().post(APIParameters.inactivationService);
	}

	@Then("Validate Inactivation response")
	public void validate_inactivation_response() {
		//res.then().body(path, matcher, additionalKeyMatcherPairs)
		//res.then().statusCode(200).and().log().all().and().assertThat();
		res.then().body("Envelope.Body.getInactivationDataResponse.contactDate",Matchers.contains("2023-06-09") );
		//System.out.println("Status :"+data);
		/*
		 * Assert.assertEquals(data.contains("HRS Unable to Reach") Expected value ,
		 * true Actual Value , "Response body contains HRS Unable to Reach");
		 */
		
	}
}
