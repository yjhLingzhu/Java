package com.fanxing.CanShu;

import java.util.Arrays;
import java.util.List;

public class ArgsDemo2 {
    public static void main(String[] args) {
        // 返回固定大小的列表
        List<String> list = Arrays.asList("hello", "world", "java");

//        list.add("yjh"); // 方法不允许
//        list.remove("hello"); // 方法不允许

        list.set(1, "yjh"); // 允许
        System.out.println(list);
    }
}
