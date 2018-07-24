package com.zbq.zSerializeDeserialize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * SerializeDemo
 * Create by 朱步青 on 2018/7/24
 */
public class SerializeDemo {
    public static void main(String[] args) {
        try {
            File file = new File("/Users/zhubuqing/Documents/githubdownload/study/src/main/resources/static/ZSerializeDeserialize/test.txt");
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            User user = new User();
            user.setUsername("username");
            user.setPassword("password");
            user.setAge(1);
            user.setName("name");
            user.setSex(0);
            oos.writeObject(user);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
