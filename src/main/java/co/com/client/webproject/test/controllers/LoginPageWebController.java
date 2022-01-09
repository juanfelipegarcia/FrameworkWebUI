package co.com.client.webproject.test.controllers;

import co.com.client.webproject.test.page.ContactUsPage;
import co.com.client.webproject.test.page.LandingPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import org.assertj.core.api.Assertions;

public class LoginPageWebController {

  private WebAction webAction;

  public void setWebAction(WebAction webAction) {
    this.webAction = webAction;
  }

  public void goToLoginPage() {
    try {
      LandingPage landingPage = new LandingPage(webAction.getDriver());
      webAction.click(landingPage.getSignIn(), 2, true);
    } catch (WebActionsException e) {
      Assertions.fail("Error en LoginPageWebController goToLoginPage()", e);
    }
  }

  public void goToContactUsPage() {
    try {
      ContactUsPage contactUsPage = new ContactUsPage(webAction.getDriver());
      webAction.click(contactUsPage.getContactUs(), 2, true);
    } catch (WebActionsException e) {
      Assertions.fail("Error en LoginPageWebController goToContactUsPage()", e);
    }
  }
}
