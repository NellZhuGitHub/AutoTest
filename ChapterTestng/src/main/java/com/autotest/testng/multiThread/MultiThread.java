package com.autotest.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThread {

    /*
    * 多线程测试--注解方式
    * 没有关联的用例可以使用多线程，减少执行时间
    * 以下演示3个线程同时运行，共执行10次
    * timeOut配置的是每次执行该测试方法所耗费时间的阈值，超过阈值则测试失败
    */
    @Test(invocationCount = 10, threadPoolSize = 3, timeOut=1000)
    public void test() {
        System.out.println("*******hello world*******");
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }
}
