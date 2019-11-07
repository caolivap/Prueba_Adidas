package com.devco.reservavuelo.ui;

import java.util.List;
import java.util.stream.Collectors;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.screenplay.targets.BaseTarget;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResultadoViajesPage extends PageObject {

  public static final Target VUELOS = Target.the("Los resultados de los vuelos").
      locatedBy("//div[@class and @data-flightid]");

  public static final Target TABLA_VUELOS = Target.the("Tabla que contiene los vuelos").
      locatedBy("//div[@id='tpl3_upsell-bound0']");

  @FindBy(
      xpath = "//div[@id='tpl3_upsell-bound0']"
  )
  private List<WebElement> lstViajes;

  public List<WebElement> getLstViajes() {
    return lstViajes
        .stream()
        .map(
            element ->
                element
                    .findElement(
                        By.xpath("//div[@class='bound-table-flightline-details']"))
        ).collect(Collectors.toList());
  }
}
