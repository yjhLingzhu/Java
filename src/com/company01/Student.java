package com.company01;

public class Student {
    // 成员变量
    String name;
    private int age;    // private 只能在本类使用

    // 成员函数
    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + ", " + age);
    }
}
