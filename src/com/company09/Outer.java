package com.company09;
/*
* 前提：
*   存在一个类或者接口
*
* 格式：
*   new 类名或者接口名() {
*       重写方法;
* };
*
* 本质：
*   是一个继承了该类或者实现了该接口的子类匿名对象(实例)
* */

public class Outer {
    public void method() {  // 匿名内部类是在局部内部类之中的，是它的特殊一种
        // 这样写仅仅是对象，对用不了方法
        /*
        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };
         */

        // 这样不方便多次调用
        /*
        new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();   // 这样可以调用方法

         */

        // 一般都是用这样的方式调用匿名内部类里面的方法
        Inter i = new Inter() {     // 这种就是用多态的形式调用
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }

            @Override
            public void eat() {
                System.out.println("吃吃吃");
            }
        };
        i.show();
        // Inter i = () -> System.out.println("匿名内部类"); // 一个抽象方法时可以这样简写
    }
}
