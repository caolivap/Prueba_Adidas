package com.devco.reservavuelo.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.avianca.com/co/es/")
public class AviancaHomePage extends PageObject {

  public static final Target BOTON_SOLO_IDA = Target.the("El botón de sólo ida").
      located(By.xpath("//a[text()='Solo ida']"));

  public static final Target CAMPO_CIUDAD_ORIGEN = Target.the("El campo de texto de ciudad de orígen").
      located(By.xpath("//div[@role='tabpanel' and @class='tab-pane acordeonBooking soloIda fade active in']//input[@data-name='pbOrigen']"));

  public static final Target CAMPO_CIUDAD_DESTINO = Target.the("El campo de texto de ciudad de destino").
      locatedBy("//div[@role='tabpanel' and @class='tab-pane acordeonBooking soloIda fade active in']//input[@data-name='pbDestino']");

  public static final Target BOTON_SUGERENCIA_CIUDAD = Target.the("La sugerencia de ciudad {0}").
      locatedBy("//div[@role='tabpanel' and @class='tab-pane acordeonBooking soloIda fade active in']//b[contains(text(),'{0}')]");

  public static final Target MES_ANIO_FECHA_VUELO = Target.the("El nombre del mes y el año de la fecha de vuelo").
      locatedBy("//div[contains(@class,'calendar_ida') and @data-space='ida_regreso']//td[@class='cal1']//div[@class='name-month']")


  public static final Target CAMPO_INGRESAR_FECHA = Target.the("Campo para ingresar la fecha del vuelo").
      locatedBy("//div[contains(@class,'soloIda')]//input[@aria-label='Selecciona la fecha de ida']");

  public static final Target FECHA_CALENDARIO = Target.the("La posición del día en el calendario").
      locatedBy("//div[@class='calendar-container hidden-xs right calendar-home']//*[@data-date='{0}']");

  public static final Target BOTON_BUSCAR_VUELOS = Target.the("Botón para consultar los vuelos").
      locatedBy("//div[@class='tab-pane acordeonBooking soloIda fade active in']//button[@title='Buscar vuelos']");

  public static final Target CERRAR_AD_MILES = Target.the("Botón de abrir publicidad de millas").
      locatedBy("//div[@data-click='hideTeaserAndDontShowAgain']");

  public static final String XPATH_FRAME_PUBLICIDAD_MILES = "//span[contains(@id,'teaser')]/iframe";


}
