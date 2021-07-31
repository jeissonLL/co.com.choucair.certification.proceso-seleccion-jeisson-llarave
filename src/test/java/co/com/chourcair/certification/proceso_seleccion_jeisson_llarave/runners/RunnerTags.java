package co.com.chourcair.certification.proceso_seleccion_jeisson_llarave.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/academyChoucair.feature",
        tags = "@tag1",
        glue = "co.com.chourcair.certification.proceso_seleccion_jeisson_llarave.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerTags {
}
