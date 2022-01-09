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


public class PurchaseWithShoppingCartStepDefinition extends GeneralSetup {


  private WebAction webAction;
  private Customer customer;

  @Before
  public void setUp(Scenario scenario) {
    testInfo = new TestInfo(scenario);
    webAction = new WebAction(testInfo.getFeatureName());
    webAction.setScenario(testInfo.getScenarioName());
  }

  // Scenario Nª 1
  @Given("The client is located on the landing page http:\\/\\/automationpractice.com\\/index.php sign in")
  public void theClientIsLocatedOnTheLandingPageHttpAutomationpracticeComIndexPhp() {
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
      Assertions.fail("Error en el setup Scenario 1 @Given Sign In", e);
    }
  }

  @When("the client selects the desired product")
  public void theClientSelectsTheDesiredProduct() {
    try {
      TShirtsCategoryController tShirtsCategoryController = new TShirtsCategoryController();
      tShirtsCategoryController.setWebAction(webAction);
      tShirtsCategoryController.goToTshirts();
      tShirtsCategoryController.startShoppingTShirts();
      tShirtsCategoryController.addressTermsPaymentTShirts();
    } catch (Exception e) {
      Assertions.fail("Error en @When Scenario 1 Sign In", e);
    }
  }

  @Then("the client should see the payment confirmation message")
  public void theClientShouldSeeThePaymentConfirmationMessage() {
    try {
      OnlinePurchasesValidationController onlinePurchasesValidationController = new OnlinePurchasesValidationController();
      onlinePurchasesValidationController.setWebAction(webAction);

      MessageValidationController messageValidationController = new MessageValidationController();
      messageValidationController.setWebAction(webAction);

      Assert.Hard
        .thatString(onlinePurchasesValidationController.getPaymentWithTransferValidation())
        .isEqualTo(messageValidationController.messagePaymentTransfer());

    } catch (Exception e) {
      Assertions.fail("Error en el @Then Scenario 1 Sign In", e);
    }
  }

  // Scenario Nª 2
  @Given("client is located on the landing page http:\\/\\/automationpractice.com\\/index.php sign in")
  public void clientIsLocatedOnTheLandingPageHttpAutomationpracticeComIndexPhp() {
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
      Assertions.fail("Error en el @Given Scenario 2 Sign In", e);
    }
  }

  @When("the client selects the products")
  public void theClientSelectsTheProducts() {
    try {
      DressesSummerCategoryController dressesSummerCategoryController = new DressesSummerCategoryController();
      dressesSummerCategoryController.setWebAction(webAction);
      dressesSummerCategoryController.goToDresses();
      dressesSummerCategoryController.goToSummerDresses();
      dressesSummerCategoryController.startShoppingDress();
      dressesSummerCategoryController.addressTermsPaymentDresses();

    } catch (Exception e) {
      Assertions.fail("Error en el @When Scenario 2 Sign In", e);
    }
  }

  @Then("the client should see the confirmation message for payment by check")
  public void theClientShouldSeeTheConfirmationMessageForPaymentByCheck() {
    try {
      OnlinePurchasesValidationController onlinePurchasesValidationController = new OnlinePurchasesValidationController();
      onlinePurchasesValidationController.setWebAction(webAction);

      MessageValidationController messageValidationController = new MessageValidationController();
      messageValidationController.setWebAction(webAction);

      Assert.Hard
        .thatString(onlinePurchasesValidationController.getPaymentWithCheckValidation())
        .isEqualTo(messageValidationController.messagePaymentCheck());

    } catch (Exception e) {
      Assertions.fail("Error en el @Then Scenario 2 Sign In", e);
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
