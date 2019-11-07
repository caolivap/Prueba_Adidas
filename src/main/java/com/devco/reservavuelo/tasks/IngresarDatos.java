package com.devco.reservavuelo.tasks;

import com.devco.reservavuelo.interactions.Cambiar;
import com.devco.reservavuelo.ui.AviancaHomePage;
import com.devco.reservavuelo.utils.UtilidadesFechas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IngresarDatos implements Task {

  private String ciudadOrigen;
  private String ciudadDestino;
  private String fechaVuelo;

  public IngresarDatos(String ciudadOrigen, String ciudadDestino, String fechaVuelo) {
    this.ciudadOrigen = ciudadOrigen;
    this.ciudadDestino = ciudadDestino;
    this.fechaVuelo = fechaVuelo;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(AviancaHomePage.CAMPO_CIUDAD_ORIGEN));
    actor.attemptsTo(Enter.theValue(ciudadOrigen).into(AviancaHomePage.CAMPO_CIUDAD_ORIGEN));
    actor.attemptsTo(Click.on(AviancaHomePage.BOTON_SUGERENCIA_CIUDAD.of(ciudadOrigen)));
    actor.attemptsTo(Click.on(AviancaHomePage.CAMPO_CIUDAD_DESTINO));
    actor.attemptsTo(Enter.theValue(ciudadDestino).into(AviancaHomePage.CAMPO_CIUDAD_DESTINO));
    actor.attemptsTo(Click.on(AviancaHomePage.BOTON_SUGERENCIA_CIUDAD.of(ciudadDestino)));
    actor.attemptsTo(Cambiar.frame(AviancaHomePage.XPATH_FRAME_PUBLICIDAD_MILES));
    actor.attemptsTo(Click.on(AviancaHomePage.CERRAR_AD_MILES));
    actor.attemptsTo(Cambiar.frame());
    actor.attemptsTo(Click.on(AviancaHomePage.CAMPO_INGRESAR_FECHA));
    actor.attemptsTo(Click.on(AviancaHomePage.FECHA_CALENDARIO.of(fechaVuelo)));
  }

  public static IngresarDatos deVuelo(String ciudadOrigen, String ciudadDestino, String fechaVuelo) {
    return Tasks.instrumented(IngresarDatos.class, ciudadOrigen, ciudadDestino, fechaVuelo);
  }

}
