package com.collection_01;

import java.util.LinkedHashSet;

// LinkedHashSet 保证顺序且元素唯一
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("肥猪鲫");
        lhs.add("刘阿焕");
        lhs.add("yjh");
        lhs.add("yjh");

        // 遍历
        for (String s : lhs) {
            System.out.println(s);
        }
    }
}
