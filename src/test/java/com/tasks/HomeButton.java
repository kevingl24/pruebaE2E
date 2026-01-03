package com.tasks;

import com.ui.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HomeButton implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Click.on(HomeUI.HOME_BUTTON)
        );

    }

    public static HomeButton go() {
        return instrumented(HomeButton.class);
    }
}

