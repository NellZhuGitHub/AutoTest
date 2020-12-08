package com.autotest.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1() {
        System.out.println("@Test - 这是测试用例2");
    }

    @Test
    public void testCase2() {
        System.out.println("@Test - 这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod - 这是在测试方法之前运行的");
    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("@AfterMethod - 这是在测试方法之后运行的");
    }

    @BeforeClass
    public void BeforeClass() {
        System.out.println("@BeforeClass - 这是在类运行之前运行的");
    }

    @AfterClass
    public void AfterClass() {
        System.out.println("@AfterClass - 这是在类运行之后运行的");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("@BeforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("@AfterTest");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("@BeforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("@AfterSuite");
    }




}
