package com.collections_anli;

/*
* 需求，
通过程序实现斗地主过程中的洗牌，发牌和看牌
思路：
1:创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
2:在牌盒里面装牌
3:洗牌，也就是把牌打撒，用Collections的shuffle()方法实现
4:发牌，也就是遍历集合，给三个玩家发牌
5:看牌，也就是三个玩家分别遍历自己的牌
* */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class PokerDemo {
    public static void main(String[] args) {
        // 创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
        ArrayList<String> poker = new ArrayList<String>();

        // 花色
        String[] colors = {"♣", "♥", "♠", "♦"};
        // 点数
        String[] array = {"A", "2", "3", "4", "5", "6", "7","8","9", "10", "J", "Q", "K"};
        // 在牌盒里面装牌
        for (String color : colors) {
            for (String each : array) {
                poker.add(color + each);
            }
        }
        // 装入大小王
        poker.add("大王");
        poker.add("小王");

        // 洗牌，也就是把牌打撒，用Collections的shuffle()方法实现
        Collections.shuffle(poker);

        // 创建三个玩家的牌盒
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        ArrayList<String> user1 = new ArrayList<String>();
        ArrayList<String> user2 = new ArrayList<String>();
        ArrayList<String> user3 = new ArrayList<String>();

        // 发牌，也就是遍历集合，给三个玩家发牌
        // 留出最后三张牌作为叫地主
        String poker_1 = poker.remove(poker.size()-1);
        String poker_2 = poker.remove(poker.size()-1);
        String poker_3 = poker.remove(poker.size()-1);
//        System.out.println(poker.size());
        for (int i=0; i<poker.size()/3; i++) {
            user1.add(poker.get(3*i));
            user2.add(poker.get(1+3*i));
            user3.add(poker.get(2+3*i));
        }

        // 阿焕把把叫地主
        user3.add(poker_1);
        user3.add(poker_2);
        user3.add(poker_3);

        map.put("阿辉", user1);
        map.put("阿云", user2);
        map.put("阿焕", user3);

        // 看牌，也就是三个玩家分别遍历自己的牌
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key+"的牌:"+map.get(key));
        }
    }
}
