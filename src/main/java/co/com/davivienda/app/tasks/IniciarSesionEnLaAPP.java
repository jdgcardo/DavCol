package co.com.davivienda.app.tasks;

import co.com.davivienda.app.models.DataUserApp;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import java.util.List;
import static co.com.davivienda.app.userinterfaces.pages.HomePage.*;

public class IniciarSesionEnLaAPP implements Task {

    private List<DataUserApp> dataUserApps;

    public IniciarSesionEnLaAPP(List<DataUserApp> dataUserApps) {
        this.dataUserApps = dataUserApps;
    }

    @Override
    @Step("{0} se loguea en la APP Davivienda colombia")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LST_TIPO_DOCUMENTO),
                Click.on(OPC_TIPO_DOCUMENTO.of(dataUserApps.get(0).getTipoDocumento())),
                Enter.theValue(dataUserApps.get(0).getNumDocumento()).into(TXT_NUMERO_DE_DOCUMENTO),
                Click.on(BTN_INGRESAR),
                Enter.theValue(dataUserApps.get(0).getContrasena()).into(TXT_CLAVE_VIRTUAL),
                Click.on(BTN_INICIAR_SESION)
        );

    }

    public static IniciarSesionEnLaAPP conLosDatos(List<DataUserApp> dataUserApps) {
        return Tasks.instrumented(IniciarSesionEnLaAPP.class,dataUserApps);
    }
}
