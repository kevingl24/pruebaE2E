package com.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ContactUsUI {

    public static final Target FORM_TITLE =
            Target.the("Contact form title")
                    .located(By.xpath("//h2[text()='Get In Touch']"));

    public static final Target NAME =
            Target.the("Name field")
                    .located(By.xpath("//input[@placeholder='Name']"));

    public static final Target EMAIL =
            Target.the("Email field")
                    .located(By.xpath("//input[@placeholder='Email']"));

    public static final Target SUBJECT =
            Target.the("Subject field")
                    .located(By.xpath("//input[@placeholder='Subject']"));

    public static final Target MESSAGE =
            Target.the("Message field")
                    .located(By.xpath("//textarea[@placeholder='Your Message Here']"));

    public static final Target UPLOAD_FILE =
            Target.the("Upload file")
                    .located(By.xpath("//input[@name='upload_file']"));


    public static final Target SUBMIT_BUTTON =
            Target.the("Submit button")
                    .located(By.xpath("//input[@name='submit']"));

    public static final Target SUCCESS_MESSAGE =
            Target.the("Success message")
                    .located(By.xpath("//*[contains(text(),'Success! Your details have been submitted successfully.')]"));
}
