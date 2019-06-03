package com.zbq002_IO.zbq003_1_RandomAccessFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FrAndFwDemo
 * Create by 朱步青 on 2019/5/30
 */
public class FrAndFwDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/Users/zhubuqing/Documents/Study/zbq.txt");
        FileWriter fileWriter = new FileWriter("/Users/zhubuqing/Documents/Study/yzb.txt");
//        FileWriter fileWriter = new FileWriter("/Users/zhubuqing/Documents/Study/yzb.txt", true);
        char[] buffer = new char[2056];

        int c;
        while ((c = fileReader.read(buffer, 0, buffer.length)) != -1) {
            fileWriter.write(buffer, 0, c);
            fileWriter.flush();
        }
        fileReader.close();
        fileWriter.close();
    }
}
