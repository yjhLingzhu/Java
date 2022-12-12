package com.collection_01;

import java.util.Comparator;
import java.util.TreeSet;

/*
* 存储学生对象并遍历，创建TreeSet集合使用带参构造方法
* 要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
* */
public class TreeSetDemo03 {
    public static void main(String[] args) {
        // 创建集合对象
        // 使用带参排序器
        TreeSet<Student03> ts = new TreeSet<Student03>(
                // 使用带参
                new Comparator<Student03>() {   // 匿名类
                    @Override
                    public int compare(Student03 s1, Student03 s2) {
                        // 在这里面实现排序规则，这个是排序器，
                        // 使用了排序器，就不用在需要排序的类里面重写排序方法
                        // 在这里写排序方法就行

                        //this.age - s.age  this就是s1, 这是和不带参的比较
                        int num1 = s1.getAge() - s2.getAge();
                        int num2 = num1 == 0 ? s1.getName().compareTo(s2.getName()) : num1;
                        return num2;
                    }
                }
        );

        // 创建stu
        Student03 s2 = new Student03("杨青云2", 18);
        Student03 s1 = new Student03("刘青云1", 18);
        Student03 s3 = new Student03("a刘青云3", 20);
        // 添加
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);

        for (Student03 s : ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
