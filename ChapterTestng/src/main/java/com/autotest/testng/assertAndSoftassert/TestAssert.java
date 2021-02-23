package com.autotest.testng.assertAndSoftassert;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;

public class TestAssert {

    @Test
    public void arraysEquals(){
        String[] st1 = {"Amy","Tom","Jhon"};
        String[] st2 = {"Jhon","Amy","Tom"};
        String[] st3 = {"Amy","Tom","Jhon"};
        System.out.println("数组St1是否与数组St3相等?: "+Arrays.equals(st1, st2));
        System.out.println("数组St1是否与数组St3相等?: "+Arrays.equals(st1, st3));
    }

    @Test
    public void assertTrue() {
        String[] st4 = {"Amy","Tom","Jhon"};
        String[] st5 = {"Amy","Tom","Jhon"};
        String[] st6 = st4;
        Assert.assertTrue(st6==st4,"两者不相同");
        Assert.assertTrue(st4==st5, "两者不相同2");
    }

    @Test
    public void assertFalse() {
        String[] st7 = {"Amy","Tom","Jhon"};
        String[] st8 = {"Jhon","Amy","Tom"};
        Assert.assertFalse(st7==st8, "两个相等");
    }

    @Test
    public void assertSame() {
        String[] st9 = {"Amy","Tom","Jhon"};
        String[] st10 = {"Jhon","Amy","Tom"};
        String[] st11 = st9;
        Assert.assertSame(st9, st11,"not same");
        Assert.assertSame(st9, st10, "not same2");
    }

    @Test
    public void assertNotSame() {
        String[] st12 = {"Amy","Tom","Jhon"};
        String[] st13 = {"Jhon","Amy","Tom"};
        String[] st14 = st12;
        Assert.assertNotSame(st14, st12, "same");
    }

    @Test
    public void assertNull() {
        String[] st15 = {"Amy","Tom","Jhon"};
        String[] st16 = {};
        String[] st17 = null;

        Assert.assertNull(st17, "st17判断结果不为null");
        Assert.assertNull(st16, "st16判断结果不为null");
        Assert.assertNull(st15, "st15判断结果不为null");
    }

    @Test
    public void assertNotNull() {
        String[] st18 = {"Amy","Tom","Jhon"};
        String[] st19 = {};
        String[] st20 = null;
        Assert.assertNotNull(st18, "st18对象为空");
        Assert.assertNotNull(st19, "st19对象为空");
        Assert.assertNotNull(st20, "st20对象为空");
    }

    @Test
    public void assertEquals() {
        Assert.assertEquals(4, 2*2,"4等于2*2");
    }

    @Test
    public void assertNotEquals() {
        String[] st21 = {"Amy","Tom","Jhon"};
        String[] st22 = {"Amy","Tom","Jhon"};
        Assert.assertNotEquals(st21,st22,"两者相等");
    }

    @Test
    public void assertEqualsNoOrder() {
        String[] st1 = {"Amy","Tom","Jhon"};
        String[] st2 = {"Jhon","Amy","Tom"};
        Assert.assertEqualsNoOrder(st1, st2, "两个字符串数组不相同");
        System.out.println("前面硬断言，执行不成功，我还会执行？");
    }

}
