package com.zbq002_IO.zbq003_1_RandomAccessFile;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * DisDemo
 * Create by 朱步青 on 2019/5/20
 */
public class DisDemo {
    public static void main(String[] args) throws IOException {
        String file = "demo/dos.dat";
        IOUtil.printHex(file);
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        int i = dataInputStream.readInt();
        System.out.println(i);
        i = dataInputStream.readInt();
        System.out.println(i);
        long l = dataInputStream.readLong();
        System.out.println(l);
        double d = dataInputStream.readDouble();
        System.out.println(d);
        String s = dataInputStream.readUTF();
        System.out.println(s);
        dataInputStream.close();
    }
}
