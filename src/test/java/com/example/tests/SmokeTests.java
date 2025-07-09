package com.example.tests;

import org.testng.annotations.Test;

public class SmokeTests {

    @Test(groups = {"smoke"})
    public void loginTest() {
        System.out.println("Executed Smoke: loginTest");
    }

    @Test(groups = {"smoke"})
    public void dashboardTest() {
        System.out.println("Executed Smoke: dashboardTest");
    }
}
