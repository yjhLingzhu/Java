package jinjie.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyImgDemo {
    public static void main(String[] args) throws Exception{
        // 源文件路径
        String originPath = "D:\\workspace\\owner\\Java\\data\\origin\\a.png";
        // 源文件 File 对象
        File originFile = new File(originPath);

        // 缓存区
        byte[] bys = new byte[1024];
        int len;

        // 源文件存在
        if (originFile.exists()) {
            // 创建源文件输入流
            FileInputStream fis = new FileInputStream(originFile);
            // 目标对象文件路径
            String savePath = "D:\\workspace\\owner\\Java\\data\\target\\b.png";
            // 创建目标文件输出流对象
            FileOutputStream fos = new FileOutputStream(savePath);
            // 开始读取数据
            while ((len = fis.read(bys)) != -1) {   // 将数据读取到缓存区
                fos.write(bys, 0, len); // 从缓存区写数据进磁盘
            }

            // 释放资源
            fis.close();
            fos.close();
        }
    }
}
