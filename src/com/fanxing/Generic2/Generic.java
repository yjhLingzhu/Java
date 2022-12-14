package com.fanxing.Generic2;

// 泛型类的定义格式 public class Generic<T> 其中T是任意写的，通常写T、E、K、V
public class Generic<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
