package com.MyMap.BianLi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // 添加值
        map.put("1", "yjh");
        map.put("2", "肥猪鲫");
        map.put("3", "刘阿焕");

        // 获取键
        Set<String> keySet = map.keySet();
        // 根据键遍历输出
        for (String key : keySet) {
            System.out.println(map.get(key));
        }
    }
}
