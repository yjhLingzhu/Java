package com.company05;

import java.util.ArrayList;

public class Test01 {
    public static void main(String[] args) {
        //创建
        ArrayList<String> array = new ArrayList<String>();

        array.add("yjh");
        array.add("yjh2");
        array.add("yjh3");
        array.add("yjh4");
        array.add("yjh5");

        // 遍历
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}
