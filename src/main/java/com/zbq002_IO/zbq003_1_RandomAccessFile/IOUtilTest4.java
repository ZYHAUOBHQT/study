package com.zbq002_IO.zbq003_1_RandomAccessFile;

import java.io.File;
import java.io.IOException;

/**
 * IOUtilTest4
 * Create by 朱步青 on 2019/5/21
 */
public class IOUtilTest4 {
    public static void main(String[] args) {
        try {
            // copyFileByByte:1600+毫秒
            // copyFileByBuffer:1500+毫秒
            // copyFile:7毫秒
//            IOUtil.copyFileByByte(new File("/Users/zhubuqing/Documents/githubdownload/study/demo/zxcasdqwe.xml"), new File("/Users/zhubuqing/Documents/githubdownload/study/demo/aaaaa.txt"));
            long startTime = System.currentTimeMillis();
            IOUtil.copyFile(new File("/Users/zhubuqing/Documents/姚红婷/一小青菜.png"), new File("/Users/zhubuqing/Documents/姚红婷/一青菜.png"));
            long endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
