package co.com.davivienda.app.tasks;

import co.com.davivienda.app.models.DataUserApp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import java.time.Duration;
import java.util.List;
import static co.com.davivienda.app.userinterfaces.pages.ListaDeProductosPage.SELECCIONAR_LISTA_DE_PRODUCTOS;
import static co.com.davivienda.app.userinterfaces.pages.PosicionConsolidadaPage.*;

public class ConsultarElSaldoDe implements Task {

    private List<DataUserApp> dataUserApps;

    public ConsultarElSaldoDe(List<DataUserApp> dataUserApps) {
        this.dataUserApps = dataUserApps;
    }

    @Override
    @Step("{0} consulta el saldo de la cuenta de ahorros")
    public <T extends Actor> void performAs(T actor) {

        SALDO_TOTAL_POSICION_CONSOLIDADA.resolveFor(actor).setImplicitTimeout(Duration.ofSeconds(30));
        actor.attemptsTo(
                Click.on(SALDO_TOTAL_POSICION_CONSOLIDADA),
                Click.on(SELECCIONAR_LISTA_DE_PRODUCTOS.of(dataUserApps.get(0).getNumCuenta()))
        );
    }

    public static ConsultarElSaldoDe laCuenta(List<DataUserApp> dataUserApps) {
        return Tasks.instrumented(ConsultarElSaldoDe.class,dataUserApps);
    }
}
