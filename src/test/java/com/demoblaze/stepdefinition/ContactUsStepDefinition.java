package com.demoblaze.stepdefinition;

import com.questions.SuccessMessageQuestion;
import com.tasks.*;
import com.ui.ContactUsUI;
import com.ui.HomeUI;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;

import java.nio.file.Paths;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class ContactUsStepDefinition {

    @When("the user accesses the {string} form")
    public void theUserAccessesTheForm(String formName) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                GoToContactUs.fromHome()
        );
    }

    @And("fills in the required fields Name, Email, Subject, and Message")
    public void fillsInTheRequiredFields() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FillContactForm.withData("Kevin", "kevin@test.com", "Test Subject", "This is a test message")
        );
    }

    @And("uploads a file using the Upload File option")
    public void uploadsAFile() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                UploadFile.go()
        );
    }

    @And("submits the form")
    public void submitsTheForm() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                GoToSubmitButton.fromHome()
        );
    }

    @And("accepts the browser alert")
    public void acceptsTheBrowserAlert() {
        BrowseTheWeb.as(OnStage.theActorInTheSpotlight())
                .getDriver()
                .switchTo()
                .alert()
                .accept();
    }

    @Then("the success message {string} is displayed")
    public void theSuccessMessageIsDisplayed(String expectedMessage) {
        OnStage.theActorInTheSpotlight().should(
                seeThat(SuccessMessageQuestion.displayed(), equalTo(expectedMessage))
        );
    }

    @And("the user returns to the Home page")
    public void theUserReturnsToTheHomePage() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                HomeButton.go()
        );
    }
}
