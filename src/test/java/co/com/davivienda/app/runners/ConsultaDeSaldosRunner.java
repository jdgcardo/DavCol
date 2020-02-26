package co.com.davivienda.app.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/consulta_de_saldo_cuenta_de_ahorros.feature",
        glue="co.com.davivienda.app.stepdefinitions",
        tags = "@test1",
        snippets = SnippetType.CAMELCASE
)

public class ConsultaDeSaldosRunner {
}
