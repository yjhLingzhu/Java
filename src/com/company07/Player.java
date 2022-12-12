package com.company07;

public abstract class Player extends Person{
    public Player() {
    }

    public Player(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("运动员吃饭");
    }

    public abstract void study();
}
