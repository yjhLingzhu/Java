package com.collection_01;

import java.util.TreeSet;

// TreeSet 存放对象，实现指定排序器进行排序
// 按照年龄排序，相同的话按照姓名排序

public class TreeSetDemo02 {
    public static void main(String[] args) {
        // 创建集合
        TreeSet<Student2> ts = new TreeSet<>();

        // 创建学生
        Student2 s1 = new Student2("刘轻", 18);
        Student2 s2 = new Student2("王耶", 8);
        Student2 s3 = new Student2("大哈2", 38);
        Student2 s4 = new Student2("大哈1", 38);

        // 添加
        ts.add(s1);     // 对于TreeSet，add里面的对象要是实现了自然排序接口的才行。
        ts.add(s2);     // 基本数据类型是实现了自然排序接口了的
        ts.add(s3);
        ts.add(s4);

        // 遍历
        for (Student2 s : ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
