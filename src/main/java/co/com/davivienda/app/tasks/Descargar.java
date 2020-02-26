package co.com.davivienda.app.tasks;

import co.com.davivienda.app.models.DataUserApp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import java.util.List;

import static co.com.davivienda.app.userinterfaces.pages.DescargarExtractosPage.*;

public class Descargar implements Task {

    private List<DataUserApp> dataUserApps;

    public Descargar(List<DataUserApp> dataUserApps) {
        this.dataUserApps = dataUserApps;
    }

    @Override
    @Step("{0} descarga el extracto de la cuenta de ahorros")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_EXTRACTOS),
                Click.on(LST_MES_EXTRACTO),
                Click.on(OPC_MES.of(dataUserApps.get(0).getMesExtracto())),
                Click.on(BTN_DESCARGAR)
        );

    }

    public static Descargar elExtracto(List<DataUserApp> dataUserApps) {
        return Tasks.instrumented(Descargar.class,dataUserApps);
    }
}
