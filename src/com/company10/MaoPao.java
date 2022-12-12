package com.company10;


import java.util.Arrays;

public class MaoPao {
    public static void main(String[] args) {
        int[] arr = {26, 24, 98, 35, 77, 85, 2, 100};
        System.out.println("排序前：" + show(arr)); // 自己写的数组输出
        sort(arr);  // 自己写的排序
        System.out.println("排序后：" + show(arr));

        int[] arr1 = {25, 24, 28, 5, 97, 85, 2, 100};
        System.out.println("排序前：" + Arrays.toString(arr1)); // Arrays.toString(arr1) 自带的数组输出
        Arrays.sort(arr1);  // Arrays自带的排序
        System.out.println("排序后：" + Arrays.toString(arr1));

        // int 和 String的转化
        // int -> String
        int a = 100;
        // 方式一
        String s = "" + a;
        System.out.println(s);
        // 方式二
        String s2 = String.valueOf(a);
        System.out.println(s2);

        // String -> int
        String t = "100";
        // 方式一
        // String -> Integer -> int
        Integer i1 = Integer.valueOf(t);
        int x = i1.intValue();
        System.out.println(x);
        // 方式二
        int y = Integer.parseInt(t);
        System.out.println(y);
    }

    public static String show(int[] arr) {
        // 创建一个字符串列表
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                sb.append(arr[i] + ", ");
            } else {
                sb.append(arr[i] + "]");
            }
        }
        // 将列表转成字符串
        String s = sb.toString();
        return s;
    }

    // 冒泡排序
    public static void sort(int[] arr) {
        int temp;
        for (int k = 0; k < arr.length - 1; k++) {
            for (int i = 0, j = i + 1; i < arr.length - 1 - k; i++, j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
}
