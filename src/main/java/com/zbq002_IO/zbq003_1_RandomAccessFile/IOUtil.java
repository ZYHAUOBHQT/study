package com.zbq002_IO.zbq003_1_RandomAccessFile;

import java.io.FileInputStream;
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
}
