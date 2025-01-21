package com.ATB8XSeleniumFrameWork.tests.VWOLogin;

import com.ATB8XSeleniumFrameWork.pages.PageObjectModel.LoginPage_POM;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class TestVWOLoginPage_POM {

    @Owner("SUNEETHA")
    @Description("Verifying  error message with invalid credentials")
    @Test
    public void test_LoginPageInvalidCred(){

        WebDriver driver=new EdgeDriver();
        driver.get("https://app.vwo.com");

        LoginPage_POM loginpage_pom=new LoginPage_POM(driver);
        String error_msg= loginpage_pom.logintoVWOappInvaliCreds("admin@gmail.com","admin123");


       assertThat(error_msg).isNotBlank().isNotEmpty();
       assertThat(error_msg).isEqualTo("Your email, password, IP address or location did not match");

            driver.quit();

    }
}
