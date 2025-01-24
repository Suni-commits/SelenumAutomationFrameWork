package com.ATB8XSeleniumFrameWork.listerners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
    private int count=0;
    private static final int maxtrycount=3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(count<maxtrycount) {
            count++;
            return true;
        }
        return false;
    }
}
