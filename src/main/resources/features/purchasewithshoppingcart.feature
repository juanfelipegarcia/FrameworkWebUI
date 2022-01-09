# new feature
# Tags: optional
@FeatureName:BuyProducts
Feature:Buy products
  I as a registered Client in the Web application
  I want to buy products
  for the summer season

  @ScenarioName:PurchaseWithPaymentByBankTransfer
  Scenario: Purchase with payment by bank transfer
    Given The client is located on the landing page http://automationpractice.com/index.php sign in
    When the client selects the desired product
    Then the client should see the payment confirmation message

  @ScenarioName:PurchaseWithPaymentByCheck
  Scenario: Purchase with payment by check
    Given client is located on the landing page http://automationpractice.com/index.php sign in
    When the client selects the products
    Then the client should see the confirmation message for payment by check