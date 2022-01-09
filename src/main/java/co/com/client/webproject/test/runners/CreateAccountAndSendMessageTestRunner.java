package co.com.client.webproject.test.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  snippets = SnippetType.CAMELCASE,
  features = {"src/main/resources/features/purchasewithshoppingcart.feature",
    "src/main/resources/features/sendmessage.feature"},
  glue = {"co.com.client.webproject.test.stepdefinition.mywork"},
  tags = {/*"not @ScenarioName:MessageSentSuccessfully",
                "not @ScenarioName:MessageNotSent",
                "not @ScenarioName:PurchaseWithPaymentByCheck",
                "not @ScenarioName:PurchaseWithPaymentByBankTransfer"*/}
)
public class CreateAccountAndSendMessageTestRunner {
}
