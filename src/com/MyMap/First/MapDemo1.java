package com.MyMap.First;

import java.util.*;

public class MapDemo1 {
    public static void main(String[] args) {
        // 创建对象 键是String类型，值也是String类型
        Map<String, String> map = new HashMap<String, String>();

        // 添加值
        map.put("1", "yjh");
        map.put("2", "肥猪鲫");
        map.put("3", "刘阿焕");

        // 输出
        System.out.println(map);

        // 键的集合
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }

        // 值的集合
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}
