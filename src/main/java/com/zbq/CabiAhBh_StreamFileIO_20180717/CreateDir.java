package com.zbq.CabiAhBh_StreamFileIO_20180717;

import java.io.File;

/**
 * CreateDir
 * Create by 朱步青 on 2018/7/23
 */
public class CreateDir {
    public static void main(String args[]) {
        String dirname = "/Users/zhubuqing/Documents/githubdownload/study/src/main/resources/static/CabiAhCd_StreamFileIo_20180723/createDirTest";
        File d = new File(dirname);
        // 现在创建目录
        d.mkdirs();
    }
}
