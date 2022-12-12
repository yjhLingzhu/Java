package com.collection_01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo01 {
    public static void main(String[] args) {
        // 增强for循环, 内部用的就是迭代器(不是列表迭代器)，这个迭代器是会抛并发异常的
        int[] a = {1, 2, 3, 4, 5};
        for (int i : a) {
            System.out.println(i);
        }
        System.out.println("-----------------------");
        String[] sArr = {"yjh", "fzj", "ah"};
        for (String s : sArr) {
            System.out.println(s);
        }

        System.out.println("-----------------------");

        // 集合的
        List<String> list = new ArrayList<String>();    // 多态
        list.add("yjh1");
        list.add("yjh2");
        list.add("yjh3");
        list.add("yjh4");
        for (String ls : list) {
            System.out.println(ls);
        }
        System.out.println("-----------------------");
        // 不是多态的形式
        ArrayList<String> al = new ArrayList<String>();
        al.add("ay1");
        al.add("ay2");
        al.add("ay3");
        al.add("ay4");
        for(String s : al) {
            System.out.println(s);
        }
        // 通过列表迭代器遍历
        ListIterator<String> lit = al.listIterator();
        while (lit.hasNext()) {
            String s = lit.next();
            if (s.equals("ay1")) {
                lit.add("yjh");
            }
        }
        System.out.println(al);
        System.out.println("-----------------------");

        // LinkedList 链表列表  查询慢增删快，用法和List/ArrayList一样
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("ah1");
        ll.add("ah2");
        ll.add("ah3");
        ll.add("ah4");
        System.out.println(ll);
        for(String s : ll) {
            System.out.println(s);
        }
    }
}
