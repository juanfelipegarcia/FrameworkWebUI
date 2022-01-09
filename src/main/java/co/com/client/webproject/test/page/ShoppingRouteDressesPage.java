package co.com.client.webproject.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingRouteDressesPage {

  @CacheLookup
  @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]")
  WebElement categoryDresses;

  @CacheLookup
  @FindBy(xpath = "//*[@id=\"subcategories\"]/ul/li[3]")
  WebElement subCategorySummer;

  @CacheLookup
  @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[1]")
  WebElement divSummerDressLarge;

  @CacheLookup
  @FindBy(css = "a[data-id-product='5']:nth-child(1)")
  WebElement addCartSummerDressLarge;

  @CacheLookup
  @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span")
  WebElement continueShopping1;

  @CacheLookup
  @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]")
  WebElement divSummerDressSmall;

  @CacheLookup
  @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[2]")
  WebElement moreSummerDressSmall;

  @CacheLookup
  @FindBy(id = "buy_block")
  WebElement divAddCart;

  @CacheLookup
  @FindBy(css = "a[class='btn btn-default button-plus product_quantity_up']")
  WebElement addUnitPSD;

  @CacheLookup
  @FindBy(id = "wishlist_button")
  WebElement AddToMyWishlist;

  @CacheLookup
  @FindBy(css = "a[class='fancybox-item fancybox-close']")
  WebElement closedAdvertisement;

  @CacheLookup
  @FindBy(css = "button[name='Submit']")
  WebElement addCart;

  @CacheLookup
  @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
  WebElement proceedToCheckout1;


  @CacheLookup
  @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
  WebElement proceedToCheckout2;

  @CacheLookup
  @FindBy(css = "button[name='processAddress']")
  WebElement proceedToCheckoutAdress;

  @CacheLookup
  @FindBy(id = "uniform-cgv")
  WebElement TermsOfService;

  @CacheLookup
  @FindBy(css = "button[name='processCarrier']")
  WebElement proceedToCheckoutCarrier;

  @CacheLookup
  @FindBy(css = "a[class='fancybox-item fancybox-close']")
  WebElement closedAdvertisementTermOfService;

  @CacheLookup
  @FindBy(css = "a[title='Pay by check.']")
  WebElement paymentByCheck;

  @CacheLookup
  @FindBy(css = "button[class='button btn btn-default button-medium']")
  WebElement buttonConfirmOrder;


  public WebElement getCategoryDresses() {
    return categoryDresses;
  }

  public WebElement getSubCategorySummer() {
    return subCategorySummer;
  }

  public WebElement getDivSummerDressLarge() {
    return divSummerDressLarge;
  }

  public WebElement getAddCartSummerDressLarge() {
    return addCartSummerDressLarge;
  }

  public WebElement getContinueShopping1() {
    return continueShopping1;
  }

  public WebElement getDivSummerDressSmall() {
    return divSummerDressSmall;
  }

  public WebElement getMoreSummerDressSmall() {
    return moreSummerDressSmall;
  }

  public WebElement getDivAddCart() {
    return divAddCart;
  }

  public WebElement getAddUnitPSD() {
    return addUnitPSD;
  }

  public WebElement getAddCart() {
    return addCart;
  }

  public WebElement getAddToMyWishlist() {
    return AddToMyWishlist;
  }

  public WebElement getClosedAdvertisement() {
    return closedAdvertisement;
  }

  public WebElement getProceedToCheckout1() {
    return proceedToCheckout1;
  }

  public WebElement getProceedToCheckout2() {
    return proceedToCheckout2;
  }

  public WebElement getProceedToCheckoutAdress() {
    return proceedToCheckoutAdress;
  }

  public WebElement getTermsOfService() {
    return TermsOfService;
  }

  public WebElement getProceedToCheckoutCarrier() {
    return proceedToCheckoutCarrier;
  }

  public WebElement getClosedAdvertisementTermOfService() {
    return closedAdvertisementTermOfService;
  }

  public WebElement getPaymentByCheck() {
    return paymentByCheck;
  }

  public WebElement getButtonConfirmOrder() {
    return buttonConfirmOrder;
  }

  public ShoppingRouteDressesPage(WebDriver webDriver) {
    PageFactory.initElements(webDriver, this);
  }
}
