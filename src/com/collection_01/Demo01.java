package com.collection_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01 {
    public static void main(String[] args) {
        // 创建Collection对象，使用多态的形式
        Collection<String> c = new ArrayList<>();
        // 添加元素
        c.add("yjh");
        c.add("yjh2");
        c.add("yjh2");

        System.out.println(c);

        // 遍历集合  Collection里面没有get方法，所以不能向ArrayList一样遍历
        // 通过迭代器遍历
        Iterator<String> it = c.iterator();
        String s;
        for (int i = 0; i < c.size(); i++) {
            s = it.next();
            System.out.println(s);
        }

        // 集合使用步骤
        /*
        1. 创建集合对象
        2. 添加元素
        3. 遍历集合（通过迭代器遍历）
        * */
    }
}
