package com.zbq002_IO.zbq003_1_RandomAccessFile;

import java.io.*;

/**
 * BrAndBwOrPwDemo
 * Create by 朱步青 on 2019/6/4
 */
public class BrAndBwOrPwDemo {
    public static void main(String[] args) throws IOException {
        // 对文件进行读写操作
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("/Users/zhubuqing/Documents/Study/zbq.txt")));
        /*BufferedWriter bufferedWriter = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("/Users/zhubuqing/Documents/Study/zbq3.txt")));*/
        PrintWriter printWriter = new PrintWriter("/Users/zhubuqing/Documents/Study/zbq4.txt");
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line); // 一次读一行并不能识别换行
            /*bufferedWriter.write(line);
            // 单独写出换行
            bufferedWriter.newLine();
            bufferedWriter.flush();*/
            printWriter.println(line);
            printWriter.flush();
        }
        bufferedReader.close();
        /*bufferedWriter.close();*/
        printWriter.close();
    }
}
