package com.tasks;

import com.ui.ContactUsUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillContactForm implements Task {

    private final String name;
    private final String email;
    private final String subject;
    private final String message;

    public FillContactForm(String name, String email, String subject, String message) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.message = message;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(name).into(ContactUsUI.NAME),
                Enter.theValue(email).into(ContactUsUI.EMAIL),
                Enter.theValue(subject).into(ContactUsUI.SUBJECT),
                Enter.theValue(message).into(ContactUsUI.MESSAGE)
        );
    }

    public static FillContactForm withData(String name, String email, String subject, String message) {
        return instrumented(FillContactForm.class, name, email, subject, message);
    }
}
