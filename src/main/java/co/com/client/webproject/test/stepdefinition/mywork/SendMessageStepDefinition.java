package co.com.client.webproject.test.stepdefinition.mywork;

import co.com.client.webproject.test.controllers.*;
import co.com.client.webproject.test.controllers.openwebpage.StartBrowserWebController;
import co.com.client.webproject.test.data.objects.TestInfo;
import co.com.client.webproject.test.models.Customer;
import co.com.client.webproject.test.stepdefinition.GeneralSetup;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Assert;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;

public class SendMessageStepDefinition extends GeneralSetup {

  private WebAction webAction;
  private Customer customer;

  @Before
  public void setUp(Scenario scenario) {
    testInfo = new TestInfo(scenario);
    webAction = new WebAction(testInfo.getFeatureName());
    webAction.setScenario(testInfo.getScenarioName());
  }

  // Scenario Nª 1
  @Given("customer is on landing page http:\\/\\/automationpractice.com\\/index.php sign in")
  public void customerIsOnLandingPageHttpAutomationpracticeComIndexPhp() {
    try {
      StartBrowserWebController startBrowserWebController = new StartBrowserWebController();
      startBrowserWebController.setBrowser(browser());
      startBrowserWebController.setWebAction(webAction);
      startBrowserWebController.setFeature(testInfo.getFeatureName());
      startBrowserWebController.abrirTiendaOnline();

      LoginPageWebController loginPageWebController = new LoginPageWebController();
      loginPageWebController.setWebAction(webAction);
      loginPageWebController.goToLoginPage();

      CreateAnAccountWebController createAnAccountWebController = new CreateAnAccountWebController();
      createAnAccountWebController.setWebAction(webAction);
      createAnAccountWebController.crearUnaCuenta();
      customer = createAnAccountWebController.getCustomer();
    } catch (Exception e) {
      Assertions.fail("Error en el setup Scenario 1 del Contact Us", e);
    }
  }

  @When("the Customer fills in all the fields")
  public void theCustomerFillsInAllTheFields() {
    try {
      LoginPageWebController loginPageWebController = new LoginPageWebController();
      loginPageWebController.setWebAction(webAction);
      loginPageWebController.goToContactUsPage();

      CreateContactUsController createContactUsController = new CreateContactUsController();
      createContactUsController.setWebAction(webAction);
      createContactUsController.fillContacUs();
      customer = createContactUsController.getCustomer();
    } catch (Exception e) {
      Assertions.fail("Error en el @When Scenario 1 del Contact Us", e);
    }
  }

  @Then("The Customer should see the delivery confirmation message")
  public void theCustomerShouldSeeTheDeliveryConfirmationMessage() {
    try {
      ContactUsValidationController contactUsValidationController = new ContactUsValidationController();
      contactUsValidationController.setWebAction(webAction);

      MessageValidationController messageValidationController = new MessageValidationController();
      messageValidationController.setWebAction(webAction);

      Assert.Hard
        .thatString(contactUsValidationController.getContactUsOk())
        .isEqualTo(messageValidationController.messageSentSuccesfully());

    } catch (Exception e) {
      Assertions.fail("Error en el @Then Scenario 1 del Contact Us", e);
    }

  }

  // Scenario Nª 2
  @Given("the customer is on landing page http:\\/\\/automationpractice.com\\/index.php sign in")
  public void theCustomerIsOnLandingPageHttpAutomationpracticeComIndexPhp() {
    try {
      StartBrowserWebController startBrowserWebController = new StartBrowserWebController();
      startBrowserWebController.setBrowser(browser());
      startBrowserWebController.setWebAction(webAction);
      startBrowserWebController.setFeature(testInfo.getFeatureName());
      startBrowserWebController.abrirTiendaOnline();

      LoginPageWebController loginPageWebController = new LoginPageWebController();
      loginPageWebController.setWebAction(webAction);
      loginPageWebController.goToLoginPage();

      CreateAnAccountWebController createAnAccountWebController = new CreateAnAccountWebController();
      createAnAccountWebController.setWebAction(webAction);
      createAnAccountWebController.crearUnaCuenta();
      customer = createAnAccountWebController.getCustomer();
    } catch (Exception e) {
      Assertions.fail("Error en el setup Scenario 2 del Contact Us", e);
    }
  }

  @When("the customer incorrectly fills in the fields")
  public void theCustomerIncorrectlyFillsInTheFields() {
    try {
      LoginPageWebController loginPageWebController = new LoginPageWebController();
      loginPageWebController.setWebAction(webAction);
      loginPageWebController.goToContactUsPage();

      CreateContactUsController createContactUsController = new CreateContactUsController();
      createContactUsController.setWebAction(webAction);
      createContactUsController.fillErrorContacUs();
      customer = createContactUsController.getCustomer();
    } catch (Exception e) {
      Assertions.fail("Error en el @When Scenario 2 del Contact Us", e);
    }
  }

  @Then("the customer should see the error message on the shipment")
  public void theCustomerShouldSeeTheErrorMessageOnTheShipment() {
    try {
      ContactUsValidationController contactUsValidationController = new ContactUsValidationController();
      contactUsValidationController.setWebAction(webAction);

      MessageValidationController messageValidationController = new MessageValidationController();
      messageValidationController.setWebAction(webAction);

      Assert.Hard
        .thatString(contactUsValidationController.getContactUsError())
        .isEqualTo(messageValidationController.messageNotSent());

    } catch (Exception e) {
      Assertions.fail("Error en el @Then Scenario 2 del Contact Us", e);
    }

  }


  @After
  public void tearDown() throws WebActionsException {

    if (webAction != null && webAction.getDriver() != null)
      webAction.closeBrowser();

    Report.reportInfo("***** HA FINALIZADO LA PRUEBA******"
      .concat(testInfo.getFeatureName())
      .concat("/-/")
      .concat(testInfo.getScenarioName()));

  }

}
