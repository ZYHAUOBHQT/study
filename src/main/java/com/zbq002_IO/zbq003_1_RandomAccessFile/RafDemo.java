package com.zbq002_IO.zbq003_1_RandomAccessFile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * RafDemo
 * Create by 朱步青 on 2019/5/15
 */
public class RafDemo {
    public static void main(String[] args) throws IOException {
        File demo = new File("demo");
        if (!demo.exists()) {
            demo.mkdir();
        }
        File file = new File(demo, "raf.dat");
        if (!file.exists()) {
            file.createNewFile();
        }

        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        System.out.println(randomAccessFile.getFilePointer());

        randomAccessFile.write('A'); // 只写了一个字节
        System.out.println(randomAccessFile.getFilePointer());

        randomAccessFile.write('B');

        int i = 0x7fffffff;
        // 用write方法，每次只能写一个字节，如果把i写进去要写4次
        randomAccessFile.write(i >>> 24); // 高8位
        randomAccessFile.write(i >>> 16);
        randomAccessFile.write(i >>> 8);
        randomAccessFile.write(i);
        System.out.println(randomAccessFile.getFilePointer());

        // 可以直接写一个int
        randomAccessFile.writeInt(i);

        String s = "中";
        byte[] gbk = s.getBytes("gbk");
        randomAccessFile.write(gbk);
        System.out.println(randomAccessFile.getFilePointer());

        // 读文件，必须把指针一到头部
        randomAccessFile.seek(0);
        // 一次性读取，把文件内容都读到字节数组中
        byte[] buf = new byte[(int) randomAccessFile.length()];
        randomAccessFile.read(buf);
        System.out.println(Arrays.toString(buf));
        String s1 = new String(buf);
        for (byte b : buf) {
            System.out.println(Integer.toHexString(b & 0xff) + " ");
        }
        randomAccessFile.close();
    }
}
