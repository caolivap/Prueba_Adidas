package com.devco.reservavuelo.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Cambiar implements Interaction {

  private String xpathElemento;
  //private WebDriver;

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
