package com.MyMap.MapAiLi2;

import java.util.HashMap;
import java.util.Set;

/*
* 需求:
创建一个HashMap集合，键是学生对象(Student)，
* 值是居住地 (String)。存储多个键值对元素，
* 并遍历要求保证键的唯一性，如果学生对象的成员变量值相同，
* 我们就认为是同一个对象
思路:
* 1:定义学生类
* 2:创建HashMap集合对象
* 3:创建学生对象
* 4:把学生添加到集合
* 5:遍历集合
* 6:在学生类中重写两个方法
hashCode()
equals()
* 保证对象的唯一性需要重写这两个方法
* */
public class HashMapDemo {
    public static void main(String[] args) {
        // 创建一个HashMap集合
        HashMap<Student, String> stuMap = new HashMap<Student, String>();

        // 创建学生对象
        Student s1 = new Student("yjh", 18);
        Student s2 = new Student("刘阿焕", 19);
        Student s3 = new Student("肥猪鲫", 20);
        Student s4 = new Student("肥猪鲫", 20);

        // 把学生添加到集合
        stuMap.put(s1, "佛山");
        stuMap.put(s2, "阳春");
        stuMap.put(s3, "深圳");
        stuMap.put(s4, "北京");   // 键相同，值覆盖

        // 遍历集合
        Set<Student> keySet = stuMap.keySet();
        for (Student s : keySet) {
            String address = stuMap.get(s);
            System.out.println(s.getName() + "," + s.getAge() + "," + address);
        }
    }
}
