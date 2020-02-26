package co.com.davivienda.app.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import java.time.Duration;
import static co.com.davivienda.app.userinterfaces.pages.HomePage.BTN_REGISTRAR_CONTINUAR;
import static co.com.davivienda.app.userinterfaces.pages.HomePage.BTN_REGISTRAR_SI;

public class RegistrarNuevo implements Task {


    @Override
    @Step("{0} registra nuevo dispositivo")
    public <T extends Actor> void performAs(T actor) {

        BTN_REGISTRAR_SI.resolveFor(actor).setImplicitTimeout(Duration.ofSeconds(5));
        actor.attemptsTo(
                Check.whether(BTN_REGISTRAR_SI.resolveFor(actor).isVisible())
                        .andIfSo(Click.on(BTN_REGISTRAR_SI))
        );
        BTN_REGISTRAR_CONTINUAR.resolveFor(actor).setImplicitTimeout(Duration.ofSeconds(5));
        actor.attemptsTo(
                Check.whether(BTN_REGISTRAR_CONTINUAR.resolveFor(actor).isVisible())
                        .andIfSo(Click.on(BTN_REGISTRAR_CONTINUAR))
        );
    }

    public static RegistrarNuevo dispositivo() {
        return Tasks.instrumented(RegistrarNuevo.class);
    }
}
