package com.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.utils.ExtentReportManager;
import io.qameta.allure.Step;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class BaseTest {

    protected static ExtentReports extent;
    protected static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @BeforeSuite(alwaysRun = true)
    public void setupReporting() {
        extent = ExtentReportManager.getInstance();
    }

    @AfterSuite(alwaysRun = true)
    public void tearDownReporting() {
        if (extent != null) {
            extent.flush();
        }
    }

    @BeforeMethod(alwaysRun = true)
    public void startTest(Method method) {
        ExtentTest extentTest = extent.createTest(method.getName());
        test.set(extentTest);
    }

    @AfterMethod(alwaysRun = true)
    public void endTest() {
        test.remove();
    }

    @Step("Log to Allure: {0}")
    protected void logToAllure(String message) {
        // Placeholder for logging Allure steps
    }
}
