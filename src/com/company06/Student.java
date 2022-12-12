package com.company06;


public class Student {
    private String id;
    private String name;
    private String age;
    private String address;

    // 构造函数
    public Student() {}
    public Student(String id, String name, String age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // 功能函数
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public String getAge() {
        return this.age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return this.address;
    }
}
