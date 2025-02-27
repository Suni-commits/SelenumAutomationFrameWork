package com.ATB8XSeleniumFrameWork.base;

import com.ATB8XSeleniumFrameWork.Utils.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.ATB8XSeleniumFrameWork.drivers.DriverManager.getDriver;

public class CommonToAllPages {

    public void CommonToAllPages(){
        // If you want to call something before every Page Object Class call, Put your Code here");
        // Open File, Open Data Base Connection You can write code here

    }

    public void clickElement(By by){

        getDriver().findElement(by).click();
    }
    public void clickElement(WebElement by){

       by.click();
    }

    public void enterInput(By by,String key){
        getDriver().findElement(by).sendKeys(key);
    }
    public void enterInput(WebElement by,String key){
        by.sendKeys(key);
    }


    public void openVWOLoginURL(){
        getDriver().get(PropertiesReader.readKey("url"));
    }

    public void getText(By by){
        getDriver().findElement(by).getText();
    }

    public WebElement presenceOfElement(By elementLocation){

        return new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }

    public WebElement visibilityOfElement(By elementLocation){
        return new WebDriverWait(getDriver(),Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
    }

    public WebElement getElement(By Key){
        return getDriver().findElement(Key);
    }

}
