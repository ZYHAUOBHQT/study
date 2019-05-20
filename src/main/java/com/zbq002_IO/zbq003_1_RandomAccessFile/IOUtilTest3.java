package com.zbq002_IO.zbq003_1_RandomAccessFile;

import java.io.File;
import java.io.IOException;

/**
 * IOUtilTest3
 * Create by 朱步青 on 2019/5/20
 */
public class IOUtilTest3 {
    public static void main(String[] args) {
        try {
            IOUtil.copyFile(new File("/Users/zhubuqing/Desktop/总部系统问题分析.docx"), new File("/Users/zhubuqing/Desktop/总部系统问题分析1.docx"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
