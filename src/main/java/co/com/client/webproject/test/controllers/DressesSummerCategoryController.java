package co.com.client.webproject.test.controllers;

import co.com.client.webproject.test.page.ShoppingRouteDressesPage;
import co.com.sofka.test.actions.WebAction;
import org.assertj.core.api.Assertions;

public class DressesSummerCategoryController {

  private WebAction webAction;

  public void setWebAction(WebAction webAction) {
    this.webAction = webAction;
  }

  public void goToDresses() {
    try {
      ShoppingRouteDressesPage shoppingRouteDressesPage = new ShoppingRouteDressesPage(webAction.getDriver());

      webAction.click(shoppingRouteDressesPage.getCategoryDresses(), 2, true);


    } catch (Exception e) {
      Assertions.fail("Error en DressesSummerCategoryController goToDresses()", e);
    }
  }


  public void goToSummerDresses() {
    try {
      ShoppingRouteDressesPage shoppingRouteDressesPage = new ShoppingRouteDressesPage(webAction.getDriver());


      webAction.moveTo(shoppingRouteDressesPage.getSubCategorySummer(), 2, true);
      webAction.click(shoppingRouteDressesPage.getSubCategorySummer(), 2, true);

    } catch (Exception e) {
      Assertions.fail("Error en DressesSummerCategoryController goToSummerDresses()", e);
    }
  }


  public void startShoppingDress() {
    try {
      ShoppingRouteDressesPage shoppingRouteDressesPage = new ShoppingRouteDressesPage(webAction.getDriver());

      webAction.moveTo(shoppingRouteDressesPage.getDivSummerDressLarge(), 2, true);
      webAction.click(shoppingRouteDressesPage.getAddCartSummerDressLarge(), 2, true);
      webAction.click(shoppingRouteDressesPage.getContinueShopping1(), 2, true);
      webAction.moveTo(shoppingRouteDressesPage.getDivSummerDressSmall(), 2, true);
      webAction.click(shoppingRouteDressesPage.getMoreSummerDressSmall(), 2, true);
      webAction.moveTo(shoppingRouteDressesPage.getDivAddCart(), 2, true);
      webAction.click(shoppingRouteDressesPage.getAddUnitPSD(), 2, true);
      webAction.click(shoppingRouteDressesPage.getAddToMyWishlist(), 2, true);
      webAction.click(shoppingRouteDressesPage.getClosedAdvertisement(), 2, true);
      webAction.click(shoppingRouteDressesPage.getAddCart(), 2, true);
      webAction.click(shoppingRouteDressesPage.getProceedToCheckout1(), 2, true);
      webAction.moveTo(shoppingRouteDressesPage.getProceedToCheckout2(), 2, true);
      webAction.click(shoppingRouteDressesPage.getProceedToCheckout2(), 2, true);


    } catch (Exception e) {
      Assertions.fail("Error en DressesSummerCategoryController startShoppingDress()", e);
    }
  }

  public void addressTermsPaymentDresses() {
    try {
      ShoppingRouteDressesPage shoppingRouteDressesPage = new ShoppingRouteDressesPage(webAction.getDriver());

      webAction.moveTo(shoppingRouteDressesPage.getProceedToCheckoutAdress(), 2, true);
      webAction.click(shoppingRouteDressesPage.getProceedToCheckoutAdress(), 2, true);
      webAction.moveTo(shoppingRouteDressesPage.getProceedToCheckoutCarrier(), 2, true);
      webAction.click(shoppingRouteDressesPage.getProceedToCheckoutCarrier(), 2, true);
      webAction.click(shoppingRouteDressesPage.getClosedAdvertisementTermOfService(), 2, true);
      webAction.click(shoppingRouteDressesPage.getTermsOfService(), 2, true);
      webAction.click(shoppingRouteDressesPage.getProceedToCheckoutCarrier(), 2, true);
      webAction.click(shoppingRouteDressesPage.getPaymentByCheck(), 2, true);
      webAction.click(shoppingRouteDressesPage.getButtonConfirmOrder(), 2, true);


    } catch (Exception e) {
      Assertions.fail("Error en DressesSummerCategoryController addressTermsPaymentDresses()", e);
    }

  }

}
