package com.course.model;

import lombok.Data;

@Data
public class User {
    private String id;
    private String code;
    private String userName;
    private String password;
    private int age;
    private String sex;
    private int permission;
    private int isDelete;

    @Override
    public String toString() {
        return(
                "{id:"+id+","+
                        "code:"+code+","+
                        "userName:"+userName+","+
                        "password:"+password+","+
                        "age:"+age+","+
                        "sex:"+sex+","+
                        "permission:"+permission+","+
                        "isDelete:"+isDelete+"}"
        );
    }
}