package com.devco.reservavuelo.stepdefinitions;

import com.devco.reservavuelo.tasks.Abrir;
import com.devco.reservavuelo.tasks.Consultar;
import com.devco.reservavuelo.tasks.Elegir;
import com.devco.reservavuelo.tasks.IngresarDatos;
import com.devco.reservavuelo.ui.ResultadoViajesPage;
import com.devco.reservavuelo.utils.UtilidadesFechas;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import java.text.ParseException;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

public class ReservaVueloStepDefinitions {

  @Managed(driver = "chrome")
  private WebDriver suNavegador;
  private Actor carlos = Actor.named("Carlos");
  private ResultadoViajesPage resultadoViajesPage = new ResultadoViajesPage();

  @Before
  public void configuracionInicial() {
    carlos.can(BrowseTheWeb.with(suNavegador));
  }

  @Dado("^que (.*) se encuentra en la página inicial de la aerolínea Avianca$")
  public void queCarlosSeEncuentraEnLaPáginaInicialDeLaAerolíneaAvianca(String nombreActor) {
    carlos.wasAbleTo(Abrir.LaPaginaDeAvianca());
  }

  @Cuando("^busca vuelos (.*) desde (.*) hacia (.*) para dentro de (.*) días$")
  public void buscaVuelosDeIdaDesdeOrigenHaciaDestino(String tipoViaje, String ciudadOrigen, String ciudadDestino,
      int dias) throws ParseException {
    String fechaVuelo = UtilidadesFechas.obtenerFechaDeVuelo(dias);
    carlos.attemptsTo(
        Elegir.SoloViajeDeIda(),
        IngresarDatos.deVuelo(ciudadOrigen, ciudadDestino, fechaVuelo),
        Consultar.Vuelos());
    //TODO convertir el número de días a una fecha con el formato adecuado

  }

  @Entonces("^se obtienen los vuelos disponibles para esa fecha$")
  public void seObtienenLosVuelosDisponiblesParaEsaFecha() {
    //carlos.should(seeThat(HayDisponibilidad.deVuelos());
    MatcherAssert.assertThat("No se encontraron viajes para la fecha", !resultadoViajesPage.getLstViajes().isEmpty());
    //System.out.println(HayDisponibilidad.deVuelos());
  }


}
