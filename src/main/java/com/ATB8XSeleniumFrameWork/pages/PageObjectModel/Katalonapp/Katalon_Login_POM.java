package com.ATB8XSeleniumFrameWork.pages.PageObjectModel.Katalonapp;

import com.ATB8XSeleniumFrameWork.Utils.PropertiesReader;
import com.ATB8XSeleniumFrameWork.base.CommonToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Katalon_Login_POM extends CommonToAllPages {
    WebDriver driver;
    public Katalon_Login_POM(WebDriver driver){
        this.driver=driver;
    }

    // Page Locators
        private By username= By.xpath("//input[@id='txt-username']");
        private By password= By.xpath("//input[@id='txt-password']");
        private By submit_btn=By.xpath("//button[@id='btn-login']");


    // Page Actions

    public void LoginToKatalonValidCred(String user,String pwd){
        driver.get(PropertiesReader.readKey("katalon_url"));
        enterInput(username,user);
        enterInput(password,pwd);
        clickElement(submit_btn);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
