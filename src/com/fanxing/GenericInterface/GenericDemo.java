package com.fanxing.GenericInterface;

public class GenericDemo {
    public static void main(String[] args) {
        GenericImpl<String> gp1 =new GenericImpl<>();
        gp1.show("yjh");

        GenericImpl<Integer> gp2 =new GenericImpl<>();
        gp2.show(100);

        GenericImpl<Boolean> gp3 =new GenericImpl<>();
        gp3.show(true);

        GenericImpl<Double> gp4 =new GenericImpl<>();
        gp4.show(12.34);
    }
}
