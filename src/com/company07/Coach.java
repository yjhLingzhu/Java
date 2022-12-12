package com.company07;

public abstract class Coach extends Person{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("教练吃饭");
    }

    public abstract void teach();
}
