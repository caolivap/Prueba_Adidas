package com.devco.adidas.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;

public class Cambiar implements Interaction {

  private String xpathElemento;

  Cambiar(){}

  Cambiar(String xpathElemento){
    this.xpathElemento = xpathElemento;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    if(xpathElemento != null){
      BrowseTheWeb.as(actor).getDriver().switchTo().frame(BrowseTheWeb.as(actor).getDriver().findElement(By.xpath(xpathElemento)));
    }else{
      BrowseTheWeb.as(actor).getDriver().switchTo().parentFrame();
    }

  }

  public static Cambiar frame(String xpathElemento) {
    return new Cambiar(xpathElemento);
  }

  public static Cambiar frame() {
    return new Cambiar();
  }


}
