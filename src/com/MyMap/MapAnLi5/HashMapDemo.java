package com.MyMap.MapAnLi5;

/*
* 需求：键盘录入一个字符串，要求统计字符串中每个字符串出现的次数。
举例：键盘录入 "aababcabcdabcde"
在控制台输出：“a(5)b(4)c(3)d(2)e(1)"
思路：
①键盘录入一个字符串
②创建HashMap集合，键是Character,值是Integer
③遍历字符串，得到悔一个字符
④拿得到的每一个字符作为键到HashMap集合中去找对应的值，看其返回值
如果返回值是nul:说明该字符在HashMap集合中不存在，就把该字符作为键，1作为值存储
如果返回值不是nul:说明该字符在HashMap集合中存在，把该值加1，然后重新存储该字符和对应的值
⑤遍历HashMap:集合，得到键和值，按照要求进行拼接
⑥输出结果
* */

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        // 键盘录入一个字符串
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = input.nextLine();

        // 创建HashMap集合，键是Character,值是Integer
        HashMap<Character, Integer> map = new HashMap<>();
//        TreeMap<Character, Integer> map = new TreeMap<>();    // 这个是会把键进行排序的

        // 遍历字符串，得到每一个字符
        for (int i = 0; i < s.length(); i++) {
            // 拿得到的每一个字符作为键到HashMap集合中去找对应的值，看其返回值
            char c = s.charAt(i);
            if (map.get(c) != null) {
                int count = map.get(c);
                count++;
                map.put(c, count);
            } else {
                map.put(c, 1);
            }
        }

        // 遍历HashMap:集合，得到键和值，按照要求进行拼接
        String r = "";
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (HashMap.Entry< Character, Integer> entry : entries) {
            r = r + entry.getKey() +"(" + entry.getValue() + ")";
        }

        // 输出结果
        System.out.println(r);
    }
}
