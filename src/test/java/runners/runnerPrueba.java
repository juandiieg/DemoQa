package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/main/resources/features/prueba.feature",
        glue = "dSteps",
        tags = "@agregarRegistro",
        snippets = SnippetType.CAMELCASE
)
public class runnerPrueba {
}
