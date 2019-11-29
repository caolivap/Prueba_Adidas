package com.devco.adidas.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.devco.adidas.ui.AdidasHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Buscar implements Task {

    private String seccion;

    public Buscar(String seccion){
        this.seccion = seccion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_SECCION_HOMBRES),
                Click.on(LINK_CALZADO)
        );
        if(CERRAR_ADD_DESCUENTO.resolveFor(actor).isPresent()){
            actor.attemptsTo(
                    Click.on(CERRAR_ADD_DESCUENTO)
            );
        }
    }

    public static Performable seccion(String seccion) {
        return instrumented(Buscar.class, seccion);
    }

}
