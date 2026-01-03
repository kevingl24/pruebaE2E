package com.demoblaze.stepdefinition;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actions.Open;

public class NavegarStepDefinition {

    @Given("the user navigates to the application URL")
    public void theUserNavigatesToTheApplicationURL() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Open.url("https://automationexercise.com/")
        );
    }
}
