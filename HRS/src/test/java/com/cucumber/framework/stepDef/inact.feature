Feature: Inactivation API

  @HRS
  Scenario Outline: Inactivation API test
    Given User1 has access to endpoint with Subscriber ID "<SubscriberID>", MemberSequenceNumber "<MemberSequenceNumber>", SourceSystem "<SourceSystem>" and SenderApp "<SenderApp>"
    When The valid endpoint fatch the Inactivation data1
    Then Validate Inactivation response1