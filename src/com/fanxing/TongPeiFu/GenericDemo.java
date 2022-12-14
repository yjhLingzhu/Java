package com.fanxing.TongPeiFu;


import java.util.ArrayList;
import java.util.List;

/**
 * 类型通配符：<?>
 * list<?>: 表示元素类型未知的List，它的元素可以匹配任何的类型这种带通配符的List仅表示它是各种泛型List的父类，并不能把元素添加到其中
 * 类型通配符上限: <?extends 类型>
 * List<? extends Number>: 它表示的类型是Number或者其子类型
 * 类型通配符下限: <? super 类型>
 * List<? super Number>: 它表示的类型是Number或者其父类刑
 * */


public class GenericDemo {
    public static void main(String[] args) {
        // 通配符 <?>
        List<?> list1 = new ArrayList<>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();

        // 上限, 就是最高的类型只能高到Number这个类型了
        List<? extends Number> list4 = new ArrayList<Integer>();

        // 下限, 就是最低的类型只能低到Number这个类型了
        List<? super Number> list5 = new ArrayList<Object>();
    }
}
