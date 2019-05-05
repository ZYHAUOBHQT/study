package com.zbq002_IO.IO_002_FileCommonlyUsedClassIntroduce_20190306;

import java.io.File;
import java.io.IOException;

/**
 * FileDemo
 * Create by 朱步青 on 2019/3/6
 */
public class FileDemo {
    public static void main(String[] args) {
        // 了解构造函数的情况
        File file = new File("/Users/zhubuqing/Documents/Study/zbq");
        if (!file.exists()) {
            file.mkdir();
        } else {
            file.delete();
        }
        // 是否是一个目录，当目标不是目录或者目录不存在，返回false。
        System.out.println(file.isDirectory());
        // 是否是一个文件
        System.out.println(file.isFile());

//        File file1 = new File("/Users/zhubuqing/Documents/Study/zbq.txt");
        File file1 = new File("/Users/zhubuqing/Documents/Study", "zbq.txt");
        if (!file1.exists())
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        else
            file1.delete();
        // 常用File对象的API
        System.out.println(file); // file的toString内容
        System.out.println(file.getAbsolutePath()); // file的抽象路径
        System.out.println(file.getName()); // file的名字
        System.out.println(file1.getName()); // file1（文件）的名字
        System.out.println(file.getParent()); // file的父目录
    }
}
