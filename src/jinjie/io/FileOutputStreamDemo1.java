package jinjie.io;

/*
* 内容看得懂的用字符流，看不懂的用字节流
* */

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\workspace\\owner\\Java\\data\\java.txt";
        // 创建字节流输出对象
        FileOutputStream fos = new FileOutputStream(path);

        /*
        * 做了三件事情：
        *   1. 调用系统功能创建了文件
        *   2. 创建了字节输出流对象
        *   3. 让字节输出流对象指向创建好的文件
        * */
        // 将指定的字节写入此文件输出流 一次写一次
        fos.write(97);

        // 释放资源
        fos.close();
    }
}
