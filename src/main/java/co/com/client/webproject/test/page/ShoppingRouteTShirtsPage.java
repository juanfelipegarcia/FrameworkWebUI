package co.com.client.webproject.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingRouteTShirtsPage {

  @CacheLookup
  @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]")
  WebElement categoryTShirts;

  @CacheLookup
  @FindBy(css = "img[title='Faded Short Sleeve T-shirts']")
  WebElement tShirts;

  @CacheLookup
  @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]")
  WebElement addCartTShirts;


  @CacheLookup
  @FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
  WebElement proceedCheckout1;

  @CacheLookup
  @FindBy(id = "cart_summary")
  WebElement divQuantyTShirts;

  @CacheLookup
  @FindBy(css = "a[title='Add']")
  WebElement addAUnitTShirts;

  @CacheLookup
  @FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
  WebElement proceedCheckout2;

  @CacheLookup
  @FindBy(css = "textarea[name='message']")
  WebElement commentOnYourOrder;

  @CacheLookup
  @FindBy(css = "button[name='processAddress']")
  WebElement buttonprocessAddress;

  @CacheLookup
  @FindBy(id = "uniform-cgv")
  WebElement termsOfService;

  @CacheLookup
  @FindBy(css = "button[name='processCarrier']")
  WebElement buttonProcessCarrier;

  @CacheLookup
  @FindBy(css = "a[title='Pay by bank wire']")
  WebElement paymentByBankTransfer;

  @CacheLookup
  @FindBy(css = "button[class='button btn btn-default button-medium']")
  WebElement buttonConfirmOrder;

  public WebElement getCategoryTShirts() {
    return categoryTShirts;
  }

  public WebElement gettShirts() {
    return tShirts;
  }

  public WebElement getAddCartTShirts() {
    return addCartTShirts;
  }

  public WebElement getProceedCheckout1() {
    return proceedCheckout1;
  }

  public WebElement getDivQuantyTShirts() {
    return divQuantyTShirts;
  }

  public WebElement getAddAUnitTShirts() {
    return addAUnitTShirts;
  }

  public WebElement getProceedCheckout2() {
    return proceedCheckout2;
  }

  public WebElement getCommentOnYourOrder() {
    return commentOnYourOrder;
  }

  public WebElement getButtonprocessAddress() {
    return buttonprocessAddress;
  }

  public WebElement getTermsOfService() {
    return termsOfService;
  }

  public WebElement getButtonProcessCarrier() {
    return buttonProcessCarrier;
  }

  public WebElement getPaymentByBankTransfer() {
    return paymentByBankTransfer;
  }

  public WebElement getButtonConfirmOrder() {
    return buttonConfirmOrder;
  }

  public ShoppingRouteTShirtsPage(WebDriver webDriver) {
    PageFactory.initElements(webDriver, this);
  }
}
