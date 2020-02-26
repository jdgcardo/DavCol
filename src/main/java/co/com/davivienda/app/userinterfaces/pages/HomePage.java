package co.com.davivienda.app.userinterfaces.pages;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.davivienda.app.userinterfaces.locators.HomePageLocators.*;
import static co.com.davivienda.app.utils.ElementFinder.dynamicElement;
import static co.com.davivienda.app.utils.ElementFinder.theElementBy;

public class HomePage {

    public static final Target LST_TIPO_DOCUMENTO = Target.the("Tipo Documento")
            .located(theElementBy(LST_TIPO_DOCUMENTO_LOCATOR));

    public static final Target OPC_TIPO_DOCUMENTO = Target.the("Opción Cédula")
            .locatedBy(dynamicElement(OPC_TIPO_DOCUMENTO_LOCATOR));

    public static final Target TXT_NUMERO_DE_DOCUMENTO = Target.the("Campo Número de documento")
            .located(theElementBy(TXT_NUMERO_DE_DOCUMENTO_LOCATOR));

    public static final Target BTN_INGRESAR = Target.the("Boton Ingresar")
            .located(theElementBy(BTN_INGRESAR_LOCATOR));

    public static final Target TXT_CLAVE_VIRTUAL = Target.the("Campo Clave Virtual")
            .located(theElementBy(TXT_CLAVE_VIRTUAL_LOCATOR));

    public static final Target BTN_INICIAR_SESION= Target.the("Boton iniciar Sesion")
            .located(theElementBy(BTN_INICIAR_SESION_LOCATOR));

    public static final Target BTN_REGISTRAR_SI= Target.the("Botón registrar dispositivo opcion SI")
            .located(theElementBy(BTN_REGISTRAR_SI_LOCATOR));

    public static final Target BTN_REGISTRAR_CONTINUAR= Target.the("Boton continuar registrar dispositivo")
            .located(theElementBy(BTN_REGISTRAR_CONTINUAR_LOCATOR));

}
