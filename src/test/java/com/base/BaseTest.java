package com.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.*;

public class BaseTest {

    protected static ExtentReports extent;
    protected static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @BeforeSuite
    public void setupReport() {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("target/extent-report.html");
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setDocumentTitle("Automation Report");
        htmlReporter.config().setReportName("Test Results");

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    @BeforeMethod
    public void createTest(Method method) {
        ExtentTest extentTest = extent.createTest(method.getName());
        test.set(extentTest);
    }

    @AfterMethod
    public void tearDown() {
        extent.flush();
    }
}
