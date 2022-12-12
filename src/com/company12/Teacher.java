package com.company12;

public class Teacher {
    public void checkScore(int score) throws MyException {
        if (score < 0 || score > 100) {
            throw new MyException("分数范围是0-100");
        } else {
            System.out.println("分数正常");
        }
    }
}
