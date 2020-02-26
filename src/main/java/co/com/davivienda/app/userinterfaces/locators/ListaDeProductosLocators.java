package co.com.davivienda.app.userinterfaces.locators;

import co.com.davivienda.app.utils.Locator;

public class ListaDeProductosLocators {
    public static final Locator SELECCIONAR_LISTA_DE_PRODUCTOS_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.view.View[contains(@text,'Saldo total {0}')]")
            .withIos("");

    public static final Locator MENSAJE_CUENTA_BLOQUEADA_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.view.View[contains(@text,'CUENTA BLOQUEADA')]")
            .withIos("");

    public static final Locator BTN_MENSAJE_CUENTA_BLOQUEADA_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.view.View[@text='Aceptar']")
            .withIos("");


}
