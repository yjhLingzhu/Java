package com.company07;

public class PingCoach extends Coach implements English{
    public PingCoach() {
    }

    public PingCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println(super.getName() + " 乒乓球教练教乒乓球 " + super.getAge());
    }

    @Override
    public void sayEnglish() {
        System.out.println("打乒乓球的人需要说英语");
    }
}
