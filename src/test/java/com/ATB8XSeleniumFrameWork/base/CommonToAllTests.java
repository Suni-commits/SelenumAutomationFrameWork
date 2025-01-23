package com.ATB8XSeleniumFrameWork.base;

import com.ATB8XSeleniumFrameWork.drivers.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonToAllTests {

    @BeforeMethod
    public void setUp(){
        DriverManager.init();

    }
    @AfterMethod
    public void tearDown(){

        DriverManager.down();
    }
}
