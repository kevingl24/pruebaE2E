package com.tasks;

import com.ui.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.ui.HomeUI.CONTACT_US;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToContactUs implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomeUI.CONTACT_US),
                WaitUntil.the(CONTACT_US, WebElementStateMatchers.isClickable())
        );
    }

    public static GoToContactUs fromHome() {
        return instrumented(GoToContactUs.class);
    }
}
