package co.com.client.webproject.test.controllers;

import co.com.client.webproject.test.models.Customer;
import co.com.client.webproject.test.page.FillFieldsContactUsPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import org.assertj.core.api.Assertions;

import static co.com.client.webproject.test.helpers.Dictionary.*;
import static co.com.client.webproject.test.helpers.Helper.generateCustomer;

public class CreateContactUsController {

  private WebAction webAction;
  private Customer customer;

  public Customer getCustomer() {
    return customer;
  }

  public void setWebAction(WebAction webAction) {
    this.webAction = webAction;
  }

  public void fillContacUs() {
    try {
      customer = generateCustomer(SPANISH_CODE_LANGUAGE, COUNTRY_CODE, EMAIL_DOMAIN);

      FillFieldsContactUsPage fillFieldsContactUsPage = new FillFieldsContactUsPage(webAction.getDriver());

      webAction.click(fillFieldsContactUsPage.getSubjectHeadingCustumer(), 2, true);
      webAction.sendText(fillFieldsContactUsPage.getMessage(), customer.getMessage(), 2, true);
      webAction.click(fillFieldsContactUsPage.getSubmitMessageBotton(), 2, true);

    } catch (WebActionsException e) {
      Assertions.fail("Error en CreateContactUsController - fillContacUs()", e);
    }

  }

  public void fillErrorContacUs() {
    try {
      customer = generateCustomer(SPANISH_CODE_LANGUAGE, COUNTRY_CODE, EMAIL_DOMAIN);

      FillFieldsContactUsPage fillFieldsContactUsPage = new FillFieldsContactUsPage(webAction.getDriver());

      webAction.click(fillFieldsContactUsPage.getSubjectHeadingCustumer(), 2, true);
      webAction.click(fillFieldsContactUsPage.getSubmitMessageBotton(), 2, true);

    } catch (WebActionsException e) {
      Assertions.fail("Error en CreateContactUsController - fillErrorContacUs()", e);
    }

  }
}
