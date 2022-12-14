package com.collections_anli;

/*
* 需求
通过程序实现斗地主过程中的洗牌，发牌和看牌。要求：对牌进行排序
思路
1:创建HashMap,键是编号，值是牌
2:创建ArrayList,存储编号
3:创建花色数组和点数数组
4:从0开始往HashMap里面存储编号，并存储对应的牌。同时往Arraylist.里面存储编号
5:洗牌（洗的是编号），用Collections的shuffle()方法实现
6:发牌（发的也是编号，为了保证编号是排序的，创建TreeSet集合接收）
7:定义方法看牌（追历TreeSet集合，获取编号，到HashMap:集合找对应的牌）
8:调用看牌方法
* */

import java.util.*;

public class PokerDemoUp {
    public static void main(String[] args) {
        // 创建HashMap,键是编号，值是牌
        HashMap<Integer, String> poker = new HashMap<Integer, String>();

        // 创建ArrayList,存储编号
        ArrayList<Integer> pokerIndexArr = new ArrayList<Integer>();

        // 创建花色数组和点数数组
        // 花色
        String[] colors = {"♦", "♣", "♥", "♠"};
        // 点数
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        // 从0开始往HashMap里面存储编号，并存储对应的牌。
        // 同时往Arraylist.里面存储编号
        int index_ = 0;
        for (String num : numbers) {
            for (String color : colors) {
                pokerIndexArr.add(index_);
                poker.put(index_, color + num);
                index_++;
            }
        }
        // 装入大小王
        pokerIndexArr.add(index_);
        poker.put(index_, "小王");
        index_++;
        pokerIndexArr.add(index_);
        poker.put(index_, "大王");

        // 洗牌（洗的是编号），用Collections的shuffle()方法实现
        Collections.shuffle(pokerIndexArr);

        // 发牌（发的也是编号，为了保证编号是排序的，创建TreeSet集合接收）
        TreeSet<Integer> user1 = new TreeSet<Integer>();
        TreeSet<Integer> user2 = new TreeSet<Integer>();
        TreeSet<Integer> user3 = new TreeSet<Integer>();
        //底牌
        TreeSet<Integer> dp = new TreeSet<Integer>();

        // 开始发牌
        for (int i = 0; i < pokerIndexArr.size(); i++) {
            int pokerIndex = pokerIndexArr.get(i);
            if (i >= pokerIndexArr.size() - 3) {
                dp.add(pokerIndex);     // 三张底牌
            } else if (i % 3 == 0) {    // 发给第一个人
                user1.add(pokerIndex);
            } else if (i % 3 == 1) {    // 发给第二个人
                user2.add(pokerIndex);
            } else {
                user3.add(pokerIndex);  // 发给第三个人
            }
        }

//        System.out.println(user1);
//        System.out.println(user2);
//        System.out.println(user3);
//        System.out.println(dp);

        // 阿焕老是叫地主
        user2.addAll(dp);   // 类似python中的列表拼接，只不过这里有自然排序

        // 调用看牌方法
        lookPoker("底牌", poker, dp);
        lookPoker("yjh", poker, user1);
        lookPoker("刘阿焕", poker, user2);
        lookPoker("刘阿云", poker, user3);

    }

    // 定义方法看牌（追历TreeSet集合，获取编号，到HashMap:集合找对应的牌）
    public static void lookPoker(String name, HashMap<Integer, String> poker, TreeSet<Integer> user) {
        System.out.println(name + "的牌是：");
        StringBuilder string = new StringBuilder();
        string.append("\t");
        for (int each : user) {
            String p = poker.get(each);
            string.append(p).append(",");
        }
        string.deleteCharAt(string.lastIndexOf(","));   // 移除最后的","
        System.out.println(string);
    }
}
