package com.ATB8XSeleniumFrameWork.tests.PF;

import com.ATB8XSeleniumFrameWork.Utils.PropertiesReader;
import com.ATB8XSeleniumFrameWork.base.CommonToAllTests;
import com.ATB8XSeleniumFrameWork.drivers.DriverManager;
import com.ATB8XSeleniumFrameWork.pages.PageFactory.LoginPage_PF;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.ATB8XSeleniumFrameWork.drivers.DriverManager.driver;
import static org.assertj.core.api.Assertions.assertThat;

public class VWOLogin_PF extends CommonToAllTests {

    @Owner("Suneetha")
    @Description("Verify the VWO app login with invalid credentials")
    @Test
    public void test_VWOappLoginInvalidCreds(){
        driver.get(PropertiesReader.readKey("url"));
        LoginPage_PF loginPagePf=new LoginPage_PF(DriverManager.getDriver());
        String error_message= loginPagePf.logintoVWOAppInvalidCreds();

        assertThat(error_message).isNotEmpty().isNotNull().isNotBlank();
        assertThat(error_message).isEqualTo(PropertiesReader.readKey("error_message"));

    }
}
