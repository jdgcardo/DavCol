package co.com.davivienda.app.userinterfaces.pages;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.davivienda.app.userinterfaces.locators.DetalleDeProductoLocators.LBL_SALDO_TOTAL_LOCATOR;
import static co.com.davivienda.app.userinterfaces.locators.DetalleDeProductoLocators.LBL_VALOR_SALDO_TOTAL_LOCATOR;
import static co.com.davivienda.app.utils.ElementFinder.dynamicElement;
import static co.com.davivienda.app.utils.ElementFinder.theElementBy;

public class DetalleDeProductoPage {
    public static final Target LBL_SALDO_TOTAL= Target.the("Label Saldo Total")
            .located(theElementBy(LBL_SALDO_TOTAL_LOCATOR));

    public static final Target LBL_VALOR_SALDO_TOTAL= Target.the("Valor Saldo Total")
            .locatedBy(dynamicElement(LBL_VALOR_SALDO_TOTAL_LOCATOR));
}
