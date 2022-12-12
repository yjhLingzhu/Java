package com.company04;

import java.util.Scanner;

// 字符串反转
public class test02 {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();   // 扫描成字符串存到s中
        toReverse(s);
    }

    public static void toReverse(String s) {
        // 转成StringBuilder
        StringBuilder sb = new StringBuilder(s);
        // 反转
        sb.reverse();

        String r = sb.toString();
        // 输出
        System.out.println("s: " + r);
    }
}
