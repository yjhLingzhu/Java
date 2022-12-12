package com.company11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    // 获取当前时间

    public static void main(String[] args) throws ParseException {
        // Date -> String
        SimpleDateFormat sdf = new SimpleDateFormat();// 格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记
        Date d = new Date();// 获取当前时间
//        long time = System.currentTimeMillis(); // 系统当前时间毫秒
        System.out.println("现在时间：" + sdf.format(d)); // 输出已经格式化的现在时间（24小时制）

        // String -> Date
        String s = "2022-10-01 12:11:00";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = sdf2.parse(s);
        System.out.println(d2);
    }
}
