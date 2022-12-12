package com.collection_01;

/*
* 特点：
*   1. 不重复
*   2. 没有索引的方法，所以不能通过普通for遍历
* */

import java.util.*;

public class SetDemo01 {
    public static void main(String[] args) {
        // 创建集合
        Set<String> set = new HashSet<String>();
        // 创建列表
        List<String> list = new ArrayList<String>();

        // 添加列表元素
        list.add("yjh1");
        list.add("yjh2");
        list.add("yjh1");
        list.add("yjh2");
        list.add("yjh3");

        for(String s: list) {
            set.addAll(list);   // 相当于对列表去重, 然后存放到set中
        }

        for (String s: set) {   // 增强for
            System.out.println(s);
        }
        System.out.println("------------");
        Iterator<String> it = set.iterator();   // 迭代器
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // HashSet是 数组+链表 的形式，数组中每一个元素是链表，这个数组长度默认是16
        // 哈希表在存储数据时是先根据哈希值对16取余决定存到哪个数组下标的，
        // 然后比较插入的元素哈希值和原来元素的哈希值，不同的话直接插入到当前元素下的
        // 链表中，如果相同的话就通过equal()比较内容，不同就插入，相同就不插入。
    }
}
