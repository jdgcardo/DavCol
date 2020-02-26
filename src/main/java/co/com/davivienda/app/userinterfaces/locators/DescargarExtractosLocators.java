package co.com.davivienda.app.userinterfaces.locators;

import co.com.davivienda.app.utils.Locator;

public class DescargarExtractosLocators {

    public static final Locator BTN_EXTRACTOS_LOCATOR = Locator.locator()
            .withAndroid(("xpath$//android.view.View[@text='Extractos']"))
            .withIos("");

    public static final Locator LST_MES_EXTRACTO_LOCATOR = Locator.locator()
            .withAndroid(("xpath$//android.widget.Spinner[@resource-id='periodAbstractSelect']"))
            .withIos("");

    public static final Locator OPC_MES_LOCATOR = Locator.locator()
            .withAndroid(("xpath$//android.widget.CheckedTextView[@text='{0}']"))
            .withIos("");

    public static final Locator BTN_DESCARGAR_LOCATOR = Locator.locator()
            .withAndroid(("xpath$//android.view.View[@resource-id='btnDownloadAbstract']"))
            .withIos("");


}
