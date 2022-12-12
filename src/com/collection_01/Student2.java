package com.collection_01;

public class Student2 implements Comparable<Student2> {
    private String name;
    private int age;

    public Student2() {
    }

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student2 student = (Student2) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(Student2 o) {  // 排序规则
//        return 0;//返回0说明重复， 1 升序输出， -1 倒序输出
        int a = this.age - o.age;    // this是前一个，o是后一个 ； 如果this-o那么是升序，如果是o-this，那么是降序
        if (a == 0) {   // 年龄相同比较姓名
            return this.name.compareTo(o.name); // compareTo就是对两个对象进行自然排序的, 0是相同，正数是正序，负数是倒序
        }
        return a;
    }
}
