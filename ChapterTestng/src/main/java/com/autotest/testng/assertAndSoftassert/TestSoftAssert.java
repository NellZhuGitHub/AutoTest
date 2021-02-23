package com.autotest.testng.assertAndSoftassert;

        import org.testng.annotations.Test;
        import org.testng.asserts.SoftAssert;

public class TestSoftAssert {
    @Test
    public void testSoftAssert() {
        System.out.println("脚本执行开始");
        // 实例化SoftAssert
        SoftAssert assertion = new SoftAssert();
        assertion.assertEquals(5, 6, "我们两个不是一样大");
        assertion.assertNotEquals(6, 6, "我们两个是一样大");
        System.out.println("脚本执行结束");
        System.out.println("我是观望，到这会不会执行的");
        assertion.assertAll();
    }
}
