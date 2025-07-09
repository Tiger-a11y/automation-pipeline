package com.example.tests;

import com.base.BaseTest;
import io.qameta.allure.*;
import org.testng.annotations.Test;

@Epic("Smoke Suite")
public class SmokeTests extends BaseTest {

    @Test(groups = {"smoke"})
    @Feature("Login")
    @Story("Valid Login")
    @Severity(SeverityLevel.CRITICAL)
    public void loginTest() {
        test = extent.createTest("loginTest - Smoke");
        logToAllure("Launching login test");
        System.out.println("Executed Smoke: loginTest");
        test.pass("Login test passed");
    }

    @Test(groups = {"smoke"})
    @Feature("Dashboard")
    @Story("Dashboard Visibility")
    @Severity(SeverityLevel.NORMAL)
    public void dashboardTest() {
        test = extent.createTest("dashboardTest - Smoke");
        logToAllure("Opening dashboard");
        System.out.println("Executed Smoke: dashboardTest");
        test.pass("Dashboard test passed");
    }
}
