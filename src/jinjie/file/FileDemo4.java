package jinjie.file;

import java.io.File;
import java.io.IOException;

/*
* 文件目录删除功能
* */
public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        // 如果只写yjh.txt，那么会创建到项目的目录下面，即和src同级；
        // 项目目录里面的文件夹是模块来的，即src是一个模块，src里面的
        // 文件夹也可以看着小模块或者包，如果想在file包下创建文件，那么
        // 需要这样写src\jinjie\file\yjh.txt
//        File file = new File("src\\jinjie\\file\\yjh.txt");
//        boolean newFile = file.createNewFile();
//        System.out.println(newFile);
//
//        // 文件
//        boolean delete = file.delete();
//        System.out.println(delete);

//        File f2 = new File("D:\\workspace\\Java");
//        boolean delete1 = f2.delete();// 如果目录有内容，是删除不了当前目录的，需要将里面的内容删除了才可以删除当前目录
//        System.out.println(delete1);

        // 对于有内容的目录需要递归删除
        deleteDir(new File("D:\\workspace\\Java")); // Java和java不区分大小写
    }

    // 递归删除
    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {    // 是目录
            String[] children = dir.list();
            // 递归删除子目录
            if (children != null) {
                for (String child : children) {
                    boolean success = deleteDir(new File(dir, child));
                    if (!success) {
                        return false;
                    }
                }
            } else {    // 删除空目录
                return dir.delete();
            }
        }

        // 空文件，直接删除
        return dir.delete();
    }
}
