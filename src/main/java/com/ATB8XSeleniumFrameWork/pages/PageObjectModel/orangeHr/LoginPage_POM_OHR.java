package com.ATB8XSeleniumFrameWork.pages.PageObjectModel.orangeHr;

import com.ATB8XSeleniumFrameWork.Utils.PropertiesReader;
import com.ATB8XSeleniumFrameWork.base.CommonToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM_OHR extends CommonToAllPages {

    WebDriver driver;

    public LoginPage_POM_OHR(WebDriver driver) {
        this.driver = driver;
    }

    // Page locators

    private By username=By.xpath("//input[@placeholder='Username']");
    private By password=By.xpath("//input[@placeholder='Password']");
    private By submmit_button=By.xpath("//button[normalize-space()='Login']");

    //Page Actions

    public void LogintoOHRValidCreds(String user,String pwd){
        driver.get(PropertiesReader.readKey("orange_hr_url"));
        visibilityOfElement(username);
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(submmit_button);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
