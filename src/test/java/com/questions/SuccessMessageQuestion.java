package com.questions;

import com.ui.ContactUsUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static org.hamcrest.Matchers.equalTo;

public class SuccessMessageQuestion implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ContactUsUI.SUCCESS_MESSAGE).answeredBy(actor);
    }

    public static Question<String> displayed() {
        return new SuccessMessageQuestion();
    }
}
