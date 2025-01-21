package com.ATB8XSeleniumFrameWork.tests.SampleTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SampleTestCase {

    @Test
    public void sample_openPage(){

        WebDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com");
        driver.quit();

    }
}
