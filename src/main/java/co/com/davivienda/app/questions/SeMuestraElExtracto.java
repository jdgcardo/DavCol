package co.com.davivienda.app.questions;

import co.com.davivienda.app.models.DataUserApp;
import co.com.davivienda.app.userinterfaces.pages.ExtractoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.springframework.aop.scope.ScopedProxyUtils;

import java.util.List;

public class SeMuestraElExtracto implements Question<Boolean> {
    private List<DataUserApp> dataUserApps;

    public SeMuestraElExtracto(List<DataUserApp> dataUserApps) {
        this.dataUserApps = dataUserApps;
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        String mes = dataUserApps.get(0).getMesExtracto().replace(" ","-");
        if(ExtractoPage.LBL_FECHA_EXTRACTO.of(mes).resolveFor(actor).isVisible()){
            return true;
        }
        else return false;

    }

    public static SeMuestraElExtracto delMes(List<DataUserApp> dataUserApps) {
        return new SeMuestraElExtracto(dataUserApps);
    }


}
