package com.ATB8XSeleniumFrameWork.pages.PageObjectModel.vwo;

import com.ATB8XSeleniumFrameWork.Utils.PropertiesReader;
import com.ATB8XSeleniumFrameWork.base.CommonToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_POM extends CommonToAllPages {

    WebDriver driver;
// default constructor
    public LoginPage_POM(WebDriver driver){
        this.driver=driver;
    }

    //Step1 : page Locators

    private By username=By.id("login-username");
    private By password = By.id("login-password");
    private By signButton = By.id("js-login-btn");
    private By error_message = By.id("js-notification-box-msg");

    // Step2 : Page Actions

    public String logintoVWOappInvaliCreds(String user,String pwd){
        driver.get(PropertiesReader.readKey("url"));
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(signButton);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        String error_message_text=driver.findElement(error_message).getText();

        return error_message_text;
    }

    public void LoginVWOValidCreds(String user, String pwd){
        driver.get(PropertiesReader.readKey("url"));
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(signButton);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
