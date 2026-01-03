package com.tasks;

import com.ui.ContactUsUI;
import com.ui.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToSubmitButton implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ContactUsUI.SUBMIT_BUTTON)
        );
    }

    public static GoToSubmitButton fromHome() {
        return instrumented(GoToSubmitButton.class);
    }
}
