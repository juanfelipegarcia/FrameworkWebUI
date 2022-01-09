package co.com.client.webproject.test.controllers;

import co.com.client.webproject.test.page.ShoppingRouteTShirtsPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;

import com.github.javafaker.Faker;
import org.assertj.core.api.Assertions;

import java.util.Locale;
import java.util.Random;

public class TShirtsCategoryController {

  private WebAction webAction;

  public void setWebAction(WebAction webAction) {
    this.webAction = webAction;
  }

  public void goToTshirts() {
    try {
      ShoppingRouteTShirtsPage shoppingRouteTShirtsPage = new ShoppingRouteTShirtsPage(webAction.getDriver());

      webAction.click(shoppingRouteTShirtsPage.getCategoryTShirts(), 2, true);

    } catch (WebActionsException e) {
      Assertions.fail("Error en TShirtsCategoryController goToTshirts() ", e);
    }
  }

  public void startShoppingTShirts() {
    try {
      ShoppingRouteTShirtsPage shoppingRouteTShirtsPage = new ShoppingRouteTShirtsPage(webAction.getDriver());

      webAction.moveTo(shoppingRouteTShirtsPage.gettShirts(), 2, true);
      webAction.click(shoppingRouteTShirtsPage.getAddCartTShirts(), 2, true);
      webAction.click(shoppingRouteTShirtsPage.getProceedCheckout1(), 2, true);
      webAction.moveTo(shoppingRouteTShirtsPage.getDivQuantyTShirts(), 2, true);
      webAction.click(shoppingRouteTShirtsPage.getAddAUnitTShirts(), 2, true);
      webAction.moveTo(shoppingRouteTShirtsPage.getProceedCheckout2(), 2, true);
      webAction.click(shoppingRouteTShirtsPage.getProceedCheckout2(), 2, true);

    } catch (WebActionsException e) {
      Assertions.fail("Error en TShirtsCategoryController startShoppingTShirts() ", e);
    }
  }

  public void addressTermsPaymentTShirts() {
    try {
      Faker faker = Faker.instance(new Locale("es-CO"), new Random());

      String messageOmOrder = faker.lorem().fixedString(500);

      ShoppingRouteTShirtsPage shoppingRouteTShirtsPage = new ShoppingRouteTShirtsPage(webAction.getDriver());

      webAction.moveTo(shoppingRouteTShirtsPage.getCommentOnYourOrder(), 2, true);
      webAction.sendText(shoppingRouteTShirtsPage.getCommentOnYourOrder(), messageOmOrder, 2, true);
      webAction.click(shoppingRouteTShirtsPage.getButtonprocessAddress(), 2, true);
      webAction.click(shoppingRouteTShirtsPage.getTermsOfService(), 2, true);
      webAction.click(shoppingRouteTShirtsPage.getButtonProcessCarrier(), 2, true);
      webAction.moveTo(shoppingRouteTShirtsPage.getPaymentByBankTransfer(), 2, true);
      webAction.click(shoppingRouteTShirtsPage.getPaymentByBankTransfer(), 2, true);
      webAction.moveTo(shoppingRouteTShirtsPage.getButtonConfirmOrder(), 2, true);
      webAction.click(shoppingRouteTShirtsPage.getButtonConfirmOrder(), 2, true);

    } catch (WebActionsException e) {
      Assertions.fail("Error en TShirtsCategoryController addressTermsPaymentTShirts() ", e);
    }
  }


}
