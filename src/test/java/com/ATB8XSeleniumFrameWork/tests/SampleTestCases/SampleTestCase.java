package com.ATB8XSeleniumFrameWork.tests.SampleTestCases;

import com.ATB8XSeleniumFrameWork.Utils.PropertiesReader;
import com.ATB8XSeleniumFrameWork.base.CommonToAllTests;
import com.ATB8XSeleniumFrameWork.drivers.DriverManager;
import com.ATB8XSeleniumFrameWork.listerners.RetryAnalyser;
import com.ATB8XSeleniumFrameWork.pages.PageObjectModel.vwo.LoginPage_POM;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test(retryAnalyzer = RetryAnalyser.class)
public class SampleTestCase extends CommonToAllTests {

    @Test
    public void sample_openPage()  {
        LoginPage_POM loginPagePom=new LoginPage_POM(DriverManager.getDriver());
        String err_msg=loginPagePom.logintoVWOappInvaliCreds(PropertiesReader.readKey("invalid_username"),PropertiesReader.readKey("invalid_password"));

        assertThat(err_msg).isNotEmpty().isNotNull().isNotBlank();
        assertThat(err_msg).isEqualTo(PropertiesReader.readKey("invalid_error_message"));
    }
}
