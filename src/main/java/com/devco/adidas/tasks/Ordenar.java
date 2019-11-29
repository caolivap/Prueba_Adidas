package com.devco.adidas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.devco.adidas.ui.AdidasHomePage.OPCION_DE_MENOR_MAYOR;
import static com.devco.adidas.ui.AdidasHomePage.TYPELIST_ORDENAR;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Ordenar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TYPELIST_ORDENAR),
                WaitUntil.the(OPCION_DE_MENOR_MAYOR, isVisible()),
                Click.on(OPCION_DE_MENOR_MAYOR)
        );
    }

    public static Performable porMenorPrecio() {
        return instrumented(Ordenar.class);
    }


}
