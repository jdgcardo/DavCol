package co.com.davivienda.app.userinterfaces.pages;

import net.serenitybdd.screenplay.targets.Target;
import static co.com.davivienda.app.userinterfaces.locators.ExtractoLocators.LBL_FECHA_EXTRACTO_LOCATOR;
import static co.com.davivienda.app.utils.ElementFinder.dynamicElement;

public class ExtractoPage {

    public static final Target LBL_FECHA_EXTRACTO = Target.the("Titulo PDF extracto")
            .locatedBy(dynamicElement(LBL_FECHA_EXTRACTO_LOCATOR));
}
