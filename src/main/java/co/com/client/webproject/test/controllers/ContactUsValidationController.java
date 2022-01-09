package co.com.client.webproject.test.controllers;

import co.com.client.webproject.test.page.ContactUsValidationPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import org.assertj.core.api.Assertions;

public class ContactUsValidationController {

  private WebAction webAction;

  public void setWebAction(WebAction webAction) {
    this.webAction = webAction;
  }

  public String getContactUsOk() {
    String message = "";
    try {
      ContactUsValidationPage contactUsValidationPage = new ContactUsValidationPage(webAction.getDriver());
      message = webAction.getText(contactUsValidationPage.getContactUsOKValidation(), 2, true);

    } catch (WebActionsException e) {
      Assertions.fail("Error en la validacion getContactUsOk()", e);
    }

    return message;
  }

  public String getContactUsError() {
    String message = "";
    try {
      ContactUsValidationPage contactUsValidationPage = new ContactUsValidationPage(webAction.getDriver());
      message = webAction.getText(contactUsValidationPage.getContactUsErrorValidation(), 2, true);

    } catch (WebActionsException e) {
      Assertions.fail("Error en la validacion getContactUsError()", e);
    }

    return message;
  }

}
