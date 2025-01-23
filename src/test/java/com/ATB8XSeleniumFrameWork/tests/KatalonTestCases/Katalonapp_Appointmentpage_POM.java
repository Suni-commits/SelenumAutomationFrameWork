package com.ATB8XSeleniumFrameWork.tests.KatalonTestCases;

import com.ATB8XSeleniumFrameWork.base.CommonToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Katalonapp_Appointmentpage_POM extends CommonToAllPages {

    WebDriver driver;
    public Katalonapp_Appointmentpage_POM(WebDriver driver){
        this.driver=driver;
    }

    // Page Locators
    private By text_message=By.xpath("//h2[normalize-space()='Make Appointment']");


    // Page Actions
    public String loggedinUser(){
        presenceOfElement(text_message);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return getElement(text_message).getText();

    }
}
