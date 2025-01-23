package com.ATB8XSeleniumFrameWork.tests.VWOLogin;

import com.ATB8XSeleniumFrameWork.Utils.PropertiesReader;
import com.ATB8XSeleniumFrameWork.base.CommonToAllTests;
import com.ATB8XSeleniumFrameWork.drivers.DriverManager;
import com.ATB8XSeleniumFrameWork.pages.PageObjectModel.vwo.DashBoardPage_POM;
import com.ATB8XSeleniumFrameWork.pages.PageObjectModel.vwo.LoginPage_POM;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class TestVWOLoginPage_POM extends CommonToAllTests {

    @Owner("SUNEETHA")
    @Description("Verifying  error message with invalid credentials")
    @Test
    public void test_LoginPageInvalidCred(){

        LoginPage_POM loginpage_pom=new LoginPage_POM(DriverManager.getDriver());
        String error_msg= loginpage_pom.logintoVWOappInvaliCreds(PropertiesReader.readKey("invalid_username"),PropertiesReader.readKey("invalid_password"));

        assertThat(error_msg).isNotBlank().isNotEmpty();
        assertThat(error_msg).isEqualTo(PropertiesReader.readKey("error_message"));
    }

    @Owner("SUNEETHA")
    @Description("Verifying  error message with invalid credentials")
    @Test
    public void test_LoginPagevalidCred(){

        LoginPage_POM loginpage_pom=new LoginPage_POM(DriverManager.getDriver());
        loginpage_pom.LoginVWOValidCreds(PropertiesReader.readKey("username"),PropertiesReader.readKey("password"));

        DashBoardPage_POM dashBoardPagePom=new DashBoardPage_POM(DriverManager.getDriver());
       String loggedinUser= dashBoardPagePom.loggedInUserName();

        assertThat(loggedinUser).isNotEmpty().isNotBlank().isNotNull();
        assertThat(loggedinUser).isEqualTo(PropertiesReader.readKey("expected_username"));
    }
}
