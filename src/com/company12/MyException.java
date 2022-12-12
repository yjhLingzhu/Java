package com.company12;

// 自定义异常  Exception是编译时异常
public class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
