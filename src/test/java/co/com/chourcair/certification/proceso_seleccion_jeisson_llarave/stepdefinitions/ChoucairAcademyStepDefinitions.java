package co.com.chourcair.certification.proceso_seleccion_jeisson_llarave.stepdefinitions;

import co.com.chourcair.certification.proceso_seleccion_jeisson_llarave.model.AcademyChoucairData;
import co.com.chourcair.certification.proceso_seleccion_jeisson_llarave.questions.Answer;
import co.com.chourcair.certification.proceso_seleccion_jeisson_llarave.tasks.Login;
import co.com.chourcair.certification.proceso_seleccion_jeisson_llarave.tasks.OpenUp;
import co.com.chourcair.certification.proceso_seleccion_jeisson_llarave.tasks.Search;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast()); }

    @Given("^than brandon wants to learn automation at the Choucair Academy$")
    public void thanBrandonWantsToLearnAutomationAtTheChoucairAcademy (List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorCalled( requiredActor,"Brandon" ).wasAbleTo(OpenUp.thePage(), (Login.
                onThePage(academyChoucairData.get(0).getSrtUser(), academyChoucairData.get(0).getSrtPassword())));
    }

    @When("^he search for the course (.*) on the Choucair Academy platform$")
    public void heSearchForTheCourseAutomationResourcesInBancolombiaOnTheChoucairAcademyPlatform (List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotLight().attemptsTo(Search.the(academyChoucairData.get(0).getSrtCourse()));
    }

    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledAutomationResourcesBancolombia (List<AcademyChoucairData> academyChoucairData) throws Exception {
        OnStage.theActorInTheSpotLight().should(GivenWhenThen.seeThat(Answer.toThe(academyChoucairData.get(0).getSrtCourse())));
    }

}
