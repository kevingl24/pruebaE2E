package com.demoblaze.stepdefinition;

import com.tasks.GoToContactUs;
import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.ui.HomeUI.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class HomeStepDefinition {

    @And("the page title is visible")
    public void thePageTitleIsVisible() {
        OnStage.theActorInTheSpotlight().should(
                seeThat(
                        WebElementQuestion.the(HOME_TITLE),
                        WebElementStateMatchers.isVisible()
                )
        );
    }

    @And("the user clicks on Contact Us")
    public void theUserClicksOnContactUs() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                GoToContactUs.fromHome()
        );
    }
}
