Feature: Clinical Search API

  @HRS
  Scenario Outline: Clinical Search API test
    Given User has access to endpoint with MCID "<MCID>", Case status "<CaseStatus>",Source System CD "<SourceSystemCD>", SubscriberID "<SubscriberID>" and SenderApp "<SenderApp>"
    When The valid endpoint fatch the clinical data ConditionData "<ConditionData>" and Method type "<MethodType>"
    Then Validate the clinical response with status code "<StatusCode>" and ConditionData "<ConditionData>"

    Examples: 
      | MCID      | CaseStatus | SenderApp | ConditionData | MethodType | StatusCode | SourceSystemCD | SubscriberID |
      | 205323395 | OPEN       | CAPI      | correctURL    | POST       |        200 | WGS20          |    129890525 |
      | 205323395 | OPEN       | CAPI      | wrongtURL     | POST       |        404 | WGS20          |    129890525 |
      | 205323395 | OPEN       | CAPI      | methodChange  | GET        |        405 | WGS20          |    129890525 |
      | 205323395 | OPEN       | CAPI      | methodChange  | DELETE     |        405 | WGS20          |    129890525 |
