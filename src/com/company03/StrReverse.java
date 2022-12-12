package com.company03;

import java.util.Scanner;

public class StrReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");

        String s = sc.nextLine();
        String result = strReverse(s);
        System.out.println("反转后的字符串：" + result);

    }

    public static String strReverse(String str) {
        String s = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            s += str.charAt(i);
        }
        return s;
    }

}
