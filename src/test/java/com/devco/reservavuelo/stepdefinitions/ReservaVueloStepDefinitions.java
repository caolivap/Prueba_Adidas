package com.devco.reservavuelo.stepdefinitions;

import com.devco.reservavuelo.tasks.Abrir;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ReservaVueloStepDefinitions {

  @Managed(driver = "chrome")
  private WebDriver suNavegador;
  private Actor carlos = Actor.named("Carlos");

  @Before
  public void configuracionInicial(){
    carlos.can(BrowseTheWeb.with(suNavegador));
  }

  @Dado("^que (.*) se encuentra en la página inicial de la aerolínea Avianca$")
  public void queCarlosSeEncuentraEnLaPáginaInicialDeLaAerolíneaAvianca(String nombreActor){
    carlos.wasAbleTo(Abrir.LaPaginaDeAvianca());
  }


  @Cuando("^busca vuelos de ida desde (.*) hacia (.*)$")
  public void buscaVuelosDeIdaDesdeMedellínHaciaBogotá(String ciudadOrigen, String ciudadDestino) {

  }

  @Cuando("^reserva el vuelo más económico$")
  public void reservaElVueloMásEconómico(){

  }

  @Entonces("^se genera un número de reserva exitosamente$")
  public void seGeneraUnNúmeroDeReservaExitosamente(){

  }


}
