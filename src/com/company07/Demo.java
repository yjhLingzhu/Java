package com.company07;

public class Demo {
    public static void main(String[] args) {
        BasketballCoach b = new BasketballCoach("刘青云", 18);
        b.eat();
        b.teach();

        System.out.println("----------------------------");

        PingCoach p = new PingCoach("刘秀焕", 17);
        p.eat();
        p.teach();
        p.sayEnglish();

        System.out.println("----------------------------");

        BasketballPlayer bp = new BasketballPlayer("马大哈", 16);
        bp.eat();
        bp.study();

        System.out.println("----------------------------");

        PingPlayer pp = new PingPlayer("阿云", 16);
        pp.eat();
        pp.study();
        pp.sayEnglish();

    }
}
