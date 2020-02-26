package co.com.davivienda.app.userinterfaces.pages;


import net.serenitybdd.screenplay.targets.Target;

import static co.com.davivienda.app.userinterfaces.locators.DescargarExtractosLocators.*;
import static co.com.davivienda.app.utils.ElementFinder.dynamicElement;
import static co.com.davivienda.app.utils.ElementFinder.theElementBy;

public class DescargarExtractosPage {

    public static final Target  BTN_EXTRACTOS = Target.the("Boton Extractos Menú Inferior")
            .located(theElementBy(BTN_EXTRACTOS_LOCATOR));

    public static final Target  LST_MES_EXTRACTO = Target.the("Lista de Extractos disponibles")
            .located(theElementBy(LST_MES_EXTRACTO_LOCATOR));

    public static final Target  OPC_MES = Target.the("Opcion mes extracto")
            .locatedBy(dynamicElement(OPC_MES_LOCATOR));

    public static final Target  BTN_DESCARGAR = Target.the("Boton Descargar")
            .located(theElementBy(BTN_DESCARGAR_LOCATOR));

}
