package co.com.davivienda.app.userinterfaces.locators;

import co.com.davivienda.app.utils.Locator;

public class ExtractoLocators {
    public static final Locator LBL_FECHA_EXTRACTO_LOCATOR = Locator.locator()
            .withAndroid(("xpath$//android.widget.TextView[contains(@text,'{0}')]"))
            .withIos("");

}
