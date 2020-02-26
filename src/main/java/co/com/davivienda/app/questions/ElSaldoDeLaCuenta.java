package co.com.davivienda.app.questions;

import co.com.davivienda.app.models.DataUserApp;
import co.com.davivienda.app.userinterfaces.pages.DetalleDeProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import java.util.List;

public class ElSaldoDeLaCuenta implements Question<Boolean> {

    private List<DataUserApp> dataUserApps;

    public ElSaldoDeLaCuenta(List<DataUserApp> dataUserApps) {
        this.dataUserApps = dataUserApps;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String Saldo = '$'+dataUserApps.get(0).getSaldo();

        if(DetalleDeProductoPage.LBL_VALOR_SALDO_TOTAL.of(dataUserApps.get(0).getSaldo())
                .resolveFor(actor).getText().equals(Saldo)){
            return true;
        }
        else {
            return false;
        }
    }

    public static ElSaldoDeLaCuenta es(List<DataUserApp> dataUserApps) {
        return new ElSaldoDeLaCuenta(dataUserApps);
    }

}
