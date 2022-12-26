package jinjie.io;

import java.io.File;
import java.io.FileInputStream;

/*
* 一次读一个字节数组数据
* */
public class FileInputStreamDemo3 {
    public static void main(String[] args) throws Exception {
        String path = "D:\\workspace\\owner\\Java\\data\\python.txt";
        // 创建file对象
        File file = new File(path);
        if (file.exists()) {
            // 创建字节输入流对象
            FileInputStream fis = new FileInputStream(file);

            // 循环读取
//            byte[] bys = new byte[3];   // 一个中文是3个字节的，一个英文是一个字节,一次最多读取3个字节放到bys中
            byte[] bys = new byte[1024];   // 通常是1024大小
            int len;
            while ((len = fis.read(bys)) > 0) {
                // 将bys转成字符串
                String r = new String(bys, 0, len);
                System.out.print(r);
            }

            // 释放资源
            fis.close();
        }
    }
}
