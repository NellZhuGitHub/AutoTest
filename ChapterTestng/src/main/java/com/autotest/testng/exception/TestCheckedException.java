package com.autotest.testng.exception;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCheckedException {

    String a;
    OrderBo orderBo;
    Order data;

    @BeforeTest
    void setup() {
        orderBo = new OrderBo();

        data = new Order();
        data.setId(1000);
        data.setCreatedBy("慕九州");
    }

    @Test(expectedExceptions = OrderSaveException.class)
    public void throwIfOrderIsNull() throws OrderSaveException {
        orderBo.save(null);
    }

    @Test(expectedExceptions = { OrderUpdateException.class, OrderNotFoundException.class })
    public void throwIfOrderIsNotExists() throws OrderUpdateException, OrderNotFoundException {
        orderBo.update(data);
    }

}
