package com.company;

import java.util.Scanner;

class Average {

    public void getScore() {
        int[] arr = new int[6];

        // 输入评委分数
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("输入第" + (i+1) + "个分数：");
            arr[i] = sc.nextInt();
        }

        printArray(arr);
        int max = getMax(arr);
        int min = getMin(arr);
        int sum = getSum(arr);

        // 平均分
        int avg = (sum - min - max) / (arr.length - 2);
        System.out.println("平均分是：" + avg);
    }

    // 输出数组
    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }

    // 获取最大值
    public int getMax(int[] arr) {
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // 获取最小值
    public int getMin(int[] arr) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // 总分
    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

