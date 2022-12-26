package jinjie.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        String path = "D:\\workspace\\owner\\Java\\data\\java.txt";

        // 创建文件对象
        File file = new File(path);
        // 创建输出流对象
        FileOutputStream fos = new FileOutputStream(file);  // 覆盖曾经的内容
        // 我们以后使用上面这种方式创建输出流会比较好，这样可以用file
        // 去做很多判断的事情

        // 单此写入
//        fos.write(97);
//        fos.write(98);
//        fos.write(99);
//        fos.write(100);
//        fos.write(101);

        // 写入字节数组
//        byte[] b = {97,98,99,100};
//        fos.write(b);

//        String string = "yjh jia 加油";
//        byte[] bytes = string.getBytes();   // getBytes返回字符串对应的字节数组
//        fos.write(bytes);   // 可以常使用这种方法

        // 写入指定长度的字节数组
        String s = "ke wu de 肥猪鲫";
        byte[] bys = s.getBytes();
        fos.write(bys, 1, 3);   // 从索引1开始，数三个字符，所以是e w

        fos.close();
    }
}
