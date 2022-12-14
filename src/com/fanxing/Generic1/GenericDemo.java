package com.fanxing.Generic1;

import java.util.ArrayList;
import java.util.Collection;

// Collection集合存储字符串并遍历
public class GenericDemo {
    public static void main(String[] args) {
        // 创建集合对象
        Collection c = new ArrayList(); // 没有指定类型，所以是泛型

        // 添加元素
        c.add("hello");
        c.add("yjh");
        c.add(100);     // 这样就有点像python中的list了，什么类型都可以存

        // 遍历  泛型的遍历使用增强for
        for (Object s : c) {    // 因为new的时候没有指定类型，因此遍历的时候只能使用Object类型
            System.out.println(s);
        }
    }
}
