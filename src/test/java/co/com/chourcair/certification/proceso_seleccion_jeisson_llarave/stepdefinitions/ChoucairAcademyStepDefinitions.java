package co.com.chourcair.certification.proceso_seleccion_jeisson_llarave.stepdefinitions;

import co.com.chourcair.certification.proceso_seleccion_jeisson_llarave.tasks.OpenUp;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast()); }

    @Given("^than brandon wants to learn automation at the Choucair Academy$")
    public void thanBrandonWantsToLearnAutomationAtTheChoucairAcademy () {
        OnStage.theActorCalled( requiredActor. "Brandon" ).wasAbleTo(OpenUp.thePage());
    }

    @When("^he search for the course automation resources in Bancolombia on the Choucair Academy platform$")
    public void heSearchForTheCourseAutomationResourcesInBancolombiaOnTheChoucairAcademyPlatform () {

    }

    @Then("^he finds the course called automation resources Bancolombia$")
    public void heFindsTheCourseCalledAutomationResourcesBancolombia () {

    }

}
