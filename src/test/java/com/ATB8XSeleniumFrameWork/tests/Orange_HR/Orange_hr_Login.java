package com.ATB8XSeleniumFrameWork.tests.Orange_HR;

import com.ATB8XSeleniumFrameWork.Utils.PropertiesReader;
import com.ATB8XSeleniumFrameWork.base.CommonToAllTests;
import com.ATB8XSeleniumFrameWork.drivers.DriverManager;
import com.ATB8XSeleniumFrameWork.pages.PageObjectModel.orangeHr.Dashboardpage_POM_OHR;
import com.ATB8XSeleniumFrameWork.pages.PageObjectModel.orangeHr.LoginPage_POM_OHR;
import com.ATB8XSeleniumFrameWork.pages.PageObjectModel.vwo.LoginPage_POM;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class Orange_hr_Login extends CommonToAllTests {

    @Owner("SUNEETHA")
    @Description("Verify the login page of the Orange HR and DashBoard page")
    @Test
    public  void test_OHR_Loginpage(){
           LoginPage_POM_OHR loginPagePomOhr=new LoginPage_POM_OHR(DriverManager.getDriver());

           loginPagePomOhr.LogintoOHRValidCreds(PropertiesReader.readKey("ohr_username"),PropertiesReader.readKey("ohr_password"));

            Dashboardpage_POM_OHR dashboardpagePomOhr=new Dashboardpage_POM_OHR(DriverManager.getDriver());
            String loggedinUserName_ohr=dashboardpagePomOhr.loggedinUsername();
            assertThat(loggedinUserName_ohr).isNotBlank().isNotNull().isNotEmpty();
            assertThat(loggedinUserName_ohr).isEqualTo(PropertiesReader.readKey("ohr_expected_username"));
    }
}
