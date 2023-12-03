Feature: Inactivation API

  @HRS
  Scenario Outline: Inactivation API test
    Given User has access to endpoint with Subscriber ID "<SubscriberID>", MemberSequenceNumber "<MemberSequenceNumber>", SourceSystem "<SourceSystem>" and SenderApp "<SenderApp>"
    When The valid endpoint fatch the Inactivation data
    Then Validate Inactivation response

    Examples: 
      | SubscriberID | MemberSequenceNumber | SourceSystem | SenderApp |
      | AAAAAD802    |                    1 | WGS          | CED       |
