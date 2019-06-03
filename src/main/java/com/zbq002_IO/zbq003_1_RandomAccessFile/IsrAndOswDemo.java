package com.zbq002_IO.zbq003_1_RandomAccessFile;

import java.io.*;

/**
 * IsrAndOswDemo
 * Create by 朱步青 on 2019/5/30
 */
public class IsrAndOswDemo {
    public static void main(String[] args) throws IOException {
        // 默认项目的编码，操作的时候，要写文件本身的编码格式
        FileInputStream fileInputStream = new FileInputStream("/Users/zhubuqing/Documents/Study/zbq.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);

        FileOutputStream fileOutputStream = new FileOutputStream("/Users/zhubuqing/Documents/Study/yht.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "gbk");

        /*int c;
            while ((c = inputStreamReader.read()) != -1) {
            System.out.print((char) c);
        }*/
        char[] buffer = new char[8 * 1024];
        int c;
        /*
        批量读取，放入buffer这个字符数组，从第0个位置开始放，最多放buffer.length个
        返回的是读到字符的个数
        */
        while ((c = inputStreamReader.read(buffer, 0, buffer.length)) != -1) {
            String s = new String(buffer, 0, c);
            System.out.print(s);
            outputStreamWriter.write(buffer, 0, c);
            outputStreamWriter.flush();
        }
        inputStreamReader.close();
        outputStreamWriter.close();
    }
}
