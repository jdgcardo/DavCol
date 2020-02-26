package co.com.davivienda.app.userinterfaces.locators;

import co.com.davivienda.app.utils.Locator;

public class DetalleDeProductoLocators {

    public static final Locator LBL_SALDO_TOTAL_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.view.View[@text='Saldo total']")
            .withIos("");

    public static final Locator LBL_VALOR_SALDO_TOTAL_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.view.View[contains(@text,'{0}')]")
            .withIos("");
}
