package com.autotest.testng.exception;

public class Order {

    int id;
    String creator;

    public void setId(int setId) {
        id = setId;
        //return id;
    }

    public void setCreatedBy(String setCreatedBy) {
        creator = setCreatedBy;
        //return creator;
    }

    public void printOrder() {
        System.out.println("订单id:"+id);
        System.out.println("订单创建人:"+creator);
    }
}
