package com.autotest.testng;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void method1() {
        System.out.println("this is method1");
    }

    @Test(dependsOnMethods = {"method1"})
    public void method2() {
        System.out.println("This is method 2");
    }

    // method3()失败，则将跳过method4()
    @Test
    public void method3() {
        System.out.println("this is method3");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"method3"})
    public void method4() {
        System.out.println("This is method 2");
    }
}
