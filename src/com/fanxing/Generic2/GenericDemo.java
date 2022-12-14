package com.fanxing.Generic2;

public class GenericDemo {
    public static void main(String[] args) {
        // 不明确地泛型类的调用
        Generic g = new Generic<>();

        g.setT("肥猪鲫");
        System.out.println(g.getT());

        g.setT(100);
        System.out.println(g.getT());

        // 明确地调用泛型类
        Generic<String> g1 = new Generic<String>();
        g1.setT("13");
        System.out.println(g1.getT());

        Generic<Integer> g2 = new Generic<>();
        g2.setT(18);
        System.out.println(g2.getT());

    }
}
