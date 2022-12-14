package com.MyMap.BianLi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // 添加值
        map.put("1", "yjh");
        map.put("2", "肥猪鲫");
        map.put("3", "刘阿焕");

        // 获取所有键值对集合
        Set<Map.Entry<String, String>> entries = map.entrySet();
        // 遍历这个键值对集合
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }
    }
}
