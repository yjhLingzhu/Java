package com.company11;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        // 日历类，可以获取年月日时分秒
        // 获取日历对象
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);

        int month = cal.get(Calendar.MONTH) + 1;
        System.out.println(month);  // 月份从0开始的

        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);

        int hour = cal.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour);

        int minute = cal.get(Calendar.MINUTE);
        System.out.println(minute);

        int second = cal.get(Calendar.SECOND);
        System.out.println(second);

        // 三年前
        cal.add(Calendar.YEAR, -3); // 三年后就是 +3
        System.out.println(cal.get(Calendar.YEAR));

        // 需求，10年后的五天前
        cal.add(Calendar.YEAR, 10);
        cal.add(Calendar.DAY_OF_MONTH, 5);
    }
}
