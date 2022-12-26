package jinjie.io;

import java.io.*;

public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
        // 字节缓冲流 写数据
//        String path = "D:\\workspace\\owner\\Java\\data\\a.txt";
//        FileOutputStream fos = new FileOutputStream(path);
//        BufferedOutputStream bos = new BufferedOutputStream(fos);
//
//        // 写数据  这个缓冲流bos和fos对文件的操作是一样的，bos调用的那些方法其实就是fos的
//        bos.write("yjh 肥猪鲫".getBytes());
//
//        // 释放资源
//        bos.close();

        //***********************************************

        // 读数据
        String path1 = "D:\\workspace\\owner\\Java\\data\\java.txt";
        // File对象
        File file = new File(path1);
        if (file.exists()) {
            // 输入流
            FileInputStream fis = new FileInputStream(file);
            // 缓冲输入流
            BufferedInputStream bis = new BufferedInputStream(fis);
            // 方式一 读取
//            int by;
//            while ((by = bis.read()) != -1) {
//                System.out.print((char) by);
//            }

            // 方式二 读取
            byte[] bys = new byte[1024];
            int len;
            while ((len = bis.read(bys)) != -1) {
                System.out.print(new String(bys, 0, len));
            }

            // 释放资源
            bis.close();
        }
    }
}
