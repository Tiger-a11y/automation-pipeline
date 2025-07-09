package com.example.tests;

import org.testng.annotations.Test;

public class RegressionTests {

    @Test(groups = {"regression"})
    public void createUserTest() {
        System.out.println("Executed Regression: createUserTest");
    }

    @Test(groups = {"regression"})
    public void updateProfileTest() {
        System.out.println("Executed Regression: updateProfileTest");
    }
}
