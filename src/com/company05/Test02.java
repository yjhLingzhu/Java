package com.company05;

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        // 创建
        ArrayList<Student> students = new ArrayList<Student>();

        Student stu1 = new Student("yjh1", 18);
        Student stu2 = new Student("yjh2", 19);
        Student stu3 = new Student("yjh3", 20);
        students.add(stu1);
        students.add(stu2);
        students.add(stu3);

        int age;
        String name;

        for (int i = 0; i < students.size(); i++) {
            age = students.get(i).getAge();
            name = students.get(i).getName();
            System.out.println(name + ", " + age);
        }
    }
}
