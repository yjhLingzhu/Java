package com.fanxing.CanShu;

public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3,4));
    }

    public static int sum(int... args) {    // args是可变参数，如果有多个参数的话，可变参数要放在后面
        int sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum;
    }
}
