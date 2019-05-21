package com.zbq002_IO.zbq003_1_RandomAccessFile;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * DosDemo
 * Create by 朱步青 on 2019/5/20
 */
public class DosDemo {
    public static void main(String[] args) throws IOException {
        String file = "demo/dos.dat";
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        dataOutputStream.writeInt(10);
        dataOutputStream.writeInt(-10);
        dataOutputStream.writeLong(10L);
        dataOutputStream.writeDouble(10.5);
        // 采用UTF-8编码写出
        dataOutputStream.writeUTF("中国");
        // 采用UTF-16 be编码写出
        dataOutputStream.writeChars("中国");
        dataOutputStream.close();
        IOUtil.printHex(file);
    }
}
