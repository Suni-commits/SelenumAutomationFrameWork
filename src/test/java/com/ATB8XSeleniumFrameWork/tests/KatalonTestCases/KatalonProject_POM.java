package com.ATB8XSeleniumFrameWork.tests.KatalonTestCases;

import com.ATB8XSeleniumFrameWork.Utils.PropertiesReader;
import com.ATB8XSeleniumFrameWork.base.CommonToAllTests;
import com.ATB8XSeleniumFrameWork.drivers.DriverManager;
import com.ATB8XSeleniumFrameWork.pages.PageObjectModel.Katalonapp.Katalon_Login_POM;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class KatalonProject_POM extends CommonToAllTests {

    @Owner("Suneetha")
    @Description("Verify the katalon page login")
    @Test
    public void test_LoginKatalonapp(){

        Katalon_Login_POM katalonLoginPom=new Katalon_Login_POM(DriverManager.getDriver());
        katalonLoginPom.LoginToKatalonValidCred(PropertiesReader.readKey("katalon_username"),PropertiesReader.readKey("katalon_password"));

        Katalonapp_Appointmentpage_POM kalanpage=new Katalonapp_Appointmentpage_POM(DriverManager.getDriver());
        String text=kalanpage.loggedinUser();

        assertThat(text).isNotBlank().isNotNull().isNotEmpty();
        assertThat(text).isEqualTo(PropertiesReader.readKey("expected_message"));
    }
}
