package com.base;

import com.aventstack.extentreports.*;
import com.utils.ExtentReportManager;
import io.qameta.allure.Step;
import org.testng.annotations.*;

public class BaseTest {
    protected ExtentReports extent;
    protected ExtentTest test;

    @BeforeSuite(alwaysRun = true)
    public void setupReporting() {
        extent = ExtentReportManager.getInstance();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDownReporting() {
        extent.flush();
    }

    @Step("Log to Allure: {0}")
    protected void logToAllure(String message) {
        // Allows step logging from any test
    }
}
