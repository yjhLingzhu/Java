package com.collection_01;

import java.util.TreeSet;

// 排序Set集合，会根据自然排序或者指定排序器来排序，元素不会重复

// 这个是对基本数据类型的
public class TreeSetDemo01 {
    public static void main(String[] args) {
        // 创建
//        TreeSet<int> ts = new TreeSet<int>();   // 这样是不行的，int要换成对应的包装类
        // 尖括号里面一定得是引用类型才行，所以不能使用int基本数据类型，但可以使用对应的包装类型

        TreeSet<Integer> ts = new TreeSet<Integer>();

        // 添加
        ts.add(100);
        ts.add(10);
        ts.add(20);
        ts.add(20);

        // 遍历
        for (Integer i : ts) {
            System.out.println(i);
        }
        Integer i = 100;
    }
}
