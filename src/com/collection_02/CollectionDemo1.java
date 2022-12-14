package com.collection_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo1 {
    public static void main(String[] args) {
        // 创建集合对象
        List<Integer> list = new ArrayList<Integer>();

        list.add(20);
        list.add(50);
        list.add(30);
        list.add(60);
        list.add(10);
        list.add(90);

        // 排序
        Collections.sort(list);
        System.out.println(list);

        // 反转
        Collections.reverse(list);
        System.out.println(list);

        // 随机
        Collections.shuffle(list);
        System.out.println(list);
    }
}
