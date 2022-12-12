package com.company07;

public class PingPlayer extends Player implements English{
    public PingPlayer() {
    }

    public PingPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println(super.getName() + " 学习乒乓球 " + super.getAge());
    }

    @Override
    public void sayEnglish() {
        System.out.println("乒乓球运动员需要说英语");
    }
}
