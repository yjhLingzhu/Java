package com.collection_01;

import java.util.HashSet;

/*
 * 需求：
 *   创建一个存储学生对象的集合，存储多个学生对象，使用程序实现在控制台遍历该集合
 *   要求：学生对象的成员变量值相同，我们就认为是同一个对象
 * */
public class HashDemo01 {
    public static void main(String[] args) {
        // 创建哈希集合对象
        HashSet<Student> hs = new HashSet<Student>();

        // 创建学生对象
        Student s1 = new Student("肥猪鲫", 18);
        Student s2 = new Student("刘阿焕", 28);
        Student s3 = new Student("马大哈", 38);

        // 这个和前面重复了
        Student s4 = new Student("马大哈", 38);

        // 添加
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        // 对于对象必须重写hashCode和equals方法才能达到去重效果
        // 对基本数据类型不用重写也可以达到去重效果
        hs.add(s4); // 一开始这里添加进去了，如何保证重复的不能添加进去呢，那么需要重写hashCode()和equals()方法
        // 遍历
        for (Student s : hs) {  // HashSet不保证顺序但元素唯一
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
