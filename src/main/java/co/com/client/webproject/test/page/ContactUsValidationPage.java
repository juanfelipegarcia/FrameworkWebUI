package co.com.client.webproject.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsValidationPage {

  @CacheLookup
  @FindBy(xpath = "//*[@id=\"center_column\"]/p")
  WebElement contactUsOKValidation;

  @CacheLookup
  @FindBy(xpath = "//*[@id=\"center_column\"]/div/ol/li")
  WebElement contactUsErrorValidation;

  public WebElement getContactUsErrorValidation() {
    return contactUsErrorValidation;
  }

  public WebElement getContactUsOKValidation() {
    return contactUsOKValidation;
  }

  public ContactUsValidationPage(WebDriver webDriver) {
    PageFactory.initElements(webDriver, this);
  }
}
