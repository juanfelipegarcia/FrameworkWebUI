# new feature
# Tags: optional
@FeatureName:SendMessage
Feature:Send Message
  I as a registered Customer in the Web application
  I want to contact customer service
  to learn about new offers


  @ScenarioName:MessageSentSuccessfully
  Scenario: Message sent successfully
    Given customer is on landing page http://automationpractice.com/index.php sign in
    When the Customer fills in all the fields
    Then The Customer should see the delivery confirmation message

  @ScenarioName:MessageNotSent
  Scenario: Message not sent
    Given the customer is on landing page http://automationpractice.com/index.php sign in
    When the customer incorrectly fills in the fields
    Then the customer should see the error message on the shipment