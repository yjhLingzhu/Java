package jinjie.io;
/*
*字节流写数据的两个小问题：
1:字节流写数据如何实现换行呢？
2:字节流写数据如何实现追加写入呢？
* */

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo3 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\workspace\\owner\\Java\\data\\python.txt";
        // 创建file
        File file = new File(path);
        // 创建输出流对象
//        FileOutputStream fos = new FileOutputStream(file);    // 这个是覆盖
        FileOutputStream fos = new FileOutputStream(file, true); // 这个是追加

        // 1:字节流写数据如何实现换行呢？
        for (int i = 0; i < 10; i++) {
            String s = "yjh 肥猪鲫";
            // 将字符串转成bytes
            byte[] bytes = s.getBytes();
            // 将内容写进去
            fos.write(bytes);
            fos.write("\r\n".getBytes()); // 把换行写进去
        }

        // 释放资源
        fos.close();
    }
}
