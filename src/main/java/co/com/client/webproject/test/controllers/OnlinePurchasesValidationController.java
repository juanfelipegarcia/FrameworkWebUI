package co.com.client.webproject.test.controllers;

import co.com.client.webproject.test.page.OnlinePurchasesValidationPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import org.assertj.core.api.Assertions;

public class OnlinePurchasesValidationController {

  private WebAction webAction;

  public void setWebAction(WebAction webAction) {
    this.webAction = webAction;
  }

  public String getPaymentWithTransferValidation() {
    String message = "";
    try {
      OnlinePurchasesValidationPage onlinePurchasesValidationPage = new OnlinePurchasesValidationPage(webAction.getDriver());
      message = webAction.getText(onlinePurchasesValidationPage.getPaymentWithTransferValidation(), 2, true);
    } catch (WebActionsException e) {
      Assertions.fail("Error en OnlinePurchasesValidationController getPaymentWithTransferValidation() ", e);
    }
    return message;
  }

  public String getPaymentWithCheckValidation() {
    String message = "";
    try {
      OnlinePurchasesValidationPage onlinePurchasesValidationPage = new OnlinePurchasesValidationPage(webAction.getDriver());
      message = webAction.getText(onlinePurchasesValidationPage.getPaymentWihtCheckrValidation(), 2, true);
    } catch (WebActionsException e) {
      Assertions.fail("Error en OnlinePurchasesValidationController getPaymentWithCheckValidation() ", e);
    }
    return message;
  }


}
