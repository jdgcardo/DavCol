package co.com.davivienda.app.userinterfaces.pages;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.davivienda.app.userinterfaces.locators.ListaDeProductosLocators.*;
import static co.com.davivienda.app.utils.ElementFinder.dynamicElement;
import static co.com.davivienda.app.utils.ElementFinder.theElementBy;

public class ListaDeProductosPage {

    public static final Target SELECCIONAR_LISTA_DE_PRODUCTOS= Target.the("Seleccionar producto")
            .locatedBy(dynamicElement(SELECCIONAR_LISTA_DE_PRODUCTOS_LOCATOR));

    public static final Target MENSAJE_CUENTA_BLOQUEADA= Target.the("Mensaje Cuenta Bloqueada")
            .located(theElementBy(MENSAJE_CUENTA_BLOQUEADA_LOCATOR));

    public static final Target BTN_MENSAJE_CUENTA_BLOQUEADA= Target.the("Boton Mensaje Cuenta Bloqueada")
            .located(theElementBy(BTN_MENSAJE_CUENTA_BLOQUEADA_LOCATOR));
}
