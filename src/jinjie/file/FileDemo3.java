package jinjie.file;

/*
* FiLe类的判断和获取功能：
public boolean isDirectory():测试此抽象路径名表示的File是否为目录
public boolean isFile():测试此抽象路径名表示的File是否为文件
public boolean exists():测试此抽象路径名表示的FiLe是否存在
public String getAbsolutePath():返回此抽象路径名的绝对路径名字符串
public String getPath():将此抽象路径名转换为路径名字符串
public String getName():返回由此抽象路径名表示的文件或目录的名称
public String[] List():返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
public File[] listFiles():返回此抽象路径名表示的目录中的文件和目录的FiLe对象数组
*
* */

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        File file = new File("D:\\workspace");

        // public boolean isDirectory():
        // 测试此抽象路径名表示的File是否为目录
        boolean directory = file.isDirectory();
        System.out.println(directory);

        // public boolean isFile():
        // 测试此抽象路径名表示的File是否为文件
        boolean file1 = file.isFile();
        System.out.println(file1);

        // public boolean exists():
        // 测试此抽象路径名表示的FiLe是否存在
        boolean exists = file.exists();
        System.out.println(exists);

        // public String getAbsolutePath():
        // 返回此抽象路径名的绝对路径名字符串
        String absolutePath = file.getAbsolutePath();
        System.out.println(absolutePath);

        // public String getPath():
        // 将此抽象路径名转换为路径名字符串
        String name = file.getName();
        System.out.println(name);

        // public String getPath():
        // 将此抽象路径名转换为路径名字符串
        File f1 = new File(file, "Java1");
        String path = f1.getPath();
        System.out.println(path);

        // public String[] List():
        // 返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
        String[] list = file.list();
        if (list != null) {
            System.out.println(String.join(",", list));
        }

        System.out.println("----------");
        // public File[] listFiles():
        // 返回此抽象路径名表示的目录中的文件和目录的FiLe对象数组
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File f : listFiles) {
                    String fName = f.getName();
                    System.out.println(fName);
                }
            }
        }
    }
}
