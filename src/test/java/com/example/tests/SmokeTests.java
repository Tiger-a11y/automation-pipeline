package com.example.tests;

import com.aventstack.extentreports.ExtentTest;
import com.base.BaseTest;
import org.testng.annotations.Test;

public class SmokeTests extends BaseTest {

    @Test(groups = {"smoke"})
    public void loginTest() {
        ExtentTest extentTest = extent.createTest("loginTest - Smoke");
        test.set(extentTest);
        System.out.println("Executed Smoke: loginTest");
        test.get().pass("Login test passed");
    }

    @Test(groups = {"smoke"})
    public void dashboardTest() {
        ExtentTest extentTest = extent.createTest("dashboardTest - Smoke");
        test.set(extentTest);
        System.out.println("Executed Smoke: dashboardTest");
        test.get().pass("Dashboard test passed");
    }
}
