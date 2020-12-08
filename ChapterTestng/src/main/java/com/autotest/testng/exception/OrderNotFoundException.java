package com.autotest.testng.exception;

public class OrderNotFoundException extends Exception {

    private String description;
    public OrderNotFoundException(String description) {
        this.description = description;
    }

    public String getExceptionDesc() {
        return description;
    }
}
