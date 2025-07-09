package com.example.tests;

import com.base.BaseTest;
import io.qameta.allure.*;
import org.testng.annotations.Test;

@Epic("Regression Suite")
public class RegressionTests extends BaseTest {

    @Test(groups = {"regression"})
    @Feature("User Management")
    @Story("Create New User")
    @Severity(SeverityLevel.BLOCKER)
    public void createUserTest() {
        test = extent.createTest("createUserTest - Regression");
        logToAllure("Creating new user");
        System.out.println("Executed Regression: createUserTest");
        test.pass("createUserTest passed");
    }

    @Test(groups = {"regression"})
    @Feature("User Profile")
    @Story("Update Profile Details")
    @Severity(SeverityLevel.NORMAL)
    public void updateProfileTest() {
        test = extent.createTest("updateProfileTest - Regression");
        logToAllure("Updating user profile");
        System.out.println("Executed Regression: updateProfileTest");
        test.pass("updateProfileTest passed");
    }
}
