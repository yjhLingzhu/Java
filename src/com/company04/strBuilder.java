package com.company04;

public class strBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // 类似python的列表
        sb.append("yjh").append("加油").append(100);
        System.out.println("sb: " + sb);
        System.out.println("length: " + sb.length());

        // 反转
        sb.reverse();
        System.out.println("sb: " + sb);

        // StringBuilder转化成String使用toString()方法就行
        // String转化成StringBuilder使用new StringBuilder("")就行
    }
}
