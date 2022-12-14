package com.fanxing.GenericMethod;

public class GenericDemo {
    public static void main(String[] args) {
        Generic<String> g1 = new Generic<String>();
        g1.show("yjh");

        Generic<Integer> g2 = new Generic<Integer>();
        g2.show(100);

        Generic<Boolean> g3 = new Generic<Boolean>();
        g3.show(true);

        // 上面那种每次都要创建对象，比较麻烦，所以我们需要只创建一次对象
        // 然后调用方法时再指定数据类型， 如下：

        GenericM gm = new GenericM();
        gm.show("yjh1");
        gm.show(101);
        gm.show(true);
    }
}
