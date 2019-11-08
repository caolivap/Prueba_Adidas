package com.devco.avianca.ui;

import java.util.List;
import java.util.stream.Collectors;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResultadoViajesPage extends PageObject {

  private static final String TABLA_VUELOS = "//div[@id='tpl3_upsell-bound0']";
  private static final String VUELOS = "//div[contains(@id,'tpl3_price-fareGroup0-bound0-row')]//span[contains(@class,'cell-reco-bestprice-integer')]";

  public List<String> getLstViajes() {
    WebElement table = this.getDriver().findElement(By.xpath(TABLA_VUELOS));
    List<WebElement> lstWe = table.findElements(By.xpath(VUELOS));
    return lstWe.stream()
                .map(
                    element ->
                        element.getText()
                ).collect(Collectors.toList());
  }
}
