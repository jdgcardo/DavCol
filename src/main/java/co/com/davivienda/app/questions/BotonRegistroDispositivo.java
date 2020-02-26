package co.com.davivienda.app.questions;

import co.com.davivienda.app.userinterfaces.pages.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.time.Duration;

import static co.com.davivienda.app.userinterfaces.pages.HomePage.BTN_REGISTRAR_SI;

public class BotonRegistroDispositivo implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        if(BTN_REGISTRAR_SI.resolveFor(actor).isVisible()){
            BTN_REGISTRAR_SI.resolveFor(actor).setImplicitTimeout(Duration.ofSeconds(5));
            return true;
        }else{
            return false;
        }


    }

    public static BotonRegistroDispositivo esVisible() {
        return new BotonRegistroDispositivo();
    }
}
