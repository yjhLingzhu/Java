package com.collection_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        // 创建对象 List 是 继承了 Collection的接口
        // 所以在使用的时候我们能用List的情况下就不要用Collection
        // 因为越具体的就具有越多的方法
        List<String> list = new ArrayList<String>();

        // 添加元素
        list.add("yjh");
        list.add("yjh2");
        list.add("yjh2");

        System.out.println(list);

        // 遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Collection 下面有 List 和 Set，List是允许重复元素的，Set不允许

        // 并发修改异常
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.equals("yjh")) {
                // 这里在遍历列表时还可以向其添加元素，是因为遍历一开始就写死了长度，新增的元素不参与遍历
                // 而且get方法不会修改预期值和实际值，但是迭代器中的next会修改这些值从而出现并发修改异常
                list.add("lqy");
            }
        }
        // 这个会报错的
        /*
        Iterator<String> it = list.iterator();  // iterator这个方法是Collection的
        while (it.hasNext()) {
            String s = it.next();
            if (s.equals("yjh")) {
                list.add("lqy");
            }
        }
        *
        */
        System.out.println(list);

        // listIterator()是List特有的方法
        // 列表迭代器
        ListIterator<String> lit = list.listIterator();
        int a = 0;
        while (lit.hasNext()) {
            a++;
            String s = lit.next();
            System.out.println(s);
            if (s.equals("yjh2")) {
                lit.add("madaha");  // 通过列表迭代器可以实现边遍历边添加元素，它不会影响遍历时的长度，且添加的元素是在当前遍历处的后面插入
            }
        }
        System.out.println(list);
        System.out.println(a);
    }
}
