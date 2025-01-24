package com.ATB8XSeleniumFrameWork.tests.PF;

import com.ATB8XSeleniumFrameWork.Utils.PropertiesReader;
import com.ATB8XSeleniumFrameWork.base.CommonToAllTests;
import com.ATB8XSeleniumFrameWork.drivers.DriverManager;
import com.ATB8XSeleniumFrameWork.listerners.RetryAnalyser;
import com.ATB8XSeleniumFrameWork.pages.PageFactory.LoginPage_PF;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static com.ATB8XSeleniumFrameWork.drivers.DriverManager.driver;
import static org.assertj.core.api.Assertions.assertThat;

@Test(retryAnalyzer = RetryAnalyser.class)
public class SampleRetryListenerTestCase extends CommonToAllTests {

    private static final Logger logger = LogManager.getLogger(SampleRetryListenerTestCase.class);

    @Test
    public void testLoginNegativeVWO_PF() {

        logger.info("Starting the Testcases Page Factory");

        driver.get(PropertiesReader.readKey("url"));
        LoginPage_PF loginPagePf=new LoginPage_PF(DriverManager.getDriver());
        String error_message= loginPagePf.logintoVWOAppInvalidCreds();
        logger.info("End of the Testcase!!");
        assertThat(error_message).isNotEmpty().isNotNull().isNotBlank();
        assertThat(error_message).isEqualTo(PropertiesReader.readKey("error_message"));

    }
}
