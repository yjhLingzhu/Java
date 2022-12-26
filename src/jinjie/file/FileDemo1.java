package jinjie.file;

import java.io.File;

/*
* 构造方法：
FiLe(String pathname):
* 通过将给定的路径名字符串转换为抽象路径名来创建新的FiLe实例。
*
File(String parent,.String child):
* 从父路径名字符串和子路径名字符串创建新的FiLe实例。
*
File(File parent,String child):
* 从父抽像路径名和子路径名字符串创建新的FiLe实例.
* */
public class FileDemo1 {
    public static void main(String[] args) {
        // FiLe(String pathname)
        File f1 = new File("D:/workspace/java.txt");
        System.out.println(f1);

        // File(String parent,.String child)
        File f2 = new File("D:/workspace", "java.txt");
        System.out.println(f2);

        // File(File parent, String child)
        File f3 = new File("D:/workspace");
        File f4 = new File(f3, "java.txt");
        System.out.println(f4);
    }
}
