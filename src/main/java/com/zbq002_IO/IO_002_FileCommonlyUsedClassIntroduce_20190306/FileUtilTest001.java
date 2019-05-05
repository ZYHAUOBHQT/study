package com.zbq002_IO.IO_002_FileCommonlyUsedClassIntroduce_20190306;

import java.io.File;
import java.io.IOException;

/**
 * FileUtilTest001
 * Create by 朱步青 on 2019/3/6
 */
public class FileUtilTest001 {
    public static void main(String[] args) throws IOException {
        FileUtil.listDirectory(new File("/Users/zhubuqing/Documents/Study"));
    }
}
