package com.autotest.testng.exception;

public class OrderUpdateException extends Exception {

    private String description;
    public OrderUpdateException(String description) {
        this.description = description;
    }

    public String getExceptionDesc() {
        return description;
    }
}
