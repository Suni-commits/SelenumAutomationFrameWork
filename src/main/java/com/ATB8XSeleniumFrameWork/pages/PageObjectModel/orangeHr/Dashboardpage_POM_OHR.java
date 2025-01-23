package com.ATB8XSeleniumFrameWork.pages.PageObjectModel.orangeHr;

import com.ATB8XSeleniumFrameWork.base.CommonToAllPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Dashboardpage_POM_OHR extends CommonToAllPages {

    WebDriver driver;

    public Dashboardpage_POM_OHR(WebDriver driver){
        this.driver=driver;
    }


    //Page Locators
   private By usernameOndashboard= By.xpath("//h6[normalize-space()='PIM']");

   //Page Actions

    public String loggedinUsername(){
        presenceOfElement(usernameOndashboard);
        return getElement(usernameOndashboard).getText();
    }

}
