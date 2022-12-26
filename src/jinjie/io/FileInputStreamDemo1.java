package jinjie.io;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        // 创建文件对象
        String path = "D:\\workspace\\owner\\Java\\data\\java.txt";
        File file = new File(path);
        if (file.exists()) {
            // 创建字节流输入对象
            FileInputStream fis = new FileInputStream(file);

            // 读取数据
//            int bytes = fis.read(); // 一次只能读取一个
//            System.out.println(bytes);
//            System.out.println((char)bytes);

            // 循环读取数据
//            int bytes = fis.read();
//            while (bytes != -1) {
////                System.out.println(bytes);
//                System.out.print((char)bytes);
//                bytes = fis.read();
//            }

            // 优化上面的循环
            int by;
            while ((by = fis.read()) != -1) {   // 先赋值后判断
                System.out.print((char) by);
            }


            // 释放资源
            fis.close();
        }


    }
}
