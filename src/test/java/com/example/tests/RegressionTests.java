package com.example.tests;

import com.aventstack.extentreports.ExtentTest;
import com.base.BaseTest;
import org.testng.annotations.Test;

public class RegressionTests extends BaseTest {

    @Test(groups = {"regression"})
    public void createUserTest() {
        ExtentTest extentTest = extent.createTest("createUserTest - Regression");
        test.set(extentTest);
        System.out.println("Executed Regression: createUserTest");
        test.get().pass("createUserTest passed");
    }

    @Test(groups = {"regression"})
    public void updateProfileTest() {
        ExtentTest extentTest = extent.createTest("updateProfileTest - Regression");
        test.set(extentTest);
        System.out.println("Executed Regression: updateProfileTest");
        test.get().pass("updateProfileTest passed");
    }
}
