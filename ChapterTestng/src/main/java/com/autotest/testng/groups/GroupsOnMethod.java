package com.autotest.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.sound.midi.Soundbank;

public class GroupsOnMethod {

    @BeforeGroups("database")
    public void setupDB() {
        System.out.println("setupDB()");
    }

    @AfterGroups("database")
    public void cleanDB() {
        System.out.println("cleanDB()");
    }

    @Test(groups = "selenium-test")
    public void runSelenium() {
        System.out.println("runSelenium()");
    }

    @Test(groups = "selenium-test")
    public void runSelenium1() {
        System.out.println("runSelenium1()");
    }

    @Test(groups = "database")
    public void testConnectOracle() {
        System.out.println("testConnectOracle()");
    }

    // 测试方法也可以同事属于多个分组
    @Test(groups = {"mysql", "database"})
    public void testConnectionMsSql() {
        System.out.println("testConnectionMsSql()");
    }

    @Test(dependsOnGroups = {"database", "selenium-test"})
    public void runFinal() {
        System.out.println("runFinal()");
    }

}
