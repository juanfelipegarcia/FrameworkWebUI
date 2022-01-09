package co.com.client.webproject.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlinePurchasesValidationPage {


  @CacheLookup
  @FindBy(xpath = "//*[@id=\"center_column\"]/div/p/strong")
  WebElement paymentWithTransferValidation;

  @CacheLookup
  @FindBy(xpath = "//*[@id=\"center_column\"]/p[1]")
  WebElement paymentWihtCheckrValidation;

  public WebElement getPaymentWithTransferValidation() {
    return paymentWithTransferValidation;
  }

  public WebElement getPaymentWihtCheckrValidation() {
    return paymentWihtCheckrValidation;
  }

  public OnlinePurchasesValidationPage(WebDriver webDriver) {
    PageFactory.initElements(webDriver, this);
  }
}
