package com.cucumber.framework.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class InactivationAPIModel {

	private String SubscriberID;
	private String MemberSequenceNumber;
	private String SourceSystem;
	private String SenderApp;

	public String getSubscriberID() {
		return SubscriberID;
	}

	public void setSubscriberID(String subscriberID) {
		SubscriberID = subscriberID;
	}

	public String getMemberSequenceNumber() {
		return MemberSequenceNumber;
	}

	public void setMemberSequenceNumber(String memberSequenceNumber) {
		MemberSequenceNumber = memberSequenceNumber;
	}

	public String getSourceSystem() {
		return SourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		SourceSystem = sourceSystem;
	}

	public String getSenderApp() {
		return SenderApp;
	}

	public void setSenderApp(String senderApp) {
		SenderApp = senderApp;
	}

	@Override
	public String toString() {
		return "InactivationAPIModel [SubscriberID=" + SubscriberID + ", MemberSequenceNumber=" + MemberSequenceNumber
				+ ", SourceSystem=" + SourceSystem + ", SenderApp=" + SenderApp + "]";
	}
	
	public static String getIn() {
		return "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:v2=\"http://wellpoint.com/esb/header/v2\" xmlns:get=\"http://wellpoint.com/schema/getInactivationDataRequest\">\r\n" + 
				"   <soapenv:Header>\r\n" + 
				"      <v2:ESBHeader>\r\n" + 
				"         <v2:srvcName>?</v2:srvcName>\r\n" + 
				"         <v2:srvcVersion>?</v2:srvcVersion>\r\n" + 
				"         <v2:operName>?</v2:operName>\r\n" + 
				"         <v2:senderApp>?</v2:senderApp>\r\n" + 
				"         <v2:transId>?</v2:transId>\r\n" + 
				"         <!--Zero or more repetitions:-->\r\n" + 
				"         <v2:ESBProps>\r\n" + 
				"            <v2:Property>\r\n" + 
				"               <v2:name>?</v2:name>\r\n" + 
				"               <v2:value>?</v2:value>\r\n" + 
				"            </v2:Property>\r\n" + 
				"         </v2:ESBProps>\r\n" + 
				"      </v2:ESBHeader>\r\n" + 
				"   </soapenv:Header>\r\n" + 
				"   <soapenv:Body>\r\n" + 
				"      <get:getInactivationDataRequest>\r\n" + 
				"         <!--Optional:-->\r\n" + 
				"         <get:MemberInfo>\r\n" + 
				"            <!--Optional:-->\r\n" + 
				"            <get:MemberDetails>\r\n" + 
				"               <!--Optional:-->\r\n" + 
				"               <get:MasterConsumerID>?</get:MasterConsumerID>\r\n" + 
				"               <!--Optional:-->\r\n" + 
				"               <get:SubscriberID>N00550268</get:SubscriberID>\r\n" + 
				"               <!--Optional:-->\r\n" + 
				"               <get:MemberSequenceNumber>001</get:MemberSequenceNumber>\r\n" + 
				"               <!--Optional:-->\r\n" + 
				"               <get:SourceSystem>WGS</get:SourceSystem>\r\n" + 
				"			<get:SenderApp>CED</get:SenderApp>\r\n" + 
				"            </get:MemberDetails>\r\n" + 
				"         </get:MemberInfo>\r\n" + 
				"      </get:getInactivationDataRequest>\r\n" + 
				"   </soapenv:Body>\r\n" + 
				"</soapenv:Envelope>\r\n" + 
				"";
	}
}
