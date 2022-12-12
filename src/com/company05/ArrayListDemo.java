package com.company05;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 创建集合   集合和python中的列表很像
        ArrayList<String> array = new ArrayList<String>();

        // 添加元素
        array.add("yjh");
        array.add("feizhuji");
        array.add("ahuan");
        array.add("yjh");

        // 删除指定元素
//        array.remove("yjh");    // 删除找到的第一个

        // 删除指定位置元素, 返回删除了的那个元素
//        String e = array.remove(1);
//        System.out.println("e:" + e);

        // 修改指定位置元素, 返回被修改的元素
        String s = array.set(2, "daha");
        System.out.println("s:" + s);
        System.out.println(array);
    }
}
