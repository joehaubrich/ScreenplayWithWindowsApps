package co.tests.screenplay.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.tests.screenplay.tasks.AddTwoNumbersWTwoDigits.addMultiDigitNumber;
import static co.tests.screenplay.userinterface.MainScreen.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddTwoNumbersStepDefinitions {

    @When("Andres clicks on two numbers to add them")
    public void andresClicksOnTwoNumbersToAddThem() {
        theActorInTheSpotlight().attemptsTo(
                addMultiDigitNumber(ONE_BUTTON, FIVE_BUTTON, ONE_BUTTON, FIVE_BUTTON)
        );
    }

    @Then("the result should be the expected result")
    public void theResultShouldBeTheExpectedResult() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(RESULTS).textContent().isEqualTo("Display is 30")
        );

    }
}
