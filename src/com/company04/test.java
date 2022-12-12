package com.company04;

public class test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s = arrToString(arr);
        System.out.println("s: " + s);
    }

    public  static String arrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                sb.append(arr[i]).append(", ");
            } else {
                sb.append(arr[i]).append("]");
            }
        }
        String s = sb.toString();
        return s;
    }
}
