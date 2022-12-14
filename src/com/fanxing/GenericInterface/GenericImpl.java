package com.fanxing.GenericInterface;

// 要实现这个泛型接口，那么你这个得是泛型类
public class GenericImpl<T> implements Generic<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
