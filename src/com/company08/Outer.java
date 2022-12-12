package com.company08;

// 成员内部类

public class Outer {
    private int num = 10;

    /*
    // 这种写法不常见
    public class Inner {
        public void show() {
            System.out.println(num);
        }
    }
    */

    // 这种是常见的
    private class Inner {
        public void show() {
            System.out.println(num);
        }
    }

    public void method() {
        Inner i = new Inner();
        i.show();
    }
}
