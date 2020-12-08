package com.autotest.testng;

import org.testng.annotations.Test;

public class TestBasicAnnotation {

    @Test
    public void runOtherTest1() {
        System.out.println("@Test - runOtherTest1");
    }

    @Test
    public void runOtherTest2() {
        System.out.println("@Test - runOtherTest2");
    }
}
