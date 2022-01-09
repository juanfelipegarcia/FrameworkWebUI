package co.com.client.webproject.test.controllers;

import co.com.sofka.test.actions.WebAction;

public class MessageValidationController {
  private WebAction webAction;

  public void setWebAction(WebAction webAction) {
    this.webAction = webAction;
  }

  public String messageSentSuccesfully() {
    String message = "Your message has been successfully sent to our team.";
    return message;
  }

  public String messageNotSent() {
    String message = "The message cannot be blank.";
    return message;
  }

  public String messagePaymentTransfer() {
    String message = "Your order on My Store is complete.";
    return message;
  }

  public String messagePaymentCheck() {
    String message = "Your order on My Store is complete.";
    return message;
  }

}
