package com.autotest.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

import java.lang.reflect.Method;


public class TestDataProvider {

    @Test(dataProvider = "provideNumbers")
    public void test(int number, int expected) {
        System.out.println("actual="+number+";expected="+expected);
        Assert.assertEquals(number + 10, expected);
    }

    @DataProvider(name = "provideNumbers")
    public Object[][] provideData() {
        return new Object[][] {{10, 20}, {100, 110}, {200, 210}};
    }

    @Test(dataProvider = "dataProvider")
    public void test1(int number, int expected) {
        System.out.println("actual="+number+";expected="+expected);
        Assert.assertEquals(number + 10, expected);
    }

    @Test(dataProvider = "dataProvider")
    public void test2(String email, String expected) {
        System.out.println("actual="+email+";expected="+expected);
        Assert.assertEquals(email, expected);
    }

    @DataProvider(name= "dataProvider")
    public Object[][] provideData(Method method) {
        Object[][] result = null;

        if(method.getName().equals("test1")) {
            result = new Object[][] {
                    {1, 11}, {200,210}
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][] {
                    { "test@gmail.com", "test@gmail.com" },
                    { "test@yahoo.com", "test@yahoo.com" }
            };
        }
        return result;
    }
}
