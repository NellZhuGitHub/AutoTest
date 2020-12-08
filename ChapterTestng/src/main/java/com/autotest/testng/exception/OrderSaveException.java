package com.autotest.testng.exception;

public class OrderSaveException extends Exception {

    private String description;
    public OrderSaveException(String description) {
        this.description = description;
    }

    public String getExceptionDesc() {
        return description;
    }
}
