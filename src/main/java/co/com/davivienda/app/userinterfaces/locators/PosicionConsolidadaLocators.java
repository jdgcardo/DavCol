package co.com.davivienda.app.userinterfaces.locators;

import co.com.davivienda.app.utils.Locator;

public class PosicionConsolidadaLocators {

    public static final Locator SALDO_TOTAL_POSICION_CONSOLIDADA_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.view.View[contains(@text,'Cuentas Saldo total')]")
            .withIos("");


}
