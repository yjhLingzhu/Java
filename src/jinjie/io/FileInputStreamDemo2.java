package jinjie.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws Exception {
        // 路径
        String path = "D:\\workspace\\owner\\Java\\data\\python.txt";
        // 创建file对象
        File file = new File(path);
        if (file.exists()) {
            // 创建字节输入流对象
            FileInputStream fis = new FileInputStream(file);

            // 创建存储对象
            String savePath = "src\\jinjie\\io\\python.txt";
            File saveFile = new File(savePath);
            FileOutputStream fos = new FileOutputStream(saveFile);

            // 循环读取数据
            int by;
            while ((by = fis.read()) != -1) {
                fos.write(by);  // 存储数据
            }

            // 释放资源
            fos.close();

            // 资源释放
            fis.close();
        }
    }
}
