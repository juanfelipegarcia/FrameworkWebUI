package co.com.client.webproject.test.controllers;

import co.com.client.webproject.test.page.MyAccountPage;
import co.com.sofka.test.actions.WebAction;
import co.com.sofka.test.evidence.reports.Report;
import co.com.sofka.test.exceptions.WebActionsException;
import org.assertj.core.api.Assertions;

public class MyAccountWebController {
  private WebAction webAction;

  public void setWebAction(WebAction webAction) {
    this.webAction = webAction;
  }

  public String obtenerNombreDeNuevoUsuario() {
    String usuario = "";
    try {
      MyAccountPage myAccountPage = new MyAccountPage(webAction.getDriver());
      usuario = webAction.getText(myAccountPage.getCustomerName(), 2, true);

    } catch (WebActionsException e) {

      Assertions.fail("Error en MyAccountWebController  obtenerNombreDeNuevoUsuario()", e);
    }

    return usuario;
  }
}
