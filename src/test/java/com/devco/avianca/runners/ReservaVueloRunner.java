package com.devco.avianca.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/realizar_reserva_vuelo_avianca.feature",
    tags = "@Escenario1",
    snippets = SnippetType.CAMELCASE,
    glue = "com.devco.avianca/stepdefinitions")

public class ReservaVueloRunner {

}
