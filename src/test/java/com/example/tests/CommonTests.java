package com.example.tests;

import com.aventstack.extentreports.ExtentTest;
import com.base.BaseTest;
import org.testng.annotations.Test;

public class CommonTests extends BaseTest {

    @Test(groups = {"smoke", "regression"})
    public void logoutTest() {
        ExtentTest extentTest = extent.createTest("logoutTest - Common");
        test.set(extentTest);
        System.out.println("Executed Common: logoutTest");
        test.get().pass("logoutTest passed");
    }

    @Test(groups = {"smoke", "regression"})
    public void settingsPageAccessTest() {
        ExtentTest extentTest = extent.createTest("settingsPageAccessTest - Common");
        test.set(extentTest);
        System.out.println("Executed Common: settingsPageAccessTest");
        test.get().pass("settingsPageAccessTest passed");
    }

    @Test(groups = {"smoke", "regression"})
    public void footerLinksTest() {
        ExtentTest extentTest = extent.createTest("footerLinksTest - Common");
        test.set(extentTest);
        System.out.println("Executed Common: footerLinksTest");
        test.get().pass("footerLinksTest passed");
    }

    @Test(groups = {"regression"})
    public void profilePageTest() {
        ExtentTest extentTest = extent.createTest("profilePageTest - Common");
        test.set(extentTest);
        System.out.println("Executed Common: profilePageTest");
        test.get().pass("profilePageTest passed");
    }

    @Test(groups = {"regression"})
    public void notificationsTest() {
        ExtentTest extentTest = extent.createTest("notificationsTest - Common");
        test.set(extentTest);
        System.out.println("Executed Common: notificationsTest");
        test.get().pass("notificationsTest passed");
    }

    @Test(groups = {"regression"})
    public void globalSearchTest() {
        ExtentTest extentTest = extent.createTest("globalSearchTest - Common");
        test.set(extentTest);
        System.out.println("Executed Common: globalSearchTest");
        test.get().pass("globalSearchTest passed");
    }

    @Test(groups = {"regression"})
    public void widgetRefreshTest() {
        ExtentTest extentTest = extent.createTest("widgetRefreshTest - Common");
        test.set(extentTest);
        System.out.println("Executed Common: widgetRefreshTest");
        test.get().pass("widgetRefreshTest passed");
    }

    @Test(groups = {"regression"})
    public void filterResetTest() {
        ExtentTest extentTest = extent.createTest("filterResetTest - Common");
        test.set(extentTest);
        System.out.println("Executed Common: filterResetTest");
        test.get().pass("filterResetTest passed");
    }

    @Test(groups = {"smoke", "regression"})
    public void helpSectionTest() {
        ExtentTest extentTest = extent.createTest("helpSectionTest - Common");
        test.set(extentTest);
        System.out.println("Executed Common: helpSectionTest");
        test.get().pass("helpSectionTest passed");
    }

    @Test(groups = {"smoke", "regression"})
    public void breadcrumbTest() {
        ExtentTest extentTest = extent.createTest("breadcrumbTest - Common");
        test.set(extentTest);
        System.out.println("Executed Common: breadcrumbTest");
        test.get().pass("breadcrumbTest passed");
    }
}
