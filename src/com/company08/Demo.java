package com.company08;

public class Demo {
    public static void main(String[] args) {
        // 外部这样创建成员内部类对象
//        Outer.Inner oi = new Outer().new Inner();
//        oi.show();

        Outer o = new Outer();
        o.method();
    }
}
