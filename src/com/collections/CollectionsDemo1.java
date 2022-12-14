package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
* 需求
ArrayListi存储学生对象，使用Collections对ArrayList进行排序
要求：按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
思路
1:定义学生类
2:创建ArrayList集合对象
3:创建学生对象
4:把学生添加到集合
5:使用Collectionsi对Arraylist集合排序
6:遍历集合
* */
public class CollectionsDemo1 {
    public static void main(String[] args) {
        // 创建ArrayList集合对象
        ArrayList<Student> array = new ArrayList<Student>();

        // 创建学生对象
        Student s1 = new Student("yjh", 18);
        Student s2 = new Student("刘阿焕", 19);
        Student s3 = new Student("肥猪鲫1", 20);
        Student s4 = new Student("肥猪鲫", 20);

        // 把学生添加到集合
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        // 使用Collectionsi对Arraylist集合排序
        Collections.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge() - o2.getAge();
                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                return num2;
            }
        });

        // 遍历集合
        for (Student stu : array) {
            System.out.println(stu.getName() + "," + stu.getAge());
        }
    }
}
