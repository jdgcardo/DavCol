package co.com.davivienda.app.userinterfaces.pages;

import net.serenitybdd.screenplay.targets.Target;
import static co.com.davivienda.app.userinterfaces.locators.PosicionConsolidadaLocators.SALDO_TOTAL_POSICION_CONSOLIDADA_LOCATOR;
import static co.com.davivienda.app.utils.ElementFinder.theElementBy;

public class PosicionConsolidadaPage {

    public static final Target SALDO_TOTAL_POSICION_CONSOLIDADA= Target.the("Saldo total posicion consolidada")
            .located(theElementBy(SALDO_TOTAL_POSICION_CONSOLIDADA_LOCATOR));


}
