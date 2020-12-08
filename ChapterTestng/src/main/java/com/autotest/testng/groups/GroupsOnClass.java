package com.autotest.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "selenium-test")
public class GroupsOnClass {

    public void runSelenium3() {
        System.out.println("runSelenium3()");
    }

    public void runSelenium4() {
        System.out.println("runSelenium4()");
    }
}
