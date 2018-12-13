package com.zbq.CabiAhBh_StreamFileIO_20180717;

import java.io.*;

/**
 * FileStreamTest
 * Create by 朱步青 on 2018/7/23
 */
public class FileStreamTest {
    public static void main(String[] args) {
        try {
            byte bWrite[] = {11, 21, 3, 40, 5};
            OutputStream os = new FileOutputStream("/Users/zhubuqing/Documents/githubdownload/study/src/main/resources/static/CabiAhCd_StreamFileIo_20180723/test.txt");
            for (int x = 0; x < bWrite.length; x++) {
                os.write(bWrite[x]); // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("/Users/zhubuqing/Documents/githubdownload/study/src/main/resources/static/CabiAhCd_StreamFileIo_20180723/test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                Object obj = is.read();
                System.out.print(String.valueOf(obj) + "  ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
