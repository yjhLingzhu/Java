package com.fanxing.GenericMethod;

public class Generic<T> {

    public void show(T t) {    // 这种还是泛型类的方式
        System.out.println(t);
    }
}

// 泛型方法
// 格式 public <T> show(T t) {}
class GenericM {
    public <T> void show(T t) {     // 这种就像go中的任意数据类型
        System.out.println(t);
    }
}