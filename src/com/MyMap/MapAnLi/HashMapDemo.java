package com.MyMap.MapAnLi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        // 创建一个HashMap集合
        Map<String, Student> stuMap = new HashMap<String, Student>();

        // 创建学生
        Student s1 = new Student("yjh", 18);
        Student s2 = new Student("刘阿焕", 19);
        Student s3 = new Student("肥猪鲫", 20);

        // 将学生添加到集合
        stuMap.put("001", s1);
        stuMap.put("002", s2);
        stuMap.put("003", s3);

        // 通过键遍历集合
        Set<String> keySet = stuMap.keySet();
        for (String key : keySet) {
            Student s = stuMap.get(key);
            System.out.println(key + ", " + s.getName() + ", " + s.getAge());
        }
        System.out.println("------------------");

        // 通过键值对集合遍历
        // 获取键值对集合
        Set<Map.Entry<String, Student>> entries = stuMap.entrySet();
        for (Map.Entry<String, Student> entry : entries) {
            Student s = entry.getValue();
            System.out.println(entry.getKey() + ", " + s.getName() + ", " + s.getAge());
        }
    }
}
