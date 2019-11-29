package com.devco.adidas.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.devco.adidas.ui.AdidasHomePage.PRECIOS;

public class Resultados implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return PRECIOS.resolveFor(actor).isCurrentlyVisible();
        //return Text.of(PRECIOS).viewedBy(actor).asString() != null;
    }

    public static Question deTenis() {
        return new Resultados();
    }

}
