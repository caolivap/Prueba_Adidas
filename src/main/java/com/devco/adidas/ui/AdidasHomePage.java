package com.devco.adidas.ui;

import net.serenitybdd.screenplay.targets.Target;

public class AdidasHomePage {

    public static final Target LINK_SECCION_HOMBRES = Target.the("Link sección de hombres").locatedBy(
            "//a[contains(text(),'HOMBRES')]");

    public static final Target LINK_CALZADO = Target.the("Link calzado").locatedBy(
            "//a[contains(text(),'Calzado')]");

    public static final Target CERRAR_ADD_DESCUENTO = Target.the("Cerrar ADD Descuento").locatedBy(
            "//button[@class='gl-modal__close']");

    public static final Target TYPELIST_ORDENAR = Target.the("Opciones de orden de resultados").locatedBy(
            "//span[contains(text(),'Ordenar por')]");

    public static final Target OPCION_DE_MENOR_MAYOR = Target.the("Opción de orden de menor a mayor precio").locatedBy(
            "//button[contains(text(),'Precio (de menor a mayor)')]");

    public static final Target PRECIOS = Target.the("Precios de los resultados encontrados").locatedBy(
            "//span[contains(@class,'gl-price__value')]");



}
