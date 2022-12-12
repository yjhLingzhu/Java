package com.company07;

public class BasketballCoach extends Coach{
    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println(super.getName() + " 篮球教练教篮球 " + super.getAge());
    }
}
