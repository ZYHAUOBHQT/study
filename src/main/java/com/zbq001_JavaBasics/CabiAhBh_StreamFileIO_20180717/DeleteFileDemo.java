package com.zbq001_JavaBasics.CabiAhBh_StreamFileIO_20180717;

import java.io.File;

/**
 * DeleteFileDemo
 * Create by 朱步青 on 2018/7/23
 */
public class DeleteFileDemo {
    public static void main(String args[]) {
        // 这里修改为自己的测试目录
        File folder = new File("/Users/zhubuqing/Documents/githubdownload/study/src/main/resources/resources/CabiAhCd_StreamFileIo_20180723/createDirTest");
        deleteFolder(folder);
    }

    //删除文件及目录
    public static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();
    }
}
