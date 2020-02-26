package co.com.davivienda.app.userinterfaces.locators;

import co.com.davivienda.app.utils.Locator;

public class HomePageLocators {

    public static final Locator LST_TIPO_DOCUMENTO_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.widget.Spinner[@resource-id='userIdType']")
            .withIos("");

    public static final Locator OPC_TIPO_DOCUMENTO_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.widget.ListView//android.widget.CheckedTextView[@resource-id='android:id/text1' and @text='{0}']")
            .withIos("");

    public static final Locator TXT_NUMERO_DE_DOCUMENTO_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.widget.EditText[@resource-id='userId']")
            .withIos("");

    public static final Locator BTN_INGRESAR_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.view.View[@resource-id='btnLoginInit']")
            .withIos("");

    public static final Locator TXT_CLAVE_VIRTUAL_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.widget.EditText[@resource-id='passwordClavevirtual']")
            .withIos("");

    public static final Locator BTN_INICIAR_SESION_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.view.View[@resource-id='btnClavevirtual']")
            .withIos("");

    public static final Locator BTN_REGISTRAR_SI_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.view.View[@text='SI']")
            .withIos("");

    public static final Locator BTN_REGISTRAR_CONTINUAR_LOCATOR = Locator.locator()
            .withAndroid("xpath$//android.view.View[@text='Continuar' and @index='2']")
            .withIos("");

}
