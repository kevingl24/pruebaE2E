package com.tasks;

import com.ui.ContactUsUI;
import com.ui.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.actors.OnStage;

import java.nio.file.Paths;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UploadFile implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Upload.theFile(Paths.get("src/test/resources/files/prueba.avif"))
                        .to(ContactUsUI.UPLOAD_FILE)
        );

    }

    public static UploadFile go() {
        return instrumented(UploadFile.class);
    }
}

