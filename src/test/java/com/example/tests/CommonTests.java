package com.example.tests;

import org.testng.annotations.Test;

public class CommonTests {

    @Test(groups = {"smoke", "regression"})
    public void logoutTest() {
        System.out.println("Executed Common: logoutTest");
    }
}
