package com.zbq002_IO.zbq003_1_RandomAccessFile;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutDemo1
 * Create by 朱步青 on 2019/5/20
 */
public class FileOutDemo1 {
    public static void main(String[] args) throws IOException {
        // FileOutputStream(String name)：如果该文件不存在，则直接创建，如果存在，则删除后创建
        // FileOutputStream(String name, boolean append)：如果该文件不存在，则直接创建，如果存在，则在文件末追加内容
        FileOutputStream fileOutputStream = new FileOutputStream("demo/out.dat", true);
        fileOutputStream.write('A'); // 写出了'A'字节的低八位
        fileOutputStream.write('B'); // 写出了'B'字节的低八位
        int a = 0; // write只能写八位，那么写一个int需要写4次，每次8位
        fileOutputStream.write(a >>> 24);
        fileOutputStream.write(a >>> 16);
        fileOutputStream.write(a >>> 8);
        fileOutputStream.write(a);
        byte[] gbk = "中国".getBytes("gbk");
        fileOutputStream.write(gbk);
        fileOutputStream.close();

        IOUtil.printHex("demo/out.dat");
    }
}
