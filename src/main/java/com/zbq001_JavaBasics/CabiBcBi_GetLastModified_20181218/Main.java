package com.zbq001_JavaBasics.CabiBcBi_GetLastModified_20181218;

import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] argv) throws Exception {
        URL u = new URL("http://127.0.0.1/test/test.html");
        URLConnection uc = u.openConnection();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        uc.setUseCaches(false);
        long timestamp = uc.getLastModified();
        System.out.println("test.html 文件最后修改时间 :" + ft.format(new Date(timestamp)));
    }
}