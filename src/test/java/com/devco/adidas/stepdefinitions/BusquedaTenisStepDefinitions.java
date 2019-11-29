package com.devco.adidas.stepdefinitions;

import com.devco.adidas.questions.Resultados;
import com.devco.adidas.tasks.Abrir;
import com.devco.adidas.tasks.Buscar;
import com.devco.adidas.tasks.Ordenar;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;

public class BusquedaTenisStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("^que (.*) se encuentra en la página inicial de la aerolínea Adidas$")
    public void queCarlosSeEncuentraEnLaPáginaInicialDeLaAerolíneaAdidas(String nombreActor) throws Exception {
        theActorCalled(nombreActor).attemptsTo(
                Abrir.laPaginaDeAdidas()
        );
    }


    @Cuando("^busca (.*) para (.*)$")
    public void buscaTenisParaHombre(String producto, String seccion) throws Exception {
        theActorInTheSpotlight().attemptsTo(
                Buscar.seccion(seccion)
        );
    }

    @Cuando("^ordena por precio de menor a mayor$")
    public void ordenaPorPrecioDeMenorAMayor() throws Exception {
        theActorInTheSpotlight().attemptsTo(
                Ordenar.porMenorPrecio()
        );
    }

    @Entonces("^se obtienen los tenis en órden de precio ascendente$")
    public void seObtienenLosTenisEnOrdenDePrecioAscendente() throws Exception {
        theActorInTheSpotlight().should(seeThat("Los resultados de calzado ordenados de menor a mayor precio", Resultados.deTenis(), is(true)));
    }
}
