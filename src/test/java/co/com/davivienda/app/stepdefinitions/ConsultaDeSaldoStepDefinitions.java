package co.com.davivienda.app.stepdefinitions;

import co.com.davivienda.app.models.DataUserApp;
import co.com.davivienda.app.questions.ElSaldoDeLaCuenta;
import co.com.davivienda.app.questions.SeMuestraElExtracto;
import co.com.davivienda.app.tasks.ConsultarElSaldoDe;
import co.com.davivienda.app.tasks.Descargar;
import co.com.davivienda.app.tasks.IniciarSesionEnLaAPP;
import co.com.davivienda.app.tasks.RegistrarNuevo;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;
import static co.com.davivienda.app.userinterfaces.pages.ListaDeProductosPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;

public class ConsultaDeSaldoStepDefinitions {

    @Before
    public void ConfiguracionInicial() {
        setTheStage(new OnlineCast());
    }

    @Dado("^que Juan esta logueado en la app davivienda con los datos$")
    public void queJuanEstaLogueadoEnLaAppDaviviendaConLosDatos(List<DataUserApp> dataUserApps) {
        theActorCalled("Juan").wasAbleTo(
                IniciarSesionEnLaAPP.conLosDatos(dataUserApps),
                RegistrarNuevo.dispositivo()
        );
    }

    @Cuando("^el consulta el saldo de la cuenta$")
    public void elConsultaElSaldoDeLaCuenta(List<DataUserApp> dataUserApps) {
        theActorInTheSpotlight().attemptsTo(
                ConsultarElSaldoDe.laCuenta(dataUserApps)
        );
    }

    @Entonces("^el saldo se muestra en la app$")
    public void elSaldoSeMuestraEnLaApp(List<DataUserApp> dataUserApps) {
        theActorInTheSpotlight().should(seeThat(ElSaldoDeLaCuenta.es(dataUserApps)));
    }

    @Entonces("^se muestra mensaje CUENTA BLOQUEADA$")
    public void seMuestraMensajeCUENTABLOQUEADA() {
        theActorInTheSpotlight().should(seeThat(the(MENSAJE_CUENTA_BLOQUEADA),isVisible()));
    }

    @Cuando("^el descarga el extracto del mes$")
    public void elDescargaElExtractoDelMes(List<DataUserApp> dataUserApps) {
        theActorInTheSpotlight().attemptsTo(
                ConsultarElSaldoDe.laCuenta(dataUserApps),
                Descargar.elExtracto(dataUserApps)
        );
    }

    @Entonces("^el valida el extracto$")
    public void elValidaElExtracto(List<DataUserApp> dataUserApps) {
        theActorInTheSpotlight().should(seeThat(SeMuestraElExtracto.delMes(dataUserApps)));
    }
}
