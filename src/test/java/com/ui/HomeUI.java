package com.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class HomeUI {

    public static final Target HOME_TITLE =
            Target.the("Home page title")
                    .located(By.xpath("//img[@alt='Website for automation practice']"));

    public static final Target CONTACT_US =
            Target.the("Contact Us option")
                    .located(By.xpath("//a[normalize-space()='Contact us']"));

    public static final Target HOME_BUTTON =
            Target.the("Home button")
                    .located(By.xpath("//a[normalize-space()='Home']"));
}
