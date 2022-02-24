package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.junit.Before;
import questions.Answer;
import tasks.*;

public class PruebaStepDefintions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to create a new user$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(),(JoinToday.onThePage()));
    }


    @When("^he search a form to register data$")
    public void sheSearchForTheCourseOnTheChoucairAcademyPlatform(String model) {
        OnStage.theActorInTheSpotlight().attemptsTo(Locate.the());
        OnStage.theActorInTheSpotlight().attemptsTo(Cell.theCell());
        OnStage.theActorInTheSpotlight().attemptsTo(LastStep.theLast());
    }

    @Then("^she finds the course called$")
    public void sheFindsTheCourseCalled() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.onThe("https://utest.com/welcome?from=signup")));
    }
}
