package com.zbq002_IO.zbq003_1_RandomAccessFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * IOUtil
 * Create by 朱步青 on 2019/5/15
 */
public class IOUtil {
    /**
     * 读取指定文件内容，按照16进制输出到控制台
     * 并且每输出10个byte换行
     *
     * @param fileName
     */
    public static void printHex(String fileName) throws IOException {
        // 把文件作为字节流进行读操作
        FileInputStream fileInputStream = new FileInputStream(fileName);
        int b;
        int i = 1;
        while ((b = fileInputStream.read()) != -1) {
            if (b <= 0xf) {
                // 单位数前面补0
                System.out.print("0");
            }
            System.out.print(Integer.toHexString(b) + " "); // 将整形b转换为16进制表示的字符串
            if (i++ % 10 == 0) {
                System.out.println();
            }
        }
        fileInputStream.close();
    }

    public static void printHexByByteArray(String fileName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        byte[] buf = new byte[20 * 1024];
        // 从fileInputStream中批量读取字节，放入到buf这个字节数组中，从第0个位置开始放，最多放buf.length个，返回的是读到的字节的个数
//        int bytes = fileInputStream.read(buf, 0, buf.length);
//        int j = 1;
//        for (int i = 0; i < bytes; i++) {
//            if (buf[i] <= 0xf) {
//                System.out.print("0");
//            }
//            System.out.print(Integer.toHexString(buf[i]) + "  ");
//            if (j++ % 10 == 0) {
//                System.out.println();
//            }
//        }
        int bytes = 0;
        int j = 0;
        while ((bytes = fileInputStream.read(buf, 0, buf.length)) != -1) {
            for (int i = 0; i < bytes; i++) {
                // & 0xff -----> byte类型8位，int类型32位，为了避免数据转换错误，通过& 0xff将高24位清零
                System.out.print(Integer.toHexString(buf[i] & 0xff) + "  ");
                if (j++ % 10 == 0)
                    System.out.println();
            }
        }
    }

    public static void copyFile(File srcFile, File destFile) throws IOException {
        if (!srcFile.exists()) {
            throw new IllegalArgumentException("文件：" + srcFile + "不存在");
        }
        if (!srcFile.isFile()) {
            throw new IllegalArgumentException("文件：" + srcFile + "不是文件");
        }
        FileInputStream fileInputStream = new FileInputStream(srcFile);
        FileOutputStream fileOutputStream = new FileOutputStream(destFile);
        byte[] bytes = new byte[8 * 1024];
        int b;
        while ((b = fileInputStream.read(bytes, 0, bytes.length)) != -1) {
            fileOutputStream.write(bytes, 0, b);
            fileOutputStream.flush(); // 最好加上
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
