package com.autotest.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IgnoreTest {

    @Test   //default enable=true
    public void ignore1() {
        Assert.assertEquals(true, true);
    }

    @Test(enabled = true)
    public void ignore2() {
        Assert.assertEquals(true, true);
    }

    @Test(enabled = false)
    public void ignore3() {
        Assert.assertEquals(true, true);
    }
}
