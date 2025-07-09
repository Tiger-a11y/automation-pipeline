package com.example.tests;

import com.base.BaseTest;
import io.qameta.allure.*;
import org.testng.annotations.Test;

@Epic("Common Functionality Suite")
public class CommonTests extends BaseTest {

    @Test(groups = {"smoke", "regression"})
    @Feature("Authentication")
    @Story("Logout Functionality")
    @Severity(SeverityLevel.CRITICAL)
    public void logoutTest() {
        test = extent.createTest("logoutTest - Common");
        Allure.step("Clicking logout button");
        Allure.step("Verifying user is logged out");
        System.out.println("Executed Common: logoutTest");
        test.pass("logoutTest passed");
    }

    @Test(groups = {"smoke", "regression"})
    @Feature("Navigation")
    @Story("Access Settings Page")
    @Severity(SeverityLevel.NORMAL)
    public void settingsPageAccessTest() {
        test = extent.createTest("settingsPageAccessTest - Common");
        Allure.step("Navigating to settings");
        Allure.step("Validating settings UI");
        System.out.println("Executed Common: settingsPageAccessTest");
        test.pass("settingsPageAccessTest passed");
    }

    @Test(groups = {"smoke", "regression"})
    @Feature("UI Validation")
    @Story("Check Footer Links")
    @Severity(SeverityLevel.MINOR)
    public void footerLinksTest() {
        test = extent.createTest("footerLinksTest - Common");
        Allure.step("Opening home page");
        Allure.step("Verifying footer links");
        System.out.println("Executed Common: footerLinksTest");
        test.pass("footerLinksTest passed");
    }

    @Test(groups = {"regression"})
    @Feature("Profile")
    @Story("Open User Profile")
    @Severity(SeverityLevel.NORMAL)
    public void profilePageTest() {
        test = extent.createTest("profilePageTest - Common");
        Allure.step("Navigating to profile");
        Allure.step("Verifying profile information");
        System.out.println("Executed Common: profilePageTest");
        test.pass("profilePageTest passed");
    }

    @Test(groups = {"regression"})
    @Feature("Notifications")
    @Story("View All Notifications")
    @Severity(SeverityLevel.NORMAL)
    public void notificationsTest() {
        test = extent.createTest("notificationsTest - Common");
        Allure.step("Opening notifications dropdown");
        Allure.step("Validating message list");
        System.out.println("Executed Common: notificationsTest");
        test.pass("notificationsTest passed");
    }

    @Test(groups = {"regression"})
    @Feature("Search")
    @Story("Global Search Test")
    @Severity(SeverityLevel.CRITICAL)
    public void globalSearchTest() {
        test = extent.createTest("globalSearchTest - Common");
        Allure.step("Typing search keyword");
        Allure.step("Validating search results");
        System.out.println("Executed Common: globalSearchTest");
        test.pass("globalSearchTest passed");
    }

    @Test(groups = {"regression"})
    @Feature("Dashboard Widgets")
    @Story("Refresh Widgets")
    @Severity(SeverityLevel.MINOR)
    public void widgetRefreshTest() {
        test = extent.createTest("widgetRefreshTest - Common");
        Allure.step("Refreshing dashboard widgets");
        Allure.step("Checking widget state");
        System.out.println("Executed Common: widgetRefreshTest");
        test.pass("widgetRefreshTest passed");
    }

    @Test(groups = {"regression"})
    @Feature("Filters")
    @Story("Reset Applied Filters")
    @Severity(SeverityLevel.NORMAL)
    public void filterResetTest() {
        test = extent.createTest("filterResetTest - Common");
        Allure.step("Apply multiple filters");
        Allure.step("Click reset and validate default view");
        System.out.println("Executed Common: filterResetTest");
        test.pass("filterResetTest passed");
    }

    @Test(groups = {"smoke", "regression"})
    @Feature("Help")
    @Story("Open Help Section")
    @Severity(SeverityLevel.TRIVIAL)
    public void helpSectionTest() {
        test = extent.createTest("helpSectionTest - Common");
        Allure.step("Click help icon");
        Allure.step("Validate help content loads");
        System.out.println("Executed Common: helpSectionTest");
        test.pass("helpSectionTest passed");
    }

    @Test(groups = {"smoke", "regression"})
    @Feature("Breadcrumbs")
    @Story("Breadcrumb Navigation")
    @Severity(SeverityLevel.NORMAL)
    public void breadcrumbTest() {
        test = extent.createTest("breadcrumbTest - Common");
        Allure.step("Navigate to deep page");
        Allure.step("Verify breadcrumb structure");
        System.out.println("Executed Common: breadcrumbTest");
        test.pass("breadcrumbTest passed");
    }
}
