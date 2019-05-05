package com.zbq001_JavaBasics.CabiAhBh_StreamFileIO_20180717;

import java.io.File;

/**
 * DirList
 * Create by 朱步青 on 2018/7/23
 */
public class DirList {
    public static void main(String args[]) {
        String dirname = "/Users/zhubuqing/Documents/githubdownload/study/src/main/resources/resources/CabiAhCd_StreamFileIo_20180723";
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("目录 " + dirname);
            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " 是一个目录");
                } else {
                    System.out.println(s[i] + " 是一个文件");
                }
            }
        } else {
            System.out.println(dirname + " 不是一个目录");
        }
    }
}
