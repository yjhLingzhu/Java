package com.company11;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;

// 字符串切割排序

public class Demo {
    public static void main(String[] args) {
        // 将字符串排序输出
        String s = "12 87 2 63 99 14 17 100";
        // 对字符串进行切割
        String[] sArr = s.split(" ");
        // 输出数组
        System.out.println("排序前：" + Arrays.toString(sArr));

        // 将数组中的元素转成int类型
        String result = transformInt(sArr);

        // 对数组进行排序
        System.out.println("排序后：" + result);
    }

    public static String transformInt(String[] sArr) {
        int[] iArr = new int[sArr.length];

        for (int i = 0; i < sArr.length; i++) {
            iArr[i] = Integer.parseInt(sArr[i]);
        }
        Arrays.sort(iArr);
//        String j = StringUtils.join(iArr, "-");
//        System.out.println(j);
        // 将整型数组弄成字符串列表
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iArr.length; i++) {
            if (i != iArr.length - 1) {
                sb.append(iArr[i]).append(" ");
            } else {
                sb.append(iArr[i]);
            }
        }
        return sb.toString();
    }
}
