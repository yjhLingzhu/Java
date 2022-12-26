package jinjie.file;

import java.io.File;
import java.io.IOException;

/*
* FiLe类包创建功能：
public boolean createNewFile():
* 当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
*
public boolean mkdir():
* 创建由此拍象路径名命名的目录
*
public boolean mkdirs():
* 创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录
*
* */
public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\workspace");

        // 在D:\workspace下创建文件java.txt
        File f1 = new File(file, "java.txt");
        boolean newFile = f1.createNewFile();   // 存在的文件是不会再创建了
        System.out.println(newFile);

        // 在D:\workspace下创建目录JavaSE
        File f2 = new File(file, "JavaSE");
        boolean mkdir = f2.mkdir();     // 存在的目录不会再创建
        System.out.println(mkdir);

        // 在D:\workspace下创建多级目录Java/Web
        File f3 = new File(file, "Java/Web");
        boolean mkdirs = f3.mkdirs();   // 存在的目录不会再创建
        System.out.println(mkdirs);

        // 在D:\workspace下创建文件javase.txt
        File f4 = new File(file, "javase.txt");
        boolean f4NewFile = f4.createNewFile();     // 存在的文件是不会再创建了
        System.out.println(f4NewFile);
    }
}
