package com.company02;


public class Str {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";  // 这种方式创建字符串是公用同一个地址的

        char[] chs = {'a', 'b', 'c'};
        String s3 = new String(chs);
        String s4 = new String(chs);

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);   // 字符串是引用类型，==比较的是地址

        // 比较字符串内容是否相同 equals是比较内容的
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
