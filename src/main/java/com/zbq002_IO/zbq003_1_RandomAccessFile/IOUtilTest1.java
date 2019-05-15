package com.zbq002_IO.zbq003_1_RandomAccessFile;

import java.io.IOException;

/**
 * IOUtilTest1
 * Create by 朱步青 on 2019/5/15
 */
public class IOUtilTest1 {
    public static void main(String[] args) {
        try {
            IOUtil.printHex("/Users/zhubuqing/Documents/githubdownload/study/src/main/java/com/zbq002_IO/IO_002_FileCommonlyUsedClassIntroduce_20190306/FileUtil.java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
